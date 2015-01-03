package org.javatribe.ams.dao.mapper;

import org.javatribe.ams.entity.Scrap;

public interface ScrapMapper {
    int deleteByPrimaryKey(Integer acraId);

    int insert(Scrap record);

    int insertSelective(Scrap record);

    Scrap selectByPrimaryKey(Integer acraId);

    int updateByPrimaryKeySelective(Scrap record);

    int updateByPrimaryKey(Scrap record);
}