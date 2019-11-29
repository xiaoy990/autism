package com.join.autism.controller.hzhRtmControlelr;

import com.join.autism.entity.HzhGeneral.HzhGeneral;
import com.join.autism.entity.HzhRtm.HzhRtm;
import com.join.autism.entity.HzhRtm.HzhRtmDto;
import com.join.autism.entity.HzhRtm.RtmQuestions;
import com.join.autism.service.hzhRtmService.HzhRtmService;
import com.join.autism.service.hzhRtmService.RtmQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * M-CHAT-R(TM)
 * */
@CrossOrigin
@RestController
@RequestMapping("HzhRtm")
public class HzhRtmController {

    private final HzhRtmService hzhRtmService;
    private final RtmQuestionService rtmQuestionService;
    @Autowired
    public HzhRtmController(HzhRtmService hzhRtmService, RtmQuestionService rtmQuestionService){
        this.hzhRtmService = hzhRtmService;
        this.rtmQuestionService = rtmQuestionService;
    }

    @RequestMapping("selectHzhRtm")
    public List<HzhRtmDto> selectRtm(HzhRtm hzhRtm, HzhGeneral hzhGeneral){
        return hzhRtmService.selectHzhRtm(hzhRtm,hzhGeneral);
    }

    @RequestMapping("insertHzhRtm")
    public void addRtm(HzhRtm hzhRtm){
        hzhRtmService.insertHzhRtm(hzhRtm);
    }

    @RequestMapping("deleteHzhRtm")
    public void delRtm(HzhRtm hzhRtm){
        hzhRtmService.delHzhRtmByPK(hzhRtm.getId());
    }

    @RequestMapping("updateRtm")
    public void updateRtm(HzhRtm hzhRtm){
        hzhRtmService.updateHzhRtm(hzhRtm);
    }

    @RequestMapping("selectRtmQuestions")
    public List<RtmQuestions> queryRtmQuestions(){
        return rtmQuestionService.queryAllQuestions();
    }
}
