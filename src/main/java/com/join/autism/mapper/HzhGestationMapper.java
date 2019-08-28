package com.join.autism.mapper;

import com.join.autism.entity.HzhGestation.HzhGestation;
import com.join.autism.entity.HzhGestation.HzhGestationDto;
import com.join.autism.entity.HzhGestation.HzhGestationExample;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * HzhGestationMapper继承基类
 */
@Repository
public interface HzhGestationMapper extends MyBatisBaseDao<HzhGestation, Integer, HzhGestationExample> {
    List<HzhGestationDto> mutiSelect(HzhGestation hzhGestation);
}