package com.kgc.controller;

import com.kgc.pojo.Szstreet;
import com.kgc.service.SzstreetService;
import com.kgc.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 深圳街道
 */
@RestController
public class SzstreetController {
    @Resource
    private SzstreetService szstreetService;

    @GetMapping("getStreetOfAreaId")
    public Result getStreetOfAreaId(Integer areaId){
        List<Szstreet> szstreetList =  szstreetService.getStreetOfAreaId(areaId);
        if(szstreetList != null){
            return new Result(szstreetList,"获取深圳街道列表成功",100);
        }
        return new Result(null,"获取深圳街道列表失败",104);
    }
}
