package com.simple.command;

import java.util.ArrayList;

public class MemberVO {
	//1
	private String id;
	private String addr;
	//M
	private ArrayList<ScoreVO> list;
	
	public MemberVO() {
		
	}

	public MemberVO(String id, String addr, ArrayList<ScoreVO> list) {
		super();
		this.id = id;
		this.addr = addr;
		this.list = list;
	}
	
	

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", addr=" + addr + ", list=" + list + "]";
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

	/**
	 * @return the list
	 */
	public ArrayList<ScoreVO> getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(ArrayList<ScoreVO> list) {
		this.list = list;
	}
	
	
	
	
	
}
	