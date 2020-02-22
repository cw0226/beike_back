package com.kgc.dao;

import com.kgc.pojo.Agent;
import com.kgc.pojo.AgentCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AgentMapper {
    int countByExample(AgentCriteria example);

    int deleteByExample(AgentCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Agent record);

    int insertSelective(Agent record);

    List<Agent> selectByExample(AgentCriteria example);

    Agent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Agent record, @Param("example") AgentCriteria example);

    int updateByExample(@Param("record") Agent record, @Param("example") AgentCriteria example);

    int updateByPrimaryKeySelective(Agent record);

    int updateByPrimaryKey(Agent record);
}