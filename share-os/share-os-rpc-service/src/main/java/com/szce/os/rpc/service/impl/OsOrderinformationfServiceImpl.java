package com.szce.os.rpc.service.impl;

import com.szce.common.annotation.BaseService;
import com.szce.common.base.BaseServiceImpl;
import com.szce.os.dao.mapper.OsOrderinformationfMapper;
import com.szce.os.dao.model.OsOrderinformationf;
import com.szce.os.dao.model.OsOrderinformationfExample;
import com.szce.os.rpc.api.OsOrderinformationfService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* OsOrderinformationfService实现
* Created by liuyunei on 2018/7/17.
*/
@Service
@Transactional
@BaseService
public class OsOrderinformationfServiceImpl extends BaseServiceImpl<OsOrderinformationfMapper, OsOrderinformationf, OsOrderinformationfExample> implements OsOrderinformationfService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OsOrderinformationfServiceImpl.class);

    @Autowired
    OsOrderinformationfMapper osOrderinformationfMapper;

}