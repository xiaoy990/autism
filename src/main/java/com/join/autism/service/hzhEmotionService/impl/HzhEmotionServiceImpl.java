package com.join.autism.service.hzhEmotionService.impl;

import com.join.autism.entity.HzhEmotion.HzhEmotion;
import com.join.autism.entity.HzhEmotion.HzhEmotionDto;
import com.join.autism.entity.HzhGeneral.HzhGeneral;
import com.join.autism.mapper.HzhEmotionMapper;
import com.join.autism.service.hzhEmotionService.HzhEmotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HzhEmotionServiceImpl implements HzhEmotionService {

    private final HzhEmotionMapper hzhEmotionMapper;
    public HzhEmotionServiceImpl(HzhEmotionMapper hzhEmotionMapper){
        this.hzhEmotionMapper = hzhEmotionMapper;
    }

    @Override
    public List<HzhEmotionDto> selectHzhEmotion(HzhEmotion hzhEmotion, HzhGeneral hzhGeneral) {
        return hzhEmotionMapper.mutiSelect(hzhEmotion,hzhGeneral);
    }

    @Override
    public HzhEmotion selectHzhEmotionByPK(Integer id) {
        return hzhEmotionMapper.selectByPrimaryKey(id);
    }

    @Override
    public void insertHzhEmotion(HzhEmotion hzhEmotion) {
        hzhEmotionMapper.insert(hzhEmotion);
    }

    @Override
    public void delHzhEmotionByPK(Integer id) {
        hzhEmotionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateHzhEmotion(HzhEmotion hzhEmotion) {
        hzhEmotionMapper.updateByPrimaryKey(hzhEmotion);
    }
}
