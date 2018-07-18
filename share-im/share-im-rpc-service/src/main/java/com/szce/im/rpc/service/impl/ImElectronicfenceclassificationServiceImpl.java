package com.szce.im.rpc.service.impl;

import com.szce.common.annotation.BaseService;
import com.szce.common.base.BaseServiceImpl;
import com.szce.common.db.DataSourceEnum;
import com.szce.common.db.DynamicDataSource;
import com.szce.im.dao.mapper.ImElectronicfenceclassificationMapper;
import com.szce.im.dao.model.ImElectronicfenceclassification;
import com.szce.im.dao.model.ImElectronicfenceclassificationExample;
import com.szce.im.rpc.api.ImElectronicfenceclassificationService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
* ImElectronicfenceclassificationService实现
* Created by liuyunei on 2018/7/17.
*/
@Service
@Transactional
@BaseService
public class ImElectronicfenceclassificationServiceImpl extends BaseServiceImpl<ImElectronicfenceclassificationMapper, ImElectronicfenceclassification, ImElectronicfenceclassificationExample> implements ImElectronicfenceclassificationService {
    @Override
    public int updateByIdSelective(ImElectronicfenceclassification classification) {
        return this.imElectronicfenceclassificationMapper.updateByPrimaryKeySelective(classification);
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(ImElectronicfenceclassificationServiceImpl.class);

    @Autowired
    ImElectronicfenceclassificationMapper imElectronicfenceclassificationMapper;


    @Override
    public ImElectronicfenceclassification getById(String id) {
        return this.imElectronicfenceclassificationMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<ImElectronicfenceclassification> getAll() {
        return this.imElectronicfenceclassificationMapper.getAll();
    }

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
                count += this.imElectronicfenceclassificationMapper.deleteByPrimaryKey(idStr);
            }
            return count;
        } catch (Exception e) {
            e.printStackTrace();
        }
        DynamicDataSource.clearDataSource();
        return 0;
    }
}