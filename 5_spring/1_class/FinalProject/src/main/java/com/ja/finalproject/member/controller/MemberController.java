package com.ja.finalproject.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	@RequestMapping("loginPage.do")
	public String loginPage() {
		
		return "member/loginPage";
	}

}
