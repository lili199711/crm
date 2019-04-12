package com.briup.dao;

import com.briup.bean.SalChance;
import com.briup.bean.SalChanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalChanceMapper {
    int countByExample(SalChanceExample example);

    int deleteByExample(SalChanceExample example);

    int deleteByPrimaryKey(Long chcId);

    int insert(SalChance record);

    int insertSelective(SalChance record);

    List<SalChance> selectByExample(SalChanceExample example);

    SalChance selectByPrimaryKey(Long chcId);

    int updateByExampleSelective(@Param("record") SalChance record, @Param("example") SalChanceExample example);

    int updateByExample(@Param("record") SalChance record, @Param("example") SalChanceExample example);

    int updateByPrimaryKeySelective(SalChance record);

    int updateByPrimaryKey(SalChance record);
}