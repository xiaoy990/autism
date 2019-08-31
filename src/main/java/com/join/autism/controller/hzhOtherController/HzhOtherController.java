package com.join.autism.controller.hzhOtherController;

import com.join.autism.entity.HzhGeneral.HzhGeneral;
import com.join.autism.entity.HzhOther.HzhOther;
import com.join.autism.entity.HzhOther.HzhOtherDto;
import com.join.autism.service.hzhOtherService.HzhOtherService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Liang Jiayue
 * @Description:
 * @Date: 9:35 2019/8/29
 */

@CrossOrigin
@RestController
@RequestMapping("/HzhOther")
public class HzhOtherController {

    private final
    HzhOtherService hzhOtherService;

    public HzhOtherController(HzhOtherService hzhOtherService) {
        this.hzhOtherService = hzhOtherService;
    }

    /**
     * 增加
     * @param hzhOther
     * @return
     */
    @RequestMapping(value = "/insertHzhOther")
    public HzhOther insertHzhOther(HzhOther hzhOther){
        try {
            hzhOtherService.insertHzhOther(hzhOther);
        }catch (Exception e){
            e.printStackTrace();
        }
        return hzhOther;
    }

    /**
     * 根据id删除
     * @param id
     */
    @RequestMapping(value = "/deleteHzhOther")
    public void deleteHzhOther(Integer id){
        try {
            hzhOtherService.deleteHzhOther(id);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 修改
     * @param hzhOther
     * @return
     */
    @RequestMapping(value = "/updateHzhOther")
    public HzhOther updateHzhOther(HzhOther hzhOther){
        try {
            hzhOtherService.updateHzhOther(hzhOther);
        }catch (Exception e){
            e.printStackTrace();
        }
        return hzhOther;
    }

    /**
     * 多条件查询
     * @param hzhOther
     * @param hzhGeneral
     * @return
     */
    @RequestMapping(value = "/mutiSelectOther")
    public List<HzhOtherDto> mutiSelectOther(HzhOther hzhOther, HzhGeneral hzhGeneral){
        List<HzhOtherDto> mutiSelectOtherList = null;
        try {
            mutiSelectOtherList = hzhOtherService.mutiSelectOther(hzhOther,hzhGeneral);
        }catch (Exception e){
            e.printStackTrace();
        }
        return mutiSelectOtherList;
    }
}
