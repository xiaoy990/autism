package com.join.autism.controller.HzhEmotionController;

import com.join.autism.entity.HzhEmotion.HzhEmotion;
import com.join.autism.service.hzhEmotionService.HzhEmotionService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    public HzhEmotionController(HzhEmotionService hzhEmotionService){
        this.hzhEmotionService = hzhEmotionService;
    }

    @RequestMapping("selectEmotion")
    public List<HzhEmotion> selectHzhEmotion(HzhEmotion hzhEmotion){
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
}