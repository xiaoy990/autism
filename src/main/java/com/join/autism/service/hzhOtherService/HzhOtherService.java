package com.join.autism.service.hzhOtherService;

import com.join.autism.entity.HzhOther.HzhOther;

import java.util.List;

/**
 * @Author: Liang Jiayue
 * @Description:
 * @Date: 22:55 2019/7/24
 */
public interface HzhOtherService {

    /**
     * 增加
     * @param hzhOther
     */
    public void insertHzhOther(HzhOther hzhOther);

    /**
     * 根据id删除
     * @param id
     */
    public void deleteHzhOther(int id);

    /**
     * 修改
     * @param hzhOther
     */
    public void updateHzhOther(HzhOther hzhOther);

    /**
     * 多条件查询
     * @return
     */
    public List<HzhOther> mutiSelectOther();
}
