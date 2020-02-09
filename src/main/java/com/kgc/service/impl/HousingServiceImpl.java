package com.kgc.service.impl;

import com.kgc.dao.HousingMapper;
import com.kgc.pojo.Housing;
import com.kgc.pojo.HousingCriteria;
import com.kgc.service.HousingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HousingServiceImpl implements HousingService {
    @Resource
    private HousingMapper housingMapper;

    @Override
    public int addHousing(Housing housing) {
        return housingMapper.insertSelective(housing);
    }

    @Override
    public List<Housing> getHousingList(Housing housing) {
        HousingCriteria housingCriteria = new HousingCriteria();
        if (housing.getCreateBy() != null){
            housingCriteria.createCriteria().andCreateByEqualTo(housing.getCreateBy());
        }
        return housingMapper.selectByExample(housingCriteria);
    }

    @Override
    public Housing getHousingById(Integer id) {
        return housingMapper.selectByPrimaryKey(id);
    }
}
