package org.javatribe.ams.dao.mapper;

import org.javatribe.ams.entity.Repair;

public interface RepairMapper {
    int deleteByPrimaryKey(Integer repaId);

    int insert(Repair record);

    int insertSelective(Repair record);

    Repair selectByPrimaryKey(Integer repaId);

    int updateByPrimaryKeySelective(Repair record);

    int updateByPrimaryKey(Repair record);
}