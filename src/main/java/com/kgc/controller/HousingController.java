package com.kgc.controller;
/**
 * 房源Controller
 */

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.pojo.Housing;
import com.kgc.service.HousingService;
import com.kgc.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class HousingController {
    @Resource
    private HousingService housingService;

    /**
     * 添加房源
     * @param housing
     * @return
     */
    @GetMapping("view/addHousing")
    public Result addHousing(Housing housing){
        int count = housingService.addHousing(housing);
        if (count > 0){
            return new Result(null, "请求成功", 100);
        }
        return new Result(null, "请求失败", 104);
    }

    /**
     * 获取所有房源
     * @return
     */
    @GetMapping("view/getHousingList")
    public Result getHousingList(@RequestParam Integer page,@RequestParam Integer limit, Housing housing){
        PageHelper.startPage(page, limit);
        List<Housing> housingList = housingService.getHousingList(housing);
        PageInfo<Housing> pageInfo = new PageInfo<Housing>(housingList);
        return new Result(pageInfo, "请求成功", 100);
    }

    /**
     * 通过id获取房源
     * @return
     */
    @GetMapping("view/getHousingById")
    public Result getHousingById(@RequestParam Integer id){
        Housing housing = housingService.getHousingById(id);
        return new Result(housing, "请求成功", 100);
    }
}
