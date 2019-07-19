package com.join.autism.mapper;

import com.join.autism.entity.HzhAssist.HzhAssist;
import com.join.autism.entity.HzhAssist.HzhAssistExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * HzhAssistMapper继承基类
 */
@Repository
public interface HzhAssistMapper extends MyBatisBaseDao<HzhAssist, Integer, HzhAssistExample> {
    List<HzhAssist> mutiSelect(HzhAssist hzhAssist);
}