package com.join.autism.service.hzhFamilyService;

import com.join.autism.entity.HzhFamily.HzhFamily;
import com.join.autism.entity.HzhFamily.HzhFamilyDto;

import java.util.List;

/**
 * @Author: Liang Jiayue
 * @Description:
 * @Date: 23:31 2019/7/17
 */
public interface HzhFamilyService {

    /**
     * 增加
     * @param hzhFamily
     */
    public void insertHzhFamily(HzhFamily hzhFamily);

    /**
     * 根据id删除
     * @param id
     */
    public void deleteHzhFamily(Integer id);

    /**
     * 修改
     * @param hzhFamily
     */
    public void updateHzhFamily(HzhFamily hzhFamily);

    /**
     * 多条件查询
     * @return
     */
    public List<HzhFamilyDto> mutiSelectFamily(HzhFamily hzhFamily);
}
