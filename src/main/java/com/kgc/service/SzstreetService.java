package com.kgc.service;

import com.kgc.pojo.Szstreet;

import java.util.List;

public interface SzstreetService {
    /**
     * 根据区域id获取街道
     * @param areaId
     * @return
     */
    List<Szstreet> getStreetOfAreaId(Integer areaId);
}
