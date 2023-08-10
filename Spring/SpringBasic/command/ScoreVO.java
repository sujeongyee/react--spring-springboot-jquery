package com.simple.command;

public class ScoreVO {
	
	private int num;
	private String name;
	private String kor;
	private String eng;
	private String id;
	private String addr;
	
	public ScoreVO() {}

	public ScoreVO(int num, String name, String kor, String eng) {
		super();
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}



	@Override
	public String toString() {
		return "ScoreVO [num=" + num + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", id=" + id + ", addr="
				+ addr + "]";
	}

	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
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
	 * @return the kor
	 */
	public String getKor() {
		return kor;
	}

	/**
	 * @param kor the kor to set
	 */
	public void setKor(String kor) {
		this.kor = kor;
	}

	/**
	 * @return the eng
	 */
	public String getEng() {
		return eng;
	}

	/**
	 * @param eng the eng to set
	 */
	public void setEng(String eng) {
		this.eng = eng;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the addr
	 */
	public String getAddr() {
		return addr;
	}

	/**
	 * @param addr the addr to set
	 */
	public void setAddr(String addr) {
		this.addr = addr;
	}

	
	

	
	

}
