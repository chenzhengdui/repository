package org.javatribe.ams.dao.mapper;

import org.javatribe.ams.entity.LostArticle;

public interface LostArticleMapper {
    int deleteByPrimaryKey(Integer loarId);

    int insert(LostArticle record);

    int insertSelective(LostArticle record);

    LostArticle selectByPrimaryKey(Integer loarId);

    int updateByPrimaryKeySelective(LostArticle record);

    int updateByPrimaryKey(LostArticle record);
}