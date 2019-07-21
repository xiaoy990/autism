package com.join.autism.mapper;

import com.join.autism.entity.HzhRtm.HzhRtm;
import com.join.autism.entity.HzhRtm.HzhRtmExample;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * HzhRtmMapper继承基类
 */
@Repository
public interface HzhRtmMapper extends MyBatisBaseDao<HzhRtm, Integer, HzhRtmExample> {

    public List<HzhRtm> mutiSelect(HzhRtm hzhRtm);
}