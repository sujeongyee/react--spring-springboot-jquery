package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.UserVO;

@Controller
@RequestMapping("/quiz")
public class QuizController {
	

	
	@RequestMapping("/quiz01")
	public void quiz01() {
	
	}
	
	@RequestMapping("/quiz01_ok")
	public String quizok(@RequestParam("year") String year,
						 @RequestParam("month") String month,
						 @RequestParam("day") String day,
						 Model model) {
		String msg = "당신의 생일은 "+year+"년 "+month+"월 "+day+"일 입니다";
		model.addAttribute("msg",msg);
		return "quiz/quiz01_ok";
	}
	
	@RequestMapping("/quiz02")
	public void quiz02() {
		
	}
	@RequestMapping("/join")
	public String join(UserVO vo,Model model) {
		String msg = "아이디 : "+vo.getId()+ "<br/>비밀번호 : " + vo.getPw()
				+ "<br/>이름 : " + vo.getName()+ "<br/>이메일 : " + vo.getEmail(); 
		
		model.addAttribute("msg",msg);
		return "quiz/quiz02_ok";
		
	}
	
	@RequestMapping("/quiz03")
	public void quiz03() {
		
	}
	
	@RequestMapping("/join2")
	public String join2(UserVO vo , @RequestParam("pw_check") String pw2,Model model,RedirectAttributes ra) {
		if(vo.getId().equals("")) {
			ra.addFlashAttribute("msg", "아이디 입력하셔야쥬?");
			return "redirect:/quiz/quiz03";
		}else if(!vo.getPw().equals(pw2)) {
			ra.addFlashAttribute("msg", "비밀번호 두개가 다르쥬?");
			return "redirect:/quiz/quiz03";
		}else{
			model.addAttribute("msg", vo.getId()+"님 회원가입을 추카포카해요!");
			return "quiz/quiz03_ok";
		}
		
	}
}
