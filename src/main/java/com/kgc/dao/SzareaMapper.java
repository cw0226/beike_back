package com.kgc.dao;

import com.kgc.pojo.Szarea;
import com.kgc.pojo.SzareaCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SzareaMapper {
    int countByExample(SzareaCriteria example);

    int deleteByExample(SzareaCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Szarea record);

    int insertSelective(Szarea record);

    List<Szarea> selectByExample(SzareaCriteria example);

    Szarea selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Szarea record, @Param("example") SzareaCriteria example);

    int updateByExample(@Param("record") Szarea record, @Param("example") SzareaCriteria example);

    int updateByPrimaryKeySelective(Szarea record);

    int updateByPrimaryKey(Szarea record);
}