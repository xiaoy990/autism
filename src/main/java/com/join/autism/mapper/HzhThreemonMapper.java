package com.join.autism.mapper;

import com.join.autism.entity.HzhThreemon.HzhThreemon;
import com.join.autism.entity.HzhThreemon.HzhThreemonExample;
import org.springframework.stereotype.Repository;

/**
 * HzhThreemonMapper继承基类
 */
@Repository
public interface HzhThreemonMapper extends MyBatisBaseDao<HzhThreemon, Integer, HzhThreemonExample> {
}