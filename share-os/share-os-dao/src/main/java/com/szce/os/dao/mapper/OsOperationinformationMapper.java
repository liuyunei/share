package com.szce.os.dao.mapper;

import com.szce.os.dao.model.OsOperationinformation;
import com.szce.os.dao.model.OsOperationinformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OsOperationinformationMapper {
    long countByExample(OsOperationinformationExample example);

    int deleteByExample(OsOperationinformationExample example);

    int deleteByPrimaryKey(String operationinformationid);

    int insert(OsOperationinformation record);

    int insertSelective(OsOperationinformation record);

    List<OsOperationinformation> selectByExample(OsOperationinformationExample example);

    OsOperationinformation selectByPrimaryKey(String operationinformationid);

    int updateByExampleSelective(@Param("record") OsOperationinformation record, @Param("example") OsOperationinformationExample example);

    int updateByExample(@Param("record") OsOperationinformation record, @Param("example") OsOperationinformationExample example);

    int updateByPrimaryKeySelective(OsOperationinformation record);

    int updateByPrimaryKey(OsOperationinformation record);
}