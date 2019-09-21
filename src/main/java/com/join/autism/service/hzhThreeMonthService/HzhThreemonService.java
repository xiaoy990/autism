package com.join.autism.service.hzhThreeMonthService;

import com.join.autism.entity.HzhGeneral.HzhGeneral;
import com.join.autism.entity.HzhThreemon.HzhThreemon;
import com.join.autism.entity.HzhThreemon.HzhThreemonDto;

import java.util.List;

/**
 * @Author: Liang Jiayue
 * @Description:
 * @Date: 20:01 2019/8/29
 */
public interface HzhThreemonService {

    /**
     * 增加
     * @param hzhThreemon
     * @return
     */
    public void insertHzhThreemon(HzhThreemon hzhThreemon);

    /**
     * 根据id删除
     * @param id
     */
    public void deleteHzhThreemon(Integer id);

    /**
     * 根据id修改
     * @param hzhThreemon
     * @return
     */
    public void updateHzhThreemon(HzhThreemon hzhThreemon);

    /**
     * 多条件查询
     * @param hzhThreemon
     * @param hzhGeneral
     * @return
     */
    public List<HzhThreemonDto> mutiSelectThreemon(HzhThreemon hzhThreemon, HzhGeneral hzhGeneral);
}
