package com.join.autism.service.exportService.impl;

import com.join.autism.entity.Export.Export;
import com.join.autism.entity.Export.ExportEntity;
import com.join.autism.mapper.ExportMapper;
import com.join.autism.service.exportService.ExportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExportServiceImpl implements ExportService {

    @Autowired
    ExportMapper exportMapper;
    @Override
    public List<Export> selectByKeys(int[] ids) {
        return exportMapper.selectByKeys(ids);
    }
}
