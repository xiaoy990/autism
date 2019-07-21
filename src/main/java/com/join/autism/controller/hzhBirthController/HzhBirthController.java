package com.join.autism.controller.hzhBirthController;

import com.join.autism.entity.HzhBirth.HzhBirth;
import com.join.autism.service.hzhBirthService.HzhBirthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 出生和喂养
 * */
@CrossOrigin
@RestController
@RequestMapping("birth")

public class HzhBirthController {

    @Autowired
    HzhBirthService hzhBirthService;

    /**
     * 查找出生和喂养情况
     * @Param hzhBirth包括了任何传入的属性组合，若不传入默认为null，即该条件不做限制
     * */
    @RequestMapping("selectBirth")
    public List<HzhBirth> selectBirth(HzhBirth hzhBirth){
        return hzhBirthService.selectHzhBirth(hzhBirth);
    }
    /**
     * 添加出生和喂养情况，允许有空存在
     * */
    @RequestMapping("addBirth")
    public void addBirth(HzhBirth hzhBirth){
        hzhBirthService.insertHzhBirth(hzhBirth);
    }
}