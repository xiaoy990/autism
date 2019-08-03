package com.join.autism.controller.hzhFamilyController;

import com.join.autism.entity.HzhFamily.HzhFamily;
import com.join.autism.service.hzhFamilyService.HzhFamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Liang Jiayue
 * @Description:
 * @Date: 14:38 2019/7/18
 */

@CrossOrigin
@RestController
@RequestMapping("/HzhFamily")
public class HzhFamilyController {

    @Autowired
    HzhFamilyService hzhFamilyService;

    /**
     * 跳转增加页面. 空方法,已弃用
     */
    @RequestMapping(value = "/toInsert")
    public void toInsertHzhFamily(){

    }

    /**
     * 增加
     * @param hzhFamily
     * @return
     */
    @RequestMapping(value = "/insertHzhFamily")
    public HzhFamily insertHzhFamily(HzhFamily hzhFamily){
        try {
            hzhFamilyService.insertHzhFamily(hzhFamily);
        }catch (Exception e){
            e.printStackTrace();
        }
        return hzhFamily;
    }

    /**
     * 删除
     * @param id
     */
    @RequestMapping(value = "/deleteHzhFamily")
    public void deleteHzhFamily(int id){
        try {
            hzhFamilyService.deleteHzhFamily(id);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 跳转修改页面 空方法,已弃用
     */
    @RequestMapping(value = "/toUpdate")
    public void toUpdateHzhFamily(){

    }

    /**
     * 修改
     * @param hzhFamily
     * @return
     */
    @RequestMapping(value = "/updateHzhFamily")
    public HzhFamily updateHzhFamily(HzhFamily hzhFamily){
        try {
            hzhFamilyService.updateHzhFamily(hzhFamily);
        }catch (Exception e){
            e.printStackTrace();
        }
        return hzhFamily;
    }

    /**
     * 多条件查询
     * @param model
     * @return
     */
    @RequestMapping(value = "/mutiSelectFamily")
    public List<HzhFamily> mutiSelectFamily(Model model){
        List<HzhFamily> mutiSelectFamilyList = null;
        HzhFamily hzhFamily = new HzhFamily();
        try {
            mutiSelectFamilyList = hzhFamilyService.mutiSelectFamily(hzhFamily);
            model.addAttribute("mutiSelectFamilyList",mutiSelectFamilyList);
        }catch (Exception e){
            e.printStackTrace();
        }
        return mutiSelectFamilyList;
    }

}
