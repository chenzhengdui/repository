package org.javatribe.ams.dao.mapper;

import org.javatribe.ams.entity.DepartmentPerson;

public interface DepartmentPersonMapper {
    int deleteByPrimaryKey(Integer depeId);

    int insert(DepartmentPerson record);

    int insertSelective(DepartmentPerson record);

    DepartmentPerson selectByPrimaryKey(Integer depeId);

    int updateByPrimaryKeySelective(DepartmentPerson record);

    int updateByPrimaryKey(DepartmentPerson record);
}