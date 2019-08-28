package com.join.autism.mapper;

import com.join.autism.entity.HzhEmotion.QuestionEmotion;
import com.join.autism.entity.HzhEmotion.QuestionEmotionExample;
import org.springframework.stereotype.Repository;

/**
 * QuestionEmotionMapper继承基类
 */
@Repository
public interface QuestionEmotionMapper extends MyBatisBaseDao<QuestionEmotion, Integer, QuestionEmotionExample> {
}