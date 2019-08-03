package com.join.autism.service.hzhOtherService.impl;

import com.join.autism.entity.HzhOther.HzhOther;
import com.join.autism.mapper.HzhOtherMapper;
import com.join.autism.service.hzhOtherService.HzhOtherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Liang Jiayue
 * @Description:
 * @Date: 22:57 2019/7/24
 */

@Service("hzhOtherService")
public class HzhOtherServiceImpl implements HzhOtherService {

    @Autowired
    HzhOtherMapper hzhOtherMapper;

    /**
     * 增加
     * @param hzhOther
     */
    @Override
    public void insertHzhOther(HzhOther hzhOther){
        hzhOtherMapper.insert(hzhOther);
    }

    /**
     * 根据id删除
     * @param id
     */
    @Override
    public void deleteHzhOther(int id){
        hzhOtherMapper.deleteByPrimaryKey(id);
    }

    /**
     * 修改
     * @param hzhOther
     */
    @Override
    public void updateHzhOther(HzhOther hzhOther){
        hzhOtherMapper.updateByPrimaryKeySelective(hzhOther);
    }

    /**
     * 多条件查询
     * @return
     */
    @Override
    public List<HzhOther> mutiSelectOther(){
        HzhOther hzhOther = new HzhOther();
        List<HzhOther> mutiSelectOtherList;
        mutiSelectOtherList = hzhOtherMapper.mutiSelect(hzhOther);
        return mutiSelectOtherList;
    }
}
