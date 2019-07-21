package com.join.autism.controller.hzhNerveController;

import com.join.autism.entity.HzhNerve.HzhNerve;
import com.join.autism.service.hzhNerveService.HzhNerveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 神经系统检查
 * */
@CrossOrigin
@RestController
@RequestMapping("nerve")
public class HzhNerveController {

    @Autowired
    HzhNerveService hzhNerveService;

    @RequestMapping("selectNerve")
    public List<HzhNerve> selectNerve(HzhNerve hzhNerve){
        return hzhNerveService.selectHzhNerve(hzhNerve);
    }

    @RequestMapping("addNerve")
    public void insertNerve(HzhNerve hzhNerve){
        hzhNerveService.insertHzhNerve(hzhNerve);
    }
}
