package com.join.autism.service.hzhCommonService.impl;

import com.join.autism.entity.HzhCommon.HzhCommon;
import com.join.autism.entity.HzhCommon.HzhCommonDto;
import com.join.autism.entity.HzhGeneral.HzhGeneral;
import com.join.autism.mapper.HzhCommonMapper;
import com.join.autism.service.hzhCommonService.HzhCommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Liang Jiayue
 * @Description:
 * @Date: 18:04 2019/8/28
 */

@Service("hzhCommonService")
public class HzhCommonServiceImpl implements HzhCommonService {

    @Autowired
    HzhCommonMapper hzhCommonMapper;

    /**
     * 增加
     * @param hzhCommon
     */
    @Override
    public void insertHzhCommon(HzhCommon hzhCommon) {
        hzhCommonMapper.insert(hzhCommon);
    }

    /**
     * 根据id删除
     * @param id
     */
    @Override
    public void deleteHzhCommon(Integer id){
        hzhCommonMapper.deleteByPrimaryKey(id);
    }

    /**
     * 修改
     * @param hzhCommon
     */
    @Override
    public void updateHzhCommon(HzhCommon hzhCommon){
        hzhCommonMapper.updateByPrimaryKeySelective(hzhCommon);
    }

    /**
     * 多条件查询（联查）
     * @param hzhCommon
     * @param hzhGeneral
     * @return
     */
    @Override
    public List<HzhCommonDto> mutiSelectCommon(HzhCommon hzhCommon, HzhGeneral hzhGeneral){
        return hzhCommonMapper.mutiSelect(hzhCommon,hzhGeneral);
    }
}
