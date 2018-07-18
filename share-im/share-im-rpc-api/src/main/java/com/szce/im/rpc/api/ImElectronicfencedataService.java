package com.szce.im.rpc.api;

import com.szce.common.base.BaseService;
import com.szce.im.dao.model.ImElectronicfencedata;
import com.szce.im.dao.model.ImElectronicfencedataExample;
import com.szce.im.dao.model.custom.ImElectronicfencedataCustom;

import java.util.List;
import java.util.Map;

/**
* ImElectronicfencedataService接口
* Created by liuyunei on 2018/7/17.
*/
public interface ImElectronicfencedataService extends BaseService<ImElectronicfencedata, ImElectronicfencedataExample> {

    int deleteByIds(String ids);

    long getCount(String search);

    List<ImElectronicfencedataCustom> getPage(Map<String, Object> cond, String search);

    ImElectronicfencedata getById(String id);

    int updateByIdSelective(ImElectronicfencedata imElectronicfencedata);

}