package com.simple.basic.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.simple.basic.command.MemberVO;
import com.simple.basic.command.ValidVO;

@Controller
@RequestMapping("/valid")
public class ValidController {
	//화면
	@GetMapping("/view")
	public String view() {
		return "valid/view";
	}
	//폼요청
	@PostMapping("/viewForm")
	public String viewForm(@Valid @ModelAttribute("vo") ValidVO vo , Errors err , Model model) {
		
		if(err.hasErrors()) { // 에러가 있다면 true, 없다면 false
			
			//1. 유효성 검사에 실패한 에러 확인
			List<FieldError> list = err.getFieldErrors();
			
			//2. 반복처리
			for(FieldError err2: list) {
//				System.out.println(err2);
//				System.out.println(err2.getField()); // 에러가 난 필드명
//				System.out.println(err2.getDefaultMessage()); // 메시지 출력
//				System.out.println(err2.isBindingFailure());//유효성검사에 의해서 err라면 false, 아니면 true반환
				if(err2.isBindingFailure()) {
					model.addAttribute("valid_"+err2.getField(), "잘못된 값 입력입니다.");
				}else {
					model.addAttribute("valid_"+err2.getField(), err2.getDefaultMessage());
				}
				
				
			}
			
			
		}		
		return "valid/view";
//		System.out.println(vo.toString());
//		System.out.println(err);
		
	}
	
	@GetMapping("/quiz01")
	public String quiz01() {
		return "valid/quiz01";
	}
	
	@PostMapping("/quizForm")
	public String quizForm(@Valid @ModelAttribute("vo") MemberVO vo, Errors err,Model model) {
		
		if(err.hasErrors()) {
			List<FieldError> list = err.getFieldErrors();
			
			for(FieldError errr: list) {
				if(errr.isBindingFailure()) {
					model.addAttribute("v_"+errr.getField(), "잘못된 값 입력입니다");
				}else {
					model.addAttribute("v_"+errr.getField(),errr.getDefaultMessage());
				}
			}
			return "valid/quiz01";
		}
		
		return "valid/quiz01_result";
	}
	
	
	
	
	
	
	
	
	
}
