package com.simple.command;

import java.util.ArrayList;

public class ReqVO {
	
	
	//만드는 규칙 - VO와 동일하게 만듭니다.
	//폼값의 name과 동일한 변수를 멤버변수로 선언
	
	private String name;
	private String age;
	private ArrayList<String> inter;
	
	public ReqVO() {
		
	}
	

	public ReqVO(String name, String age, ArrayList<String> inter) {
		super();
		this.name = name;
		this.age = age;
		this.inter = inter;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * @return the inter
	 */
	public ArrayList<String> getInter() {
		return inter;
	}

	/**
	 * @param inter the inter to set
	 */
	public void setInter(ArrayList<String> inter) {
		this.inter = inter;
	}

	//값에 대한 확인을 빠르게!
	@Override
	public String toString() {
		return "ReqVO [name=" + name + ", age=" + age + ", inter=" + inter + "]";
	}
	
	
	
	
	
	
}
