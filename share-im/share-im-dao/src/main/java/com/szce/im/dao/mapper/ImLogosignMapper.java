package com.szce.im.dao.mapper;

import com.szce.im.dao.model.ImLogosign;
import com.szce.im.dao.model.ImLogosignExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImLogosignMapper {
    long countByExample(ImLogosignExample example);

    int deleteByExample(ImLogosignExample example);

    int deleteByPrimaryKey(String logosignid);

    int insert(ImLogosign record);

    int insertSelective(ImLogosign record);

    List<ImLogosign> selectByExample(ImLogosignExample example);

    ImLogosign selectByPrimaryKey(String logosignid);

    int updateByExampleSelective(@Param("record") ImLogosign record, @Param("example") ImLogosignExample example);

    int updateByExample(@Param("record") ImLogosign record, @Param("example") ImLogosignExample example);

    int updateByPrimaryKeySelective(ImLogosign record);

    int updateByPrimaryKey(ImLogosign record);
}