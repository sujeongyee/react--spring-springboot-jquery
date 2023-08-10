package com.ddu.practice.notice.service;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.ddu.practice.command.NoticeVO;

@Mapper
public interface NoticeMapper {
	
	public void registNotice(NoticeVO vo);
	public ArrayList<NoticeVO> getList();
	public NoticeVO getVo(int notice_num);

}
