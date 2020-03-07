package com.kgc.service.impl;

import com.kgc.dao.HousingMapper;
import com.kgc.dao.HousingMapperEx;
import com.kgc.pojo.Housing;
import com.kgc.pojo.HousingCriteria;
import com.kgc.pojo.HousingEx;
import com.kgc.service.HousingService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HousingServiceImpl implements HousingService {
    @Resource
    private HousingMapper housingMapper;
    @Resource
    private HousingMapperEx housingMapperEx;

    @CacheEvict(value = "housing" ,allEntries = true)
    @Override
    public int addHousing(Housing housing) {
        return housingMapper.insertSelective(housing);
    }

    @Override
    public Housing getHousingById(Integer id) {
        return housingMapper.selectByPrimaryKey(id);
    }

    @Cacheable(value = "housing",key = "'getHousingExById'+#id")
    @Override
    public HousingEx getHousingExById(Integer id) {
        return housingMapperEx.getHousingExById(id);
    }

    @CacheEvict(value = "housing" ,allEntries = true)
    @Override
    public int deleteHousingById(Integer id) {
        return housingMapper.deleteByPrimaryKey(id);
    }

    @CacheEvict(value = "housing" ,allEntries = true)
    @Override
    public int updateHousingById(Housing housing) {
        return housingMapper.updateByPrimaryKeySelective(housing);
    }

    @Cacheable(value = "housing",key = "'getHousingListByCreateUserId'+#createUserId")
    @Override
    public List<HousingEx> getHousingListByCreateUserId(Integer createUserId) {
        return housingMapperEx.getHousingExListByCreateUserId(createUserId);
    }
}
