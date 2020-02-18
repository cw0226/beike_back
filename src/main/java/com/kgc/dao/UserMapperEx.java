package com.kgc.dao;

import com.kgc.pojo.User;

public interface UserMapperEx {
    User selectUserByName(String name);

    User selectUserByPhone(String phone);
}
