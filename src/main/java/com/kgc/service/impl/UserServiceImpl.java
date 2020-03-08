package com.kgc.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.dao.UserMapper;
import com.kgc.pojo.User;
import com.kgc.pojo.UserCriteria;
import com.kgc.service.UserService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

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

    @Override
    public User selectUserByName(String name) {
        UserCriteria userCriteria = new UserCriteria();
        userCriteria.createCriteria().andUserNameEqualTo(name);
        List<User> userList = userMapper.selectByExample(userCriteria);
        if (userList != null && userList.size() >0){
            return userList.get(0);
        }
        return null;
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

    @Override
    public User selectUSerByPhone(String phone) {
        UserCriteria userCriteria = new UserCriteria();
        userCriteria.createCriteria().andUserPhoneEqualTo(phone);

        List<User> userList = userMapper.selectByExample(userCriteria);
        if (userList != null && userList.size() >0){
            return userList.get(0);
        }
        return null;
    }

    @Cacheable(value = "user",key = "'getAllUserInfo'+#pageNum+','+#pageSize+','+#id")
    @Override
    public PageInfo<User> getAllUserInfo(Integer pageNum,Integer pageSize,Integer id) {
        UserCriteria userCriteria = null;
        if(id != null){
            userCriteria = new UserCriteria();
            userCriteria.createCriteria().andIdNotEqualTo(id);
        }


        PageHelper.startPage(pageNum,pageSize);
        List<User> userList = userMapper.selectByExample(userCriteria==null?null:userCriteria);
        if(userList != null && userList.size() >0){
            return new PageInfo(userList);
        }
        return null;
    }
}
