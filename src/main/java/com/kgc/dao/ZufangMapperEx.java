package com.kgc.dao;

import com.kgc.pojo.ZufangEx;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ZufangMapperEx {
    List<ZufangEx> selectZufang(@Param("areaId") Integer areaId,@Param("streetId") Integer streetId,
                                @Param("rental") Integer rental,@Param("orderBy") String orderBy);
}
