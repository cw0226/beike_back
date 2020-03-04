package com.kgc.dao;

import com.kgc.pojo.Zufang;
import com.kgc.pojo.ZufangCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZufangMapper {
    int countByExample(ZufangCriteria example);

    int deleteByExample(ZufangCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Zufang record);

    int insertSelective(Zufang record);

    List<Zufang> selectByExample(ZufangCriteria example);

    Zufang selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Zufang record, @Param("example") ZufangCriteria example);

    int updateByExample(@Param("record") Zufang record, @Param("example") ZufangCriteria example);

    int updateByPrimaryKeySelective(Zufang record);

    int updateByPrimaryKey(Zufang record);
}