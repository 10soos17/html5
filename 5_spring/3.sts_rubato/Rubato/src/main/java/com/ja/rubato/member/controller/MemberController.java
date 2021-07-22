package com.ja.rubato.member.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ja.rubato.member.service.MemberServiceImpl;
import com.ja.rubato.vo.HobbyCategoryVo;
import com.ja.rubato.vo.MailAuthVo;
import com.ja.rubato.vo.MemberVo;

@Controller
@RequestMapping("member/*")
public class MemberController {

	@Autowired
	private MemberServiceImpl memberService;

	// 회원 가입시 인증 메일 클래스
	@Autowired
	private JavaMailSender mailSender;

	// ==============================첫 페이지
	@RequestMapping("index.do")
	public String index() {

		return "member/index";
	}

	// ==============================회원 가입 페이지

	@RequestMapping("joinMemberPage.do")
	public String joinMemberPage(Model model) {

		// 취미 선택 리스트(db에서 불러와서 목록에 뿌리기)
		ArrayList<HobbyCategoryVo> list = memberService.getHobbyCategoryList();
		model.addAttribute("hobbyCategoryList", list);

		return "member/joinMemberPage";
	}

	// ==============================회원 가입 기입 후 sumbit
	@RequestMapping("joinMemberProcess.do")
	public String joinMemberProcess(MemberVo param, int[] hobby_category_no) {

		// ------회원 가입시, 인증 메일 전송 서비스 설정
		// root-context.xml파일 - 메일 관련 인스턴스 추가(구글 api) && MailAutho class랑 db 만들기
		// 랜덤 키 생성
		// class MailSendThread
		String uuid = UUID.randomUUID().toString();

		MailAuthVo mailAuthVo = new MailAuthVo();
		mailAuthVo.setMailauth_key(uuid);

		// 메일 보내는 thread 생성 및 실행
		MailSendThread th = new MailSendThread(mailSender, param.getMember_email(), uuid);
		th.start();

		// insert db 처리
		memberService.joinMember(param, hobby_category_no, mailAuthVo);

		return "member/joinMemberComplete";
	}

	//==============================인증 메일 확인 시
	@RequestMapping("certifyMail.do")
	public String certifyMail(String mailauth_key) {

		memberService.certifyMail(mailauth_key);

		return "member/certifyMailComplete";
	}
	
	//==============================login 시도
	@RequestMapping("loginProcess.do")
	public String loginProcess(HttpSession session, MemberVo param) {
		
		
		MemberVo sessionUser = memberService.login(param);
		Set <Integer> visited = new HashSet<>(); //조회한 게시판 글 번호 저장 용도(조회수 관리)
		
		if(sessionUser != null) {
			//인증 성공
			session.setAttribute("sessionUser", sessionUser);
			session.setAttribute("visited", visited);
		
			return "redirect:../member/index.do";//board/mainPage"; //
			
		}else {
			//인증 실패
			return "member/loginFail";
		}
		
	}
	
	//==============================logout 시도
	@RequestMapping("logoutProcess.do")
	public String logoutProcess(HttpSession session) {
		
		session.invalidate();
		
		return "redirect:../member/index.do";
	}
}

//========================================================================================================================
//==============================회원 가입, 인증 메일 발송(thread로 처리)
//========================================================================================================================
class MailSendThread extends Thread {

	private JavaMailSender mailSender;
	private String mailAddress;
	private String key;

	public MailSendThread(JavaMailSender mailSender, String mailAddress, String key) {
		this.mailSender = mailSender;
		this.mailAddress = mailAddress;
		this.key = key;
	}

	public void run() {
		try {
			MimeMessage mimeMessage = mailSender.createMimeMessage();
			MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true, "UTF-8");

			mimeMessageHelper.setSubject("[인증 메일] 회원 가입을 축하드립니다.");

			// 인증 메일 확인 시 보낼 페이지(파람에 키값 받아서 처리)
			String text = "";
			text += "<h1>회원 가입 완료</h1>";
			text += "다음 링크를 클릭하여 인증을 완료해 주세요.<br>";
			text += "<a href='http://localhost:8181/rubato/member/certifyMail.do?mailauth_key=" + key + "'>";
			text += "인증하기";
			text += "</a>";

			mimeMessageHelper.setText("내용: " + text, true);// 순수문자(true) or html(false)

			try {
				mimeMessageHelper.setFrom("admin", "사이트 관리자");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}

			mimeMessageHelper.setTo(mailAddress);
			mailSender.send(mimeMessage);

		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

}
