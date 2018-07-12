package com.szce.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import com.szce.common.base.BaseService;
import com.szce.upms.dao.model.UpmsUserPermission;
import com.szce.upms.dao.model.UpmsUserPermissionExample;

/**
* UpmsUserPermissionService接口
* Created by szce on 2018/3/20.
*/
public interface UpmsUserPermissionService extends BaseService<UpmsUserPermission, UpmsUserPermissionExample> {

    /**
     * 用户权限
     * @param datas 权限数据
     * @param id 用户id
     * @return
     */
    int permission(JSONArray datas, int id);

}