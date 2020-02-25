package com.kgc.dao;

import com.kgc.pojo.Community;

public interface CommunityMapperEx {
    /**
     * 添加小区名，并返回id
     * @param community
     * @return
     */
    int insertCommunity(Community community);
}
