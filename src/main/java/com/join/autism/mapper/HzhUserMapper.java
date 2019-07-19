package com.join.autism.mapper;

import com.join.autism.entity.HzhUser.HzhUser;
import com.join.autism.entity.HzhUser.HzhUserExample;
import org.springframework.stereotype.Repository;

/**
 * HzhUserMapper继承基类
 */
@Repository
public interface HzhUserMapper extends MyBatisBaseDao<HzhUser, Integer, HzhUserExample> {
}