package com.join.autism.service.hzhGestationService;

import com.join.autism.entity.HzhGeneral.HzhGeneral;
import com.join.autism.entity.HzhGestation.HzhGestation;
import com.join.autism.entity.HzhGestation.HzhGestationDto;

import java.util.List;

/**
 * @Author: Liang Jiayue
 * @Description:
 * @Date: 23:09 2019/7/21
 */
public interface HzhGestationService {

    /**
     * 增加
     * @param hzhGestation
     */
    public void insertHzhGestation(HzhGestation hzhGestation);

    /**
     * 根据id删除
     * @param id
     */
    public void deleteHzhGestation(int id);

    /**
     * 修改
     * @param hzhGestation
     */
    public void updateHzhGestation(HzhGestation hzhGestation);

    /**
     * 多条件查询
     * @return
     */
    public List<HzhGestationDto> mutiSelectGestation(HzhGestation hzhGestation, HzhGeneral hzhGeneral);
}
