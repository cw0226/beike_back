package com.kgc.dao;

import com.kgc.pojo.Community;
import com.kgc.pojo.CommunityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommunityMapper {
    int countByExample(CommunityCriteria example);

    int deleteByExample(CommunityCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Community record);

    int insertSelective(Community record);

    List<Community> selectByExample(CommunityCriteria example);

    Community selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Community record, @Param("example") CommunityCriteria example);

    int updateByExample(@Param("record") Community record, @Param("example") CommunityCriteria example);

    int updateByPrimaryKeySelective(Community record);

    int updateByPrimaryKey(Community record);
}