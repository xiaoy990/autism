package com.join.autism.mapper;

import com.join.autism.entity.HzhFlup.HzhFlup;
import com.join.autism.entity.HzhFlup.HzhFlupExample;
import org.springframework.stereotype.Repository;

/**
 * HzhFlupMapper继承基类
 */
@Repository
public interface HzhFlupMapper extends MyBatisBaseDao<HzhFlup, Integer, HzhFlupExample> {
}