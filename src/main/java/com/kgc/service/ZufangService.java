package com.kgc.service;

import com.github.pagehelper.PageInfo;
import com.kgc.pojo.Zufang;
import com.kgc.pojo.ZufangEx;

import java.util.List;

public interface ZufangService {
    /**
     * 获取租房列表
     * @param pageNum 当前页
     * @param pageSize 显示总条数
     * @param areaId 区域id
     * @param streetId 街道id
     * @param rental 租赁方式
     * @param orderBy 根据xx分组 降序
     * @return
     */
    PageInfo<ZufangEx> getZufangList(Integer pageNum,Integer pageSize,Integer areaId,Integer streetId,Integer rental,String orderBy);

    Zufang getHouseInfoById(Integer id);
}
