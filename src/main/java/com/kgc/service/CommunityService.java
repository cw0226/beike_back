package com.kgc.service;

import com.kgc.pojo.Community;

import java.util.List;

public interface CommunityService {
    int communityExist(Community community);

    int addCommunity(Community community);

    List<Community> getCommunityByCommunityName(String communityName);
}
