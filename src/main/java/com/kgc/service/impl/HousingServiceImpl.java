package com.kgc.service.impl;

import com.kgc.dao.HousingMapper;
import com.kgc.dao.HousingMapperEx;
import com.kgc.pojo.Housing;
import com.kgc.pojo.HousingCriteria;
import com.kgc.pojo.HousingEx;
import com.kgc.service.HousingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HousingServiceImpl implements HousingService {
    @Resource
    private HousingMapper housingMapper;
    @Resource
    private HousingMapperEx housingMapperEx;

    @Override
    public int addHousing(Housing housing) {
        return housingMapper.insertSelective(housing);
    }

    @Override
    public List<HousingEx> getHousingExList(HousingEx housingEx) {
        return housingMapperEx.getHousingExList(housingEx);
    }

    @Override
    public Housing getHousingById(Integer id) {
        return housingMapper.selectByPrimaryKey(id);
    }

    @Override
    public HousingEx getHousingExById(Integer id) {
        return housingMapperEx.getHousingExById(id);
    }

    @Override
    public int deleteHousingById(Integer id) {
        return housingMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateHousingById(Housing housing) {
        return housingMapper.updateByPrimaryKeySelective(housing);
    }
}
