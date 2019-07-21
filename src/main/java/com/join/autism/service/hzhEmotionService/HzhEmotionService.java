package com.join.autism.service.hzhEmotionService;

import com.join.autism.entity.HzhEmotion.HzhEmotion;

import java.util.List;

public interface HzhEmotionService {
    List<HzhEmotion> selectHzhEmotion(HzhEmotion hzhEmotion);
    HzhEmotion selectHzhEmotionByPK(Integer id);
    void insertHzhEmotion(HzhEmotion hzhEmotion);
    void delHzhEmotionByPK(Integer id);
    void updateHzhEmotion(HzhEmotion hzhEmotion);
}
