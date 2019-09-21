package com.join.autism.service.hzhThreeMonthService.impl;

import com.join.autism.entity.HzhGeneral.HzhGeneral;
import com.join.autism.entity.HzhThreemon.HzhThreemon;
import com.join.autism.entity.HzhThreemon.HzhThreemonDto;
import com.join.autism.mapper.HzhThreemonMapper;
import com.join.autism.service.hzhThreeMonthService.HzhThreemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Liang Jiayue
 * @Description:
 * @Date: 20:06 2019/8/29
 */

@Service("/HzhThreemonService")
public class HzhThreemonServiceImpl implements HzhThreemonService {

    @Autowired
    HzhThreemonMapper hzhThreemonMapper;

    /**
     * 增加
     * @param hzhThreemon
     */
    @Override
    public void insertHzhThreemon(HzhThreemon hzhThreemon){
        hzhThreemonMapper.insert(hzhThreemon);
    }

    /**
     * 根据id删除
     * @param id
     */
    @Override
    public void deleteHzhThreemon(Integer id){
        hzhThreemonMapper.deleteByPrimaryKey(id);
    }

    /**
     * 修改
     * @param hzhThreemon
     */
    @Override
    public void updateHzhThreemon(HzhThreemon hzhThreemon){
        hzhThreemonMapper.updateByPrimaryKeySelective(hzhThreemon);
    }

    /**
     * 多条件查询
     * @param hzhThreemon
     * @param hzhGeneral
     * @return
     */
    @Override
    public List<HzhThreemonDto> mutiSelectThreemon(HzhThreemon hzhThreemon, HzhGeneral hzhGeneral){
        return hzhThreemonMapper.mutiSelect(hzhThreemon);
    }
}
