package com.kgc.service;

import com.kgc.pojo.Community;

public interface CommunityService {
    int communityExist(Community community);

    int addCommunity(Community community);
}
