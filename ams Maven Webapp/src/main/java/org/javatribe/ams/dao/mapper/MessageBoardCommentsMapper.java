package org.javatribe.ams.dao.mapper;

import org.javatribe.ams.entity.MessageBoardComments;

public interface MessageBoardCommentsMapper {
    int deleteByPrimaryKey(Integer mbcoId);

    int insert(MessageBoardComments record);

    int insertSelective(MessageBoardComments record);

    MessageBoardComments selectByPrimaryKey(Integer mbcoId);

    int updateByPrimaryKeySelective(MessageBoardComments record);

    int updateByPrimaryKey(MessageBoardComments record);
}