package com.coding404.myweb.util;

import lombok.Data;

@Data
public class Paging {
	
	
	private int page;
	private int amount;
	
	private String searchTitle;
	private String searchId;
	
	
	public Paging() {
		this.page = 1;
		this.amount = 10;
	}
	
	public Paging(int page, int amount) {
		this.page = page;
		this.amount = amount;
	}
	
	// 페이지시작을 지정하는 getter
	public int getPageStart() {
		return (page-1) * amount;
	}
	

}
 