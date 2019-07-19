package com.join.autism.mapper;

import com.join.autism.entity.HzhDiagnose.HzhDiagnose;
import com.join.autism.entity.HzhDiagnose.HzhDiagnoseExample;
import org.springframework.stereotype.Repository;

/**
 * HzhDiagnoseMapper继承基类
 */
@Repository
public interface HzhDiagnoseMapper extends MyBatisBaseDao<HzhDiagnose, Integer, HzhDiagnoseExample> {
}