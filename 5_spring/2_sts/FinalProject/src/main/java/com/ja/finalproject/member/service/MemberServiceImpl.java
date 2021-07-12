package com.ja.finalproject.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ja.finalproject.member.mapper.MemberSQLMapper;
import com.ja.finalproject.vo.MemberVo;

//db

//root-context.xml

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