package com.kgc.service.impl;

import com.kgc.dao.CityMapper;
import com.kgc.pojo.City;
import com.kgc.pojo.CityCriteria;
import com.kgc.service.CityService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CityServiceImpl implements CityService {
    @Resource
    private CityMapper cityMapper;

    @Cacheable(value = "city", key = "'getCityListByParentId'+#parentId")
    @Override
    public List<City> getCityListByParentId(Short parentId) {
        CityCriteria cityCriteria = new CityCriteria();
        cityCriteria.createCriteria().andParentIdEqualTo(parentId);
        return cityMapper.selectByExample(cityCriteria);
    }
}
