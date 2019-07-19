package com.join.autism.mapper;

import com.join.autism.entity.HzhRegion.HzhRegion;
import com.join.autism.entity.HzhRegion.HzhRegionExample;
import org.springframework.stereotype.Repository;

/**
 * HzhRegionMapper继承基类
 */
@Repository
public interface HzhRegionMapper extends MyBatisBaseDao<HzhRegion, Short, HzhRegionExample> {
}