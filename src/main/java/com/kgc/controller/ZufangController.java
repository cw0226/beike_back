package com.kgc.controller;

import com.kgc.pojo.ZufangEx;
import com.kgc.service.ZufangService;
import com.kgc.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
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
    public Result getZufangList(){
        List<ZufangEx> zufangExList = zufangService.getZufangList();
        if(zufangExList != null ){
            return new Result(zufangExList,"获取租房列表成功",100);
        }
        return new Result(null,"获取租房列表失败",104);
    }
}
