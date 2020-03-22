package com.kgc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.dao.ZufangMapper;
import com.kgc.dao.ZufangMapperEx;
import com.kgc.pojo.Zufang;
import com.kgc.pojo.ZufangEx;
import com.kgc.repository.ZufangRepostory;
import com.kgc.service.ZufangService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
    private ZufangRepostory zufangRepostory;

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
    public Map<String, Object> getZufangListOfSolr(String params, Integer pageNow, Integer pageSize) {
        //获取数据总行数
        long numFound = zufangRepostory.countByStreetOrAreaOrVillage(params,params,params);
        PageRequest pageRequest = PageRequest.of(pageNow-1,pageSize);
        List<com.kgc.document.Zufang> zufangList = zufangRepostory.findByStreetOrAreaOrVillage(params,params,params,pageRequest);

        Map<String,Object> map = new HashMap<>();
        map.put("numFound",numFound);
        map.put("list",zufangList);
        return map;
    }
}
