package com.join.autism.service.hzhFamilyService.impl;

import com.join.autism.entity.HzhFamily.HzhFamily;
import com.join.autism.mapper.HzhFamilyMapper;
import com.join.autism.service.hzhFamilyService.HzhFamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Liang Jiayue
 * @Description:
 * @Date: 23:31 2019/7/17
 */

@Service
public class HzhFamilyServiceImpl implements HzhFamilyService {

    @Autowired
    HzhFamilyMapper hzhFamilyMapper;

    /**
     * 增加HzhFamily
     * @param hzhFamily
     */
    @Override
    public void insertHzhFamily(HzhFamily hzhFamily){
        hzhFamilyMapper.insert(hzhFamily);
    }

    /**
     * 删除HzhFamily
     * @param id
     */
    @Override
    public void deleteHzhFamily(Integer id){
        hzhFamilyMapper.deleteByPrimaryKey(id);
    }

    /**
     * 根据id修改
     * @param hzhFamily
     */
    @Override
    public void updateHzhFamily(HzhFamily hzhFamily){
        hzhFamilyMapper.updateByPrimaryKeySelective(hzhFamily);
    }

    /**
     * 多条件查询
     * @return
     */
    @Override
    public List<HzhFamily> mutiSelectFamily(HzhFamily hzhFamily){
        List<HzhFamily> mutiSelectFamilyList;
        mutiSelectFamilyList = hzhFamilyMapper.mutiSelect(hzhFamily);
        return mutiSelectFamilyList;
    }
}
