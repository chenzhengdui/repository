package org.javatribe.ams.front.service;

import java.util.List;
import java.util.Map;

import org.javatribe.ams.entity.MessageBoardComments;


/**
 * Time		: 2014/12/16 10:08
 *
 * @author czd
 */
public interface MessageBoardCommentsService {

    
    public List<Map<String, Object>> getMessageBoardCommentsList(int meboId);
    
    public int addComments(MessageBoardComments messageBoardComments);
    
}
