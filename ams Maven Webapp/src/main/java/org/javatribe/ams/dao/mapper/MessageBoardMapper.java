package org.javatribe.ams.dao.mapper;

import org.javatribe.ams.entity.MessageBoard;

public interface MessageBoardMapper {
    int deleteByPrimaryKey(Integer meboId);

    int insert(MessageBoard record);

    int insertSelective(MessageBoard record);

    MessageBoard selectByPrimaryKey(Integer meboId);

    int updateByPrimaryKeySelective(MessageBoard record);

    int updateByPrimaryKey(MessageBoard record);
}