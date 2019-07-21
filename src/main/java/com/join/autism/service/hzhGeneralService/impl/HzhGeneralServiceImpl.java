package com.join.autism.service.hzhGeneralService.impl;

import com.join.autism.entity.HzhGeneral.HzhGeneral;
import com.join.autism.mapper.HzhGeneralMapper;
import com.join.autism.service.hzhGeneralService.HzhGeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HzhGeneralServiceImpl implements HzhGeneralService {

    @Autowired
    HzhGeneralMapper hzhGeneralMapper;

    @Override
    public List<HzhGeneral> selectHzhGeneral(HzhGeneral hzhGeneral) {
        return hzhGeneralMapper.mutiSelect(hzhGeneral);
    }

    @Override
    public HzhGeneral selectHzhGeneralByPK(Integer id) {
        return hzhGeneralMapper.selectByPrimaryKey(id);
    }

    @Override
    public void insertHzhGeneral(HzhGeneral hzhGeneral) {
        hzhGeneralMapper.insert(hzhGeneral);
    }

    @Override
    public void delHzhGeneralByPK(Integer id) {
        hzhGeneralMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateGeneral(HzhGeneral hzhGeneral) {
        hzhGeneralMapper.updateByPrimaryKey(hzhGeneral);
    }
}
