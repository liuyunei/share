package com.szce.os.rpc.service.impl;

import com.szce.common.annotation.BaseService;
import com.szce.common.base.BaseServiceImpl;
import com.szce.os.dao.mapper.OsComplainthandlingrecordMapper;
import com.szce.os.dao.model.OsComplainthandlingrecord;
import com.szce.os.dao.model.OsComplainthandlingrecordExample;
import com.szce.os.rpc.api.OsComplainthandlingrecordService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* OsComplainthandlingrecordService实现
* Created by liuyunei on 2018/7/10.
*/
@Service
@Transactional
@BaseService
public class OsComplainthandlingrecordServiceImpl extends BaseServiceImpl<OsComplainthandlingrecordMapper, OsComplainthandlingrecord, OsComplainthandlingrecordExample> implements OsComplainthandlingrecordService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OsComplainthandlingrecordServiceImpl.class);

    @Autowired
    OsComplainthandlingrecordMapper osComplainthandlingrecordMapper;

}