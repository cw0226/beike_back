package com.kgc.controller;
/**
 * 房源Controller
 */

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.pojo.Building;
import com.kgc.pojo.Community;
import com.kgc.pojo.Housing;
import com.kgc.pojo.HousingEx;
import com.kgc.service.BuildingService;
import com.kgc.service.CommunityService;
import com.kgc.service.HousingService;
import com.kgc.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
public class HousingController {
    @Resource
    private HousingService housingService;
    @Resource
    private BuildingService buildingService;
    @Resource
    private CommunityService communityService;

    /**
     * 添加或修改房源
     * 有id--修改房源
     * 无id--添加房源
     * @param housing
     * @return
     */
    @PostMapping("view/addOrUpdateHousing")
    public Result addOrUpdateHousing(Housing housing, Building building, Community community){
        int communityId = communityService.addCommunity(community);
        housing.setCommunityId(communityId);
        building.setCommunityBuilding(communityId);
        int buildingId = buildingService.addBuilding(building);
        housing.setBuildingsId(buildingId);
        int count = 0;
        if (housing.getId() != null) {
            housing.setCheckTime(new Date());  //修改时间
            count = housingService.updateHousingById(housing);
        } else {
            housing.setCheckState((byte) 1);
            housing.setCreateTime(new Date());  // 创建日期
            count = housingService.addHousing(housing);
        }
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
     * 获取所有房源
     * @return
     */
    @GetMapping("view/getHousingList")
    public Result getHousingList(@RequestParam Integer page,@RequestParam Integer limit, HousingEx housingEx){
        PageHelper.startPage(page, limit);
        List<HousingEx> housingExList = housingService.getHousingExList(housingEx);
        PageInfo<HousingEx> pageInfo = new PageInfo<HousingEx>(housingExList);
        return new Result(pageInfo, "请求成功", 100);
    }

    /**
     * 通过id获取房源
     * @return
     */
    @GetMapping("view/getHousingById")
    public Result getHousingById(@RequestParam Integer id){
        HousingEx housingEx = housingService.getHousingExById(id);
        return new Result(housingEx, "请求成功", 100);
    }
}
