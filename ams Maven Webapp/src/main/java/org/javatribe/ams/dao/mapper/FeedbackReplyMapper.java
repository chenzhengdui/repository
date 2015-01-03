package org.javatribe.ams.dao.mapper;

import org.javatribe.ams.entity.FeedbackReply;

public interface FeedbackReplyMapper {
    int deleteByPrimaryKey(Integer fereId);

    int insert(FeedbackReply record);

    int insertSelective(FeedbackReply record);

    FeedbackReply selectByPrimaryKey(Integer fereId);

    int updateByPrimaryKeySelective(FeedbackReply record);

    int updateByPrimaryKey(FeedbackReply record);
}