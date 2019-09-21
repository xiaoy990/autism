package com.join.autism.controller.hzhThreeMonthController;

import com.join.autism.entity.HzhGeneral.HzhGeneral;
import com.join.autism.entity.HzhThreemon.HzhThreemon;
import com.join.autism.entity.HzhThreemon.HzhThreemonDto;
import com.join.autism.entity.HzhThreemon.QuestionThreemonth;
import com.join.autism.entity.HzhThreemon.QuestionThreemonthExample;
import com.join.autism.service.hzhThreeMonthService.HzhThreemonService;
import com.join.autism.service.hzhThreeMonthService.ThreeMonthQuestionsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/**
 * @Author: Liang Jiayue
 * @Description:
 * @Date: 20:14 2019/8/29
 */

@CrossOrigin
@RestController
@RequestMapping("/HzhThreemon")
public class HzhThreemonController {

    private final
    HzhThreemonService hzhThreemonService;

    private final ThreeMonthQuestionsService threeMonthQuestionsService;

    public HzhThreemonController(HzhThreemonService hzhThreemonService, ThreeMonthQuestionsService threeMonthQuestionsService) {
        this.hzhThreemonService = hzhThreemonService;
        this.threeMonthQuestionsService = threeMonthQuestionsService;
    }

    @RequestMapping("selectThreeMonthQuestions")
    public List<QuestionThreemonth> queryAll(){
        return threeMonthQuestionsService.queryAll(new QuestionThreemonthExample());
    }

    @RequestMapping(value = "/insertThreemon")
    public HzhThreemon insertHzhThreenmon(HzhThreemon hzhThreemon){
        try {
            hzhThreemonService.insertHzhThreemon(hzhThreemon);
        }catch (Exception e){
            e.printStackTrace();
        }
        return hzhThreemon;
    }

    @RequestMapping(value = "/deleteThreemon")
    public void deleteHzhThreemon(Integer id){
        try {
            hzhThreemonService.deleteHzhThreemon(id);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/updateThreemon")
    public HzhThreemon updateHzhThreemon(HzhThreemon hzhThreemon){
        try {
            hzhThreemonService.updateHzhThreemon(hzhThreemon);
        }catch (Exception e){
            e.printStackTrace();
        }
        return hzhThreemon;
    }

    @RequestMapping(value = "/selectThreemon")
    public List<HzhThreemonDto> mutiSelectThreemon(HzhThreemon hzhThreemon, HzhGeneral hzhGeneral){
        List<HzhThreemonDto> mutiSelectThreemonList =null;
        try {
            mutiSelectThreemonList = hzhThreemonService.mutiSelectThreemon(hzhThreemon,hzhGeneral);
        }catch (Exception e){
            e.printStackTrace();
        }
        return mutiSelectThreemonList;
    }
}
