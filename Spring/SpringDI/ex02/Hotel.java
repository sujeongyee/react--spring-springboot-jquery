package ex02;

public class Hotel {
	
	//호텔은 생성 될 때 생성자 매개변수로  Chef를 받는다
	private Chef chef;
	
	// 생성자 (chef가 있어야만 hotel이 생성된다) -> hotel은 chef에게 종속적 의존적이다.
	public Hotel(Chef chef){
		this.chef = chef;
	}
	
	//getter
	public Chef getChef() {
		return chef;
	}
	
	
}
