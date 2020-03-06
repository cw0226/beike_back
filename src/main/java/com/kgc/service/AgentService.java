package com.kgc.service;

import com.kgc.pojo.Agent;

import java.util.List;

public interface AgentService {
    Agent getAgentById(Integer id);

    List<Agent> getAgentList();

    int addAgent(Agent agent);

    int updateAgent(Agent agent);

    int deleteAgentById(Integer id);
}
