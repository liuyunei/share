package com.szce.upms.rpc.api;

import com.szce.common.base.BaseServiceMock;
import com.szce.upms.dao.mapper.UpmsUserOrganizationMapper;
import com.szce.upms.dao.model.UpmsUserOrganization;
import com.szce.upms.dao.model.UpmsUserOrganizationExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* 降级实现UpmsUserOrganizationService接口
* Created by szce on 2017/3/20.
*/
public class UpmsUserOrganizationServiceMock extends BaseServiceMock<UpmsUserOrganizationMapper, UpmsUserOrganization, UpmsUserOrganizationExample> implements UpmsUserOrganizationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UpmsUserOrganizationServiceMock.class);

    @Override
    public int organization(String[] organizationIds, int id) {
        LOGGER.info("UpmsUserOrganizationServiceMock => organization");
        return 0;
    }

}
