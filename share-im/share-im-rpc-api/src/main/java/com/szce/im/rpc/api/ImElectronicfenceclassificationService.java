package com.szce.im.rpc.api;

import com.szce.common.base.BaseService;
import com.szce.im.dao.model.ImElectronicfenceclassification;
import com.szce.im.dao.model.ImElectronicfenceclassificationExample;

import java.util.List;

/**
* ImElectronicfenceclassificationService接口
* Created by liuyunei on 2018/7/17.
*/
public interface ImElectronicfenceclassificationService extends BaseService<ImElectronicfenceclassification, ImElectronicfenceclassificationExample> {

    int deleteByIds(String ids);

    ImElectronicfenceclassification getById(String id);

    int updateByIdSelective(ImElectronicfenceclassification classification);

    List<ImElectronicfenceclassification> getAll();
}