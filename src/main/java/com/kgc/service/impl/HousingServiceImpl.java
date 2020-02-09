package com.kgc.service.impl;

import com.kgc.dao.HousingMapper;
import com.kgc.pojo.Housing;
import com.kgc.service.HousingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class HousingServiceImpl implements HousingService {
    @Resource
    private HousingMapper housingMapper;

    @Override
    public int addHousing(Housing housing) {
        return housingMapper.insertSelective(housing);
    }
}
