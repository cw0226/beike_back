package com.kgc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.dao.ZufangMapper;
import com.kgc.dao.ZufangMapperEx;
import com.kgc.pojo.Zufang;
import com.kgc.pojo.ZufangEx;
import com.kgc.service.ZufangService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ZufangServiceImpl implements ZufangService {
    @Resource
    private ZufangMapper zufangMapper;
    @Resource
    private ZufangMapperEx zufangMapperEx;

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
}
