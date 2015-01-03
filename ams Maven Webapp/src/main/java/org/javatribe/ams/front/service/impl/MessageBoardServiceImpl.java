package org.javatribe.ams.front.service.impl;

import java.util.List;
import java.util.Map;

import org.javatribe.ams.dao.mymapper.FrontMessageBoardMapper;
import org.javatribe.ams.front.service.MessageBoardService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Time : 2014/12/16 10:08
 * 
 * @author czd
 */
@Service(value = "messageBoardServiceImpl")
public class MessageBoardServiceImpl implements MessageBoardService {

	@Resource(name = "frontMessageBoardMapper")
	private FrontMessageBoardMapper frontMessageBoardMapper;

	
	@Override
	public List<Map<String, Object>> getMessageBoardList(Map<String , Object> data){
		return frontMessageBoardMapper.selectMessageBoardList(data);
	}
}
