package com.szce.os.dao.mapper;

import com.szce.os.dao.model.OsCustodyinformation;
import com.szce.os.dao.model.OsCustodyinformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OsCustodyinformationMapper {
    long countByExample(OsCustodyinformationExample example);

    int deleteByExample(OsCustodyinformationExample example);

    int deleteByPrimaryKey(String custodyinformationid);

    int insert(OsCustodyinformation record);

    int insertSelective(OsCustodyinformation record);

    List<OsCustodyinformation> selectByExample(OsCustodyinformationExample example);

    OsCustodyinformation selectByPrimaryKey(String custodyinformationid);

    int updateByExampleSelective(@Param("record") OsCustodyinformation record, @Param("example") OsCustodyinformationExample example);

    int updateByExample(@Param("record") OsCustodyinformation record, @Param("example") OsCustodyinformationExample example);

    int updateByPrimaryKeySelective(OsCustodyinformation record);

    int updateByPrimaryKey(OsCustodyinformation record);
}