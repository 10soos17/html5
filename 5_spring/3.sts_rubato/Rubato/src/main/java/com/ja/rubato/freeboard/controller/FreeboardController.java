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
	public String mainPage(Model model, String search_type, String search_word,
			@RequestParam(defaultValue = "1") int page_num) {
		// 할 것 많음
		//System.out.println(search_type+":"+search_word+":"+page_num);

		ArrayList<FreeboardVo> freeboardList = freeboardService.getContents(search_type, search_word, page_num);
		System.out.println(search_type+":"+search_word+":"+page_num);
		// 전체 글 수
		int count = freeboardService.getContentCount(search_type, search_word, page_num);
		// 전체 페이지 수(각 페이지 10개 글)
		int totalPageCount = (int) Math.ceil(count / 10.0);
		// 현재 페이지 번호
		int currentPage = page_num;
		// 보여줄 시작 페이지번호
		int beginPage = ((currentPage - 1) / 5) * 5 + 1;
		// 보여줄 끝 페이지번호
		int endPage = ((currentPage - 1) / 5 + 1) * (5);

		if (endPage > totalPageCount) {
			endPage = totalPageCount;
		}

		String addParam = "";

		if (search_type != null && search_word != null) {
			addParam += "&search_type=" + search_type;
			addParam += "&search_word=" + search_word;
		}
		model.addAttribute("addParam", addParam);

		model.addAttribute("currentPage", currentPage);
		model.addAttribute("beginPage", beginPage);
		model.addAttribute("endPage", endPage);
		model.addAttribute("totalPageCount", totalPageCount);

		model.addAttribute("freeboardList", freeboardList); // Q. request, session대신 model쓰는 이유??

		return "freeboard/freeboard_list";
	}
	
//	//==============================게시판 글 목록 클릭 시
//	@RequestMapping("freeboard_view.do")
//	public String readContentPage(int board_no, Model model, HttpSession session) {
//
//		System.out.println(board_no);
//		MemberVo vo = (MemberVo) session.getAttribute("sessionUser");
//		int loginMember_no;
//		
//		//System.out.println("readContentPageCheck"+vo);
//		
//		if(vo == null) {//로그인 안한 경우 
//			loginMember_no = -1;
//			freeboardService.increaseReadCount(board_no);
//			System.out.println(board_no);
//
//		}else {	//로그인 한 경우 
//			loginMember_no = vo.getMember_no();
//			// 조회수 증가
//			HashSet<Integer> visited = (HashSet) session.getAttribute("visited");
//	
//			if (!visited.contains(board_no)) {
//				freeboardService.increaseReadCount(board_no);
//				visited.add(board_no);
//				// System.out.println("first visited"+ board_no);
//			}
//		}
//		// 조회
//		HashMap<String, Object> map = freeboardService.getContent(board_no, loginMember_no);
//		
//		model.addAttribute("content", map);
//		
//
//		return "freeboard/freeboard_view";
//	}
//	
	//==============================board 글쓰기 관련 
	//
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
	public String deleteContentProcess(int freeboard_no) {

		freeboardService.deleteContent(freeboard_no);

		return "redirect:../freeboard/freeboard_list.do";
	}

//	@RequestMapping("updateContentBoard.do")
//	public String updateContentBoard(int board_no, Model model, HttpSession session) {
//
//		MemberVo vo = (MemberVo) session.getAttribute("sessionUser");
//		int loginMember_no = vo.getMember_no();
//
//		HashMap<String, Object> map = freeboardService.getContent(board_no, loginMember_no);
//
//		model.addAttribute("content", map);
//
//		return "freeboard/updateContentBoard";
//	}
//
//	@RequestMapping("updateContentProcess.do")
//	public String updateContentProcess(BoardVo param) {
//
//		freeboardService.updateContent(param);
//		
//		return "redirect:./freeboard_view.do?board_no=" + param.getBoard_no();
//	}
//	
//	//==============================댓글 관련 
//	@RequestMapping("writeComment.do")
//	public String writeComment(FreeboardCommentVo param, HttpSession session) {
//
//
//
//		return "redirect:./freeboard_view.do?board_no=";// + param.getBoard_no();
//	}
//
//	@RequestMapping("deleteComment.do")
//	public String deleteComment(int comment_no, int freeboard_no) {
//		freeboardService.deleteComment(comment_no);
//
//		return "redirect:./freeboard_view.do?freeboard_no=" + freeboard_no;
//	}
//
//	@RequestMapping("updateCommentBoard.do")
//	public String updateCommentBoard(BoardCommentVo param, int board_no, Model model, HttpSession session) {
//
//		MemberVo vo = (MemberVo) session.getAttribute("sessionUser");
//		int loginMember_no = vo.getMember_no();
//
//		HashMap<String, Object> map = freeboardService.getContent(board_no, loginMember_no);
//
//		model.addAttribute("content", map);
//
//		return "freeboard/updateCommentBoard";
//	}
//
//	@RequestMapping("updateCommentProcess.do")
//	public String updateCommentProcess(int freeboard_no, String comment_content, int comment_no) {
//
//		// System.out.println("comment_content:
//		// "+comment_content+"board_no"+board_no+"comment_no"+comment_no);
//		freeboardService.updateComment(comment_content, comment_no);
//
//		return "redirect:./freeboard_view.do?freeboard_no=" + freeboard_no;
//	}
//
//	//==============================종아요 관련 
//	@RequestMapping("changeRecommend.do")
//	public String changeRecommend(int freeboard_no, int member_no, int recommend) {
//
//		if (recommend == 0) {
//			freeboardService.upRecommend(freeboard_no, member_no);
//			// System.out.println("up"+recommend);
//		} else {
//			freeboardService.downRecommend(freeboard_no, member_no);
//			// System.out.println("down"+recommend);
//		}
//
//		return "redirect:./freeboard_view.do?freeboard_no=" + freeboard_no;
//	}
}
