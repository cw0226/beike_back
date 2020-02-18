package com.kgc.service.impl;

import com.kgc.dao.ValidateCodeMapper;
import com.kgc.dao.ValidateCodeMapperEx;
import com.kgc.pojo.ValidateCode;
import com.kgc.service.ValidateCodeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class ValidateCodeServiceImpl implements ValidateCodeService {
    @Resource
    private ValidateCodeMapper validateCodeMapper;
    @Resource
    private ValidateCodeMapperEx validateCodeMapperEx;

    @Override
    public int InsertValidateCode(ValidateCode validateCode) {
        return validateCodeMapper.insert(validateCode);
    }

    @Override
    public ValidateCode selectCodeIsExist(String code) {
        return validateCodeMapperEx.selectByCode(code);
    }

    @Override
    public int deleteByCode(String code) {
        return validateCodeMapperEx.deleteByCode(code);
    }
}
