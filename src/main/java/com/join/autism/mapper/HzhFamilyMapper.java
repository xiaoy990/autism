package com.join.autism.mapper;

import com.join.autism.entity.HzhFamily.HzhFamily;
import com.join.autism.entity.HzhFamily.HzhFamilyDto;
import com.join.autism.entity.HzhFamily.HzhFamilyExample;
import com.join.autism.entity.HzhGeneral.HzhGeneral;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * HzhFamilyMapper继承基类
 */
@Repository
public interface HzhFamilyMapper extends MyBatisBaseDao<HzhFamily, Integer, HzhFamilyExample> {
    List<HzhFamilyDto> mutiSelect(@Param("hzhFamily") HzhFamily hzhFamily, @Param("hzhGeneral") HzhGeneral hzhGeneral);
}