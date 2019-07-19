package com.join.autism.mapper;

import com.join.autism.entity.HzhInborn.HzhInborn;
import com.join.autism.entity.HzhInborn.HzhInbornExample;
import org.springframework.stereotype.Repository;

/**
 * HzhInbornMapper继承基类
 */
@Repository
public interface HzhInbornMapper extends MyBatisBaseDao<HzhInborn, Integer, HzhInbornExample> {
}