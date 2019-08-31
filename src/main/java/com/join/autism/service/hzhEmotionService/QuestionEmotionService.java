package com.join.autism.service.hzhEmotionService;

import com.join.autism.entity.HzhEmotion.QuestionEmotion;

import java.util.List;

public interface QuestionEmotionService {
    List<QuestionEmotion> queryEmotion(QuestionEmotion emotion);
}
