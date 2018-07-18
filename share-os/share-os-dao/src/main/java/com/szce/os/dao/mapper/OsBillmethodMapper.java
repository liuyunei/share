package com.szce.os.dao.mapper;

import com.szce.os.dao.model.OsBillmethod;
import com.szce.os.dao.model.OsBillmethodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OsBillmethodMapper {
    long countByExample(OsBillmethodExample example);

    int deleteByExample(OsBillmethodExample example);

    int deleteByPrimaryKey(String billmethodid);

    int insert(OsBillmethod record);

    int insertSelective(OsBillmethod record);

    List<OsBillmethod> selectByExample(OsBillmethodExample example);

    OsBillmethod selectByPrimaryKey(String billmethodid);

    int updateByExampleSelective(@Param("record") OsBillmethod record, @Param("example") OsBillmethodExample example);

    int updateByExample(@Param("record") OsBillmethod record, @Param("example") OsBillmethodExample example);

    int updateByPrimaryKeySelective(OsBillmethod record);

    int updateByPrimaryKey(OsBillmethod record);
}