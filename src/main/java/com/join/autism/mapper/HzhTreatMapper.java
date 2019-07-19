package com.join.autism.mapper;

import com.join.autism.entity.HzhTreat.HzhTreat;
import com.join.autism.entity.HzhTreat.HzhTreatExample;
import org.springframework.stereotype.Repository;

/**
 * HzhTreatMapper继承基类
 */
@Repository
public interface HzhTreatMapper extends MyBatisBaseDao<HzhTreat, Integer, HzhTreatExample> {
}