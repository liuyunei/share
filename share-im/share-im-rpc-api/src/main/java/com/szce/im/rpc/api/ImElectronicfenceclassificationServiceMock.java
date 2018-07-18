package com.szce.im.rpc.api;

import com.szce.common.base.BaseServiceMock;
import com.szce.im.dao.mapper.ImElectronicfenceclassificationMapper;
import com.szce.im.dao.model.ImElectronicfenceclassification;
import com.szce.im.dao.model.ImElectronicfenceclassificationExample;

import java.util.List;

/**
* 降级实现ImElectronicfenceclassificationService接口
* Created by liuyunei on 2018/7/17.
*/
public class ImElectronicfenceclassificationServiceMock extends BaseServiceMock<ImElectronicfenceclassificationMapper, ImElectronicfenceclassification, ImElectronicfenceclassificationExample> implements ImElectronicfenceclassificationService {

    @Override
    public int deleteByIds(String ids) {
        return 0;
    }

    @Override
    public List<ImElectronicfenceclassification> getAll() {
        return null;
    }

    @Override
    public int updateByIdSelective(ImElectronicfenceclassification classification) {
        return 0;
    }

    @Override
    public ImElectronicfenceclassification getById(String id) {
        return null;
    }
}
