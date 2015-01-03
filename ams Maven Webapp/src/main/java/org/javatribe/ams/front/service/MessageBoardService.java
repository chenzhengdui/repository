package org.javatribe.ams.front.service;

import java.util.List;
import java.util.Map;


/**
 * Time		: 2014/12/16 10:08
 *
 * @author czd
 */
public interface MessageBoardService {

    
    public List<Map<String, Object>> getMessageBoardList(Map<String, Object> data);
    
}
