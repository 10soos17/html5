package com.ja.finalproject2.member.mapper;

import com.ja.finalproject2.vo.MemberVo;

public interface MemberSQLMapper {
	
	public void joinMember(MemberVo vo);
	
	public MemberVo getMemberByIdAndPw(MemberVo vo);
	
}
