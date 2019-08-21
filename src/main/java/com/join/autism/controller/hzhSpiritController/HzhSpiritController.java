package com.join.autism.controller.hzhSpiritController;

import com.join.autism.entity.HzhSpirit.HzhSpirit;
import com.join.autism.entity.HzhSpirit.HzhSpiritDto;
import com.join.autism.service.hzhSpiritService.HzhSpiritService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 精神和神经系统疾病的家族史
 * */
@RestController
@CrossOrigin
@RequestMapping("spirit")
public class HzhSpiritController {

    @Autowired
    HzhSpiritService hzhSpiritService;

    @RequestMapping("selectSpirit")
    public List<HzhSpiritDto> queryAll(HzhSpirit hzhSpirit){
        return hzhSpiritService.selectHzhSpirit(hzhSpirit);
    }

    @RequestMapping("addSpirit")
    public String insertSpirit(HzhSpirit hzhSpirit){
        hzhSpiritService.insertHzhSpirit(hzhSpirit);
        return "200";
    }
}
