package com.szce.os.rpc.service.impl;

import com.szce.common.annotation.BaseService;
import com.szce.common.base.BaseServiceImpl;
import com.szce.os.dao.mapper.OsBikeuseinfoMapper;
import com.szce.os.dao.model.OsBikeuseinfo;
import com.szce.os.dao.model.OsBikeuseinfoExample;
import com.szce.os.rpc.api.OsBikeuseinfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* OsBikeuseinfoService实现
* Created by liuyunei on 2018/7/17.
*/
@Service
@Transactional
@BaseService
public class OsBikeuseinfoServiceImpl extends BaseServiceImpl<OsBikeuseinfoMapper, OsBikeuseinfo, OsBikeuseinfoExample> implements OsBikeuseinfoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OsBikeuseinfoServiceImpl.class);

    @Autowired
    OsBikeuseinfoMapper osBikeuseinfoMapper;

}