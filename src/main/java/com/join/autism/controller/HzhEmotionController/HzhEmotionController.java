package com.join.autism.controller.HzhEmotionController;

import com.join.autism.entity.HzhEmotion.HzhEmotion;
import com.join.autism.entity.HzhEmotion.HzhEmotionDto;
import com.join.autism.entity.HzhEmotion.QuestionEmotion;
import com.join.autism.service.hzhEmotionService.HzhEmotionService;
import com.join.autism.service.hzhEmotionService.QuestionEmotionService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 患儿情感等的严重程度
 * */
@CrossOrigin
@RestController
@RequestMapping("emotion")
public class HzhEmotionController {

    private final HzhEmotionService hzhEmotionService;
    private final QuestionEmotionService questionEmotionService;
    public HzhEmotionController(HzhEmotionService hzhEmotionService, QuestionEmotionService questionEmotionService){
        this.hzhEmotionService = hzhEmotionService;
        this.questionEmotionService = questionEmotionService;
    }

    @RequestMapping("selectEmotion")
    public List<HzhEmotionDto> selectHzhEmotion(HzhEmotion hzhEmotion){
        return hzhEmotionService.selectHzhEmotion(hzhEmotion);
    }

    @RequestMapping("addEmotion")
    public void addHzhEmotion(HzhEmotion hzhEmotion){
        hzhEmotionService.insertHzhEmotion(hzhEmotion);
    }

    @RequestMapping("delEmotion")
    public void delHzhEmotion(HzhEmotion hzhEmotion){
        hzhEmotionService.delHzhEmotionByPK(hzhEmotion.getId());
    }

    @RequestMapping("updateEmotion")
    public void updateHzhEmotion(HzhEmotion hzhEmotion){
        hzhEmotionService.updateHzhEmotion(hzhEmotion);
    }

    @RequestMapping("selectEmotionQuestions")
    public List<QuestionEmotion> queryEmotionQuestions(QuestionEmotion questionEmotion){
        return questionEmotionService.queryEmotion(questionEmotion);
    }
}
