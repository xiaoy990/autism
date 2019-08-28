package com.join.autism.controller.hzhSpiritController;

import com.join.autism.entity.HzhSpirit.HzhSpirit;
import com.join.autism.entity.HzhSpirit.HzhSpiritDto;
import com.join.autism.service.hzhSpiritService.HzhSpiritService;
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

    private final HzhSpiritService hzhSpiritService;

    public HzhSpiritController(HzhSpiritService hzhSpiritService) {
        this.hzhSpiritService = hzhSpiritService;
    }

    @RequestMapping("selectSpirit")
    public List<HzhSpiritDto> queryAll(HzhSpirit hzhSpirit){
        return hzhSpiritService.selectHzhSpirit(hzhSpirit);
    }

    @RequestMapping("insertSpirit")
    public void insertSpirit(HzhSpirit hzhSpirit){
        hzhSpiritService.insertHzhSpirit(hzhSpirit);
    }

    @RequestMapping("deleteSpirit")
    public void delSpirit(HzhSpirit hzhSpirit){
        hzhSpiritService.delHzhSpiritByPK(hzhSpirit.getId());
    }

    @RequestMapping("updateSpirit")
    public void update(HzhSpirit hzhSpirit){
        hzhSpiritService.updateHzhSpirit(hzhSpirit);
    }
}
