package com.join.autism.controller.hzhRtmControlelr;

import com.join.autism.entity.HzhRtm.HzhRtm;
import com.join.autism.entity.HzhRtm.HzhRtmDto;
import com.join.autism.service.hzhRtmService.HzhRtmService;
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
    @Autowired
    public HzhRtmController(HzhRtmService hzhRtmService){
        this.hzhRtmService = hzhRtmService;
    }

    @RequestMapping("selectHzhRtm")
    public List<HzhRtmDto> selectRtm(HzhRtm hzhRtm){
        return hzhRtmService.selectHzhRtm(hzhRtm);
    }

    @RequestMapping("insertHzhRtm")
    public void addRtm(HzhRtm hzhRtm){
        hzhRtmService.insertHzhRtm(hzhRtm);
    }

    @RequestMapping("deleteHzhRtm")
    public void delRtm(HzhRtm hzhRtm){
        hzhRtmService.delHzhRtmByPK(hzhRtm.getId());
    }

    @RequestMapping("updateHzhRtm")
    public void updateRtm(HzhRtm hzhRtm){
        hzhRtmService.updateHzhRtm(hzhRtm);
    }
}
