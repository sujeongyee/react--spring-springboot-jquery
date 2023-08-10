package com.ddu.practice.notice.service;

import java.util.ArrayList;

import com.ddu.practice.command.NoticeVO;

public interface NoticeService {
	
	public void registNotice(NoticeVO vo);
	public ArrayList<NoticeVO> getList();
	public NoticeVO getVo(int notice_num);

}
