package org.javatribe.ams.dao.mapper;

import org.javatribe.ams.entity.AssetType;

public interface AssetTypeMapper {
    int deleteByPrimaryKey(Integer astyId);

    int insert(AssetType record);

    int insertSelective(AssetType record);

    AssetType selectByPrimaryKey(Integer astyId);

    int updateByPrimaryKeySelective(AssetType record);

    int updateByPrimaryKey(AssetType record);
}