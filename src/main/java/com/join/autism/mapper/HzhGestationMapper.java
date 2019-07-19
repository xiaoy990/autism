package com.join.autism.mapper;

import com.join.autism.entity.HzhGestation.HzhGestation;
import com.join.autism.entity.HzhGestation.HzhGestationExample;
import org.springframework.stereotype.Repository;

/**
 * HzhGestationMapper继承基类
 */
@Repository
public interface HzhGestationMapper extends MyBatisBaseDao<HzhGestation, Integer, HzhGestationExample> {
}