package com.szce.os.rpc.service.impl;


import com.szce.common.annotation.BaseService;
import com.szce.common.base.BaseServiceImpl;
import com.szce.os.dao.mapper.OsUserreviewMapper;
import com.szce.os.dao.model.OsUserreview;
import com.szce.os.dao.model.OsUserreviewExample;
import com.szce.os.rpc.api.OsUserreviewService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* OsUserreviewService实现
* Created by liuyunei on 2018/7/10.
*/
@Service
@Transactional
@BaseService
public class OsUserreviewServiceImpl extends BaseServiceImpl<OsUserreviewMapper, OsUserreview, OsUserreviewExample> implements OsUserreviewService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OsUserreviewServiceImpl.class);

    @Autowired
    OsUserreviewMapper osUserreviewMapper;

}