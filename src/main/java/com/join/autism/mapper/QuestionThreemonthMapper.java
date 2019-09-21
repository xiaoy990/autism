package com.join.autism.mapper;

import com.join.autism.entity.HzhThreemon.QuestionThreemonth;
import com.join.autism.entity.HzhThreemon.QuestionThreemonthExample;
import org.springframework.stereotype.Repository;

/**
 * QuestionThreemonthMapper继承基类
 */
@Repository
public interface QuestionThreemonthMapper extends MyBatisBaseDao<QuestionThreemonth, Integer, QuestionThreemonthExample> {
}