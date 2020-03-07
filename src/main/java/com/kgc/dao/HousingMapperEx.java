package com.kgc.dao;

import com.kgc.pojo.HousingEx;

import java.util.List;

public interface HousingMapperEx {
    List<HousingEx> getHousingExListByCreateUserId(Integer createUserId);

    HousingEx getHousingExById(Integer id);
}
