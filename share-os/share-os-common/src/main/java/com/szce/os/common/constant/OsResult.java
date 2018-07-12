package com.szce.os.common.constant;

import com.szce.common.base.BaseResult;

/**
 * cms系统常量枚举类
 * Created by szce on 2018/7/10.
 */
public class OsResult extends BaseResult {

    public OsResult(OsResultConstant osResultConstant, Object data) {
        super(osResultConstant.getCode(), osResultConstant.getMessage(), data);
    }

}
