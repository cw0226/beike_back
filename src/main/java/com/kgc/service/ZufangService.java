package com.kgc.service;

import com.github.pagehelper.PageInfo;
import com.kgc.pojo.ZufangEx;

import java.util.List;

public interface ZufangService {
    PageInfo<ZufangEx> getZufangList(Integer pageNum,Integer pageSize,Integer areaId,Integer streetId);
}
