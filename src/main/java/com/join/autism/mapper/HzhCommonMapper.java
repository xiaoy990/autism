package com.join.autism.mapper;

import com.join.autism.entity.HzhCommon.HzhCommon;
import com.join.autism.entity.HzhCommon.HzhCommonDto;
import com.join.autism.entity.HzhCommon.HzhCommonExample;
import com.join.autism.entity.HzhGeneral.HzhGeneral;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * HzhCommonMapper继承基类
 */
@Repository
public interface HzhCommonMapper extends MyBatisBaseDao<HzhCommon, Integer, HzhCommonExample> {
    List<HzhCommonDto> mutiSelect(@Param("common") HzhCommon hzhCommon, @Param("hzhGeneral")HzhGeneral hzhGeneral);
}