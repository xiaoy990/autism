package com.join.autism.mapper;

import com.join.autism.entity.HzhConvertion.HzhConvertion;
import com.join.autism.entity.HzhConvertion.HzhConvertionExample;
import org.springframework.stereotype.Repository;

/**
 * HzhConvertionMapper继承基类
 */
@Repository
public interface HzhConvertionMapper extends MyBatisBaseDao<HzhConvertion, Integer, HzhConvertionExample> {
}