package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping("/test/aaa")
	public ModelAndView main() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("aaa");
		mv.addObject("data","hell로 월드 정말 어려웡");
		return mv;
	}
}
