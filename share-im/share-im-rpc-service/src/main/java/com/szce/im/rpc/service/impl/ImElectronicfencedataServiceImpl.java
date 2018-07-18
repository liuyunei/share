package com.szce.im.rpc.service.impl;

import com.szce.common.annotation.BaseService;
import com.szce.common.base.BaseServiceImpl;
import com.szce.common.db.DataSourceEnum;
import com.szce.common.db.DynamicDataSource;
import com.szce.im.dao.mapper.ImElectronicfencedataMapper;
import com.szce.im.dao.model.ImElectronicfencedata;
import com.szce.im.dao.model.ImElectronicfencedataExample;
import com.szce.im.dao.model.custom.ImElectronicfencedataCustom;
import com.szce.im.rpc.api.ImElectronicfencedataService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
* ImElectronicfencedataService实现
* Created by liuyunei on 2018/7/17.
*/
@Service
@Transactional
@BaseService
public class ImElectronicfencedataServiceImpl extends BaseServiceImpl<ImElectronicfencedataMapper, ImElectronicfencedata, ImElectronicfencedataExample> implements ImElectronicfencedataService {
    @Autowired
    private ImElectronicfencedataMapper imElectronicfencedataMapper;

    private static final Logger LOGGER = LoggerFactory.getLogger(ImElectronicfencedataServiceImpl.class);

    @Override
    public int deleteByIds(String ids) {
        try {
            if (StringUtils.isBlank(ids)) {
                return 0;
            }
            DynamicDataSource.setDataSource(DataSourceEnum.MASTER.getName());
            String[] idArray = ids.split("-");
            int count = 0;
            for (String idStr : idArray) {
                if (StringUtils.isBlank(idStr)) {
                    continue;
                }
                count += this.imElectronicfencedataMapper.deleteByPrimaryKey(idStr);
            }
            return count;
        } catch (Exception e) {
            e.printStackTrace();
        }
        DynamicDataSource.clearDataSource();
        return 0;
    }




    @Override
    public int updateByIdSelective(ImElectronicfencedata imElectronicfencedata) {
        return this.imElectronicfencedataMapper.updateByPrimaryKeySelective(imElectronicfencedata);
    }

    @Override
    public ImElectronicfencedata getById(String id) {
        return this.imElectronicfencedataMapper.selectByPrimaryKey(id);
    }

    @Override
    public long getCount(String search) {
        return this.imElectronicfencedataMapper.getCount(search);
    }

    @Override
    public List<ImElectronicfencedataCustom> getPage(Map<String, Object> cond, String search) {
        return this.imElectronicfencedataMapper.getPage(cond, search);
    }
}