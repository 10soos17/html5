package com.ja.finalproject.member.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ja.finalproject.member.mapper.MemberSQLMapper;
import com.ja.finalproject.vo.HobbyCategoryVo;
import com.ja.finalproject.vo.HobbyVo;
import com.ja.finalproject.vo.MemberVo;

//db

//root-context.xml

@Service
public class MemberServiceImpl {
	
	@Autowired //DI(setter 주입)
	private MemberSQLMapper memberSQLMapper;
	
	//----Member table
	
	public void joinMember(MemberVo vo, int [] hobby_category_no) {
		
		int member_no = memberSQLMapper.createMemberPK();//pk 값을 먼저 생성
		vo.setMember_no(member_no);//pk 값을 설정
		
		memberSQLMapper.joinMember(vo);
		
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
	//
	public MemberVo login(MemberVo param) {
		
		MemberVo result = memberSQLMapper.getMemberByIdAndPw(param);
		
		return result;
	}
	
	//----HobbyCategory table
	public ArrayList<HobbyCategoryVo> getHobbyCategoryList(){
		return memberSQLMapper.getCategoryList();
	}
}