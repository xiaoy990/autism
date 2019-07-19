package com.join.autism.controller.hzhgeneralController;

import com.join.autism.entity.HzhGeneral.HzhGeneral;
import com.join.autism.service.hzhGeneralService.HzhGeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("general")
public class HzhGeneralController {
    @Autowired
    HzhGeneralService hzhGeneralService;

    @RequestMapping("queryAll")
    public List<HzhGeneral> queryAll(HzhGeneral hzhGeneral){
        return hzhGeneralService.selectHzhGeneral(hzhGeneral);
    }

    @RequestMapping("addGeneral")
    public String insertGeneral(HzhGeneral hzhGeneral,String pct){
        //将字符串解析成省份城市区县
        String[] temp = pct.split("/");
        hzhGeneral.setProvince(temp[0]);
        hzhGeneral.setCity(temp[1]);
        hzhGeneral.setTown(temp[2]);
        hzhGeneralService.insertHzhGeneral(hzhGeneral);
        return "200";
    }

}
