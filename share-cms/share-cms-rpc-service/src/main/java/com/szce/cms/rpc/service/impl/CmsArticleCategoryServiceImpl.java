package com.szce.cms.rpc.service.impl;

import com.szce.cms.dao.mapper.CmsArticleCategoryMapper;
import com.szce.cms.dao.model.CmsArticleCategory;
import com.szce.cms.dao.model.CmsArticleCategoryExample;
import com.szce.cms.rpc.api.CmsArticleCategoryService;
import com.szce.common.annotation.BaseService;
import com.szce.common.base.BaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* CmsArticleCategoryService实现
* Created by szce on 2017/4/5.
*/
@Service
@Transactional
@BaseService
public class CmsArticleCategoryServiceImpl extends BaseServiceImpl<CmsArticleCategoryMapper, CmsArticleCategory, CmsArticleCategoryExample> implements CmsArticleCategoryService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CmsArticleCategoryServiceImpl.class);

    @Autowired
    CmsArticleCategoryMapper cmsArticleCategoryMapper;

}