package com.kgc.controller;

import com.kgc.pojo.Building;
import com.kgc.service.BuildingService;
import com.kgc.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class BuildingController {
    @Resource
    private BuildingService buildingService;

    @GetMapping("view/addBuilding")
    public Result addBuilding(Building building){
        int count = buildingService.addBuilding(building);
        if (count > 0){
            return new Result(null,"添加成功",100);
        }
        return new Result(null,"添加失败",104);
    }

    @GetMapping("view/deleteBuildingById")
    public Result deleteBuildingById(Integer id){
        int count = buildingService.deleteBuildingById(id);
        if (count > 0){
            return new Result(null,"删除成功",100);
        }
        return new Result(null,"删除失败",104);
    }
}
