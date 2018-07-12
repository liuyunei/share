package com.szce.upms.rpc.api;

import com.szce.common.base.BaseServiceMock;
import com.szce.upms.dao.mapper.UpmsUserMapper;
import com.szce.upms.dao.model.UpmsUser;
import com.szce.upms.dao.model.UpmsUserExample;

/**
* 降级实现UpmsUserService接口
* Created by szce on 2017/3/20.
*/
public class UpmsUserServiceMock extends BaseServiceMock<UpmsUserMapper, UpmsUser, UpmsUserExample> implements UpmsUserService {

    @Override
    public UpmsUser createUser(UpmsUser upmsUser) {
        return null;
    }

}
