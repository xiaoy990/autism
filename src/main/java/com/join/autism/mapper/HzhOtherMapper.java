package com.join.autism.mapper;

import com.join.autism.entity.HzhOther.HzhOther;
import com.join.autism.entity.HzhOther.HzhOtherExample;
import org.springframework.stereotype.Repository;

/**
 * HzhOtherMapper继承基类
 */
@Repository
public interface HzhOtherMapper extends MyBatisBaseDao<HzhOther, Integer, HzhOtherExample> {
}