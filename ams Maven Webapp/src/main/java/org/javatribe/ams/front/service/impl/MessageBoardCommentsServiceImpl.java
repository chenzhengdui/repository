package org.javatribe.ams.front.service.impl;

import java.util.List;
import java.util.Map;

import org.javatribe.ams.dao.mapper.MessageBoardCommentsMapper;
import org.javatribe.ams.dao.mymapper.FrontMessageBoardCommentsMapper;
import org.javatribe.ams.entity.MessageBoardComments;
import org.javatribe.ams.front.service.MessageBoardCommentsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Time : 2014/12/16 10:08
 * 
 * @author czd
 */
@Service(value = "messageBoardCommentsServiceImpl")
public class MessageBoardCommentsServiceImpl implements MessageBoardCommentsService {

	@Resource(name = "frontMessageBoardCommentsMapper")
	private FrontMessageBoardCommentsMapper frontMessageBoardCommentsMapper;

	@Resource(name="messageBoardCommentsMapper")
	private MessageBoardCommentsMapper messageBoardCommentsMapper;
	
	@Override
	public List<Map<String, Object>> getMessageBoardCommentsList(int meboId){
		return frontMessageBoardCommentsMapper.selectMessageBoardCommentsList(meboId);
	}

	@Override
	public int addComments(MessageBoardComments messageBoardComments) {
		 return messageBoardCommentsMapper.insert(messageBoardComments);
		
	}
}
