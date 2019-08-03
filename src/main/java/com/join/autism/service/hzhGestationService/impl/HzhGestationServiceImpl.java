package com.join.autism.service.hzhGestationService.impl;
import com.join.autism.entity.HzhGestation.HzhGestation;
import com.join.autism.mapper.HzhGestationMapper;
import com.join.autism.service.hzhGestationService.HzhGestationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Liang Jiayue
 * @Description:
 * @Date: 11:35 2019/7/23
 */

@Service("hzhGestationService")
public class HzhGestationServiceImpl implements HzhGestationService{

    @Autowired
    HzhGestationMapper hzhGestationMapper;

    /**
     * 增加
     * @param hzhGestation
     */
    @Override
    public void insertHzhGestation(HzhGestation hzhGestation){
        hzhGestationMapper.insert(hzhGestation);
    }

    /**
     * 根据id删除
     * @param id
     */
    @Override
    public void deleteHzhGestation(int id){
        hzhGestationMapper.deleteByPrimaryKey(id);
    }

    /**
     * 根据id修改
     * @param hzhGestation
     */
    @Override
    public void updateHzhGestation(HzhGestation hzhGestation){
        hzhGestationMapper.updateByPrimaryKeySelective(hzhGestation);
    }

    /**
     * 多条件查询
     * @return
     */
    @Override
    public List<HzhGestation> mutiSelectGestation(){
        HzhGestation hzhGestation = new HzhGestation();
        List<HzhGestation> mutiSelectGestationList = hzhGestationMapper.mutiSelect(hzhGestation);
        return mutiSelectGestationList;
    }

}

