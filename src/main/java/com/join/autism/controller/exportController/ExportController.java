package com.join.autism.controller.exportController;

import com.join.autism.entity.Export.Export;
import com.join.autism.entity.Export.ExportEntity;
import com.join.autism.entity.HzhGeneral.CriteriaSupportGeneral;
import com.join.autism.entity.HzhGeneral.HzhGeneral;
import com.join.autism.service.exportService.ExportService;
import com.join.autism.util.poi.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/export")
public class ExportController {

    @Autowired
    ExportService exportService;

    @RequestMapping("/ex")
    List<Export> selectByKeys(int[] ids){
        for (int i = 0; i < ids.length; i++) {
            System.out.println(ids[i]);
        }
        return exportService.selectByKeys(ids);
    }

    @RequestMapping(value = "downExcel",produces = "application/octet-stream")
    public void selectGeneralForDownloadExcel(int[] ids, HttpServletResponse resp){
        List<Export> exportEntities = exportService.selectByKeys(ids);
        ExcelUtil<Export> excelUtil = new ExcelUtil<>();
        String fileUrl = excelUtil.creatExcelFile(exportEntities);

        File file = new File(fileUrl);
        if (file.exists()){

            resp.setContentType("application/octet-stream");
            resp.setHeader("content-type","application/octet-steam");
            long l = System.currentTimeMillis();
            Date date = new Date(l);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            resp.setHeader("Content-Disposition","attachment;fileName=AutismInfo"+simpleDateFormat.format(date)+".xls");
            byte[] buffer = new byte[1024];
            FileInputStream input = null;
            BufferedInputStream bis = null;

            try {
                input = new FileInputStream(file);
                bis = new BufferedInputStream(input);
                ServletOutputStream outputStream = resp.getOutputStream();
                int i = bis.read(buffer);
                while( i != -1){
                    outputStream.write(buffer,0,i);
                    i = bis.read(buffer);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
