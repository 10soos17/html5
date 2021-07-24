package com.ja.rubato.freeboard.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.ja.rubato.board.service.BoardServiceImpl;
import com.ja.rubato.freeboard.service.FreeboardServiceImpl;
import com.ja.rubato.vo.BoardCommentVo;
import com.ja.rubato.vo.BoardImageVo;
import com.ja.rubato.vo.BoardVo;
import com.ja.rubato.vo.FreeboardCommentVo;
import com.ja.rubato.vo.FreeboardImageVo;
import com.ja.rubato.vo.FreeboardVo;
import com.ja.rubato.vo.MemberVo;

@Controller
@RequestMapping("/freeboard/*")
public class FreeboardController {

	@Autowired
	private FreeboardServiceImpl freeboardService;

	@RequestMapping("freeboard_list.do")
	public String mainPage(Model model, String freeboard_search_type, String freeboard_search_word,
			@RequestParam(defaultValue = "1") int freeboard_page_num) {
		// 할 것 많음
		// System.out.println(search_type+":"+search_word+":"+page_num);

		ArrayList<FreeboardVo> freeboardList = freeboardService.getContents(freeboard_search_type, freeboard_search_word, freeboard_page_num);
		System.out.println(freeboard_search_type + ":" + freeboard_search_word + ":" + freeboard_page_num);
		// 전체 글 수
		int count = freeboardService.getContentCount(freeboard_search_type, freeboard_search_word, freeboard_page_num);
		// 전체 페이지 수(각 페이지 10개 글)
		int totalPageCount = (int) Math.ceil(count / 10.0);
		// 현재 페이지 번호
		int currentPage = freeboard_page_num;
		// 보여줄 시작 페이지번호
		int beginPage = ((currentPage - 1) / 5) * 5 + 1;
		// 보여줄 끝 페이지번호
		int endPage = ((currentPage - 1) / 5 + 1) * (5);

		if (endPage > totalPageCount) {
			endPage = totalPageCount;
		}

		String addParam = "";

		if (freeboard_search_type != null && freeboard_search_word != null) {
			addParam += "&search_type=" + freeboard_search_type;
			addParam += "&search_word=" + freeboard_search_word;
		}
		model.addAttribute("addParam", addParam);

		model.addAttribute("currentPage", currentPage);
		model.addAttribute("beginPage", beginPage);
		model.addAttribute("endPage", endPage);
		model.addAttribute("totalPageCount", totalPageCount);

		model.addAttribute("freeboardList", freeboardList); // Q. request, session대신 model쓰는 이유??

		return "freeboard/freeboard_list";
	}

	// ==============================게시판 글 목록 클릭 시
	@RequestMapping("freeboard_view.do")
	public String readContentPage(int freeboard_no, Model model) {

		System.out.println(freeboard_no);

		// System.out.println("readContentPageCheck"+vo);

		freeboardService.increaseReadCount(freeboard_no);

		// 조회
		HashMap<String, Object> map = freeboardService.getContent(freeboard_no);

		model.addAttribute("content", map);

		return "freeboard/freeboard_view";
	}

	// ==============================board 글쓰기 관련

	@RequestMapping("freeboard_write.do")
	public String writeContentPage() {

		return "freeboard/freeboard_write";
	}

	// writeContentPage.do에서 submit 시
	@RequestMapping("writeContentProcess.do")
	public String writeContentProcess(FreeboardVo param, MultipartFile[] freeboard_files) {

		ArrayList<FreeboardImageVo> boardImageVoList = new ArrayList<>();

		// "C:/uploadFolder/aaa.jpg"

		// 파일 업로드
		for (MultipartFile freeboardFile : freeboard_files) {

			// 예외처리: 하나도 안 날려도 한바퀴는 돈다.
			if (freeboardFile.isEmpty()) {
				continue;
			}

			String rootFolderName = "/Users/soos/Desktop/uploadFolder/freeboardFolder/";// "C:/uploadFolder/";

			// 랜덤 파일 네임 만들기 : 충돌 방지 (시간 + 랜덤 활용)
			String originalFilename = freeboardFile.getOriginalFilename();
			String ext = originalFilename.substring(originalFilename.lastIndexOf("."));
			String uuidName = UUID.randomUUID().toString();
			long currentTimeMillis = System.currentTimeMillis();
			String randomFileName = uuidName + "_" + currentTimeMillis + ext;

			// 오늘 날짜 폴더 만들기
			Date today = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			String todayFolderName = sdf.format(today);
			String uploadFolderName = rootFolderName + todayFolderName;

			File uploadFolder = new File(uploadFolderName);

			if (!uploadFolder.exists()) {
				uploadFolder.mkdirs();
			}

			String saveFilePathName = uploadFolderName + "/" + randomFileName;

			try {
				freeboardFile.transferTo(new File(saveFilePathName));
			} catch (Exception e) {
				e.printStackTrace();
			}

			// 데이터
			FreeboardImageVo boardImageVo = new FreeboardImageVo();
			boardImageVo.setFreeboard_image_ori(originalFilename);
			boardImageVo.setFreeboard_image_url(todayFolderName + "/" + randomFileName);

			boardImageVoList.add(boardImageVo);
		}

		// 아래 데이터 처리

		// 공부해야 할 부분
		freeboardService.writeContent(param, boardImageVoList);

		return "redirect:./freeboard_list.do";
	}

