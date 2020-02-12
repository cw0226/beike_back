package com.kgc.dao;

import com.kgc.pojo.Building;
import com.kgc.pojo.BuildingCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BuildingMapper {
    int countByExample(BuildingCriteria example);

    int deleteByExample(BuildingCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Building record);

    int insertSelective(Building record);

    List<Building> selectByExample(BuildingCriteria example);

    Building selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Building record, @Param("example") BuildingCriteria example);

    int updateByExample(@Param("record") Building record, @Param("example") BuildingCriteria example);

    int updateByPrimaryKeySelective(Building record);

    int updateByPrimaryKey(Building record);
}