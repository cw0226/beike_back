package com.kgc.service;

import com.kgc.dao.ValidateCodeMapper;
import com.kgc.pojo.ValidateCode;

public interface ValidateCodeService {

    /**
     * 插入验证码
     * @return
     */
    int InsertValidateCode(ValidateCode validateCode);

    /**
     * 查询验证码是否存在
     * @param code
     * @return
     */
    ValidateCode selectCodeIsExist(String code);

    int deleteByCode(String code);
}
