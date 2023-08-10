package com.simple.basic.controller;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Producer;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.simple.basic.command.SimpleVO;

@RestController // @ResponseBody + @Controller
public class RestBasicController {
	
	@GetMapping("/basic")
	public String basic() {
		return "<h3>hello world</h3>";
	}
	
	//데이터를 보내는 방법 -> @ResponseBody = 자바의 객체를 JSON형식으로 자동 변환
	@GetMapping("/getObject")
	public SimpleVO getObject() {
		
		SimpleVO vo = new SimpleVO(1,"홍","길동",LocalDateTime.now());
		
		return vo;
	}
	
	@GetMapping("/getMap")
	public Map<String,Object> getMap(){
		Map<String,Object> map = new HashMap<>();
		map.put("name", "홍길동");
		return map;
		
	}
	
	@GetMapping("/getList")       
	public List<SimpleVO> getList(){
		List<SimpleVO> list = new ArrayList<>();
		list.add(new SimpleVO(0,"박","수정",LocalDateTime.now()));
		list.add(new SimpleVO(1,"박","나쵸",LocalDateTime.now()));
		return list;
	}
	
	//데이터를 받는 방법
	//get => 쿼리스트링 or 쿼리파라미터 이용해서 주소에 담아서 넘김 (약속)
	//post => 폼형식 or json을 이용해서 body에 담아서 넘김
	
	@GetMapping("/getData")
	public SimpleVO getData(SimpleVO vo) {
		System.out.println(vo.toString());
		return new SimpleVO(1,"박","나쵸",LocalDateTime.now());
	}
	
	//sno,first,last는 필수값이 됩니다.
	@GetMapping("/getData2")
	public SimpleVO getData2(@RequestParam("sno") int sno,
							 @RequestParam("first") String first,
							 @RequestParam("last") String last) {
		System.out.println(sno);
		System.out.println(first);
		System.out.println(last);
		return new SimpleVO(1,"박","나쵸",LocalDateTime.now());
	}
	
	@GetMapping("/getData3/{sno}/{first}")
	public SimpleVO getData3(@PathVariable("sno") int sno,
							 @PathVariable("first") String first) {
		System.out.println(sno);
		System.out.println(first);
		return new SimpleVO(1,"박","나쵸",LocalDateTime.now());
	}
	
	/////////////////////////////////////////////////////////
	// post방식의 데이터받기
	// 보내는 입장에서 form형식의 데이터를 써줘야함 (url에 쓰는게 아닙니다 body에 데이터를 숨겨 보내는겁니다.)
	
	@PostMapping("/getForm")
	public SimpleVO getForm(SimpleVO vo) {
		System.out.println(vo.toString());
		return new SimpleVO(1,"박","나쵸",LocalDateTime.now());
	}
	
	//보내는 입장에서는 JSON형식의 데이터를 써줘야함
	//{"sno" : "1" , "first":"박" , "last" : "나쵸"}
	@PostMapping("/getJSON")
	public SimpleVO getJSON(@RequestBody SimpleVO vo) {
		System.out.println(vo.toString());
		return new SimpleVO(1,"박","나쵸",LocalDateTime.now());
	}
	
	@PostMapping("/getJSON2")          
	public SimpleVO getJSON2(@RequestBody Map<String,Object> map) {
		System.out.println(map.toString());
		return new SimpleVO(1,"박","나쵸",LocalDateTime.now());
	}
	
	///////////////////////////////////////////////////
	//consumer = 반드시 이 타입으로 보내라 ! 명시
	//producer = 내가 이 타입으로 줄게! 명시 (default = json) , xml을 사용하려면 xml데이터바인딩 라이브러리가 필요합니다.
	// text/plain
	// application/json
	//보내는 타입은 produces , 너는 consumes 타입으로 보내줘
	@PostMapping(value = "/getResult" , produces = "text/plain", consumes = "text/plain" )
	public String getResult(@RequestBody String str) {
		System.out.println(str);
		return "<h3>문자열</h3>";
	}
	
	
	//응답문서 직접 작성하기 = ResponseEntity<보낼데이터타입>
	@PostMapping("/createResponse")
	public ResponseEntity<SimpleVO> createResponse(){
		
		SimpleVO vo = new SimpleVO(1,"홍","길동",LocalDateTime.now());
		
		//1st
		//ResponseEntity<SimpleVO> result= new ResponseEntity<>(vo, HttpStatus.OK); // 데이터, 상태코드
		
		//2nd
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JSON WEB TOKEN~");
		header.add("Content-Type","application/json");
		header.add("Access-Control-Allow-Origin", "*");
		ResponseEntity<SimpleVO> result = new ResponseEntity<SimpleVO>(vo,header, HttpStatus.OK); // 데이터,헤더,상태코드
		
		
		return result;
	}
	
	
	////////////////////////////
	/*
	 * 클라이언트 fetch
	 * 요청주소 : /api/v1/getData
	 * 메서드 : get
	 * 클라이언트에서 보낼데이터는 :num,name
	 * 서버에서 보낼데이터는 : SimplVO 
	 * 받을수 있는 restAPI를 생성
	 */
	
	@GetMapping("/api/v1/getData")
	public SimpleVO getData2(@RequestParam("num") int num,
							 @RequestParam("name") String name) {
		SimpleVO vo = new SimpleVO(1, "홍", "길동", LocalDateTime.now());
		
		System.out.println(num + "   " + name);

		return vo;
	}
	
	@CrossOrigin("*")
	@GetMapping("/api/v1/getData/{num}/{name}")
	public ResponseEntity<SimpleVO> getFetch(@PathVariable("num") int num,
											 @PathVariable("name") String name){
		System.out.println(num);
		System.out.println(name);
		 
		return new ResponseEntity<>(new SimpleVO(1, "Kim", "hong", LocalDateTime.now()), HttpStatus.OK);
	}
	
	
	/*
	 * 클라이언트 fetch
	 * 요청주소 : /api/v1/getInfo
	 * 메서드 : post
	 * 클라이언트에서 보낼데이터는 : num, name
	 * 서버에서 보낼데이터는 : SimplVO 
	 * 받을 수 있는 restAPI를 생성
	 */
	@CrossOrigin({"http://localhost:3000","http://127.0.0.1:5500"})
	@PostMapping("/api/v1/getInfo")
	public ResponseEntity<List<SimpleVO>> getInfo(@RequestBody Map<String,Object> map){
		
		System.out.println(map.toString());
		SimpleVO vo = new SimpleVO(1, "홍", "길동", LocalDateTime.now());
		List<SimpleVO> list = new ArrayList<>();
		list.add(vo);
		ResponseEntity<List<SimpleVO>> entity= new ResponseEntity<>(list, HttpStatus.OK);
		return entity;
	}
	

}
