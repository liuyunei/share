package com.szce.cms.rpc.api;

import com.szce.common.base.BaseServiceMock;
import com.szce.cms.dao.mapper.CmsSystemMapper;
import com.szce.cms.dao.model.CmsSystem;
import com.szce.cms.dao.model.CmsSystemExample;

/**
* 降级实现CmsSystemService接口
* Created by szce on 2017/4/5.
*/
public class CmsSystemServiceMock extends BaseServiceMock<CmsSystemMapper, CmsSystem, CmsSystemExample> implements CmsSystemService {

}
