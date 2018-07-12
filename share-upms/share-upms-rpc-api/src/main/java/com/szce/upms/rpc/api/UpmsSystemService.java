package com.szce.upms.rpc.api;

import com.szce.common.base.BaseService;
import com.szce.upms.dao.model.UpmsSystem;
import com.szce.upms.dao.model.UpmsSystemExample;

/**
* UpmsSystemService接口
* Created by szce on 2017/3/20.
*/
public interface UpmsSystemService extends BaseService<UpmsSystem, UpmsSystemExample> {

    /**
     * 根据name获取UpmsSystem
     * @param name
     * @return
     */
    UpmsSystem selectUpmsSystemByName(String name);

}