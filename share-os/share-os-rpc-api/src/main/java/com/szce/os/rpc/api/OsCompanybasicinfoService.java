package com.szce.os.rpc.api;


import com.szce.common.base.BaseService;
import com.szce.os.dao.model.OsCompanybasicinfo;
import com.szce.os.dao.model.OsCompanybasicinfoExample;

import java.util.ArrayList;

/**
* OsCompanybasicinfoService接口
* Created by liuyunei on 2018/7/17.
*/
public interface OsCompanybasicinfoService extends BaseService<OsCompanybasicinfo, OsCompanybasicinfoExample> {
    /**
     * 获取所有企业基本信息
     * @return
     */
    ArrayList<OsCompanybasicinfo> getAllCompanybasicinfos();

    /**
     * 根据offset和limit进行显示
     * @param offset
     * @param limit
     * @return
     */
    ArrayList<OsCompanybasicinfo> getOsCompanybasicinfosByOffsetAndLimit(int offset,int limit);

    int deleteByPrimaryKeysTypeString(String ids);

    OsCompanybasicinfo getOsCompanyBasicInfoByCompanyId(String ids);

    int updateOsCompanyBasicInfo(OsCompanybasicinfo osCompanybasicinfo);
}