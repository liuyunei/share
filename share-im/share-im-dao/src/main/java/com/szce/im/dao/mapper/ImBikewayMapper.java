package com.szce.im.dao.mapper;

import com.szce.im.dao.model.ImBikeway;
import com.szce.im.dao.model.ImBikewayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImBikewayMapper {
    long countByExample(ImBikewayExample example);

    int deleteByExample(ImBikewayExample example);

    int deleteByPrimaryKey(String bikewayid);

    int insert(ImBikeway record);

    int insertSelective(ImBikeway record);

    List<ImBikeway> selectByExample(ImBikewayExample example);

    ImBikeway selectByPrimaryKey(String bikewayid);

    int updateByExampleSelective(@Param("record") ImBikeway record, @Param("example") ImBikewayExample example);

    int updateByExample(@Param("record") ImBikeway record, @Param("example") ImBikewayExample example);

    int updateByPrimaryKeySelective(ImBikeway record);

    int updateByPrimaryKey(ImBikeway record);
}