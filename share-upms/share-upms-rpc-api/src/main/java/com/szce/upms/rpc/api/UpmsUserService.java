package com.szce.upms.rpc.api;

import com.szce.common.base.BaseService;
import com.szce.upms.dao.model.UpmsUser;
import com.szce.upms.dao.model.UpmsUserExample;

/**
* UpmsUserService接口
* Created by szce on 2017/3/20.
*/
public interface UpmsUserService extends BaseService<UpmsUser, UpmsUserExample> {

    UpmsUser createUser(UpmsUser upmsUser);

}