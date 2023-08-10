package com.coding404.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/join")
	public String join() {
		return "user/join";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "user/login";
	}
	
	@RequestMapping("/mypage")
	public String mypage() {
		return "user/mypage";
	}
	
	
}
