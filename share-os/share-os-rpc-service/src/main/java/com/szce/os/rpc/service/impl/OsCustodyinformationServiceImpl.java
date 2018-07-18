package com.szce.os.rpc.service.impl;

import com.szce.common.annotation.BaseService;
import com.szce.common.base.BaseServiceImpl;
import com.szce.os.dao.mapper.OsCustodyinformationMapper;
import com.szce.os.dao.model.OsCustodyinformation;
import com.szce.os.dao.model.OsCustodyinformationExample;
import com.szce.os.rpc.api.OsCustodyinformationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* OsCustodyinformationService实现
* Created by liuyunei on 2018/7/17.
*/
@Service
@Transactional
@BaseService
public class OsCustodyinformationServiceImpl extends BaseServiceImpl<OsCustodyinformationMapper, OsCustodyinformation, OsCustodyinformationExample> implements OsCustodyinformationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OsCustodyinformationServiceImpl.class);

    @Autowired
    OsCustodyinformationMapper osCustodyinformationMapper;

}