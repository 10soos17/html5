package com.ja.finalproject2.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ja.finalproject2.member.mapper.MemberSQLMapper;
import com.ja.finalproject2.vo.MemberVo;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	@Autowired
	private MemberSQLMapper memberSQLMapper;

	@RequestMapping("loginPage.do")
	public String loginPage() {

		return "member/loginPage";
	}

	@RequestMapping("joinMemberPage.do")
	public String joinMemberPage() {

		return "/member/joinMemberPage";
	}

	@RequestMapping("joinMemberProcess.do")
	public String joinMemberProcess(MemberVo param) {
		
		memberSQLMapper.joinMember(param);
		
//		System.out.println("[test]" + param.getMember_id());
//		System.out.println("[test]" + param.getMember_nick());
//		System.out.println("[test]" + param.getMember_gender());
		return "member/joinMemberComplete";
	}

}
