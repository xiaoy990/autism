package com.join.autism.service.hzhThreeMonthService.impl;

import com.join.autism.entity.HzhThreemon.QuestionThreemonth;
import com.join.autism.entity.HzhThreemon.QuestionThreemonthExample;
import com.join.autism.mapper.QuestionThreemonthMapper;
import com.join.autism.service.hzhThreeMonthService.ThreeMonthQuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThreeMonthQuestionsServiceImpl implements ThreeMonthQuestionsService {

    final
    QuestionThreemonthMapper questionThreemonthMapper;

    public ThreeMonthQuestionsServiceImpl(QuestionThreemonthMapper questionThreemonthMapper) {
        this.questionThreemonthMapper = questionThreemonthMapper;
    }

    @Override
    public List<QuestionThreemonth> queryAll(QuestionThreemonthExample questionThreemonthExample) {
        return questionThreemonthMapper.selectByExample(questionThreemonthExample);
    }
}
