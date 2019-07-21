package com.join.autism.service.hzhSpiritService;

import com.join.autism.entity.HzhAssist.HzhAssist;
import com.join.autism.entity.HzhSpirit.HzhSpirit;

import java.util.List;

public interface HzhSpiritService {
    List<HzhSpirit> selectHzhSpirit(HzhSpirit hzhSpirit);
    HzhSpirit selectHzhSpiritByPK(Integer id);
    void insertHzhSpirit(HzhSpirit hzhSpirit);
    void delHzhSpiritByPK(Integer id);
}
