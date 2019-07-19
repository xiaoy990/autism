package com.join.autism.mapper;

import com.join.autism.entity.HzhNerve.HzhNerve;
import com.join.autism.entity.HzhNerve.HzhNerveExample;
import org.springframework.stereotype.Repository;

/**
 * HzhNerveMapper继承基类
 */
@Repository
public interface HzhNerveMapper extends MyBatisBaseDao<HzhNerve, Integer, HzhNerveExample> {
}