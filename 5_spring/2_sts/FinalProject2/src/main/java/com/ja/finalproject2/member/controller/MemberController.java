package com.ja.finalproject2.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ja.finalproject2.member.mapper.MemberSQLMapper;
import com.ja.finalproject2.member.service.MemberServiceImpl;
import com.ja.finalproject2.vo.MemberVo;

@Controller // sevlet-context.xml 등록
@RequestMapping("/member/*")
public class MemberController {

	// 2 tier
	// @Autowired
	// private MemberSQLMapper memberSQLMapper;

	// 3tier
	@Autowired
	private MemberServiceImpl memberService;

	@RequestMapping("loginPage.do")
	public String loginPage() {

		return "member/loginPage";
	}

	@RequestMapping("joinMemberPage.do")
	public String joinMemberPage() {

		return "/member/joinMemberPage";
	}

	@RequestMapping("joinMemberProcess.do")
	public String joinMemberProcess(MemberVo param) {// MemberVo 멤버변수명과 일치해야 값 setting됨

		// 2 tier(큰 큐모일수록 더 많은 tier)
		// memberSQLMapper.joinMember(param);

		// 3 tier(service->db)
		memberService.joinMember(param);

//		System.out.println("[test]" + param.getMember_id());
//		System.out.println("[test]" + param.getMember_nick());
//		System.out.println("[test]" + param.getMember_gender());
		return "member/joinMemberComplete";
	}

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
	
	@RequestMapping("logoutProcess.do")
	public String logoutProcess(HttpSession session) {
		
		session.invalidate();
		
		return "redirect:../board/mainPage.do";
	}

}
