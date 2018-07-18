package com.szce.os.dao.mapper;

import com.szce.os.dao.model.OsUserregistrationinfo;
import com.szce.os.dao.model.OsUserregistrationinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OsUserregistrationinfoMapper {
    long countByExample(OsUserregistrationinfoExample example);

    int deleteByExample(OsUserregistrationinfoExample example);

    int deleteByPrimaryKey(String useraccount);

    int insert(OsUserregistrationinfo record);

    int insertSelective(OsUserregistrationinfo record);

    List<OsUserregistrationinfo> selectByExample(OsUserregistrationinfoExample example);

    OsUserregistrationinfo selectByPrimaryKey(String useraccount);

    int updateByExampleSelective(@Param("record") OsUserregistrationinfo record, @Param("example") OsUserregistrationinfoExample example);

    int updateByExample(@Param("record") OsUserregistrationinfo record, @Param("example") OsUserregistrationinfoExample example);

    int updateByPrimaryKeySelective(OsUserregistrationinfo record);

    int updateByPrimaryKey(OsUserregistrationinfo record);
}