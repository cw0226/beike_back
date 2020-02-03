package com.kgc.service;

import com.kgc.pojo.User;
import com.kgc.utils.Result;

public interface UserService {

    public User getUserOfLogin(String userName, String password);
}
