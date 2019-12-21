package com.join.autism.service.exportService;

import com.join.autism.entity.Export.Export;
import com.join.autism.entity.Export.ExportEntity;

import java.util.List;

public interface ExportService {
    List<Export> selectByKeys(int[] ids);
}
