package com.szce.im.rpc.service.impl;

import com.szce.common.annotation.BaseService;
import com.szce.common.base.BaseServiceImpl;
import com.szce.im.dao.mapper.ImParksitedataMapper;
import com.szce.im.dao.model.ImParksitedata;
import com.szce.im.dao.model.ImParksitedataExample;
import com.szce.im.rpc.api.ImParksitedataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ImParksitedataService实现
* Created by liuyunei on 2018/7/17.
*/
@Service
@Transactional
@BaseService
public class ImParksitedataServiceImpl extends BaseServiceImpl<ImParksitedataMapper, ImParksitedata, ImParksitedataExample> implements ImParksitedataService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ImParksitedataServiceImpl.class);

    @Autowired
    ImParksitedataMapper imParksitedataMapper;

}