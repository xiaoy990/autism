package com.join.autism.mapper;

import com.join.autism.entity.HzhBirth.HzhBirth;
import com.join.autism.entity.HzhBirth.HzhBirthExample;
import org.springframework.stereotype.Repository;

/**
 * HzhBirthMapper继承基类
 */
@Repository
public interface HzhBirthMapper extends MyBatisBaseDao<HzhBirth, Integer, HzhBirthExample> {
}