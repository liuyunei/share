package com.szce.cms.rpc.mapper;

import com.szce.cms.dao.model.CmsArticle;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 文章VOMapper
 * Created by szce on 2017/01/07.
 */
public interface CmsArticleExtMapper {

    int up(Integer articleId);

    int down(Integer articleId);

    List<CmsArticle> selectCmsArticlesByCategoryId(@Param("categoryId") Integer categoryId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    long countByCategoryId(@Param("categoryId") Integer categoryId);

    List<CmsArticle> selectCmsArticlesByTagId(@Param("tagId") Integer tagId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    long countByTagId(@Param("tagId") Integer tagId);

}