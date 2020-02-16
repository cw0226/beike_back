package com.kgc.service;

import com.kgc.pojo.Housing;
import com.kgc.pojo.HousingEx;

import java.util.List;

public interface HousingService {
    int addHousing(Housing housing);

    List<HousingEx> getHousingExList(HousingEx housingEx);

    Housing getHousingById(Integer id);

    HousingEx getHousingExById(Integer id);

    int deleteHousingById(Integer id);

    int updateHousingById(Housing housing);
}
