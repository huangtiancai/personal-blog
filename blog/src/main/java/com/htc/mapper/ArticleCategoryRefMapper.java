package com.htc.mapper;

import com.htc.entity.ArticleCategoryRef;
import com.htc.entity.ArticleCategoryRefExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleCategoryRefMapper {
    long countByExample(ArticleCategoryRefExample example);

    int deleteByExample(ArticleCategoryRefExample example);

    int insert(ArticleCategoryRef record);

    int insertSelective(ArticleCategoryRef record);

    List<ArticleCategoryRef> selectByExample(ArticleCategoryRefExample example);

    int updateByExampleSelective(@Param("record") ArticleCategoryRef record, @Param("example") ArticleCategoryRefExample example);

    int updateByExample(@Param("record") ArticleCategoryRef record, @Param("example") ArticleCategoryRefExample example);
}