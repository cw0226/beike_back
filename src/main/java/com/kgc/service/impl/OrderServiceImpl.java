package com.kgc.service.impl;

import com.kgc.dao.OrderMapper;
import com.kgc.pojo.Order;
import com.kgc.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderMapper orderMapper;
    @Override
    public Order getCostByID(Integer id) {
        return orderMapper.selectByPrimaryKey(id);
    }
}
