package org.javatribe.ams.dao.mapper;

import org.javatribe.ams.entity.Department;

public interface DepartmentMapper {
    int deleteByPrimaryKey(Integer depaId);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer depaId);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}