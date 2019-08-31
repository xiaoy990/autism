package com.join.autism.service.hzhEmotionService.impl;

import com.join.autism.entity.HzhEmotion.QuestionEmotion;
import com.join.autism.entity.HzhEmotion.QuestionEmotionExample;
import com.join.autism.mapper.QuestionEmotionMapper;
import com.join.autism.service.hzhEmotionService.QuestionEmotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionEmotionServiceImpl implements QuestionEmotionService {

    private final QuestionEmotionMapper questionEmotionMapper;

    public QuestionEmotionServiceImpl(QuestionEmotionMapper questionEmotionMapper) {
        this.questionEmotionMapper = questionEmotionMapper;
    }

    @Override
    public List<QuestionEmotion> queryEmotion(QuestionEmotion emotion) {
        return questionEmotionMapper.selectByExample(new QuestionEmotionExample());
    }
}
