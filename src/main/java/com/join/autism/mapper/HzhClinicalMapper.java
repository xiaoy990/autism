package com.join.autism.mapper;

import com.join.autism.entity.HzhClinical.HzhClinical;
import com.join.autism.entity.HzhClinical.HzhClinicalExample;
import org.springframework.stereotype.Repository;

/**
 * HzhClinicalMapper继承基类
 */
@Repository
public interface HzhClinicalMapper extends MyBatisBaseDao<HzhClinical, Integer, HzhClinicalExample> {
}