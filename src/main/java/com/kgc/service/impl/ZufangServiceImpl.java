package com.kgc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.dao.ZufangMapper;
import com.kgc.dao.ZufangMapperEx;
import com.kgc.pojo.Zufang;
import com.kgc.pojo.ZufangEx;
import com.kgc.repository.ZufangRepository;
import com.kgc.service.ZufangService;
import org.apache.solr.client.solrj.SolrServerException;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ZufangServiceImpl implements ZufangService {
    @Resource
    private ZufangMapper zufangMapper;
    @Resource
    private ZufangMapperEx zufangMapperEx;
    @Resource
    private ZufangRepository zufangRepository;

    @Cacheable(value = "zufang",key = "'getZufangList'+#pageNum+','+#pageSize+','+#areaId+','+#streetId+','+#rental+','+#orderBy")
    @Override
    public PageInfo<ZufangEx> getZufangList(Integer pageNum,Integer pageSize,Integer areaId,Integer streetId,Integer rental,String orderBy) {
        //分页插件
        PageHelper.startPage(pageNum,pageSize);
        List<ZufangEx> zufangExList = zufangMapperEx.selectZufang(areaId,streetId,rental,orderBy);
        return new PageInfo(zufangExList);
    }

    @Cacheable(value = "zufang",key = "'getHouseInfoById'+#id")
    @Override
    public Zufang getHouseInfoById(Integer id) {
        return zufangMapper.selectByPrimaryKey(id);
    }


    @Override
    public Map<String, Object> getZufangListOfSolr(String params,String area,String street,Integer rental,String orderBy,
                                                   String rent1,String rent2,String rent3,String rent4,String rent5,
                                                   String rent6,String rent7,String room1,String room2,String room3,
                                                   String room4,Integer pageNow, Integer pageSize) throws IOException, SolrServerException {
        //开始下标
        int start = (pageNow-1)*pageSize;
        Map<String,Object> map = zufangRepository.getZufangList(params,area,street,rental,orderBy, rent1,rent2,rent3,rent4,rent5,rent6,rent7,room1,room2,room3,room4,start,pageSize);
        return map;
    }
}
