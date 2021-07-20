package com.ja.rubato.member.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ja.rubato.member.service.MemberServiceImpl;
import com.ja.rubato.vo.HobbyCategoryVo;

@Controller
@RequestMapping("/member/*")
public class MemberController {

	@Autowired
	private MemberServiceImpl memberService;

	// 회원 가입시 인증 메일 클래스
	@Autowired
	private JavaMailSender mailSender;

	@RequestMapping("joinMemberPage.do")
	public String joinMemberPage(Model model) {

		// 취미 선택 리스트(db에서 불러와서 목록에 뿌리기)
		ArrayList<HobbyCategoryVo> list = memberService.getHobbyCategoryList();


		return "/member/joinMemberPage";

	}


}
