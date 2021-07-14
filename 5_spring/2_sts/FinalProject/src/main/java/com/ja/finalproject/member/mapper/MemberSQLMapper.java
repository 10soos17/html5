package com.ja.finalproject.member.mapper;

import java.util.ArrayList;

import com.ja.finalproject.vo.HobbyCategoryVo;
import com.ja.finalproject.vo.HobbyVo;
import com.ja.finalproject.vo.MemberVo;

//root-context.xml

//MemberServiceImpl.java가 이 mapper 를 호출
//@Insert, @Select 방식 대신 인터페이스 만들고 MemberSQLMapper.xml에 설정하였음 

public interface MemberSQLMapper {
	
	public int createMemberPK();
	
	//----Member table
	
	//insert
	public void joinMember(MemberVo vo);
	
	//select
	public MemberVo getMemberByIdAndPw(MemberVo vo);
	
	//select
	public MemberVo getMemberByNo(int no); // , 여러개 쓸수없다 
	
	//----HobbyCategory table, Hobby table
	public ArrayList<HobbyCategoryVo> getCategoryList();
	
	public void registerHobby(HobbyVo vo);
}
