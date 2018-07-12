package com.szce.upms.rpc.api;

import com.szce.common.base.BaseServiceMock;
import com.szce.upms.dao.mapper.UpmsSystemMapper;
import com.szce.upms.dao.model.UpmsSystem;
import com.szce.upms.dao.model.UpmsSystemExample;

/**
* 降级实现UpmsSystemService接口
* Created by szce on 2017/3/20.
*/
public class UpmsSystemServiceMock extends BaseServiceMock<UpmsSystemMapper, UpmsSystem, UpmsSystemExample> implements UpmsSystemService {

    @Override
    public UpmsSystem selectUpmsSystemByName(String name) {
        return null;
    }

}
