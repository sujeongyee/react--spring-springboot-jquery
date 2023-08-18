package com.coding404.jwt.security.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import com.coding404.jwt.security.config.JWTService;

public class JwtAuthorizationFilter extends BasicAuthenticationFilter{
	
	//생성자
	public JwtAuthorizationFilter(AuthenticationManager authenticationManager) {
		super(authenticationManager);
				
	}
	
	//필터기능
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("================JwtAuthorizationFilter실행됨==============>");
		
		//헤더에 담긴 토큰이 유효성을 확인하고, 인증된 토큰이면 우리서비스로 연결, 만료or위조 인 경우에는 error 메시지 반환
		
		String headers = request.getHeader("Authorization");
		
		//헤더가 없거나 Bearer로 시작하지 않으면
		if(headers == null || headers.startsWith("Bearer ")==false) {
			
			response.setContentType("text/plain; charset=UTF8;");
			response.sendError(403, "토큰없음");
			
			return; // 함수종료
		}
		
		//토큰의 유효성검사
		try {

			boolean result = JWTService.validateToken(headers.substring(7)); //bearer 공백 이후에 토큰
			
			if(result) { //true면 정상토큰
				chain.doFilter(request, response); //컨트롤러로 연결됨
			}else { // 토큰이 만료됨
				response.setContentType("text/plain; charset=UTF8;");
				response.sendError(403, "토큰만료");
			}
			
			
		} catch (Exception e) { //토큰이 위조
			e.printStackTrace();
			response.setContentType("text/plain; charset=UTF8;");
			response.sendError(403, "토큰위조");
		}
		
		//super.doFilterInternal(request, response, chain);
	}
	
	
	

}
