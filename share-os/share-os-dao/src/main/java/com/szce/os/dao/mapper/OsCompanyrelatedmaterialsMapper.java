package com.szce.os.dao.mapper;

import com.szce.os.dao.model.OsCompanyrelatedmaterials;
import com.szce.os.dao.model.OsCompanyrelatedmaterialsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OsCompanyrelatedmaterialsMapper {
    long countByExample(OsCompanyrelatedmaterialsExample example);

    int deleteByExample(OsCompanyrelatedmaterialsExample example);

    int deleteByPrimaryKey(String companyrelatedmaterialsid);

    int insert(OsCompanyrelatedmaterials record);

    int insertSelective(OsCompanyrelatedmaterials record);

    List<OsCompanyrelatedmaterials> selectByExample(OsCompanyrelatedmaterialsExample example);

    OsCompanyrelatedmaterials selectByPrimaryKey(String companyrelatedmaterialsid);

    int updateByExampleSelective(@Param("record") OsCompanyrelatedmaterials record, @Param("example") OsCompanyrelatedmaterialsExample example);

    int updateByExample(@Param("record") OsCompanyrelatedmaterials record, @Param("example") OsCompanyrelatedmaterialsExample example);

    int updateByPrimaryKeySelective(OsCompanyrelatedmaterials record);

    int updateByPrimaryKey(OsCompanyrelatedmaterials record);
}