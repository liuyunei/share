package com.szce.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import com.szce.common.base.BaseService;
import com.szce.upms.dao.model.UpmsPermission;
import com.szce.upms.dao.model.UpmsPermissionExample;

/**
* UpmsPermissionService接口
* Created by szce on 2017/3/20.
*/
public interface UpmsPermissionService extends BaseService<UpmsPermission, UpmsPermissionExample> {

    JSONArray getTreeByRoleId(Integer roleId);

    JSONArray getTreeByUserId(Integer usereId, Byte type);

}