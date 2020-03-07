package com.kgc.pojo;

/**
 * 房源拓展类
 */
public class HousingEx extends Housing {
    private String communityName;   // 小区名
    private String cityName;    // 城市名

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
