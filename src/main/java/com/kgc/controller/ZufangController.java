package com.kgc.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.pojo.Zufang;
import com.kgc.pojo.ZufangEx;
import com.kgc.repository.ZufangRepostory;
import com.kgc.service.ZufangService;
import com.kgc.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 租房
 */
@RestController
public class ZufangController {
    @Resource
    private ZufangService zufangService;

    /**
     * 获取租房列表
     * @return
     */
    @GetMapping("getZufangList")
    public Result getZufangList(@RequestParam Integer pageNum,@RequestParam Integer pageSize,Integer areaId,Integer streetId,Integer rental,String orderBy){
        PageInfo<ZufangEx> pageInfo = zufangService.getZufangList(pageNum,pageSize,areaId,streetId,rental,orderBy);
        return new Result(pageInfo,"获取租房列表成功",100);
    }

    @GetMapping("getHouseInfoById")
    public Result getHouseInfoById(@RequestParam Integer id){
        Zufang zufang = zufangService.getHouseInfoById(id);
        return new Result(zufang,"请求处理成功",100);
    }

    /**
     * 获取租房列表
     * 使用Solr搜索引擎
     * @return
     */
    @GetMapping("getZufangListOfSolr")
    public Result getZufangListOfSolr(String params,Integer pageNow,Integer pageSize){
        Map<String,Object> map =zufangService.getZufangListOfSolr(params,pageNow,pageSize);
        return new Result(map,"获取成功",100);
    }
}
