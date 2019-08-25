package com.join.autism.mapper;

import com.join.autism.entity.HzhGeneral.HzhGeneral;
import com.join.autism.entity.HzhNerve.HzhNerve;
import com.join.autism.entity.HzhNerve.HzhNerveDto;
import com.join.autism.entity.HzhNerve.HzhNerveExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * HzhNerveMapper继承基类
 */
@Repository
public interface HzhNerveMapper extends MyBatisBaseDao<HzhNerve, Integer, HzhNerveExample> {
    List<HzhNerveDto> mutiSelect(@Param("hzhNerve") HzhNerve hzhNerve,@Param("hzhGeneral") HzhGeneral hzhGeneral);
}