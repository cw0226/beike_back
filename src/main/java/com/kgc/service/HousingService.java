package com.kgc.service;

import com.kgc.pojo.Housing;

import java.util.List;

public interface HousingService {
    int addHousing(Housing housing);

    List<Housing> getHousingList(Housing housing);

    Housing getHousingById(Integer id);
}
