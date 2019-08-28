package com.join.autism.mapper;

import com.join.autism.entity.HzhEmotion.HzhEmotion;
import com.join.autism.entity.HzhEmotion.HzhEmotionDto;
import com.join.autism.entity.HzhEmotion.HzhEmotionExample;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * HzhEmotionMapper继承基类
 */
@Repository
public interface HzhEmotionMapper extends MyBatisBaseDao<HzhEmotion, Integer, HzhEmotionExample> {

    List<HzhEmotionDto> mutiSelect(HzhEmotion hzhEmotion);
}