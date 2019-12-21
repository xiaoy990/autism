package com.join.autism.mapper;

import com.join.autism.entity.Export.Export;
import com.join.autism.entity.Export.ExportExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ExportMapper继承基类
 */
@Repository
public interface ExportMapper extends MyBatisBaseDao<Export, Export, ExportExample> {
    List<Export> selectByKeys(@Param("ids") int[] ids);
}