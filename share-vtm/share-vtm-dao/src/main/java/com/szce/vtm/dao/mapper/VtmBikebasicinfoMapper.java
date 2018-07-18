package com.szce.vtm.dao.mapper;

import com.szce.vtm.dao.model.VtmBikebasicinfo;
import com.szce.vtm.dao.model.VtmBikebasicinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VtmBikebasicinfoMapper {
    long countByExample(VtmBikebasicinfoExample example);

    int deleteByExample(VtmBikebasicinfoExample example);

    int deleteByPrimaryKey(String bikeid);

    int insert(VtmBikebasicinfo record);

    int insertSelective(VtmBikebasicinfo record);

    List<VtmBikebasicinfo> selectByExample(VtmBikebasicinfoExample example);

    VtmBikebasicinfo selectByPrimaryKey(String bikeid);

    int updateByExampleSelective(@Param("record") VtmBikebasicinfo record, @Param("example") VtmBikebasicinfoExample example);

    int updateByExample(@Param("record") VtmBikebasicinfo record, @Param("example") VtmBikebasicinfoExample example);

    int updateByPrimaryKeySelective(VtmBikebasicinfo record);

    int updateByPrimaryKey(VtmBikebasicinfo record);
}