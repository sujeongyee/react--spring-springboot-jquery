package com.simple.basic;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import com.simple.basic.command.BuilderVO;
import com.simple.basic.command.BuilderVO.Builder;
import com.simple.basic.command.BuilderVO2;

@SpringBootTest //스프링 부트 테스트클래스
public class JDBCTest {
	
	//빌더 패턴의 확인
	@Test
	public void testCode01() {
//		Builder b =BuilderVO.builder();
//		b= b.age(10);
//		b= b.name("홍길동");
//		BuilderVO vo = b.build();
		
		//vo는 setter가 없기 때문에 객체불변성을 보장합니다.
		BuilderVO vo2 = BuilderVO.builder().age(10).name("홍길동").build();
		System.out.println(vo2.toString());
		
		BuilderVO2 vo3 = BuilderVO2.builder().name("이순신").age(20).build();
		
		System.out.println(vo3.toString());
		
	}
	
}
