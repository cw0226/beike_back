package com.kgc.dao;

import com.kgc.pojo.Housing;
import com.kgc.pojo.HousingCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HousingMapper {
    int countByExample(HousingCriteria example);

    int deleteByExample(HousingCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Housing record);

    int insertSelective(Housing record);

    List<Housing> selectByExample(HousingCriteria example);

    Housing selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Housing record, @Param("example") HousingCriteria example);

    int updateByExample(@Param("record") Housing record, @Param("example") HousingCriteria example);

    int updateByPrimaryKeySelective(Housing record);

    int updateByPrimaryKey(Housing record);
}