package com.ja.finalproject.member.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ja.finalproject.member.mapper.MemberSQLMapper;
import com.ja.finalproject.member.service.MemberServiceImpl;
import com.ja.finalproject.vo.HobbyCategoryVo;
import com.ja.finalproject.vo.MemberVo;

//servlet-context.xml 등록

@Controller
@RequestMapping("/member/*")
public class MemberController {

	// 2 tier
	// @Autowired
	// private MemberSQLMapper memberSQLMapper;

	// 3 tier
	@Autowired
	private MemberServiceImpl memberService;

	// ======첫화면
	@RequestMapping("loginPage.do")
	public String loginPage() {

		return "member/loginPage";
	}

	// ======회원 가입 페이지
	@RequestMapping("joinMemberPage.do")
	public String joinMemberPage(Model model) {

		// 취미 선택 리스트(db에서 불러와서 목록에 뿌리기)
		ArrayList<HobbyCategoryVo> list = memberService.getHobbyCategoryList();

		model.addAttribute("hobbyCategoryList", list);

		return "/member/joinMemberPage";
	}

	// ======회원 가입 기입 후 sumbit
	@RequestMapping("joinMemberProcess.do")
	public String joinMemberProcess(MemberVo param, int[] hobby_category_no) {// MemberVo 멤버변수명과 일치해야 값 setting됨

		// 2 tier(큰 규모일수록 더 많은 tier)
		// memberSQLMapper.joinMember(param);

		// 3 tier(serviceImpl->mapper->xml(db))
		memberService.joinMember(param, hobby_category_no);

//		System.out.println("[test]" + param.getMember_id());
//		System.out.println("[test]" + param.getMember_nick());
//		System.out.println("[test]" + param.getMember_gender());
		return "member/joinMemberComplete";
	}

	// ======login 시도
	@RequestMapping("loginProcess.do")
	public String loginProcess(HttpSession session, MemberVo param) {

		MemberVo sessionUser = memberService.login(param);
		Set <Integer> visited = new HashSet<>();//조회한 게시판 글 번호 저장 용도(조회수 관리) 

		// System.out.println();

		if (sessionUser != null) {
			// 인증 성공
			session.setAttribute("sessionUser", sessionUser);// 중요
			session.setAttribute("visited", visited);
			
			return "redirect:../board/mainPage.do";

		} else {
			// 인증 실패
			return "member/loginFail";

		}

	}

	// ======logout 시도
	@RequestMapping("logoutProcess.do")
	public String logoutProcess(HttpSession session) {

		session.invalidate();

		return "redirect:../board/mainPage.do";
	}
	
	// ==================================회원정보수정========================================================
	// ===============self try

	@RequestMapping("readMyPage.do")
	public String readMyPage(HttpSession session, Model model) {

		MemberVo vo = (MemberVo) session.getAttribute("sessionUser");

		ArrayList<HobbyCategoryVo> myList = memberService.getHobby(vo);
		model.addAttribute("myHobbyCategoryList", myList);

		return "member/readMyPage";
	}
	
	//
	@RequestMapping("editMyPage.do")
	public String editMyPage(Model model) {

		// 취미 선택 리스트(db에서 불러와서 목록에 뿌리기)
		ArrayList<HobbyCategoryVo> list = memberService.getHobbyCategoryList();

		model.addAttribute("hobbyCategoryList", list);

		return "member/editMyPage";
	}
	
	//
	@RequestMapping("editMyPageProcess.do")
	public String editMyPageProcess(HttpSession session, Model model, MemberVo vo, int[] hobby_category_no){
		
		//MemberVo vo = (MemberVo)session.getAttribute("sessionUser");
		
		MemberVo updateVo = memberService.updateMyInfo(vo, hobby_category_no);
		session.setAttribute("sessionUser", updateVo);
		
		ArrayList<HobbyCategoryVo> myList = memberService.getHobby(updateVo);
		model.addAttribute("myHobbyCategoryList", myList);

		return "/member/readMyPage";
	}

}






