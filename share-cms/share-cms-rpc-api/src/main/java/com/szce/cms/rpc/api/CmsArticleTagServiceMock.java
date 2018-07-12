package com.szce.cms.rpc.api;

import com.szce.common.base.BaseServiceMock;
import com.szce.cms.dao.mapper.CmsArticleTagMapper;
import com.szce.cms.dao.model.CmsArticleTag;
import com.szce.cms.dao.model.CmsArticleTagExample;

/**
* 降级实现CmsArticleTagService接口
* Created by szce on 2017/4/5.
*/
public class CmsArticleTagServiceMock extends BaseServiceMock<CmsArticleTagMapper, CmsArticleTag, CmsArticleTagExample> implements CmsArticleTagService {

}
