package com.kgc.service.impl;

import com.kgc.dao.BuildingMapper;
import com.kgc.dao.BuildingMapperEx;
import com.kgc.pojo.Building;
import com.kgc.pojo.BuildingCriteria;
import com.kgc.service.BuildingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BuildingServiceImpl implements BuildingService {
    @Resource
    private BuildingMapper buildingMapper;
    @Resource
    private BuildingMapperEx buildingMapperEx;

    /**
     * 添加Building
     * 返回id
     * @param building
     * @return
     */
    @Override
    public int addBuilding(Building building) {
        int id = buildingExist(building);
        if (id > 0){   // 该数据已存在
            return id;
        }
        int row = buildingMapperEx.insertBuilding(building);
        if (row > 0){
            return building.getId();
        }
        return 0;
    }

    /**
     * 查询是否存在相同数据
     * 存在--返回id
     * 不存在--返回0
     * @param building
     * @return
     */
    @Override
    public int buildingExist(Building building) {
        BuildingCriteria buildingCriteria = new BuildingCriteria();
        buildingCriteria.createCriteria().andBlockEqualTo(building.getBlock()).
                andUintEqualTo(building.getUint()).andRoomNumberEqualTo(building.getRoomNumber())
                .andCommunityBuildingEqualTo(building.getCommunityBuilding());
        List<Building> buildingList = buildingMapper.selectByExample(buildingCriteria);
        if (buildingList != null && buildingList.size() != 0){
            return buildingList.get(0).getId();
        }
        return 0;
    }

    @Override
    public int deleteBuildingById(Integer id) {
        return buildingMapper.deleteByPrimaryKey(id);
    }
}
