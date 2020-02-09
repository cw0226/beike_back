package com.kgc.controller;
/**
 * 房源Controller
 */

import com.kgc.pojo.Housing;
import com.kgc.service.HousingService;
import com.kgc.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HousingController {
    @Resource
    private HousingService housingService;

    @GetMapping("view/addHousing")
    public Result addHousing(Housing housing){
        int count = housingService.addHousing(housing);
        if (count > 0){
            return new Result(null, "请求成功", 100);
        }
        return new Result(null, "请求失败", 104);
    }
}
