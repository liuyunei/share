package com.szce.os.rpc.service.impl;

import com.szce.common.annotation.BaseService;
import com.szce.common.base.BaseServiceImpl;
import com.szce.os.dao.mapper.OsOperationinformationMapper;
import com.szce.os.dao.model.OsOperationinformation;
import com.szce.os.dao.model.OsOperationinformationExample;
import com.szce.os.rpc.api.OsOperationinformationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* OsOperationinformationService实现
* Created by liuyunei on 2018/7/17.
*/
@Service
@Transactional
@BaseService
public class OsOperationinformationServiceImpl extends BaseServiceImpl<OsOperationinformationMapper, OsOperationinformation, OsOperationinformationExample> implements OsOperationinformationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OsOperationinformationServiceImpl.class);

    @Autowired
    OsOperationinformationMapper osOperationinformationMapper;

}