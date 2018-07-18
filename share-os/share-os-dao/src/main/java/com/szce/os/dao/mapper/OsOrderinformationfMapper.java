package com.szce.os.dao.mapper;

import com.szce.os.dao.model.OsOrderinformationf;
import com.szce.os.dao.model.OsOrderinformationfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OsOrderinformationfMapper {
    long countByExample(OsOrderinformationfExample example);

    int deleteByExample(OsOrderinformationfExample example);

    int deleteByPrimaryKey(String orderid);

    int insert(OsOrderinformationf record);

    int insertSelective(OsOrderinformationf record);

    List<OsOrderinformationf> selectByExample(OsOrderinformationfExample example);

    OsOrderinformationf selectByPrimaryKey(String orderid);

    int updateByExampleSelective(@Param("record") OsOrderinformationf record, @Param("example") OsOrderinformationfExample example);

    int updateByExample(@Param("record") OsOrderinformationf record, @Param("example") OsOrderinformationfExample example);

    int updateByPrimaryKeySelective(OsOrderinformationf record);

    int updateByPrimaryKey(OsOrderinformationf record);
}