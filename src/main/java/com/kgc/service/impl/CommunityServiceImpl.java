package com.kgc.service.impl;

import com.kgc.dao.CommunityMapper;
import com.kgc.dao.CommunityMapperEx;
import com.kgc.pojo.Community;
import com.kgc.pojo.CommunityCriteria;
import com.kgc.service.CommunityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CommunityServiceImpl implements CommunityService {
    @Resource
    private CommunityMapper communityMapper;
    @Resource
    private CommunityMapperEx communityMapperEx;

    @Override
    public int communityExist(Community community) {
        CommunityCriteria communityCriteria = new CommunityCriteria();
        communityCriteria.createCriteria().andCommunityNameEqualTo(community.getCommunityName());
        List<Community> communityList = communityMapper.selectByExample(communityCriteria);
        if (communityList != null && communityList.size() != 0){
            return communityList.get(0).getId();
        }
        return 0;
    }

    @Override
    public int addCommunity(Community community) {
        int id = communityExist(community);
        if (id > 0){   // 该数据已存在
            return id;
        }
        int row = communityMapperEx.insertCommunity(community);
        if (row > 0){
            return community.getId();
        }
        return 0;
    }
}
