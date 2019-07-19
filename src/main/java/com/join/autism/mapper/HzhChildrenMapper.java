package com.join.autism.mapper;

import com.join.autism.entity.HzhChildren.HzhChildren;
import com.join.autism.entity.HzhChildren.HzhChildrenExample;
import org.springframework.stereotype.Repository;

/**
 * HzhChildrenMapper继承基类
 */
@Repository
public interface HzhChildrenMapper extends MyBatisBaseDao<HzhChildren, Integer, HzhChildrenExample> {
}