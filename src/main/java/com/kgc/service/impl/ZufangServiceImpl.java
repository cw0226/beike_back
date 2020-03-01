package com.kgc.service.impl;

import com.kgc.dao.ZufangMapperEx;
import com.kgc.pojo.ZufangEx;
import com.kgc.service.ZufangService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ZufangServiceImpl implements ZufangService {
    @Resource
    private ZufangMapperEx zufangMapperEx;

    @Cacheable(value = "zufang",key = "'getZufangList'")
    @Override
    public List<ZufangEx> getZufangList() {
        return zufangMapperEx.selectZufang();
    }
}
