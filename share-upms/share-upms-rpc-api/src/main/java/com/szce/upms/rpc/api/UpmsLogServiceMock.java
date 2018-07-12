package com.szce.upms.rpc.api;

import com.szce.common.base.BaseServiceMock;
import com.szce.upms.dao.mapper.UpmsLogMapper;
import com.szce.upms.dao.model.UpmsLog;
import com.szce.upms.dao.model.UpmsLogExample;

/**
* 降级实现UpmsLogService接口
* Created by szce on 2017/3/20.
*/
public class UpmsLogServiceMock extends BaseServiceMock<UpmsLogMapper, UpmsLog, UpmsLogExample> implements UpmsLogService {

}
