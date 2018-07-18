package com.szce.im.rpc.api;

import com.szce.common.base.BaseServiceMock;
import com.szce.im.dao.mapper.ImElectronicfencedataMapper;
import com.szce.im.dao.model.ImElectronicfencedata;
import com.szce.im.dao.model.ImElectronicfencedataExample;
import com.szce.im.dao.model.custom.ImElectronicfencedataCustom;

import java.util.List;
import java.util.Map;

/**
* 降级实现ImElectronicfencedataService接口
* Created by liuyunei on 2018/7/17.
*/
public class ImElectronicfencedataServiceMock extends BaseServiceMock<ImElectronicfencedataMapper, ImElectronicfencedata, ImElectronicfencedataExample> implements ImElectronicfencedataService {
    @Override
    public int deleteByIds(String ids) {
        return 0;
    }

    @Override
    public long getCount(String search) {
        return 0;
    }


    @Override
    public int updateByIdSelective(ImElectronicfencedata imElectronicfencedata) {
        return 0;
    }

    @Override
    public ImElectronicfencedata getById(String id) {
        return null;
    }

    @Override
    public List<ImElectronicfencedataCustom> getPage(Map<String, Object> cond, String search) {
        return null;
    }
}
