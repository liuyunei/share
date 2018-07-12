package com.szce.cms.rpc.api;

import com.szce.common.base.BaseServiceMock;
import com.szce.cms.dao.mapper.CmsPageMapper;
import com.szce.cms.dao.model.CmsPage;
import com.szce.cms.dao.model.CmsPageExample;

/**
* 降级实现CmsPageService接口
* Created by szce on 2017/4/5.
*/
public class CmsPageServiceMock extends BaseServiceMock<CmsPageMapper, CmsPage, CmsPageExample> implements CmsPageService {

}
