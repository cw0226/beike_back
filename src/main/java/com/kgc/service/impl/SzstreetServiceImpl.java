package com.kgc.service.impl;

import com.kgc.dao.SzstreetMapper;
import com.kgc.pojo.Szstreet;
import com.kgc.pojo.SzstreetCriteria;
import com.kgc.service.SzstreetService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SzstreetServiceImpl implements SzstreetService {
    @Resource
    private SzstreetMapper szstreetMapper;

    @Cacheable(value = "szstreet",key = "'getStreetOfAreaId'+#areaId")
    @Override
    public List<Szstreet> getStreetOfAreaId(Integer areaId) {
        //创建用户参数类，拼接sql语句
        SzstreetCriteria szstreetCriteria = new SzstreetCriteria();
        szstreetCriteria.createCriteria()
                .andAreaIdEqualTo(areaId);
        return szstreetMapper.selectByExample(szstreetCriteria);
    }
}
