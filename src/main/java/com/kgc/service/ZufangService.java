package com.kgc.service;

import com.github.pagehelper.PageInfo;
import com.kgc.pojo.Zufang;
import com.kgc.pojo.ZufangEx;
import org.apache.solr.client.solrj.SolrServerException;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface ZufangService {
    /**
     * 获取租房列表
     * @param pageNum 当前页
     * @param pageSize 显示总条数
     * @param areaId 区域id
     * @param streetId 街道id
     * @param rental 租赁方式
     * @param orderBy 根据xx分组 降序
     * @return
     */
    PageInfo<ZufangEx> getZufangList(Integer pageNum,Integer pageSize,Integer areaId,Integer streetId,Integer rental,String orderBy);

    Zufang getHouseInfoById(Integer id);

    Map<String, Object> getZufangListOfSolr(String params,String area,String street,Integer rental,String orderBy,
                                            String rent1,String rent2,String rent3,String rent4,String rent5,
                                            String rent6,String rent7,String room1,String room2,String room3,
                                            String room4,Integer pageNow, Integer pageSize) throws IOException, SolrServerException;
}
