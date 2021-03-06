package com.join.autism.mapper;

import com.join.autism.entity.HzhBirth.HzhBirth;
import com.join.autism.entity.HzhBirth.HzhBirthDto;
import com.join.autism.entity.HzhBirth.HzhBirthExample;
import com.join.autism.entity.HzhGeneral.HzhGeneral;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * HzhBirthMapper继承基类
 */
@Repository
public interface HzhBirthMapper extends MyBatisBaseDao<HzhBirth, Integer, HzhBirthExample> {
    List<HzhBirthDto> mutiSelect(HzhBirth hzhBirth, HzhGeneral hzhGeneral);
}