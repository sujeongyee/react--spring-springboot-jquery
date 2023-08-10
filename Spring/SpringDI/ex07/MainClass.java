package ex07;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ex01.SpringTest;
import ex02.Chef;
import ex02.Hotel;
import ex03.DatabaseDev;
import ex03.MemberDAO;

public class MainClass {
	
	public static void main(String[] args) {
		
		// 자바 설정 파일을 읽을 때
		AnnotationConfigApplicationContext atx = 
				new AnnotationConfigApplicationContext(JavaConfig.class);
		
		SpringTest sp = (SpringTest)atx.getBean("test");
		Chef chef = (Chef)atx.getBean("chef");
		Hotel hotel = (Hotel)atx.getBean("hotel");
		hotel.getChef().cooking();
		DatabaseDev dev =  atx.getBean(DatabaseDev.class);
		
		System.out.println(dev.getUrl());
		
		MemberDAO dao = atx.getBean(MemberDAO.class);
		
		
		System.out.println(dao.getDataSource().getUid());
		System.out.println(dao.getDataSource().getUrl());
		System.out.println(dao.getDataSource().getUpw());
	}

}
