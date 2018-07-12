package com.szce.cms.rpc.api;

import com.szce.common.base.BaseServiceMock;
import com.szce.cms.dao.mapper.CmsSettingMapper;
import com.szce.cms.dao.model.CmsSetting;
import com.szce.cms.dao.model.CmsSettingExample;

/**
* 降级实现CmsSettingService接口
* Created by szce on 2017/4/5.
*/
public class CmsSettingServiceMock extends BaseServiceMock<CmsSettingMapper, CmsSetting, CmsSettingExample> implements CmsSettingService {

}
