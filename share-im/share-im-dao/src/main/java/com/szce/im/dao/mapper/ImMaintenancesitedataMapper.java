package com.szce.im.dao.mapper;

import com.szce.im.dao.model.ImMaintenancesitedata;
import com.szce.im.dao.model.ImMaintenancesitedataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImMaintenancesitedataMapper {
    long countByExample(ImMaintenancesitedataExample example);

    int deleteByExample(ImMaintenancesitedataExample example);

    int deleteByPrimaryKey(String maintenancesitedataid);

    int insert(ImMaintenancesitedata record);

    int insertSelective(ImMaintenancesitedata record);

    List<ImMaintenancesitedata> selectByExample(ImMaintenancesitedataExample example);

    ImMaintenancesitedata selectByPrimaryKey(String maintenancesitedataid);

    int updateByExampleSelective(@Param("record") ImMaintenancesitedata record, @Param("example") ImMaintenancesitedataExample example);

    int updateByExample(@Param("record") ImMaintenancesitedata record, @Param("example") ImMaintenancesitedataExample example);

    int updateByPrimaryKeySelective(ImMaintenancesitedata record);

    int updateByPrimaryKey(ImMaintenancesitedata record);
}