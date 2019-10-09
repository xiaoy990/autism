package com.join.autism.controller.hzhgeneralController;

import com.join.autism.entity.HzhGeneral.CriteriaSupportGeneral;
import com.join.autism.entity.HzhGeneral.HzhGeneral;
import com.join.autism.service.hzhGeneralService.HzhGeneralService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 一般信息
 * */
@CrossOrigin
@RestController
@RequestMapping("general")
public class HzhGeneralController {
    private final HzhGeneralService hzhGeneralService;
    public HzhGeneralController(HzhGeneralService hzhGeneralService) {
        this.hzhGeneralService = hzhGeneralService;
    }

    /**
     * 查询一般信息，对应一般信息管理
     * */
    @RequestMapping(value = "selectGeneral",produces = "application/json;charset=UTF-8")
    public List<HzhGeneral> selectGeneral(HzhGeneral hzhGeneral, CriteriaSupportGeneral criteriaSupportGeneral){
        return hzhGeneralService.selectHzhGeneral(hzhGeneral,criteriaSupportGeneral);
    }


    /**
     * 插入一般信息，对应一般信息添加
     * 要求前端必须同时传入生日和就诊时月份
     * */
    @RequestMapping(value = "addGeneral",produces = "application/json;charset=UTF-8")
    public List<HzhGeneral> insertGeneral( HzhGeneral hzhGeneral, String[] pct){
        hzhGeneralService.insertHzhGeneral(hzhGeneral,pct);
        if (hzhGeneral.getBirthday() != null) {
            System.out.println(hzhGeneral.getBirthday());
            hzhGeneral.setBirthday(hzhGeneral.getBirthday().replaceAll("-",""));
            System.out.println(hzhGeneral.getBirthday());
        }
        if (hzhGeneral.getSurveyTime()!=null){
            System.out.println(hzhGeneral.getSurveyTime());
            hzhGeneral.setSurveyTime(hzhGeneral.getSurveyTime().replaceAll("-",""));
            System.out.println(hzhGeneral.getSurveyTime());
        }
        System.out.println("controller: "+hzhGeneral.getBirthday()+" "+hzhGeneral.getSurveyTime());
        List<HzhGeneral> hzhGenerals = hzhGeneralService.selectHzhGeneral(hzhGeneral, new CriteriaSupportGeneral());
        for (HzhGeneral g:hzhGenerals
             ) {
            System.out.println(g);
        }
        return hzhGenerals;

    }

    /**
     * 删除一般信息
     * */
    @RequestMapping("delGeneral")
    public void delGeneral(HzhGeneral hzhGeneral){
        hzhGeneralService.delHzhGeneralByPK(hzhGeneral.getId());
    }

    /***
     * 修改一般信息
     * */
    @RequestMapping("updateGeneral")
    public void updateGeneral(HzhGeneral hzhGeneral){
        hzhGeneralService.updateGeneral(hzhGeneral);
    }

    @RequestMapping("fuzzySearch")
    public void fuzzySearchGeneral(String key){
        hzhGeneralService.fuzzySearch(key);
    }

}
