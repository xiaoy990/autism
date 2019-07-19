package com.join.autism.mapper;

import com.join.autism.entity.HzhGeneral.HzhGeneral;
import com.join.autism.entity.HzhGeneral.HzhGeneralExample;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * HzhGeneralMapper继承基类
 */
@Repository
public interface HzhGeneralMapper extends MyBatisBaseDao<HzhGeneral, Integer, HzhGeneralExample> {
    List<HzhGeneral> mutiSelect(HzhGeneral hzhGeneral);
}
