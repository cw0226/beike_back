package com.kgc.controller;

import com.github.pagehelper.PageInfo;
import com.kgc.pojo.Zufang;
import com.kgc.pojo.ZufangEx;
import com.kgc.service.ZufangService;
import com.kgc.utils.Result;
import org.apache.solr.client.solrj.SolrServerException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;
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
    public Result getZufangListOfSolr(String params,String area,String street,Integer rental,String orderBy,
                                        String rent1,String rent2,String rent3,String rent4,String rent5,
                                        String rent6,String rent7,String room1,String room2,String room3,
                                        String room4, Integer pageNow,Integer pageSize)
                                        throws IOException, SolrServerException {
        Map<String,Object> map =zufangService.getZufangListOfSolr(params,area,street,rental,orderBy,
                                                                    rent1,rent2,rent3,rent4,rent5,rent6,rent7,
                                                                    room1,room2,room3,room4,pageNow,pageSize);
        return new Result(map,"获取成功",100);
    }
}
