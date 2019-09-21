package com.join.autism.controller.hzhConvertionController;

import com.join.autism.entity.HzhConvertion.HzhConvertion;
import com.join.autism.entity.HzhConvertion.HzhConvertionDto;
import com.join.autism.entity.HzhGeneral.HzhGeneral;
import com.join.autism.service.hzhConvertionService.HzhConvertionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Liang Jiayue
 * @Description:
 * @Date: 9:07 2019/8/29
 */

@CrossOrigin
@RestController
@RequestMapping("/HzhConvention")
public class HzhConvertionController {

    private final
    HzhConvertionService hzhConvertionService;

    public HzhConvertionController(HzhConvertionService hzhConvertionService) {
        this.hzhConvertionService = hzhConvertionService;
    }

    /**
     * 增加
     * @param hzhConvertion
     * @return
     */
    @RequestMapping(value = "/insertConvention")
    public HzhConvertion insertHzhConvertion(HzhConvertion hzhConvertion){
        try {
            hzhConvertionService.insertHzhConvertion(hzhConvertion);
        }catch (Exception e){
            e.printStackTrace();
        }
        return hzhConvertion;
    }

    /**
     * 根据id删除
     * @param id
     */
    @RequestMapping(value = "/deleteConvention")
    public void deleteHzhConvertion(Integer id){
        try {
            hzhConvertionService.deleteHzhConvertion(id);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 修改
     * @param hzhConvertion
     * @return
     */
    @RequestMapping(value = "/updateConvention")
    public HzhConvertion updateHzhConvertion(HzhConvertion hzhConvertion){
        try {
            hzhConvertionService.updateHzhConvertion(hzhConvertion);
        }catch (Exception e){
            e.printStackTrace();
        }
        return hzhConvertion;
    }

    /**
     * 多条件查询
     * @param hzhConvertion
     * @param hzhGeneral
     * @return
     */
    @RequestMapping(value = "/selectConvention")
    public List<HzhConvertionDto> mutiSelectConvertion(HzhConvertion hzhConvertion, HzhGeneral hzhGeneral){
        List<HzhConvertionDto> mutiSelectConvertionList = null;
        try {
            mutiSelectConvertionList = hzhConvertionService.mutiSelectConvertion(hzhConvertion,hzhGeneral);
        }catch (Exception e){
            e.printStackTrace();
        }
        return mutiSelectConvertionList;
    }
}
