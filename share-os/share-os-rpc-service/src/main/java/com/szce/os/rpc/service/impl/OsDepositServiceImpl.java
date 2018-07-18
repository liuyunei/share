package com.szce.os.rpc.service.impl;

import com.szce.common.annotation.BaseService;
import com.szce.common.base.BaseServiceImpl;
import com.szce.os.dao.mapper.OsDepositMapper;
import com.szce.os.dao.model.OsDeposit;
import com.szce.os.dao.model.OsDepositExample;
import com.szce.os.rpc.api.OsDepositService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* OsDepositService实现
* Created by liuyunei on 2018/7/17.
*/
@Service
@Transactional
@BaseService
public class OsDepositServiceImpl extends BaseServiceImpl<OsDepositMapper, OsDeposit, OsDepositExample> implements OsDepositService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OsDepositServiceImpl.class);

    @Autowired
    OsDepositMapper osDepositMapper;

}