package com.coding404.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/trip")
public class TripController {
	
	//목록화면
	@RequestMapping("/notice_list")
	public String list() {
		return "trip/notice_list";
	}
	//내용화면
	@RequestMapping("/notice_view")
	public String view() {
		return "trip/notice_view";
	}
	//수정화면
	@RequestMapping("/notice_modify")
	public String modify() {
		return "trip/notice_modify";
	}
	//등록화면
	@RequestMapping("/notice_write")
	public String write() {
		return "trip/notice_write";
	}
	
	
	
	
	
}
