package com.join.autism.service.hzhConvertionService;

import com.join.autism.entity.HzhConvertion.HzhConvertion;
import com.join.autism.entity.HzhConvertion.HzhConvertionDto;
import com.join.autism.entity.HzhGeneral.HzhGeneral;

import java.util.List;

/**
 * @Author: Liang Jiayue
 * @Description:
 * @Date: 8:58 2019/8/29
 */
public interface HzhConvertionService {

    /**
     * 增加
     * @param hzhConvertion
     */
    public void insertHzhConvertion(HzhConvertion hzhConvertion);

    /**
     * 根据id删除
     * @param id
     */
    public void deleteHzhConvertion(Integer id);

    /**
     * 修改
     * @param hzhConvertion
     */
    public void updateHzhConvertion(HzhConvertion hzhConvertion);

    /**
     * 多条件查询
     * @param hzhConvertion
     * @param hzhGeneral
     * @return
     */
    List<HzhConvertionDto> mutiSelectConvertion(HzhConvertion hzhConvertion, HzhGeneral hzhGeneral);
}
