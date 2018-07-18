package com.szce.im.rpc.service.impl;

import com.szce.common.annotation.BaseService;
import com.szce.common.base.BaseServiceImpl;
import com.szce.im.dao.mapper.ImMaintenancesitedataMapper;
import com.szce.im.dao.model.ImMaintenancesitedata;
import com.szce.im.dao.model.ImMaintenancesitedataExample;
import com.szce.im.rpc.api.ImMaintenancesitedataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ImMaintenancesitedataService实现
 * Created by liuyunei on 2018/7/16.
 */
@Service
@Transactional
@BaseService
public class ImMaintenancesitedataServiceImpl extends BaseServiceImpl<ImMaintenancesitedataMapper, ImMaintenancesitedata, ImMaintenancesitedataExample> implements ImMaintenancesitedataService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ImMaintenancesitedataServiceImpl.class);

    @Autowired
    ImMaintenancesitedataMapper imMaintenancesitedataMapper;

}