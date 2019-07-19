package com.join.autism.service.HzhAssistService.impl;

import com.join.autism.entity.HzhAssist.HzhAssist;
import com.join.autism.entity.HzhAssist.HzhAssistExample;
import com.join.autism.mapper.HzhAssistMapper;
import com.join.autism.service.HzhAssistService.HzhAssistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HzhAssistServiceImpl implements HzhAssistService {

    @Autowired
    HzhAssistMapper hzhAssistMapper;

    /**
     * 根据任意条件组合检索hzhAssist
     * */
    public List<HzhAssist> selectHzhAssists(HzhAssist hzhAssist){
        List<HzhAssist> hzhAssists = hzhAssistMapper.mutiSelect(hzhAssist);
        return hzhAssists;
    }

    /**
     * 通过主键检索
     * */
    public HzhAssist selectHzhAssistByPK(Integer id){
        return hzhAssistMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增HzhAssist
     * */
    public void insertHzhAssist(HzhAssist hzhAssist){
        hzhAssistMapper.insert(hzhAssist);
    }

    /**
     * 真删除记录，请勿轻易调用
     * */
    public void delHzhAssistByPK(Integer id){
        hzhAssistMapper.deleteByPrimaryKey(id);
    }
}
