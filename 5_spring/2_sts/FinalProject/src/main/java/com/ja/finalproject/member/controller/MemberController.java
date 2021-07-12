package com.ja.finalproject.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ja.finalproject.member.mapper.MemberSQLMapper;
import com.ja.finalproject.member.service.MemberServiceImpl;
import com.ja.finalproject.vo.MemberVo;


//servlet-context.xml 등록

@Controller
@RequestMapping("/member/*")
public class MemberController {

	// 2 tier
	// @Autowired
	// private MemberSQLMapper memberSQLMapper;

	// 3tier
	@Autowired
	private MemberServiceImpl memberService;

	//======첫화면 
	@RequestMapping("loginPage.do")
	public String loginPage() {

		return "member/loginPage";
	}

	//======회원 가입 
	@RequestMapping("joinMemberPage.do")
	public String joinMemberPage() {

		return "/member/joinMemberPage";
	}

	//======회원 가입 기입 후 sumbit 
	@RequestMapping("joinMemberProcess.do")
	public String joinMemberProcess(MemberVo param) {// MemberVo 멤버변수명과 일치해야 값 setting됨

		// 2 tier(큰 규모일수록 더 많은 tier)
		// memberSQLMapper.joinMember(param);

		// 3 tier(serviceImpl->mapper->xml(db))
		memberService.joinMember(param);

//		System.out.println("[test]" + param.getMember_id());
//		System.out.println("[test]" + param.getMember_nick());
//		System.out.println("[test]" + param.getMember_gender());
		return "member/joinMemberComplete";
	}

	//======login 시도
	@RequestMapping("loginProcess.do")
	public String loginProcess(HttpSession session, MemberVo param) {

		MemberVo sessionUser = memberService.login(param);

		// System.out.println();

		if (sessionUser != null) {
			// 인증 성공
			session.setAttribute("sessionUser", sessionUser);//중요 
		
			return "redirect:../board/mainPage.do";

		} else {
			// 인증 실패
			return "member/loginFail";

		}

	}
	//======logout 시도
	@RequestMapping("logoutProcess.do")
	public String logoutProcess(HttpSession session) {
		
		session.invalidate();
		
		return "redirect:../board/mainPage.do";
	}

}