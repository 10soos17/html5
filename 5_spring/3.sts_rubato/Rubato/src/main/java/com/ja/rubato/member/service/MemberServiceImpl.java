package com.ja.rubato.member.service;

import com.ja.rubato.commons.MessageDigestUtil;
import com.ja.rubato.member.mapper.MemberSQLMapper;
import com.ja.rubato.vo.HobbyCategoryVo;
import com.ja.rubato.vo.HobbyVo;
import com.ja.rubato.vo.MailAuthVo;
import com.ja.rubato.vo.MemberVo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MemberServiceImpl {
	
	@Autowired // DI(setter 주입)
	private MemberSQLMapper memberSQLMapper;

	//==============================회원 가입시
	
	//==============================HobbyCategory table
	//select FP_HobbyCategory 회원 가입 정보 기입 취미란에 입력할 선택 정보 뿌리기
	public ArrayList<HobbyCategoryVo> getHobbyCategoryList() {
		return memberSQLMapper.getCategoryList();
	}
	
	//insert RBT_Member table에 하기 전에 처리할 것
	//member_pk인 member_no 먼저 만들고 받은 MemberVo에 세팅하기
	//비밀번호 해쉬값으로 만들기
	//---> insert RBT_Member
	//---> insert RBT_MailAuth
	//---> insert RBT_Hobby
	public void joinMember(MemberVo vo, int[] hobby_category_no, MailAuthVo mailAuthVo) {
		
		int member_no = memberSQLMapper.createMemberPK(); //pk 값을 먼저 생성
		vo.setMember_no(member_no); //pk 값을 먼저 세팅
		
		//비밀번호 해쉬값 획득 및 변경
		String hashCode = MessageDigestUtil.getPasswordHashCode(vo.getMember_pw());
		vo.setMember_pw(hashCode);
		
		memberSQLMapper.joinMember(vo);
		
		mailAuthVo.setMember_no(member_no);
		memberSQLMapper.createMailAuthInfo(mailAuthVo);

		if(hobby_category_no == null) {
			return;
		}
		
		for(int hobby : hobby_category_no) {
			HobbyVo hobbyVo = new HobbyVo();
			hobbyVo.setHobby_category_no(hobby);
			hobbyVo.setMember_no(member_no);
			
			memberSQLMapper.registerHobby(hobbyVo);
		}
	}
	
	public void certifyMail(String key) {
		memberSQLMapper.certifyMail(key);
	}
	
	public MemberVo login(MemberVo param) {
		//입력받은 비번 해쉬코드로 변경 후 select FP_Member
		String hashCode = MessageDigestUtil.getPasswordHashCode(param.getMember_pw());
		param.setMember_pw(hashCode);
		
		MemberVo result = memberSQLMapper.getMemberByIdAndPw(param);
		
		return result;
		
	}
}
