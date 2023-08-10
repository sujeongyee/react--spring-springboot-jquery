package com.coding404.myweb.util;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import lombok.Data;

@Data
public class PagingVO {
	
	private int start; //게시판 화면에 보여질 첫페이지 번호
	private int end; //게시판 화면에 보여질 끝페이지 번호
	private boolean prev; //다음 이전 활성화 여부
	private boolean next; //이전버튼 활성화 여부
	private int realEnd; //진짜끝번호
	
	private int page; //현재 조회하는 페이지 번호
	private int amount; //한 페이지에서 몇개의 데이터를 보여줄 건가
	private int total; //총 계시물 수
	private Paging paging;
	private int pnCount = 10; // 페이지네이션 개수

	private List<Integer> pageList; //페이지 번호리스트(*타임리프에서는 향상된for문을 쓰기위해 list로 페이지번호생성)
	
	
	public PagingVO(Paging paging, int total) {
			this.paging = paging; 
			this.total = total; 
			this.page = paging.getPage(); 
			this.amount = paging.getAmount(); 
			
			this.end = (int)(Math.ceil(this.page / (double)this.pnCount)) * this.pnCount ;
			
			this.start = this.end - this.pnCount + 1; 
			
			this.realEnd = (int)Math.ceil(this.total / (double)this.amount );
			
			if(this.end > realEnd ) this.end = this.realEnd;
			
			this.prev = this.start > 1;
			
			this.next = this.realEnd > this.end;
			this.pageList = IntStream.rangeClosed(this.start, this.end).boxed().collect(Collectors.toList());
	}
	

}
