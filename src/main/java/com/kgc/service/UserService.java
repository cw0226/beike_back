package com.kgc.service;

import com.github.pagehelper.PageInfo;
import com.kgc.pojo.User;
import com.kgc.utils.Result;

import java.util.List;

public interface UserService {
    /**
     * 获取用户登录信息
     * @param userName
     * @param password
     * @return
     */
    User getUserOfLogin(String userName, String password);

    /**
     * 用户注册
     * @return
     */
    int addUser(User user);

    /**
     * 根据用户名查询用户是否存在
     * @param name
     * @return
     */
    User selectUserByName(String name);

    /**
     * 修改资料
     * @param user
     * @return
     */
    int updUserData(User user);

    /**
     * 根据id获取用户信息
     * @param id
     * @return
     */
    User getUserById(Integer id);

    /**
     * 根据手机号查询用户
     * @param phone
     * @return
     */
    User selectUSerByPhone(String phone);

    /**
     * 获取所有用户信息
     * @return
     */
    PageInfo<User> getAllUserInfo(Integer pageNum, Integer pageSize,Integer id);

    /**
     * 根据用户id删除用户
     * @param id
     * @return
     */
    int deleteUserById(Integer id);
}
