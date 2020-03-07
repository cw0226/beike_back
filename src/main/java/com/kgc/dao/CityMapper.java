package com.kgc.dao;

import com.kgc.pojo.City;
import com.kgc.pojo.CityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CityMapper {
    int countByExample(CityCriteria example);

    int deleteByExample(CityCriteria example);

    int deleteByPrimaryKey(Short id);

    int insert(City record);

    int insertSelective(City record);

    List<City> selectByExample(CityCriteria example);

    City selectByPrimaryKey(Short id);

    int updateByExampleSelective(@Param("record") City record, @Param("example") CityCriteria example);

    int updateByExample(@Param("record") City record, @Param("example") CityCriteria example);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
}