package com.szce.os.dao.mapper;

import com.szce.os.dao.model.OsBikeuseinfo;
import com.szce.os.dao.model.OsBikeuseinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OsBikeuseinfoMapper {
    long countByExample(OsBikeuseinfoExample example);

    int deleteByExample(OsBikeuseinfoExample example);

    int insert(OsBikeuseinfo record);

    int insertSelective(OsBikeuseinfo record);

    List<OsBikeuseinfo> selectByExample(OsBikeuseinfoExample example);

    int updateByExampleSelective(@Param("record") OsBikeuseinfo record, @Param("example") OsBikeuseinfoExample example);

    int updateByExample(@Param("record") OsBikeuseinfo record, @Param("example") OsBikeuseinfoExample example);
}