package com.join.autism.service.hzhRtmService.impl;

import com.join.autism.entity.HzhRtm.RtmQuestions;
import com.join.autism.entity.HzhRtm.RtmQuestionsExample;
import com.join.autism.mapper.QuestionRtmMapper;
import com.join.autism.service.hzhRtmService.RtmQuestionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RtmQuestionServiceImpl implements RtmQuestionService {

    private final QuestionRtmMapper questionRtmMapper;

    public RtmQuestionServiceImpl(QuestionRtmMapper questionRtmMapper) {
        this.questionRtmMapper = questionRtmMapper;
    }

    @Override
    public List<RtmQuestions> queryAllQuestions() {
        return questionRtmMapper.selectByExample(new RtmQuestionsExample());
    }
}
