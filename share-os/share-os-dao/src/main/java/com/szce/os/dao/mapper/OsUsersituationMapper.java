package com.szce.os.dao.mapper;

import com.szce.os.dao.model.OsUsersituation;
import com.szce.os.dao.model.OsUsersituationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OsUsersituationMapper {
    long countByExample(OsUsersituationExample example);

    int deleteByExample(OsUsersituationExample example);

    int deleteByPrimaryKey(String usersituationid);

    int insert(OsUsersituation record);

    int insertSelective(OsUsersituation record);

    List<OsUsersituation> selectByExample(OsUsersituationExample example);

    OsUsersituation selectByPrimaryKey(String usersituationid);

    int updateByExampleSelective(@Param("record") OsUsersituation record, @Param("example") OsUsersituationExample example);

    int updateByExample(@Param("record") OsUsersituation record, @Param("example") OsUsersituationExample example);

    int updateByPrimaryKeySelective(OsUsersituation record);

    int updateByPrimaryKey(OsUsersituation record);
}