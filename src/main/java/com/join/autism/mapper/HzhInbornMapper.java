package com.join.autism.mapper;

import com.join.autism.entity.HzhGeneral.HzhGeneral;
import com.join.autism.entity.HzhInborn.HzhInbornDto;
import com.join.autism.entity.HzhInborn.HzhInborn;
import com.join.autism.entity.HzhInborn.HzhInbornExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * HzhInbornMapper继承基类
 */
@Repository
public interface HzhInbornMapper extends MyBatisBaseDao<HzhInborn, Integer, HzhInbornExample> {

    List<HzhInbornDto> mutiSelect(@Param("hzhInborn") HzhInborn hzhInborn, @Param("hzhGeneral") HzhGeneral hzhGeneral);

}