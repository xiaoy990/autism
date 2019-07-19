package com.join.autism.mapper;

import com.join.autism.entity.HzhEmotion.HzhEmotion;
import com.join.autism.entity.HzhEmotion.HzhEmotionExample;
import org.springframework.stereotype.Repository;

/**
 * HzhEmotionMapper继承基类
 */
@Repository
public interface HzhEmotionMapper extends MyBatisBaseDao<HzhEmotion, Integer, HzhEmotionExample> {
}