package com.join.autism.mapper;

import com.join.autism.entity.HzhFamily.HzhFamily;
import com.join.autism.entity.HzhOther.HzhOther;
import com.join.autism.entity.HzhOther.HzhOtherExample;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * HzhOtherMapper继承基类
 */
@Repository
public interface HzhOtherMapper extends MyBatisBaseDao<HzhOther, Integer, HzhOtherExample> {
    List<HzhOther> mutiSelect(HzhOther hzhOther);
}