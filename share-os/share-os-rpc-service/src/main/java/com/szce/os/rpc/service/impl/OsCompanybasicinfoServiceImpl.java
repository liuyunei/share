package com.szce.os.rpc.service.impl;

import com.szce.common.annotation.BaseService;
import com.szce.common.base.BaseServiceImpl;
import com.szce.os.dao.mapper.OsCompanybasicinfoMapper;
import com.szce.os.dao.model.OsCompanybasicinfo;
import com.szce.os.dao.model.OsCompanybasicinfoExample;
import com.szce.os.rpc.api.OsCompanybasicinfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* OsCompanybasicinfoService实现
* Created by liuyunei on 2018/7/10.
*/
@Service
@Transactional
@BaseService
public class OsCompanybasicinfoServiceImpl extends BaseServiceImpl<OsCompanybasicinfoMapper, OsCompanybasicinfo, OsCompanybasicinfoExample> implements OsCompanybasicinfoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OsCompanybasicinfoServiceImpl.class);

    @Autowired
    OsCompanybasicinfoMapper osCompanybasicinfoMapper;

}