package com.join.autism.controller.hzhGestationController;

import com.join.autism.entity.HzhFamily.HzhFamily;
import com.join.autism.entity.HzhGestation.HzhGestation;
import com.join.autism.service.hzhGestationService.HzhGestationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.ls.LSException;

import java.util.List;

/**
 * @Author: Liang Jiayue
 * @Description:
 * @Date: 15:08 2019/7/25
 */

@CrossOrigin
@RestController
@RequestMapping("/HzhGestation")
public class HzhGestationController {


    @Autowired
    HzhGestationService hzhGestationService;

    /**
     * 跳转增加页面
     */
    @RequestMapping(value = "/toInsert")
    public void toInsertHzhGestation(){

    }

    /**
     * 增加
     * @param hzhGestation
     * @return
     */
    @RequestMapping(value = "/insertHzhGestation")
    public HzhGestation insertHzhGestation(HzhGestation hzhGestation){
        try {
            hzhGestationService.insertHzhGestation(hzhGestation);
        }catch (Exception e){
            e.printStackTrace();
        }
        return hzhGestation;
    }

    /**
     * 删除
     * @param id
     */
    @RequestMapping(value = "/deleteHzhGestation")
    public void deleteHzhGestation(int id){
        try {
            hzhGestationService.deleteHzhGestation(id);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 跳转修改页面
     */
    @RequestMapping(value = "/toUpdate")
    public void toUpdateHzhGestation(){

    }

    /**
     * 修改
     * @param hzhGestation
     * @return
     */
    @RequestMapping(value = "/updateHzhGestation")
    public HzhGestation updateHzhGestation(HzhGestation hzhGestation){
        try {
            hzhGestationService.updateHzhGestation(hzhGestation);
        }catch (Exception e){
            e.printStackTrace();
        }
        return hzhGestation;
    }

    /**
     * 多条件查询
     * @param model
     * @return
     */
    @RequestMapping(value = "/mutiSelectGestation")
    public List<HzhGestation> mutiSelectGestation(Model model){
        List<HzhGestation> mutiSelectGestationList = null;
        try {
            mutiSelectGestationList = hzhGestationService.mutiSelectGestation();
            model.addAttribute("mutiSelectGestationList",mutiSelectGestationList);
        }catch (Exception e){
            e.printStackTrace();
        }
        return mutiSelectGestationList;
    }
}
