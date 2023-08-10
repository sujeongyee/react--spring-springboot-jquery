package com.coding404.myweb.product.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.coding404.myweb.command.TopicVO;
import com.coding404.myweb.util.Paging;

@Mapper
public interface TopicMapper {
	
	public void topicRegist(TopicVO vo);
	public List<TopicVO> getTopic(Paging paging);
	public int getTotal(Paging paging);
	public TopicVO topicDetail(int topic_num);
	public List<TopicVO> getMyTopic(String topic_id);
	public void topicModify(TopicVO vo);
	public void topicDelete(int topic_num);
}
