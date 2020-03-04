package com.kgc.controller;

/**
 * 区域
 */

import com.kgc.pojo.Szarea;
import com.kgc.service.SzareaService;
import com.kgc.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class SzareaController {
    @Resource
    private SzareaService szareaService;

    @GetMapping("getSzareaList")
    public Result getSzareaList(){
        List<Szarea> szareaList = szareaService.getSzareaList();
        if(szareaList != null){
            return new Result(szareaList,"获取深圳区域列表成功",100);
        }
        return new Result(null,"获取深圳区域列表失败",104);
    }
}
