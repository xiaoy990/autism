package com.join.autism.mapper;

import com.join.autism.entity.HzhRtm.RtmQuestions;
import com.join.autism.entity.HzhRtm.RtmQuestionsExample;
import org.springframework.stereotype.Repository;

/**
 * QuestionRtmMapper继承基类
 */
@Repository
public interface QuestionRtmMapper extends MyBatisBaseDao<RtmQuestions, Integer, RtmQuestionsExample> {
}