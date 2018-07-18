package com.szce.im.dao.mapper;

import com.szce.im.dao.model.ImElectronicfenceclassification;
import com.szce.im.dao.model.ImElectronicfenceclassificationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImElectronicfenceclassificationMapper {
    long countByExample(ImElectronicfenceclassificationExample example);

    int deleteByExample(ImElectronicfenceclassificationExample example);

    int deleteByPrimaryKey(String electronicfenceclassificationid);

    int insert(ImElectronicfenceclassification record);

    int insertSelective(ImElectronicfenceclassification record);

    List<ImElectronicfenceclassification> selectByExample(ImElectronicfenceclassificationExample example);

    ImElectronicfenceclassification selectByPrimaryKey(String electronicfenceclassificationid);

    int updateByExampleSelective(@Param("record") ImElectronicfenceclassification record, @Param("example") ImElectronicfenceclassificationExample example);

    int updateByExample(@Param("record") ImElectronicfenceclassification record, @Param("example") ImElectronicfenceclassificationExample example);

    int updateByPrimaryKeySelective(ImElectronicfenceclassification record);

    int updateByPrimaryKey(ImElectronicfenceclassification record);
    
    List<ImElectronicfenceclassification> getAll();
}