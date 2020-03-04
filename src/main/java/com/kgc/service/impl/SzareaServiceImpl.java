package com.kgc.service.impl;

import com.kgc.dao.SzareaMapper;
import com.kgc.pojo.Szarea;
import com.kgc.service.SzareaService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class SzareaServiceImpl implements SzareaService {
    @Resource
    private SzareaMapper szareaMapper;

    @Cacheable(value = "Szarea",key = "'getSzareaList'")
    @Override
    public List<Szarea> getSzareaList() {
        return szareaMapper.selectByExample(null);
    }
}
