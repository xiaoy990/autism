package com.join.autism.mapper;

import com.join.autism.entity.HzhMchat.HzhMchat;
import com.join.autism.entity.HzhMchat.HzhMchatExample;
import org.springframework.stereotype.Repository;

/**
 * HzhMchatMapper继承基类
 */
@Repository
public interface HzhMchatMapper extends MyBatisBaseDao<HzhMchat, Integer, HzhMchatExample> {
}