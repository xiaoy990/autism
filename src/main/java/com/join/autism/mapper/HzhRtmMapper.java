package com.join.autism.mapper;

import com.join.autism.entity.HzhGeneral.HzhGeneral;
import com.join.autism.entity.HzhRtm.HzhRtm;
import com.join.autism.entity.HzhRtm.HzhRtmDto;
import com.join.autism.entity.HzhRtm.HzhRtmExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * HzhRtmMapper继承基类
 */
@Repository
public interface HzhRtmMapper extends MyBatisBaseDao<HzhRtm, Integer, HzhRtmExample> {

    List<HzhRtmDto> mutiSelect(@Param("hzhRtm") HzhRtm hzhRtm, @Param("hzhGeneral") HzhGeneral hzhGeneral);
}