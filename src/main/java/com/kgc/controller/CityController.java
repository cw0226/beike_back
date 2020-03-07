package com.kgc.controller;

import com.kgc.pojo.City;
import com.kgc.service.CityService;
import com.kgc.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class CityController {
    @Resource
    private CityService cityService;

    @GetMapping("getCityListByParentId")
    public Result getCityListByParentId(@RequestParam Short parentId){
        List<City> cityList = cityService.getCityListByParentId(parentId);
        return new Result(cityList,"处理请求成功",100);
    }
}
