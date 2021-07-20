package com.ja.finalproject.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;
import org.springframework.web.servlet.mvc.WebContentInterceptor;

import com.ja.finalproject.vo.MemberVo;

//==============================user별로(혹은 권한별로)특정 페이지 접근 가능 설정 -> 페이지 접근 권한 없는 자가 주소 직접 입력 시, 막기 위해 
//								대부분 로그인 한 사용자만 접근 가능한 페이지에 대하여 사용함
public class AuthInterceptor extends WebContentInterceptor{
	
	public boolean preHandle(
			HttpServletRequest request, 
			HttpServletResponse response, 
			Object handler) throws ModelAndViewDefiningException {
		
		MemberVo sessionUser = (MemberVo)request.getSession().getAttribute("sessionUser");
		
		//로그인하지 않은 경우 보여줄 페이지 처리 
		//ex. 로그인하지 않은 상태에서 글쓰기 관련 페이지 주소직접 입력시, member/loginRequired로 이동함. 즉, 접근 못하도록 하기
		if(sessionUser == null) {
			ModelAndView mv = new ModelAndView("member/loginRequired");
			throw new ModelAndViewDefiningException(mv);
		}
		//System.out.println("[인터셉터 테스트]");
		
		return true;
	}
	
}
