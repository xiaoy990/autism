package com.join.autism.service.hzhBirthService.impl;

import com.join.autism.entity.HzhBirth.HzhBirth;
import com.join.autism.mapper.HzhBirthMapper;
import com.join.autism.service.hzhBirthService.HzhBirthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HzhBirthServiceImpl implements HzhBirthService {

    @Autowired
    HzhBirthMapper hzhBirthMapper;

    @Override
    public List<HzhBirth> selectHzhBirth(HzhBirth hzhBirth) {
        return hzhBirthMapper.mutiSelect(hzhBirth);
    }

    @Override
    public HzhBirth selectHzhBirthByPK(Integer id) {
        return hzhBirthMapper.selectByPrimaryKey(id);
    }

    @Override
    public void insertHzhBirth(HzhBirth hzhBirth) {
        hzhBirthMapper.insert(hzhBirth);
    }

    @Override
    public void delHzhBirthByPK(Integer id) {
        hzhBirthMapper.deleteByPrimaryKey(id);
    }
}
