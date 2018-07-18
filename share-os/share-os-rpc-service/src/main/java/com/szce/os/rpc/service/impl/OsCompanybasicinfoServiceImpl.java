package com.szce.os.rpc.service.impl;


import com.szce.common.annotation.BaseService;
import com.szce.common.base.BaseServiceImpl;
import com.szce.common.db.DataSourceEnum;
import com.szce.common.db.DynamicDataSource;
import com.szce.os.dao.mapper.OsCompanybasicinfoMapper;
import com.szce.os.dao.model.OsCompanybasicinfo;
import com.szce.os.dao.model.OsCompanybasicinfoExample;
import com.szce.os.rpc.api.OsCompanybasicinfoService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

/**
* OsCompanybasicinfoService实现
* Created by liuyunei on 2018/7/17.
*/
@Service
@Transactional
@BaseService
public class OsCompanybasicinfoServiceImpl extends BaseServiceImpl<OsCompanybasicinfoMapper, OsCompanybasicinfo, OsCompanybasicinfoExample> implements OsCompanybasicinfoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OsCompanybasicinfoServiceImpl.class);

    @Autowired
    private OsCompanybasicinfoMapper osCompanybasicinfoMapper;

    @Override
    public ArrayList<OsCompanybasicinfo> getAllCompanybasicinfos() {
        return osCompanybasicinfoMapper.getAllCompanybasicinfos();
    }

    /**
     *  根据limit和offset进行查询
     * @param offset
     * @param limit
     * @return
     */
    @Override
    public ArrayList<OsCompanybasicinfo> getOsCompanybasicinfosByOffsetAndLimit(int offset, int limit) {
        HashMap<String,Integer> map = new HashMap<String, Integer>();
        map.put("limit_num",limit);
        map.put("offset_num",offset);
        return osCompanybasicinfoMapper.getOsCompanybasicinfosByOffsetAndLimit(map);
    }

    /**
     * 根据id删除数据
     * @param ids
     * @return
     */
    @Override
    public int deleteByPrimaryKeysTypeString(String ids) {
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
                Method deleteByPrimaryKey = mapper.getClass().getDeclaredMethod("deleteByPrimaryKey", idStr.getClass());
                Object result = deleteByPrimaryKey.invoke(mapper, idStr);
                count += Integer.parseInt(String.valueOf(result));
            }
            return count;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        DynamicDataSource.clearDataSource();
        return 0;
    }

    @Override
    public OsCompanybasicinfo getOsCompanyBasicInfoByCompanyId(String ids) {
        return osCompanybasicinfoMapper.getOsCompanyBasicInfoByCompanyId(ids);
    }

    @Override
    public int updateOsCompanyBasicInfo(OsCompanybasicinfo osCompanybasicinfo) {
        return osCompanybasicinfoMapper.updateOsCompanyBasicInfo(osCompanybasicinfo);
    }
}