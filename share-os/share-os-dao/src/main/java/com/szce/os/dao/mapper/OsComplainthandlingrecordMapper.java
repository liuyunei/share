package com.szce.os.dao.mapper;

import com.szce.os.dao.model.OsComplainthandlingrecord;
import com.szce.os.dao.model.OsComplainthandlingrecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OsComplainthandlingrecordMapper {
    long countByExample(OsComplainthandlingrecordExample example);

    int deleteByExample(OsComplainthandlingrecordExample example);

    int deleteByPrimaryKey(String complainthandlingrecordid);

    int insert(OsComplainthandlingrecord record);

    int insertSelective(OsComplainthandlingrecord record);

    List<OsComplainthandlingrecord> selectByExample(OsComplainthandlingrecordExample example);

    OsComplainthandlingrecord selectByPrimaryKey(String complainthandlingrecordid);

    int updateByExampleSelective(@Param("record") OsComplainthandlingrecord record, @Param("example") OsComplainthandlingrecordExample example);

    int updateByExample(@Param("record") OsComplainthandlingrecord record, @Param("example") OsComplainthandlingrecordExample example);

    int updateByPrimaryKeySelective(OsComplainthandlingrecord record);

    int updateByPrimaryKey(OsComplainthandlingrecord record);
}