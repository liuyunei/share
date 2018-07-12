package com.szce.os.dao.mapper;

import com.szce.os.dao.model.OsCompanybasicinfo;
import com.szce.os.dao.model.OsCompanybasicinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OsCompanybasicinfoMapper {
    long countByExample(OsCompanybasicinfoExample example);

    int deleteByExample(OsCompanybasicinfoExample example);

    int deleteByPrimaryKey(String companyid);

    int insert(OsCompanybasicinfo record);

    int insertSelective(OsCompanybasicinfo record);

    List<OsCompanybasicinfo> selectByExample(OsCompanybasicinfoExample example);

    OsCompanybasicinfo selectByPrimaryKey(String companyid);

    int updateByExampleSelective(@Param("record") OsCompanybasicinfo record, @Param("example") OsCompanybasicinfoExample example);

    int updateByExample(@Param("record") OsCompanybasicinfo record, @Param("example") OsCompanybasicinfoExample example);

    int updateByPrimaryKeySelective(OsCompanybasicinfo record);

    int updateByPrimaryKey(OsCompanybasicinfo record);
}