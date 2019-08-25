package com.join.autism.controller.hzhNerveController;

import com.join.autism.entity.HzhGeneral.HzhGeneral;
import com.join.autism.entity.HzhNerve.HzhNerve;
import com.join.autism.entity.HzhNerve.HzhNerveDto;
import com.join.autism.service.hzhNerveService.HzhNerveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Field;
import java.util.List;

/**
 * 神经系统检查
 * */
@CrossOrigin
@RestController
@RequestMapping("HzhNerve")
public class HzhNerveController {

    @Autowired
    HzhNerveService hzhNerveService;

    @RequestMapping("selectHzhNerve")
    public List<HzhNerveDto> selectNerve(HzhNerve hzhNerve, HzhGeneral hzhGeneral) throws IllegalAccessException {
        Field[] fields = hzhNerve.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            if (fields[i].get(hzhNerve)!=null && fields[i].get(hzhNerve).equals(0)){
                fields[i].set(hzhNerve,null);
            }
        }
        System.out.println(hzhNerve);
        return hzhNerveService.selectHzhNerve(hzhNerve,hzhGeneral);
    }

    @RequestMapping("insertHzhNerve")
    public void insertNerve(HzhNerve hzhNerve){
        hzhNerveService.insertHzhNerve(hzhNerve);
    }

    @RequestMapping("deleteHzhNerve")
    public void deleteNerve(HzhNerve hzhNerve){hzhNerveService.delHzhNerveByPK(hzhNerve.getId());}

    @RequestMapping("updateHzhNerve")
    public void updateNerve(HzhNerve hzhNerve){hzhNerveService.updateNerve(hzhNerve);}

}
