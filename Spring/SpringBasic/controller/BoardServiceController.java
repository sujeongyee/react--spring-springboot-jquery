package com.simple.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.BoardVO;
import com.simple.service.BoardService;

@Controller
@RequestMapping("/service")
public class BoardServiceController {
	
	@Autowired
	@Qualifier("boardService")
	BoardService boardService;
	
	@RequestMapping("/boardRegister")
	public void boardRegister() {
		
	}
	
	@RequestMapping("/boardForm")
	public String boardForm(BoardVO vo) {
		boardService.boardRegist(vo);
		return "/service/boardResult";
	}
	
	@RequestMapping("/boardList")
	public String boardList(Model model) {
		ArrayList<BoardVO> voList =boardService.getList();
		model.addAttribute("list", voList);
		return "/service/boardList";
	}
	
	@RequestMapping("/boardDelete")
	public String boardDelete(@RequestParam("num") int num){
		boardService.boardDelete(num);
		return "redirect:/service/boardList";
	}
	
	
	

}
