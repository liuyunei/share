package com.szce.im.rpc.service.impl;

import com.szce.common.annotation.BaseService;
import com.szce.common.base.BaseServiceImpl;
import com.szce.im.dao.mapper.ImBikewayMapper;
import com.szce.im.dao.model.ImBikeway;
import com.szce.im.dao.model.ImBikewayExample;
import com.szce.im.rpc.api.ImBikewayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ImBikewayService实现
* Created by liuyunei on 2018/7/17.
*/
@Service
@Transactional
@BaseService
public class ImBikewayServiceImpl extends BaseServiceImpl<ImBikewayMapper, ImBikeway, ImBikewayExample> implements ImBikewayService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ImBikewayServiceImpl.class);

    @Autowired
    ImBikewayMapper imBikewayMapper;

}