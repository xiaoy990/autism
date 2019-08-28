package com.join.autism.service.hzhSpiritService.impl;

import com.join.autism.entity.HzhSpirit.HzhSpirit;
import com.join.autism.entity.HzhSpirit.HzhSpiritDto;
import com.join.autism.mapper.HzhSpiritMapper;
import com.join.autism.service.hzhSpiritService.HzhSpiritService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HzhSpiritServiceImpl implements HzhSpiritService {

    @Autowired
    HzhSpiritMapper hzhSpiritMapper;

    @Override
    public List<HzhSpiritDto> selectHzhSpirit(HzhSpirit hzhSpirit) {
        return hzhSpiritMapper.mutiSelect(hzhSpirit);
    }

    @Override
    public HzhSpirit selectHzhSpiritByPK(Integer id) {
        return hzhSpiritMapper.selectByPrimaryKey(id);
    }

    @Override
    public void insertHzhSpirit(HzhSpirit hzhSpirit) {
        hzhSpiritMapper.insert(hzhSpirit);
    }

    @Override
    public void delHzhSpiritByPK(Integer id) {
        hzhSpiritMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateHzhSpirit(HzhSpirit hzhSpirit) {
        hzhSpiritMapper.updateByPrimaryKey(hzhSpirit);
    }
}
