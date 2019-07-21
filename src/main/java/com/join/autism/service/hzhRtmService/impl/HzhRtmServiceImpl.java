package com.join.autism.service.hzhRtmService.impl;

import com.join.autism.entity.HzhRtm.HzhRtm;
import com.join.autism.mapper.HzhRtmMapper;
import com.join.autism.service.hzhRtmService.HzhRtmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HzhRtmServiceImpl implements HzhRtmService {

    private final HzhRtmMapper hzhRtmMapper;
    @Autowired
    public HzhRtmServiceImpl(HzhRtmMapper hzhRtmMapper) {
        this.hzhRtmMapper = hzhRtmMapper;
    }

    @Override
    public List<HzhRtm> selectHzhRtm(HzhRtm hzhRtm) {
        return hzhRtmMapper.mutiSelect(hzhRtm);
    }

    @Override
    public HzhRtm selectHzhRtmByPK(Integer id) {
        return hzhRtmMapper.selectByPrimaryKey(id);
    }

    @Override
    public void insertHzhRtm(HzhRtm hzhRtm) {
        hzhRtmMapper.insert(hzhRtm);
    }

    @Override
    public void delHzhRtmByPK(Integer id) {
        hzhRtmMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateHzhRtm(HzhRtm hzhRtm) {
        hzhRtmMapper.updateByPrimaryKey(hzhRtm);
    }
}
