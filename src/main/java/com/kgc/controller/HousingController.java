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
import java.util.Date;
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
        housing.setCreateDate(new Date());  // 创建日期
        int count = housingService.addHousing(housing);
        if (count > 0){
            return new Result(null, "请求成功", 100);
        }
        return new Result(null, "请求失败", 104);
    }

    /**
     * 根据id删除房源
     * @param id
     * @return
     */
    @GetMapping("view/deleteHousingById")
    public Result deleteHousingById(@RequestParam Integer id){
        int count = housingService.deleteHousingById(id);
        if (count > 0){
            return new Result(null, "请求成功", 100);
        }
        return new Result(null, "请求失败", 104);
    }

    /**
     * 根据id修改房源信息
     * @param housing
     * @return
     */
    @GetMapping("view/updateHousingById")
    public Result updateHousingById(Housing housing){
        housing.setModifyDate(new Date());  //修改时间
        int count = housingService.updateHousingById(housing);
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
