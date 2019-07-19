package com.join.autism.mapper;

import com.join.autism.entity.HzhIllnerssed.HzhIllnerssed;
import com.join.autism.entity.HzhIllnerssed.HzhIllnerssedExample;
import org.springframework.stereotype.Repository;

/**
 * HzhIllnerssedMapper继承基类
 */
@Repository
public interface HzhIllnerssedMapper extends MyBatisBaseDao<HzhIllnerssed, Integer, HzhIllnerssedExample> {
}