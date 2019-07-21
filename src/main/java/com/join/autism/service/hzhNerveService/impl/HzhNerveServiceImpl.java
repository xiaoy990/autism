package com.join.autism.service.hzhNerveService.impl;

import com.join.autism.entity.HzhNerve.HzhNerve;
import com.join.autism.mapper.HzhNerveMapper;
import com.join.autism.service.hzhNerveService.HzhNerveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HzhNerveServiceImpl implements HzhNerveService {

    @Autowired
    HzhNerveMapper hzhNerveMapper;

    @Override
    public List<HzhNerve> selectHzhNerve(HzhNerve hzhNerve) {
        return hzhNerveMapper.mutiSelect(hzhNerve);
    }

    @Override
    public HzhNerve selectHzhNerveByPK(Integer id) {
        return hzhNerveMapper.selectByPrimaryKey(id);
    }

    @Override
    public void insertHzhNerve(HzhNerve hzhNerve) {
        hzhNerveMapper.insert(hzhNerve);
    }

    @Override
    public void delHzhNerveByPK(Integer id) {
        hzhNerveMapper.deleteByPrimaryKey(id);
    }
}
