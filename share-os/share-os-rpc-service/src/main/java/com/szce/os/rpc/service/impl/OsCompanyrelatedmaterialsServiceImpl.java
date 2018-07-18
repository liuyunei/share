package com.szce.os.rpc.service.impl;

import com.szce.common.annotation.BaseService;
import com.szce.common.base.BaseServiceImpl;
import com.szce.os.dao.mapper.OsCompanyrelatedmaterialsMapper;
import com.szce.os.dao.model.OsCompanyrelatedmaterials;
import com.szce.os.dao.model.OsCompanyrelatedmaterialsExample;
import com.szce.os.rpc.api.OsCompanyrelatedmaterialsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* OsCompanyrelatedmaterialsService实现
* Created by liuyunei on 2018/7/17.
*/
@Service
@Transactional
@BaseService
public class OsCompanyrelatedmaterialsServiceImpl extends BaseServiceImpl<OsCompanyrelatedmaterialsMapper, OsCompanyrelatedmaterials, OsCompanyrelatedmaterialsExample> implements OsCompanyrelatedmaterialsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OsCompanyrelatedmaterialsServiceImpl.class);

    @Autowired
    OsCompanyrelatedmaterialsMapper osCompanyrelatedmaterialsMapper;

}