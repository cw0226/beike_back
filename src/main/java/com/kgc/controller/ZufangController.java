package com.kgc.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.pojo.ZufangEx;
import com.kgc.service.ZufangService;
import com.kgc.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

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
        if(pageInfo != null ){
            return new Result(pageInfo,"获取租房列表成功",100);
        }
        return new Result(null,"获取租房列表失败",104);
    }
}
