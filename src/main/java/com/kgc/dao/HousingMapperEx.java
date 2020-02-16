package com.kgc.dao;

import com.kgc.pojo.HousingEx;

import java.util.List;

public interface HousingMapperEx {
    List<HousingEx> getHousingExList(HousingEx housingEx);

    HousingEx getHousingExById(Integer id);
}
