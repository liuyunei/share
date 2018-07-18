package com.szce.os.rpc.api;

import com.szce.common.base.BaseServiceMock;
import com.szce.os.dao.mapper.OsCompanybasicinfoMapper;
import com.szce.os.dao.model.OsCompanybasicinfo;
import com.szce.os.dao.model.OsCompanybasicinfoExample;

import java.util.ArrayList;

/**
* 降级实现OsCompanybasicinfoService接口
* Created by liuyunei on 2018/7/17.
*/
public class OsCompanybasicinfoServiceMock extends BaseServiceMock<OsCompanybasicinfoMapper, OsCompanybasicinfo, OsCompanybasicinfoExample> implements OsCompanybasicinfoService {

    @Override
    public ArrayList<OsCompanybasicinfo> getAllCompanybasicinfos() {
        return null;
    }

    @Override
    public ArrayList<OsCompanybasicinfo> getOsCompanybasicinfosByOffsetAndLimit(int offset, int limit) {
        return null;
    }

    @Override
    public int deleteByPrimaryKeysTypeString(String ids) {
        return 0;
    }

    @Override
    public OsCompanybasicinfo getOsCompanyBasicInfoByCompanyId(String ids) {
        return null;
    }

    @Override
    public int updateOsCompanyBasicInfo(OsCompanybasicinfo osCompanybasicinfo) {
        return 0;
    }

}
