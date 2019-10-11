package com.join.autism.mapper;

import com.join.autism.entity.HzhGeneral.HzhGeneral;
import com.join.autism.entity.HzhOther.HzhOther;
import com.join.autism.entity.HzhOther.HzhOtherDto;
import com.join.autism.entity.HzhOther.HzhOtherExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * HzhOtherMapper继承基类
 */
@Repository
public interface HzhOtherMapper extends MyBatisBaseDao<HzhOther, Integer, HzhOtherExample> {
    List<HzhOtherDto> mutiSelect(@Param("other") HzhOther hzhOther, @Param("hzhGeneral") HzhGeneral hzhGeneral);
}