package com.kgc.service;

import com.kgc.pojo.Building;

public interface BuildingService {
    int addBuilding(Building building);

    int buildingExist(Building building);

    int deleteBuildingById(Integer id);
}
