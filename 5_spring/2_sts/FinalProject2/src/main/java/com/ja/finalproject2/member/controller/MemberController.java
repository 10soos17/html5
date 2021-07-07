package com.ja.finalproject2.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member/*")
public class MemberController {

	@RequestMapping("loginPage.do")
	public String loginPage() {

		return "member/loginPage";
	}

	@RequestMapping("joinMemberPage.do")
	public String joinMemberPage() {

		return "/member/joinMemberPage";
	}

	@RequestMapping("joinMemberProcess.do")
	public String joinMemberProcess(String id, String nick) {
		System.out.println("[test]" + id);
		System.out.println("[test]" + nick);
		return "";
	}

}
