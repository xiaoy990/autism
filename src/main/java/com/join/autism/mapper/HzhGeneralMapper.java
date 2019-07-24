package com.join.autism.mapper;

import com.join.autism.entity.HzhGeneral.CriteriaSupportGeneral;
import com.join.autism.entity.HzhGeneral.HzhGeneral;
import com.join.autism.entity.HzhGeneral.HzhGeneralExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * HzhGeneralMapper继承基类
 */
@Repository
public interface HzhGeneralMapper extends MyBatisBaseDao<HzhGeneral, Integer, HzhGeneralExample> {
    List<HzhGeneral> mutiSelect(@Param("hzhGeneral") HzhGeneral hzhGeneral,@Param("CSG") CriteriaSupportGeneral criteriaSupportGeneral);
    List<HzhGeneral> fuzzySearch(String key);
}
