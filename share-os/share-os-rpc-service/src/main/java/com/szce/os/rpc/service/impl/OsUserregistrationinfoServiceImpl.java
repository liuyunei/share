package com.szce.os.rpc.service.impl;

import com.szce.common.annotation.BaseService;
import com.szce.common.base.BaseServiceImpl;
import com.szce.os.dao.mapper.OsUserregistrationinfoMapper;
import com.szce.os.dao.model.OsUserregistrationinfo;
import com.szce.os.dao.model.OsUserregistrationinfoExample;
import com.szce.os.rpc.api.OsUserregistrationinfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* OsUserregistrationinfoService实现
* Created by liuyunei on 2018/7/17.
*/
@Service
@Transactional
@BaseService
public class OsUserregistrationinfoServiceImpl extends BaseServiceImpl<OsUserregistrationinfoMapper, OsUserregistrationinfo, OsUserregistrationinfoExample> implements OsUserregistrationinfoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OsUserregistrationinfoServiceImpl.class);

    @Autowired
    OsUserregistrationinfoMapper osUserregistrationinfoMapper;

}