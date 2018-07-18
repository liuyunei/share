package com.szce.vtm.rpc.service.impl;

import com.szce.common.annotation.BaseService;
import com.szce.common.base.BaseServiceImpl;
import com.szce.vtm.dao.mapper.VtmBikebasicinfoMapper;
import com.szce.vtm.dao.model.VtmBikebasicinfo;
import com.szce.vtm.dao.model.VtmBikebasicinfoExample;
import com.szce.vtm.rpc.api.VtmBikebasicinfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
* VtmBikebasicinfoService实现
* Created by liuyunei on 2018/7/17.
*/
@Service
@Transactional
@BaseService
public class VtmBikebasicinfoServiceImpl extends BaseServiceImpl<VtmBikebasicinfoMapper, VtmBikebasicinfo, VtmBikebasicinfoExample> implements VtmBikebasicinfoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(VtmBikebasicinfoServiceImpl.class);

    @Autowired
    VtmBikebasicinfoMapper vtmBikebasicinfoMapper;


    @Override
    public VtmBikebasicinfo getBikebasicinfo(String id) {
        VtmBikebasicinfo vtmBikebasicinfo=vtmBikebasicinfoMapper.selectByPrimaryKey(id);
        return vtmBikebasicinfo;
    }

    @Override
    public int deleteBikebasicinfo(String id) {
        return vtmBikebasicinfoMapper.deleteByPrimaryKey(id);
    }
}