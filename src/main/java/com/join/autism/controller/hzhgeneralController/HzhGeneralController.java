package com.join.autism.controller.hzhgeneralController;

import com.join.autism.entity.HzhGeneral.HzhGeneral;
import com.join.autism.service.hzhGeneralService.HzhGeneralService;
import com.join.autism.util.enums.Month;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 一般信息
 * */
@CrossOrigin
@RestController
@RequestMapping("general")
public class HzhGeneralController {
    @Autowired
    HzhGeneralService hzhGeneralService;

    /**
     * 查询全部一般信息，对应一般信息管理
     * */
    @RequestMapping(value = "selectGeneral",produces = "application/json;charset=UTF-8")
    public List<HzhGeneral> selectGeneral(HzhGeneral hzhGeneral){
        return hzhGeneralService.selectHzhGeneral(hzhGeneral);
    }

    /**
     * 插入一般信息，对应一般信息添加
     * 要求前端必须同时传入生日和就诊时月份
     * */
    @RequestMapping(value = "addGeneral",produces = "application/json;charset=UTF-8")
    public void insertGeneral( HzhGeneral hzhGeneral, String[] pct){
        if (!hzhGeneral.getBirthday().equals("")&&!hzhGeneral.getSurveyTime().equals("")){
            System.out.println(hzhGeneral.getBirthday());
            //计算出生月
            String birth = hzhGeneral.getBirthday();
            String[] splits = birth.split(" ");
            Month date = Month.valueOf(splits[1]);
            Integer birthMonth = date.ordinal()+1;
            //计算就诊时月份
            String cur = hzhGeneral.getSurveyTime();
            String[] curSplits = cur.split(" ");
            Month date1 = Month.valueOf(curSplits[1]);
            Integer curMonth = date1.ordinal()+1;
            //以年份初始化生日
            int age = Integer.valueOf(curSplits[3]) - Integer.valueOf(splits[3]);
            //如果今年没过生日月份 就给年龄减1
            if (curMonth<birthMonth){age--;}
            //如果月份相等 判断是否已经过了生日 如果没过 年龄减1
            else if (Integer.valueOf(curSplits[2])<Integer.valueOf(splits[2])&&curMonth==birthMonth){age--;}
            hzhGeneral.setAge(age);
            hzhGeneral.setBirthday(splits[3]+"-"+birthMonth+"-"+Integer.valueOf(splits[2]));
        }

        //将字符串解析成省份城市区县
        if (pct.length==3) {
            hzhGeneral.setProvince(pct[0]);
            hzhGeneral.setCity(pct[1]);
            hzhGeneral.setTown(pct[2]);
        }else if (pct.length==2){
            hzhGeneral.setProvince(pct[0]);
            hzhGeneral.setCity(pct[1]);
        }else if (pct.length==1){
            hzhGeneral.setProvince(pct[0]);
        }
        //替换生日属性

        hzhGeneralService.insertHzhGeneral(hzhGeneral);
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

}
