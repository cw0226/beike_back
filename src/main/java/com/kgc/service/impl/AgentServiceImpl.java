package com.kgc.service.impl;

import com.kgc.dao.AgentMapper;
import com.kgc.pojo.Agent;
import com.kgc.service.AgentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AgentServiceImpl implements AgentService {
    @Resource
    private AgentMapper agentMapper;

    @Override
    public Agent getAgentById(Integer id) {
        return agentMapper.selectByPrimaryKey(id);
    }
}
