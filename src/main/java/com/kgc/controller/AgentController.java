package com.kgc.controller;

import com.kgc.pojo.Agent;
import com.kgc.service.AgentService;
import com.kgc.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class AgentController {
    @Resource
    private AgentService agentService;

    /**
     * 经纪人查询接口
     *
     * @param id
     * @return
     */
    @GetMapping("getAgentById")
    public Result getAgentById(@RequestParam Integer id) {
        Agent agent = agentService.getAgentById(id);
        return new Result(agent, "请求处理成功", 100);
    }
}
