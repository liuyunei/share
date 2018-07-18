package com.szce.vtm.common.constant;

import com.szce.common.base.BaseResult;

/**
 * cms系统常量枚举类
 * Created by szce on 2018/7/19.
 */
public class VtmResult extends BaseResult {

    public VtmResult(VtmResultConstant vtmResultConstant, Object data) {
        super(vtmResultConstant.getCode(), vtmResultConstant.getMessage(), data);
    }

}
