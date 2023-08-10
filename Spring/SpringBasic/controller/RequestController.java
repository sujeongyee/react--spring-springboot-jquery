package com.simple.controller;

import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.ReqVO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("/request") // 각 메서드의 공통분모
public class RequestController {
	
	//화면을 띄우는 
	@RequestMapping("/req_ex01")
	public String ex01() {
		
		return "request/req_ex01";
	} // 나가는 경로는 항상 resolver view에 합성 된다고 생각을 해야 합니다.
	
	//get요청만 허용 (2가지 값 이상을 넣고 싶다면 value = , method = 이런식으로!)
	//@RequestMapping(value = "/basic1", method=RequestMethod.GET)
	
	
	@GetMapping("/basic")
	public void basic1() {
		System.out.println("basic요청");
	}
	
	//post요청만 허용
	//@RequestMapping(value = "/basic2", method=RequestMethod.POST)
	
	@PostMapping("/basic2")	
	public void basic2() {
		System.out.println("basic2요청");
	}
	
	@RequestMapping("/basic3")
	public void basic3() {
		System.out.println("basic3요청");
	}
	
	/////////////////////////////////////////////////////////
	//파라미터값 받기
	@RequestMapping("/req_ex02")
	public String ex02() {
		return"request/req_ex02";
	}
	
	//@PostMapping("/param1")
	//1. 전통적인 방법 request객체 사용
//	@RequestMapping("/param1")
//	public String param1(HttpServletRequest request) {
//		String name = request.getParameter("name");
//		String age = request.getParameter("age");
//		String[] inter = request.getParameterValues("inter");
//		
//		System.out.println(name+"   "+age);
//		System.out.println(Arrays.toString(inter));
//		
//		return "request/result";
//	}
	
	//2. RequestParam 어노테이션 방법(네임값) - 반드시 필수로 값이 전달이 돼야 합니다.
	//required = false는 반드시 필수가 아님
	//defaultValue 값이 없을 때 기본값
//	@RequestMapping("/param1")
//	public String param1(@RequestParam(value = "name", required = false , defaultValue = "박수정") String name,
//						 @RequestParam(value = "age", required = false , defaultValue = "27") int age,
//						 @RequestParam(value = "inter", required = false, defaultValue = "") ArrayList<String> inter) {
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(inter.toString());
//		return "request/result";
//	}
	//커맨드객체를 이용 하는 방법
	@RequestMapping("/param1")
	public String param1(ReqVO vo) {
		
		System.out.println(vo.toString());
		
		return "request/result";
	}
	@RequestMapping("/req_quiz01")
	public String quiz01() {
		return "request/req_quiz01";
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam("id") String id,
					    @RequestParam("pw") String pw) {
		
		if(id.equals("abc123")&&pw.equals("xxx123")) {
			return "request/req_quiz01_ok";
		}else {
			return "request/req_quiz01_no";
		}
		
	}
	
	
}
