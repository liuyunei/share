package com.szce.vtm.rpc.api;

import com.szce.common.base.BaseServiceMock;
import com.szce.vtm.dao.mapper.VtmBikebasicinfoMapper;
import com.szce.vtm.dao.model.VtmBikebasicinfo;
import com.szce.vtm.dao.model.VtmBikebasicinfoExample;

import java.util.List;

/**
* 降级实现VtmBikebasicinfoService接口
* Created by liuyunei on 2018/7/17.
*/
public class VtmBikebasicinfoServiceMock extends BaseServiceMock<VtmBikebasicinfoMapper, VtmBikebasicinfo, VtmBikebasicinfoExample> implements VtmBikebasicinfoService {


    @Override
    public VtmBikebasicinfo getBikebasicinfo(String id) {
        return null;
    }

    @Override
    public int deleteBikebasicinfo(String id) {
        return 0;
    }
}
