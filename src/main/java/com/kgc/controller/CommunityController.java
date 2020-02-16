package com.kgc.controller;

import com.kgc.pojo.Community;
import com.kgc.service.CommunityService;
import com.kgc.utils.Result;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class CommunityController {
    @Resource
    private CommunityService communityService;

    public Result addCommunity(Community community){
        int count = communityService.addCommunity(community);
        if (count > 0){
            return new Result(null,"添加成功",100);
        }
        return new Result(null,"添加失败",104);
    }
}
