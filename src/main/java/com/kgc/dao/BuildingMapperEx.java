package com.kgc.dao;

import com.kgc.pojo.Building;

public interface BuildingMapperEx {
    /**
     * 添加房源地址信息，并返回id
     * @param building
     * @return
     */
    int insertBuilding(Building building);
}
