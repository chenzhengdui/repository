package org.javatribe.ams.dao.mapper;

import org.javatribe.ams.entity.Admin;

public interface AdminMapper {
    int deleteByPrimaryKey(Integer admiId);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer admiId);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}