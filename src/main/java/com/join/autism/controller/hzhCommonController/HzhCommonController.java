package com.join.autism.controller.hzhCommonController;

import com.join.autism.entity.HzhCommon.HzhCommon;
import com.join.autism.entity.HzhCommon.HzhCommonDto;
import com.join.autism.entity.HzhGeneral.HzhGeneral;
import com.join.autism.service.hzhCommonService.HzhCommonService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Liang Jiayue
 * @Description:
 * @Date: 18:14 2019/8/28
 */

@CrossOrigin
@RestController
@RequestMapping("/HzhCommon")
public class HzhCommonController {

    private final
    HzhCommonService hzhCommonService;

    public HzhCommonController(HzhCommonService hzhCommonService) {
        this.hzhCommonService = hzhCommonService;
    }


    /**
     * 增加
     * @param hzhCommon
     * @return
     */
    @RequestMapping(value = "/insertCommon")
    public HzhCommon insertHzhCommon(HzhCommon hzhCommon){
        try {
            hzhCommonService.insertHzhCommon(hzhCommon);
        }catch (Exception e){
            e.printStackTrace();
        }
        return hzhCommon;
    }


    /**
     * 根据id删除
     * @param id
     */
    @RequestMapping(value = "/deleteCommon")
    public void deleteHzhCommon(Integer id){
        try {
            hzhCommonService.deleteHzhCommon(id);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    /**
     * 修改
     * @param hzhCommon
     * @return
     */
    @RequestMapping(value = "/updateCommon")
    public HzhCommon updateHzhCommon(HzhCommon hzhCommon){
        try {
            hzhCommonService.updateHzhCommon(hzhCommon);
        }catch (Exception e){
            e.printStackTrace();
        }
        return hzhCommon;
    }


    /**
     * 多条件查询
     * @param hzhCommon
     * @param hzhGeneral
     * @return
     */
    @RequestMapping(value = "/selectCommon")
    public List<HzhCommonDto> mutiSelectCommon(HzhCommon hzhCommon, HzhGeneral hzhGeneral){
        List<HzhCommonDto> mutiSelectCommonList = null;
        try {
            mutiSelectCommonList = hzhCommonService.mutiSelectCommon(hzhCommon,hzhGeneral);
        }catch (Exception e){
            e.printStackTrace();
        }
        return mutiSelectCommonList;
    }
}
