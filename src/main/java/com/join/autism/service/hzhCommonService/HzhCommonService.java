package com.join.autism.service.hzhCommonService;

import com.join.autism.entity.HzhCommon.HzhCommon;
import com.join.autism.entity.HzhCommon.HzhCommonDto;
import com.join.autism.entity.HzhGeneral.HzhGeneral;

import java.util.List;

/**
 * @Author: Liang Jiayue
 * @Description:
 * @Date: 18:04 2019/8/28
 */
public interface HzhCommonService {

    /**
     * 增加
     * @param hzhCommon
     */
    public void insertHzhCommon(HzhCommon hzhCommon);

    /**
     * 根据id删除
     * @param id
     */
    public void deleteHzhCommon(Integer id);

    /**
     * 修改
     * @param hzhCommon
     */
    public void updateHzhCommon(HzhCommon hzhCommon);

    /**
     * 多条件查询
     * 为啥后面的参数是HzhCommon 不是 HzhCommonDto
     * @param hzhCommon
     * @return
     */
    public List<HzhCommonDto> mutiSelectCommon(HzhCommon hzhCommon, HzhGeneral hzhGeneral);
}
