package com.kgc.dao;

import com.kgc.pojo.ValidateCode;
import com.kgc.pojo.ValidateCodeCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ValidateCodeMapper {
    int countByExample(ValidateCodeCriteria example);

    int deleteByExample(ValidateCodeCriteria example);

    int insert(ValidateCode record);

    int insertSelective(ValidateCode record);

    List<ValidateCode> selectByExample(ValidateCodeCriteria example);

    int updateByExampleSelective(@Param("record") ValidateCode record, @Param("example") ValidateCodeCriteria example);

    int updateByExample(@Param("record") ValidateCode record, @Param("example") ValidateCodeCriteria example);
}