package ex07;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ex01.SpringTest;
import ex02.Chef;
import ex02.Hotel;
import ex03.DatabaseDev;
import ex03.MemberDAO;

@Configuration
public class JavaConfig {
	
	@Bean
	public SpringTest test() {
		return new SpringTest();
	}
	
	@Bean
	public Chef chef() {
		return new Chef();
	}
	
	@Bean
	public Hotel hotel(Chef chef) {
		return new Hotel(chef());
	}
	
	@Bean
	public DatabaseDev dev () {
		DatabaseDev dev = new DatabaseDev();
		dev.setUrl("jdbc:mysql://localhost~~~");
		dev.setUid("coding404");
		dev.setUpw("1234");
		return dev;
	}
	
	@Bean
	public MemberDAO memberDAO() {
		MemberDAO memberDAO = new MemberDAO();
		memberDAO.setDataSource(dev());
		return memberDAO;
	}
	
	
}
