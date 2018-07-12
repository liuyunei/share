package com.szce.cms.rpc.api;

import com.szce.common.base.BaseServiceMock;
import com.szce.cms.dao.mapper.CmsMenuMapper;
import com.szce.cms.dao.model.CmsMenu;
import com.szce.cms.dao.model.CmsMenuExample;

/**
* 降级实现CmsMenuService接口
* Created by szce on 2017/4/5.
*/
public class CmsMenuServiceMock extends BaseServiceMock<CmsMenuMapper, CmsMenu, CmsMenuExample> implements CmsMenuService {

}
