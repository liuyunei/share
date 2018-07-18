package com.szce.im.dao.mapper;

import com.szce.im.dao.model.ImParksitedata;
import com.szce.im.dao.model.ImParksitedataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImParksitedataMapper {
    long countByExample(ImParksitedataExample example);

    int deleteByExample(ImParksitedataExample example);

    int deleteByPrimaryKey(String parksitedataid);

    int insert(ImParksitedata record);

    int insertSelective(ImParksitedata record);

    List<ImParksitedata> selectByExample(ImParksitedataExample example);

    ImParksitedata selectByPrimaryKey(String parksitedataid);

    int updateByExampleSelective(@Param("record") ImParksitedata record, @Param("example") ImParksitedataExample example);

    int updateByExample(@Param("record") ImParksitedata record, @Param("example") ImParksitedataExample example);

    int updateByPrimaryKeySelective(ImParksitedata record);

    int updateByPrimaryKey(ImParksitedata record);
}