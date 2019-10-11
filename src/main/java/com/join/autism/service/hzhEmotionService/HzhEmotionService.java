package com.join.autism.service.hzhEmotionService;

import com.join.autism.entity.HzhEmotion.HzhEmotion;
import com.join.autism.entity.HzhEmotion.HzhEmotionDto;
import com.join.autism.entity.HzhGeneral.HzhGeneral;

import java.util.List;

public interface HzhEmotionService {
    List<HzhEmotionDto> selectHzhEmotion(HzhEmotion hzhEmotion, HzhGeneral hzhGeneral);
    HzhEmotion selectHzhEmotionByPK(Integer id);
    void insertHzhEmotion(HzhEmotion hzhEmotion);
    void delHzhEmotionByPK(Integer id);
    void updateHzhEmotion(HzhEmotion hzhEmotion);
}
