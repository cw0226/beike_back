package com.kgc.service;

import com.kgc.pojo.City;

import java.util.List;

public interface CityService {
    List<City> getCityListByParentId(Short parentId);
}
