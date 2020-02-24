package com.kgc.service;

import com.kgc.pojo.Agent;

import java.util.List;

public interface AgentService {
    Agent getAgentById(Integer id);

    List<Agent> getAgentList();
}
