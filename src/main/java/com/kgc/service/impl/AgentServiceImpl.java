package com.kgc.service.impl;

import com.kgc.dao.AgentMapper;
import com.kgc.pojo.Agent;
import com.kgc.service.AgentService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AgentServiceImpl implements AgentService {
    @Resource
    private AgentMapper agentMapper;

    @Cacheable(value = "agent", key = "'getAgentById'+#id")
    @Override
    public Agent getAgentById(Integer id) {
        return agentMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Agent> getAgentList() {
        return agentMapper.selectByExample(null);
    }

    @CacheEvict(value = "agent", allEntries = true)
    @Override
    public int addAgent(Agent agent) {
        return agentMapper.insertSelective(agent);
    }

    @CacheEvict(value = "agent", allEntries = true)
    @Override
    public int updateAgent(Agent agent) {
        return agentMapper.updateByPrimaryKeySelective(agent);
    }

    @CacheEvict(value = "agent", allEntries = true)
    @Override
    public int deleteAgentById(Integer id) {
        return agentMapper.deleteByPrimaryKey(id);
    }
}
