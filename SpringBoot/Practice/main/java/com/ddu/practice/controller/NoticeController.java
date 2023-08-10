package com.ddu.practice.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ddu.practice.command.NoticeVO;
import com.ddu.practice.notice.service.NoticeService;

@Controller
@RequestMapping("/notice")
public class NoticeController {
	
	@Autowired
	@Qualifier("noticeService")
	private NoticeService noticeService;
	
	@GetMapping("/noticeList")
	public String noticeList(Model model) {
		ArrayList<NoticeVO> vo =noticeService.getList();
		model.addAttribute("vo", vo);
		return "notice/notice_list";
	}
	
	@GetMapping("/noticeView")
	public String noticeView(@RequestParam("notice_num") int notice_num,
							 Model model) {
		
		NoticeVO vo = noticeService.getVo(notice_num);
		model.addAttribute("vo", vo);
		return "notice/notice_view";
	}
	@GetMapping("/noticeWrite")
	public String noticeWrite() {
		return "notice/notice_write";
	}
	@GetMapping("/programList")
	public String programList() {
		return "notice/program_list";
	}
	
	@PostMapping("/registForm")
	public String registForm(NoticeVO vo) {
		noticeService.registNotice(vo);
		return "redirect:/notice/noticeList";
	}

	
	
}
