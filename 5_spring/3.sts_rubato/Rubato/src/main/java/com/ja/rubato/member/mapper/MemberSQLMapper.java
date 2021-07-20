package com.ja.rubato.member.mapper;

import java.util.ArrayList;

import com.ja.rubato.vo.HobbyCategoryVo;
import com.ja.rubato.vo.HobbyVo;
import com.ja.rubato.vo.MailAuthVo;
import com.ja.rubato.vo.MemberVo;

public interface MemberSQLMapper {

	public int createMemberPK();
	
	//===============FP_Member table
	
	//insert
	public void joinMember(MemberVo vo); //cf. 매개변수 여러개 쓸수없다 ,여러 개 매핑시, @param 설정하기
	
	//select
	public MemberVo getMemberByIdAndPw(MemberVo vo);
	
	//select
	public MemberVo getmemberByNo(int no);

	//===============FP_HobbyCategory table, FP_Hobby table

	//select
	public ArrayList<HobbyCategoryVo> getCategoryList();
	
	//insert
	public void registerHobby(HobbyVo vo);
	
	
	//===============FP_MailAuth table(메일 인증 관련)
	
	//insert
	public void createMailAuthInfo(MailAuthVo vo);
	
	//update
	public void certifyMail(String mailauth_key);
	
	
}
