package com.kgc.service.impl;

import com.alibaba.druid.util.StringUtils;
import com.kgc.dao.UserMapper;
import com.kgc.dao.UserMapperEx;
import com.kgc.pojo.User;
import com.kgc.pojo.UserCriteria;
import com.kgc.service.UserService;
import com.kgc.utils.Result;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Resource
    private UserMapperEx userMapperEx;

    @Cacheable(value = "user",key = "'getUserOfLogin'+#userName+','+#password")
    @Override
    public User getUserOfLogin(String userName,String password) {
        //创建用户参数类，拼接SQL语句
        UserCriteria userCriteria = new UserCriteria();
        userCriteria.createCriteria()
                .andUserNameEqualTo(userName)
                .andUserPasswordEqualTo(password);
        List<User> userList =  userMapper.selectByExample(userCriteria);
        //判断集合是否为空
        if(userList != null && userList.size() > 0){
            return userList.get(0);
        }
        return null;
    }

    @CacheEvict(value = "user",allEntries = true)
    @Override
    public int addUser(User user) {
        return userMapper.insertSelective(user);
    }

    @Cacheable(value = "user",key = "'selectUserByName'+#name")
    @Override
    public User selectUserByName(String name) {
        return userMapperEx.selectUserByName(name);
    }

    @CacheEvict(value = "user",allEntries = true)
    @Override
    public int updUserData(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Cacheable(value = "user",key = "'getUserById'+#id")
    @Override
    public User getUserById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Cacheable(value = "user",key = "'selectUSerByPhone'+#phone")
    @Override
    public User selectUSerByPhone(String phone) {
        return userMapperEx.selectUserByPhone(phone);
    }
}
