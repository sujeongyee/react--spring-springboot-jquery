package com.simple.basic;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.simple.basic.mapper.TestMapper;
import com.simple.command.MemberVO;
import com.simple.command.ScoreVO;

@RunWith(SpringJUnit4ClassRunner.class) // Junit 테스트 진행
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/root-context.xml") // 테스트를 진행할 스프링 설정파일

public class JDBCMybatis {
	
	@Autowired
	TestMapper testMapper;

//	@Test
//	public void testCode01() {
//		int result = testMapper.insertOne("test");
//		System.out.println("성공실패?:" + result);
//	} 
	
//	@Test
//	public void testCode02() {
//		ScoreVO vo = new ScoreVO(0,"test","100","90");
//		testMapper.insertTwo(vo);
//	} 
//	
//	@Test
//	public void testCode03() {
//		HashMap<String,Object> map = new HashMap<>();
//		map.put("name","맵을통한");
//		map.put("kor", "100");
//		map.put("eng","100");
//		testMapper.insertThree(map);
//	}
	
//	@Test
//	public void testCode04() {
//		testMapper.insertFour("파람", "100", "200");
//	}
	
//	@Test
//	public void testCode04() {
//		
//		ScoreVO vo = new ScoreVO(2, "수정", "미리", "연습");
//		testMapper.updateOwn(vo);
//	}
//	
//	@Test
//	public void testCode05() {
//		
//		testMapper.updateOwn(new ScoreVO(1,"테스트","하는중","성공?"));
//	}
	
//	@Test
//	public void testCode06() {
//		
//		ScoreVO vo = testMapper.selectOne(1);
//		System.out.println(vo.toString());
//	}
	
//	@Test
//	public void testCode07() {
//		HashMap<String,Object> map = testMapper.selectTwo(1);
//		System.out.println(map.toString());
//	}
	
	@Test
	public void testCode08() {
		MemberVO vo = testMapper.joinTwo("테스트");
		System.out.println(vo.toString());
	}
	

}
