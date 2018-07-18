package com.szce.im.dao.mapper;

import com.szce.im.dao.model.ImElectronicfencedata;
import com.szce.im.dao.model.ImElectronicfencedataExample;
import com.szce.im.dao.model.custom.ImElectronicfencedataCustom;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ImElectronicfencedataMapper {
    long countByExample(ImElectronicfencedataExample example);

    int deleteByExample(ImElectronicfencedataExample example);

    int deleteByPrimaryKey(String electronicfenceid);

    int insert(ImElectronicfencedata record);

    int insertSelective(ImElectronicfencedata record);

    List<ImElectronicfencedata> selectByExample(ImElectronicfencedataExample example);

    ImElectronicfencedata selectByPrimaryKey(String electronicfenceid);

    int updateByExampleSelective(@Param("record") ImElectronicfencedata record, @Param("example") ImElectronicfencedataExample example);

    int updateByExample(@Param("record") ImElectronicfencedata record, @Param("example") ImElectronicfencedataExample example);

    int updateByPrimaryKeySelective(ImElectronicfencedata record);

    int updateByPrimaryKey(ImElectronicfencedata record);

    List<ImElectronicfencedataCustom> getPage(@Param("cond") Map<String, Object> cond, @Param("search") String search);

    long getCount(@Param("search") String search);
}