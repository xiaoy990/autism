package com.join.autism.mapper;

import com.join.autism.entity.HzhCommon.HzhCommon;
import com.join.autism.entity.HzhCommon.HzhCommonExample;
import org.springframework.stereotype.Repository;

/**
 * HzhCommonMapper继承基类
 */
@Repository
public interface HzhCommonMapper extends MyBatisBaseDao<HzhCommon, Integer, HzhCommonExample> {
}