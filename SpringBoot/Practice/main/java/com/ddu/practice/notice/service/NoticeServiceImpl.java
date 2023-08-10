package com.ddu.practice.notice.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddu.practice.command.NoticeVO;

@Service("noticeService")
public class NoticeServiceImpl implements NoticeService {
	
	@Autowired
	private NoticeMapper noticeMapper;

	@Override
	public void registNotice(NoticeVO vo) {
		noticeMapper.registNotice(vo);	
	}

	@Override
	public ArrayList<NoticeVO> getList() {
		
		return noticeMapper.getList();
	}

	@Override
	public NoticeVO getVo(int notice_num) {
		
		return noticeMapper.getVo(notice_num);
	}
	
	

}
