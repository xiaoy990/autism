package com.join.autism.service.hzhInbornService.impl;

import com.join.autism.entity.HzhInborn.HzhInborn;
import com.join.autism.mapper.HzhInbornMapper;
import com.join.autism.service.hzhInbornService.HzhInbornService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HzhInbornServiceImpl implements HzhInbornService {

    @Autowired
    HzhInbornMapper hzhInbornMapper;

    @Override
    public List<HzhInborn> selectHzhInborn(HzhInborn hzhInborn) {
        return hzhInbornMapper.mutiSelect(hzhInborn);
    }

    @Override
    public HzhInborn selectHzhInbornByPK(Integer id) {
        return hzhInbornMapper.selectByPrimaryKey(id);
    }

    @Override
    public void insertHzhInborn(HzhInborn hzhInborn) {
        hzhInbornMapper.insert(hzhInborn);
    }

    @Override
    public void delHzhInbornByPK(Integer id) {
        hzhInbornMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateInborn(HzhInborn hzhInborn) {
        hzhInbornMapper.updateByPrimaryKey(hzhInborn);
    }
}
