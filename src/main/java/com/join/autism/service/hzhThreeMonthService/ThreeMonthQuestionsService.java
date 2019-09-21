package com.join.autism.service.hzhThreeMonthService;

import com.join.autism.entity.HzhThreemon.QuestionThreemonth;
import com.join.autism.entity.HzhThreemon.QuestionThreemonthExample;

import java.util.List;

public interface ThreeMonthQuestionsService {
    List<QuestionThreemonth> queryAll(QuestionThreemonthExample questionThreemonthExample);
}
