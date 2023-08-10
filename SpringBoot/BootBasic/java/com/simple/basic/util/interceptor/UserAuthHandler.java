package com.simple.basic.util.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class UserAuthHandler implements HandlerInterceptor {
	
	//컨트롤러 진입하기 이전에 실행됨
	//return true가 들어가면 컨트롤러가 실행됨
	//return false가 들어가면 컨트롤러를 실행 x
	//스프링설정파일에 인터셉터를 등록
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		System.out.println("userAuthHandler동작함");
		System.out.println("==============");
		
		//세션검사 or 파라미터 검사
		HttpSession session = request.getSession();
		
		if(session.getAttribute("username") != null) { //로그인이 된 사람
			
			return true;
			
		}else { // 로그인이 안돼있는 경우
			
			response.sendRedirect(request.getContextPath()+"/user/login");
			return false;
		}
		

	}
	 
	// 컨트롤러 실행후에 동작함
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// 모델앤뷰를 사용해서 컨트롤러에서 돌아오는 모델데이터 or 뷰의 정보 확인
		System.out.println("userAuthHandler post 핸들러 동작함");
		System.out.println("========================");
		
	}
	
	
	
	
	

}
