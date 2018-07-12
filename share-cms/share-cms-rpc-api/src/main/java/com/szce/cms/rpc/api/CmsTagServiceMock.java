package com.szce.cms.rpc.api;

import com.szce.common.base.BaseServiceMock;
import com.szce.cms.dao.mapper.CmsTagMapper;
import com.szce.cms.dao.model.CmsTag;
import com.szce.cms.dao.model.CmsTagExample;

/**
* 降级实现CmsTagService接口
* Created by szce on 2017/4/5.
*/
public class CmsTagServiceMock extends BaseServiceMock<CmsTagMapper, CmsTag, CmsTagExample> implements CmsTagService {

}
