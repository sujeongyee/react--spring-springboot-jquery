package com.coding404.myweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.coding404.myweb.command.TopicVO;
import com.coding404.myweb.product.service.ProductService;
import com.coding404.myweb.product.service.TopicService;
import com.coding404.myweb.util.PageVO;
import com.coding404.myweb.util.Paging;
import com.coding404.myweb.util.PagingVO;

@Controller
@RequestMapping("/topic")
public class TopicController {
	
	
	@Autowired
	@Qualifier("topicService")
	private TopicService topicService;
	
	
	@GetMapping("/topicDetail")
	public String topicDetail(@RequestParam("topic_num") int topic_num, Model model) {
		TopicVO vo = topicService.topicDetail(topic_num);
		model.addAttribute("detailVO", vo);
		return "topic/topicDetail";
	}
	
	@GetMapping("/topicListAll")
	public String topicListAll(Model model,Paging paging) {

		List<TopicVO> list = topicService.getTopic(paging);
		int total = topicService.getTotal(paging);
		PagingVO pageVO = new PagingVO(paging,total);
		model.addAttribute("list", list);
		model.addAttribute("pageVO", pageVO);
		return "topic/topicListAll";
	}
	@GetMapping("/topicListMe")
	public String topicListMe(Model model) {
		List<TopicVO> myList = topicService.getMyTopic("admin");
		model.addAttribute("myList", myList);
		return "topic/topicListMe";
	}
	@GetMapping("/topicModify")
	public String topicModify(@RequestParam("topic_num") int topic_num ,Model model) {
		
		TopicVO vo = topicService.topicDetail(topic_num);
		model.addAttribute("vo", vo);
		return "topic/topicModify";
	}
	@PostMapping("/modifyForm")
	public String modifyForm(TopicVO vo,Model model) {
		topicService.topicModify(vo);
		TopicVO vo2 = topicService.topicDetail(vo.getTopic_num());
		model.addAttribute("detailVO", vo2);
		return "topic/topicDetail";
	}
	
	@GetMapping("/topicReg")
	public String topicReg() {
		return "topic/topicReg";
	}
	
	@PostMapping("/topicRegist")
	public String topicRegist(TopicVO vo) {
		topicService.topicRegist(vo);		
		return "redirect:topicListAll";
	}
	
	@GetMapping("/topicDelete")
	public String topicDelete(@RequestParam("topic_num") int topic_num) {
		topicService.topicDelete(topic_num);
		return "redirect:topicListMe";
	}
	
	
}
