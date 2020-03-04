package com.kgc.dao;

import com.kgc.pojo.Szstreet;
import com.kgc.pojo.SzstreetCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SzstreetMapper {
    int countByExample(SzstreetCriteria example);

    int deleteByExample(SzstreetCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Szstreet record);

    int insertSelective(Szstreet record);

    List<Szstreet> selectByExample(SzstreetCriteria example);

    Szstreet selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Szstreet record, @Param("example") SzstreetCriteria example);

    int updateByExample(@Param("record") Szstreet record, @Param("example") SzstreetCriteria example);

    int updateByPrimaryKeySelective(Szstreet record);

    int updateByPrimaryKey(Szstreet record);
}