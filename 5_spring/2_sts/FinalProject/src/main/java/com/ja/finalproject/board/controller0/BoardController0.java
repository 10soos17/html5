package com.ja.finalproject.board.controller0;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ja.finalproject.board.service.BoardServiceImpl;
import com.ja.finalproject.vo.BoardVo;
import com.ja.finalproject.vo.MemberVo;

//servlet-context.xml 등록


@Controller
@RequestMapping("/board/*")
public class BoardController0 {

	@Autowired
	private BoardServiceImpl boardService;
	
	//로그인 성공시 or 로그아웃시 
	@RequestMapping("mainPage.do")
	public String mainPage(
			HttpSession session,
			Model model, 
			String search_type, 
			String search_word,
			@RequestParam(defaultValue = "1") int page_num){//@RequestParam(defaultValue = "1") 
		// 할 것 많음
		
		ArrayList<HashMap<String, Object>> contentList = 
				boardService.getContents(search_type, search_word, page_num);
		
		System.out.println(page_num);
		System.out.println(search_type);
		System.out.println(search_word);

		//전체 글 수 
		int count = boardService.getContentCount(search_type, search_word, page_num);
		//전체 페이지 수(각 페이지 10개 글)
		int totalPageCount = (int)Math.ceil(count/10.0);
		//현재 페이지 번호
		int currentPage = page_num;
		//보여줄 시작 페이지번호
		int beginPage = ((currentPage-1)/5)*5+1;
		//보여줄 끝 페이지번호 
		int endPage = ((currentPage-1)/5 + 1)*(5);
		
		if(endPage > totalPageCount){
			endPage = totalPageCount;
		}
//		String addParam = "";
		
//		if(search_type != null && search_word != null) {
//			addParam += "&search_type=" + search_type;
//			addParam += "&search_word=" + search_word;
//		}
//		model.addAttribute("addParam", addParam);
		
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("beginPage", beginPage);
		model.addAttribute("endPage", endPage);
		model.addAttribute("totalPageCount", totalPageCount);
		
		model.addAttribute("contentList", contentList); //Q. request, session대신 model쓰는 이유??
//		
		model.addAttribute("search_type", search_type);
		model.addAttribute("search_word", search_word);
//		session.setAttribute("search_type", search_type);
//		session.setAttribute("search_word", search_word);
		//session.setAttribute("page_num", page_num);
//		session.setAttribute("currentPage", currentPage);
//		session.setAttribute("beginPage", beginPage);
//		session.setAttribute("endPage", endPage);
//		session.setAttribute("totalPageCount", totalPageCount);
//		
//		model.addAttribute("contentList", contentList);
		
		return "board/mainPage";
	}

	//mainPage.do에서 글쓰기 클릭 시
	@RequestMapping("writeContentPage.do")
	public String writeContentPage() {

		return "board/writeContentPage";
	}

	//writeContentPage.do에서 submit 시
	@RequestMapping("writeContentProcess.do")
	public String writeContentProcess(BoardVo param, HttpSession session) {

		// 공부해야 할 부분

		MemberVo sessionUser = (MemberVo) session.getAttribute("sessionUser");
		int member_no = sessionUser.getMember_no();

		param.setMember_no(member_no);

		//
		boardService.writeContent(param);

		return "redirect:./mainPage.do";
	}
	
	//게시판 글 목록 클릭 시
	@RequestMapping("readContentPage.do")
	public String readContentPage(int board_no, Model model) {
		
		//조회수 증가
		boardService.increaseReadCount(board_no);
		
		//조회
		HashMap<String, Object> map =boardService.getContent(board_no);
		
		model.addAttribute("content", map);
		
		return "board/readContentPage";
	}
	
	@RequestMapping("deleteContentProcess.do")
	public String deleteContentProcess(int board_no) {
		
		boardService.deleteContent(board_no);
		
		return "redirect:./mainPage.do";
	}
	
	@RequestMapping("updateContentPage.do")
	public String updateContentPage(int board_no, Model model) {
		
		HashMap<String, Object> map = boardService.getContent(board_no);
		
		model.addAttribute("content", map);
		
		return "board/updateContentPage";
	}
	
	@RequestMapping("updateContentProcess.do")
	public String updateContentProcess(BoardVo param) {
		
		boardService.updateContent(param);
		
		return "redirect:./readContentPage.do?board_no=" + param.getBoard_no();
	}
	
			
}











