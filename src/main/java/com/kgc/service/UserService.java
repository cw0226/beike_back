package com.kgc.service;

import com.kgc.pojo.User;
import com.kgc.utils.Result;

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
}
