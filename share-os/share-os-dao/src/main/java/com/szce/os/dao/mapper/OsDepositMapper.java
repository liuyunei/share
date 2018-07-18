package com.szce.os.dao.mapper;

import com.szce.os.dao.model.OsDeposit;
import com.szce.os.dao.model.OsDepositExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OsDepositMapper {
    long countByExample(OsDepositExample example);

    int deleteByExample(OsDepositExample example);

    int deleteByPrimaryKey(String depositid);

    int insert(OsDeposit record);

    int insertSelective(OsDeposit record);

    List<OsDeposit> selectByExample(OsDepositExample example);

    OsDeposit selectByPrimaryKey(String depositid);

    int updateByExampleSelective(@Param("record") OsDeposit record, @Param("example") OsDepositExample example);

    int updateByExample(@Param("record") OsDeposit record, @Param("example") OsDepositExample example);

    int updateByPrimaryKeySelective(OsDeposit record);

    int updateByPrimaryKey(OsDeposit record);
}