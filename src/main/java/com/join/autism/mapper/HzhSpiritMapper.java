package com.join.autism.mapper;

import com.join.autism.entity.HzhSpirit.HzhSpirit;
import com.join.autism.entity.HzhSpirit.HzhSpiritDto;
import com.join.autism.entity.HzhSpirit.HzhSpiritExample;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * HzhSpiritMapper继承基类
 */
@Repository
public interface HzhSpiritMapper extends MyBatisBaseDao<HzhSpirit, Integer, HzhSpiritExample> {
    List<HzhSpiritDto> mutiSelect(HzhSpirit hzhSpirit);
}