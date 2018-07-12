package com.szce.cms.rpc.api;

import com.szce.common.base.BaseServiceMock;
import com.szce.cms.dao.mapper.CmsTopicMapper;
import com.szce.cms.dao.model.CmsTopic;
import com.szce.cms.dao.model.CmsTopicExample;

/**
* 降级实现CmsTopicService接口
* Created by szce on 2017/4/5.
*/
public class CmsTopicServiceMock extends BaseServiceMock<CmsTopicMapper, CmsTopic, CmsTopicExample> implements CmsTopicService {

}
