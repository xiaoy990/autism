package com.join.autism.controller.hzhInbornController;

import com.join.autism.entity.HzhGeneral.HzhGeneral;
import com.join.autism.entity.HzhInborn.HzhInbornDto;
import com.join.autism.entity.HzhInborn.HzhInborn;
import com.join.autism.service.hzhInbornService.HzhInbornService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 先天畸形
 * */
@CrossOrigin
@RestController
@RequestMapping("HzhInborn")

public class HzhInbornController {

    private final HzhInbornService hzhInbornService;
    @Autowired
    public HzhInbornController(HzhInbornService hzhInbornService) {
        this.hzhInbornService = hzhInbornService;
    }

    @RequestMapping("selectInborn")
    public List<HzhInbornDto> selectInborn(HzhInborn hzhInborn, HzhGeneral hzhGeneral){
        return hzhInbornService.selectHzhInborn(hzhInborn,hzhGeneral);
    }

    @RequestMapping("insertInborn")
    public void addInborn(HzhInborn hzhInborn){
        hzhInbornService.insertHzhInborn(hzhInborn);
    }

    @RequestMapping("deleteInborn")
    public void delInborn(HzhInborn hzhInborn){
        hzhInbornService.delHzhInbornByPK(hzhInborn.getId());
    }

    @RequestMapping("updateInborn")
    public void updateInborn(HzhInborn hzhInborn){
        hzhInbornService.updateInborn(hzhInborn);
    }
}
