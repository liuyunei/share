package com.szce.os.rpc.service.impl;

import com.szce.common.annotation.BaseService;
import com.szce.common.base.BaseServiceImpl;
import com.szce.os.dao.mapper.OsUsersituationMapper;
import com.szce.os.dao.model.OsUsersituation;
import com.szce.os.dao.model.OsUsersituationExample;
import com.szce.os.rpc.api.OsUsersituationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* OsUsersituationService实现
* Created by liuyunei on 2018/7/17.
*/
@Service
@Transactional
@BaseService
public class OsUsersituationServiceImpl extends BaseServiceImpl<OsUsersituationMapper, OsUsersituation, OsUsersituationExample> implements OsUsersituationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OsUsersituationServiceImpl.class);

    @Autowired
    OsUsersituationMapper osUsersituationMapper;

}