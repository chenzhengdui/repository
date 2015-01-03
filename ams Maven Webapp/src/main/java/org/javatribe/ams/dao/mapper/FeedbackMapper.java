package org.javatribe.ams.dao.mapper;

import org.javatribe.ams.entity.Feedback;

public interface FeedbackMapper {
    int deleteByPrimaryKey(Integer feedId);

    int insert(Feedback record);

    int insertSelective(Feedback record);

    Feedback selectByPrimaryKey(Integer feedId);

    int updateByPrimaryKeySelective(Feedback record);

    int updateByPrimaryKey(Feedback record);
}