	@RequestMapping("deleteContentProcess.do")
	public String deleteContentProcess(FreeboardVo param, String this_pw) {
		
		if (param.getFreeboard_pw().equals(this_pw)) {
			
			freeboardService.deleteContent(param.getFreeboard_no());
			
			return "redirect:./freeboard_view.do?freeboard_no=" + param.getFreeboard_no();
		} else {
			
			return "redirect:./freeboard_viewFail.do";
		}
	}

	@RequestMapping("updateContentPage.do")
	public String updateContentPage(int freeboard_no, Model model) {

		HashMap<String, Object> map = freeboardService.getContent(freeboard_no);

		model.addAttribute("content", map);

		return "freeboard/updateContentPage";
	}

	@RequestMapping("updateContentProcess.do")
	public String updateContentProcess(FreeboardVo param, String this_pw) {
		
	
		if (param.getFreeboard_pw().equals(this_pw)) {
			
			freeboardService.updateContent(param);
			
			return "redirect:./freeboard_view.do?freeboard_no=" + param.getFreeboard_no();
		} else {
			
			return "redirect:./freeboard_viewFail.do";
		}
	
	}
	
	// ==============================댓글 관련
	@RequestMapping("writeComment.do")
	public String writeComment(FreeboardCommentVo param) {
		System.out.println("comment:" + param.getFreeboard_no() + param.getFreeboard_nick());

		freeboardService.writeComment(param);

		return "redirect:./freeboard_view.do?freeboard_no=" + param.getFreeboard_no();
	}

	@RequestMapping("freeboard_viewFail.do")
	public String freeboard_viewFail() {
		return "freeboard/freeboard_viewFail";
	}
	
	@RequestMapping("deleteComment.do")
	public String deleteComment(FreeboardCommentVo param, String this_pw) {
		System.out.println(
				"comment_content:" + param.getFreeboard_comment_content() + "freeboardNO:" + param.getFreeboard_no()+"inputPw"+param.getFreeboard_comment_pw()+"this_pw:"+this_pw);

		
		if (param.getFreeboard_comment_pw().equals(this_pw)) {
			
			freeboardService.deleteComment(param);
			
			return "redirect:./freeboard_view.do?freeboard_no=" + param.getFreeboard_no();
		} else {
			
			return "redirect:./freeboard_viewFail.do";
		}
	}

//	@RequestMapping("updateCommentBoard.do")
//	public String updateCommentBoard(FreeboardCommentVo param, Model model) {
//		
//		HashMap<String, Object> map = freeboardService.getContent(param.getFreeboard_no());
//
//		model.addAttribute("content", map);
//
//		return "freeboard/updateCommentBoard";
//	}

	@RequestMapping("updateComment.do")
	public String updateCommentProcess(FreeboardCommentVo param, String this_pw) {

		System.out.println(
				"comment_content:" + param.getFreeboard_comment_content() + "freeboardNO:" + param.getFreeboard_no()+"inputPw"+param.getFreeboard_comment_pw()+"this_pw:"+this_pw);

		if (param.getFreeboard_comment_pw().equals(this_pw)) {
			
			freeboardService.updateComment(param);
			
			return "redirect:./freeboard_view.do?freeboard_no=" + param.getFreeboard_no();
		} else {
			
			return "redirect:./freeboard_viewFail.do";
		}

	}

	// ==============================종아요 관련
	@RequestMapping("upRecommend.do")
	public String upRecommend(int freeboard_no) {

		freeboardService.upRecommend(freeboard_no);

		return "redirect:./freeboard_view.do?freeboard_no=" + freeboard_no;
	}
}
