package com.kgc.dao;

import com.kgc.pojo.ValidateCode;

public interface ValidateCodeMapperEx {
    ValidateCode selectByCode(String code);

    int deleteByCode(String code);
}
