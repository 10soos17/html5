package com.ja.finalproject2.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ja.finalproject2.member.mapper.MemberSQLMapper;
import com.ja.finalproject2.vo.MemberVo;

@Service
public class MemberServiceImpl {
	
	@Autowired //DI(setter 주입)
	private MemberSQLMapper memberSQLMapper;
	
	public void joinMember(MemberVo vo) {
		memberSQLMapper.joinMember(vo);
	}
	
	public MemberVo login(MemberVo param) {
		
		MemberVo result = memberSQLMapper.getMemberByIdAndPw(param);
		
		return result;
	}
}
