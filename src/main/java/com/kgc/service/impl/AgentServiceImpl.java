package com.kgc.service.impl;

import com.kgc.dao.AgentMapper;
import com.kgc.pojo.Agent;
import com.kgc.service.AgentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AgentServiceImpl implements AgentService {
    @Resource
    private AgentMapper agentMapper;

    @Override
    public Agent getAgentById(Integer id) {
        return agentMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Agent> getAgentList() {
        return agentMapper.selectByExample(null);
    }
}
