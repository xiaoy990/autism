package com.join.autism.mapper;

import com.join.autism.entity.HzhConvertion.HzhConvertion;
import com.join.autism.entity.HzhConvertion.HzhConvertionDto;
import com.join.autism.entity.HzhConvertion.HzhConvertionExample;
import com.join.autism.entity.HzhGeneral.HzhGeneral;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * HzhConvertionMapper继承基类
 */
@Repository
public interface HzhConvertionMapper extends MyBatisBaseDao<HzhConvertion, Integer, HzhConvertionExample> {
    List<HzhConvertionDto> mutiSelect(@Param("hzhConvertion") HzhConvertion hzhConvertion, @Param("hzhGeneral") HzhGeneral hzhGeneral);
}