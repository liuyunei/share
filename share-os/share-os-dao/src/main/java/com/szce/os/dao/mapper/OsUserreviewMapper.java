package com.szce.os.dao.mapper;

import com.szce.os.dao.model.OsUserreview;
import com.szce.os.dao.model.OsUserreviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OsUserreviewMapper {
    long countByExample(OsUserreviewExample example);

    int deleteByExample(OsUserreviewExample example);

    int deleteByPrimaryKey(String reviewid);

    int insert(OsUserreview record);

    int insertSelective(OsUserreview record);

    List<OsUserreview> selectByExample(OsUserreviewExample example);

    OsUserreview selectByPrimaryKey(String reviewid);

    int updateByExampleSelective(@Param("record") OsUserreview record, @Param("example") OsUserreviewExample example);

    int updateByExample(@Param("record") OsUserreview record, @Param("example") OsUserreviewExample example);

    int updateByPrimaryKeySelective(OsUserreview record);

    int updateByPrimaryKey(OsUserreview record);
}