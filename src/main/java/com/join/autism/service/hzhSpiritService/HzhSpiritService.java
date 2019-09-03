package com.join.autism.service.hzhSpiritService;

import com.join.autism.entity.HzhSpirit.HzhSpirit;
import com.join.autism.entity.HzhSpirit.HzhSpiritDto;

import java.util.List;

public interface HzhSpiritService {
    List<HzhSpiritDto> selectHzhSpirit(HzhSpirit hzhSpirit);
    HzhSpirit selectHzhSpiritByPK(Integer id);
    void insertHzhSpirit(HzhSpirit hzhSpirit);
    void delHzhSpiritByPK(Integer id);
    void updateHzhSpirit(HzhSpirit hzhSpirit);
    String queryAllSpirits(HzhSpirit hzhSpirit) throws IllegalAccessException;
}
