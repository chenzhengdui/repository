package org.javatribe.ams.dao.mapper;

import org.javatribe.ams.entity.Assets;

public interface AssetsMapper {
    int deleteByPrimaryKey(Integer asseId);

    int insert(Assets record);

    int insertSelective(Assets record);

    Assets selectByPrimaryKey(Integer asseId);

    int updateByPrimaryKeySelective(Assets record);

    int updateByPrimaryKey(Assets record);
}