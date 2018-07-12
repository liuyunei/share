package com.szce.cms.rpc.api;

import com.szce.common.base.BaseServiceMock;
import com.szce.cms.dao.mapper.CmsCategoryMapper;
import com.szce.cms.dao.model.CmsCategory;
import com.szce.cms.dao.model.CmsCategoryExample;

/**
* 降级实现CmsCategoryService接口
* Created by szce on 2017/4/5.
*/
public class CmsCategoryServiceMock extends BaseServiceMock<CmsCategoryMapper, CmsCategory, CmsCategoryExample> implements CmsCategoryService {

}
