package com.szce.vtm.rpc.api;


import com.szce.common.base.BaseService;
import com.szce.vtm.dao.model.VtmBikebasicinfo;
import com.szce.vtm.dao.model.VtmBikebasicinfoExample;

import java.util.List;

/**
* VtmBikebasicinfoService接口
* Created by liuyunei on 2018/7/17.
*/
public interface VtmBikebasicinfoService extends BaseService<VtmBikebasicinfo, VtmBikebasicinfoExample> {

    /*
    * 根据主键查询车辆信息
    * */
   VtmBikebasicinfo  getBikebasicinfo(String id);

 /*
 * 根据主键删除车辆信息
 * */

 int deleteBikebasicinfo(String id);






}

