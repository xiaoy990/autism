package com.join.autism.mapper;

import com.join.autism.entity.HzhAssist.HzhAssist;
import com.join.autism.entity.HzhFamily.HzhFamily;
import com.join.autism.entity.HzhFamily.HzhFamilyExample;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * HzhFamilyMapper继承基类
 */
@Repository
public interface HzhFamilyMapper extends MyBatisBaseDao<HzhFamily, Integer, HzhFamilyExample> {
    List<HzhFamily> mutiSelect(HzhFamily hzhFamily);
}