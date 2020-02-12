package com.kgc.service.impl;

import com.alibaba.druid.util.StringUtils;
import com.kgc.dao.UserMapper;
import com.kgc.dao.UserMapperEx;
import com.kgc.pojo.User;
import com.kgc.pojo.UserCriteria;
import com.kgc.service.UserService;
import com.kgc.utils.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Resource
    private UserMapperEx userMapperEx;

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

    @Override
    public int addUser(User user) {
        return userMapper.insertSelective(user);
    }

    @Override
    public User selectUserByName(String name) {
        return userMapperEx.selectUserByName(name);
    }

    @Override
    public int updUserData(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }
}
