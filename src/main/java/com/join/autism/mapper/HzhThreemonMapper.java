package com.join.autism.mapper;

import com.join.autism.entity.HzhGeneral.HzhGeneral;
import com.join.autism.entity.HzhThreemon.HzhThreemon;
import com.join.autism.entity.HzhThreemon.HzhThreemonDto;
import com.join.autism.entity.HzhThreemon.HzhThreemonExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * HzhThreemonMapper继承基类
 */
@Repository
public interface HzhThreemonMapper extends MyBatisBaseDao<HzhThreemon, Integer, HzhThreemonExample> {
    List<HzhThreemonDto> mutiSelect(HzhThreemon hzhThreemonl);
}