package com.join.autism.service.hzhConvertionService.impl;

import com.join.autism.entity.HzhConvertion.HzhConvertion;
import com.join.autism.entity.HzhConvertion.HzhConvertionDto;
import com.join.autism.entity.HzhGeneral.HzhGeneral;
import com.join.autism.mapper.HzhConvertionMapper;
import com.join.autism.service.hzhConvertionService.HzhConvertionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Liang Jiayue
 * @Description:
 * @Date: 9:02 2019/8/29
 */

@Service("hzhConvertionService")
public class HzhConvertionServiceImpl implements HzhConvertionService {

    @Autowired
    HzhConvertionMapper hzhConvertionMapper;

    /**
     * 增加
     * @param hzhConvertion
     */
    @Override
    public void insertHzhConvertion(HzhConvertion hzhConvertion){
        hzhConvertionMapper.insert(hzhConvertion);
    }

    /**
     * 根据id删除
     * @param id
     */
    @Override
    public void deleteHzhConvertion(Integer id){
        hzhConvertionMapper.deleteByPrimaryKey(id);
    }

    /**
     * 修改
     * @param hzhConvertion
     */
    @Override
    public void updateHzhConvertion(HzhConvertion hzhConvertion){
        hzhConvertionMapper.updateByPrimaryKeySelective(hzhConvertion);
    }

    /**
     * 多条件查询
     * @param hzhConvertion
     * @param hzhGeneral
     * @return
     */
    @Override
    public List<HzhConvertionDto> mutiSelectConvertion(HzhConvertion hzhConvertion, HzhGeneral hzhGeneral){
        return hzhConvertionMapper.mutiSelect(hzhConvertion,hzhGeneral);
    }


}
