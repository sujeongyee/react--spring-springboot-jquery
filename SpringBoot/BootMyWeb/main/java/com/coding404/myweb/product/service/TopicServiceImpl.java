package com.coding404.myweb.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding404.myweb.command.TopicVO;
import com.coding404.myweb.util.Paging;

@Service("topicService")
public class TopicServiceImpl implements TopicService {
	
	@Autowired
	private TopicMapper topicMapper;

	@Override
	public void topicRegist(TopicVO vo) {
		topicMapper.topicRegist(vo);
	}

	@Override
	public List<TopicVO> getTopic(Paging paging) {
		//여기서도 paging값 잘 나옵니다
		return topicMapper.getTopic(paging);
	}

	@Override
	public TopicVO topicDetail(int topic_num) {
		return topicMapper.topicDetail(topic_num);
	}

	@Override
	public List<TopicVO> getMyTopic(String topic_id) {
		return topicMapper.getMyTopic(topic_id);
	}

	@Override
	public void topicModify(TopicVO vo) {
		topicMapper.topicModify(vo);
	}

	@Override
	public void topicDelete(int topic_num) {
		topicMapper.topicDelete(topic_num);
		
	}

	@Override
	public int getTotal(Paging paging) {
		
		return topicMapper.getTotal(paging);
	}
	
	

}
