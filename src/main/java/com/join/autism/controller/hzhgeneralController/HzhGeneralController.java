package com.join.autism.controller.hzhgeneralController;

import com.join.autism.entity.HzhGeneral.CriteriaSupportGeneral;
import com.join.autism.entity.HzhGeneral.HzhGeneral;
import com.join.autism.service.hzhGeneralService.HzhGeneralService;
import com.join.autism.util.poi.ExcelUtil;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 一般信息
 * */
@CrossOrigin
@RestController
@RequestMapping("general")
public class HzhGeneralController {
    private final HzhGeneralService hzhGeneralService;
    public HzhGeneralController(HzhGeneralService hzhGeneralService) {
        this.hzhGeneralService = hzhGeneralService;
    }

    /**
     * 查询一般信息，对应一般信息管理
     * */
    @RequestMapping(value = "selectGeneral",produces = "application/json;charset=UTF-8")
    public List<HzhGeneral> selectGeneral(HzhGeneral hzhGeneral, CriteriaSupportGeneral criteriaSupportGeneral){
        return hzhGeneralService.selectHzhGeneral(hzhGeneral,criteriaSupportGeneral);
    }

    @RequestMapping(value = "downExcel",produces = "application/json;charset=UTF-8")
    public String selectGeneralForDownloadExcel(HzhGeneral hzhGeneral, CriteriaSupportGeneral criteriaSupportGeneral, HttpServletResponse resp){
        List<HzhGeneral> hzhGenerals = hzhGeneralService.selectHzhGeneral(hzhGeneral, criteriaSupportGeneral);
        ExcelUtil<HzhGeneral> excelUtil = new ExcelUtil<>();
        String fileUrl = excelUtil.creatExcelFile(hzhGenerals);

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
        return "succeed";
    }


    /**
     * 插入一般信息，对应一般信息添加
     * 要求前端必须同时传入生日和就诊时月份
     * */
    @RequestMapping(value = "addGeneral",produces = "application/json;charset=UTF-8")
    public List insertGeneral( HzhGeneral hzhGeneral, String[] pct){

        if(!hzhGeneralService.insertHzhGeneral(hzhGeneral,pct))return null;
        if (hzhGeneral.getBirthday() != null) {
            hzhGeneral.setBirthday(hzhGeneral.getBirthday().replaceAll("-",""));
        }
        if (hzhGeneral.getSurveyTime()!=null){
            hzhGeneral.setSurveyTime(hzhGeneral.getSurveyTime().replaceAll("-",""));
        }
        List hzhGenerals = hzhGeneralService.selectHzhGeneral(hzhGeneral, new CriteriaSupportGeneral());
        return hzhGenerals;

    }

    /**
     * 删除一般信息
     * */
    @RequestMapping("delGeneral")
    public void delGeneral(HzhGeneral hzhGeneral){
        hzhGeneralService.delHzhGeneralByPK(hzhGeneral.getId());
    }

    /***
     * 修改一般信息
     * */
    @RequestMapping("updateGeneral")
    public void updateGeneral(HzhGeneral hzhGeneral){
        hzhGeneralService.updateGeneral(hzhGeneral);
    }

    @RequestMapping("fuzzySearch")
    public void fuzzySearchGeneral(String key){
        hzhGeneralService.fuzzySearch(key);
    }

}
