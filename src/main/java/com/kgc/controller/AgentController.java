package com.kgc.controller;

import com.alibaba.druid.util.StringUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.pojo.Agent;
import com.kgc.service.AgentService;
import com.kgc.utils.FtpUtil;
import com.kgc.utils.Result;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@RestController
public class AgentController {
    @Resource
    private AgentService agentService;

    /**
     * 删除经纪人接口
     * @param id
     * @return
     */
    @GetMapping("view/deleteAgentById")
    public Result deleteAgentById(@RequestParam Integer id){
        int count = agentService.deleteAgentById(id);
        if (count > 0){
            return new Result(null, "请求处理成功", 100);
        }
        return new Result(null, "请求处理失败", 104);
    }

    /**
     * 添加或者修改经纪人接口
     * @param agent
     * @return
     */
    @PostMapping("view/addOrUpdateAgent")
    public Result addOrUpdateAgent(Agent agent, @RequestParam("picFile")MultipartFile file) throws IOException {
        if (file != null && !file.isEmpty()){
            String agentPic = FtpUtil.uploadFile(file);
            if (!StringUtils.isEmpty(agentPic)){
                agent.setAgentPic(agentPic);
            }
        }
        int count = 0;
        if (agent.getId() != null){
            agent.setUpdateTime(new Date());
            count = agentService.updateAgent(agent);
        } else {
            agent.setCreateTime(new Date());
            count = agentService.addAgent(agent);
        }
        if (count > 0){
            return new Result(null, "请求处理成功", 100);
        }
        return new Result(null, "请求处理失败", 104);

    }

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

    /**
     * 获取经纪人列表
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Cacheable(value = "agent", key = "'getAgentList'+#pageNum+'-'+#pageSize")
    @GetMapping("getAgentList")
    public Result getAgentList(@RequestParam Integer pageNum,@RequestParam Integer pageSize){
        PageHelper.startPage(pageNum, pageSize);
        List<Agent> agentList = agentService.getAgentList();
        PageInfo<Agent> pageInfo = new PageInfo<Agent>(agentList);
        return new Result(pageInfo,"请求处理成功",100);
    }
}
