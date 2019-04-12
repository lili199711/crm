package com.briup.dao;

import com.briup.bean.CstService;
import com.briup.bean.CstServiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CstServiceMapper {
    int countByExample(CstServiceExample example);

    int deleteByExample(CstServiceExample example);

    int deleteByPrimaryKey(Long svrId);

    int insert(CstService record);

    int insertSelective(CstService record);

    List<CstService> selectByExample(CstServiceExample example);

    CstService selectByPrimaryKey(Long svrId);

    int updateByExampleSelective(@Param("record") CstService record, @Param("example") CstServiceExample example);

    int updateByExample(@Param("record") CstService record, @Param("example") CstServiceExample example);

    int updateByPrimaryKeySelective(CstService record);

    int updateByPrimaryKey(CstService record);
}