package com.simple.basic.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class SessionController {
	
	@GetMapping("/mypage")
	public String mypage(HttpSession session) {
		/*
		 * if(session.getAttribute("username") == null) { return "redirect:user/login";
		 * }
		 */
		System.out.println("컨트롤러 실행됨");
		System.out.println("==========");
		
		return "user/mypage";
	}
	@GetMapping("/login")
	public String login() {
		
		return "user/login";
	}
	
	@PostMapping("/loginForm")
	public String loginForm(/* HttpServletRequest request, */
							HttpSession session) {
		
		//로그인 시도 (성공) 후 session 불러오기
		/* HttpSession session = request.getSession(); */
		String username = "aaa123";
		
		
		//로그인성공시
		if(username.equals("aaa123")) {
			session.setAttribute("username", "aaa123");
			return "redirect:/user/mypage"; //리다이렉트에는 원래 값 못 가져가는데 세션은 노상관
		}else {
			return "redirect:/" ; // 홈
		}
		
	}
	@GetMapping("/modify")
	public String modify() {
		
		return "user/modify";
	}
	
	
	

}
