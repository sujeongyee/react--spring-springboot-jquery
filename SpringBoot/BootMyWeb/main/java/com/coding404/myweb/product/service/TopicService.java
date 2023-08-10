package com.coding404.myweb.product.service;

import java.util.List;

import com.coding404.myweb.command.TopicVO;
import com.coding404.myweb.util.Criteria;
import com.coding404.myweb.util.Paging;

public interface TopicService {
	
	
	public void topicRegist(TopicVO vo);
	public List<TopicVO> getTopic(Paging paging);
	public int getTotal(Paging paging);
	public TopicVO topicDetail(int topic_num);
	public List<TopicVO> getMyTopic(String topic_id);
	public void topicModify(TopicVO vo);
	public void topicDelete(int topic_num);
	
}
