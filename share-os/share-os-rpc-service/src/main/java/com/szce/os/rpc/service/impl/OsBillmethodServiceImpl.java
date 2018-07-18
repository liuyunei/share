package com.szce.os.rpc.service.impl;

import com.szce.common.annotation.BaseService;
import com.szce.common.base.BaseServiceImpl;
import com.szce.os.dao.mapper.OsBillmethodMapper;
import com.szce.os.dao.model.OsBillmethod;
import com.szce.os.dao.model.OsBillmethodExample;
import com.szce.os.rpc.api.OsBillmethodService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* OsBillmethodService实现
* Created by liuyunei on 2018/7/17.
*/
@Service
@Transactional
@BaseService
public class OsBillmethodServiceImpl extends BaseServiceImpl<OsBillmethodMapper, OsBillmethod, OsBillmethodExample> implements OsBillmethodService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OsBillmethodServiceImpl.class);

    @Autowired
    OsBillmethodMapper osBillmethodMapper;

}