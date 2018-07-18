package com.szce.im.rpc.service.impl;

import com.szce.common.annotation.BaseService;
import com.szce.common.base.BaseServiceImpl;
import com.szce.im.dao.mapper.ImLogosignMapper;
import com.szce.im.dao.model.ImLogosign;
import com.szce.im.dao.model.ImLogosignExample;
import com.szce.im.rpc.api.ImLogosignService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ImLogosignService实现
* Created by liuyunei on 2018/7/17.
*/
@Service
@Transactional
@BaseService
public class ImLogosignServiceImpl extends BaseServiceImpl<ImLogosignMapper, ImLogosign, ImLogosignExample> implements ImLogosignService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ImLogosignServiceImpl.class);

    @Autowired
    ImLogosignMapper imLogosignMapper;

}