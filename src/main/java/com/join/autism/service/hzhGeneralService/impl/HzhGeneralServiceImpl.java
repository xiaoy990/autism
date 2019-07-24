package com.join.autism.service.hzhGeneralService.impl;

import com.join.autism.entity.HzhGeneral.CriteriaSupportGeneral;
import com.join.autism.entity.HzhGeneral.HzhGeneral;
import com.join.autism.mapper.HzhGeneralMapper;
import com.join.autism.service.hzhGeneralService.HzhGeneralService;
import com.join.autism.util.enums.Month;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class HzhGeneralServiceImpl implements HzhGeneralService {

    @Autowired
    HzhGeneralMapper hzhGeneralMapper;

    @Override
    public List<HzhGeneral> selectHzhGeneral(HzhGeneral hzhGeneral, CriteriaSupportGeneral criteriaSupportGeneral) {
        hzhGeneral.setSurveyTime(formatDateFromDB(hzhGeneral.getSurveyTime()));
        hzhGeneral.setBirthday(formatDateFromDB(hzhGeneral.getBirthday()));
        if (criteriaSupportGeneral.getMinSurTime() != null && criteriaSupportGeneral.getMinSurTime() != "") {
            criteriaSupportGeneral.setMinSurTime(criteriaSupportGeneral.getMinSurTime().replaceAll("-",""));
            criteriaSupportGeneral.setMaxSurTime(criteriaSupportGeneral.getMaxSurTime().replaceAll("-",""));
        }
        List<HzhGeneral> hzhGenerals = hzhGeneralMapper.mutiSelect(hzhGeneral, criteriaSupportGeneral);
        for (HzhGeneral hzh : hzhGenerals) {
            hzh.setBirthday(formatDateFromDB(hzh.getBirthday()));
        }
        for (HzhGeneral hzh : hzhGenerals) {
            hzh.setSurveyTime(formatDateFromDB(hzh.getSurveyTime()));
        }
        return hzhGenerals;
    }

    /**
     * 将日期由纯数字转换成yyyy-mm-dd的形式
     * */
    private String formatDateFromDB(String originDate) {
        if (originDate==null){
            return null;
        }
        String[] split = originDate.split("");
        if(split.length!=8){
            return originDate;
        }
        List<String> linkedList = new LinkedList();
        for (int i = 0; i < split.length; i++) {
            if (i==4||i==6){
                linkedList.add("-");
            }
            linkedList.add(split[i]);

        }
        originDate = String.join("",linkedList);
        return originDate;
    }
    @Override
    public HzhGeneral selectHzhGeneralByPK(Integer id) {
        return hzhGeneralMapper.selectByPrimaryKey(id);
    }

    @Override
    public void insertHzhGeneral(HzhGeneral hzhGeneral,String[] pct) {
            updateAge(hzhGeneral);
            hzhGeneral.setBirthday(hzhGeneral.getBirthday().replaceAll("-",""));
            hzhGeneral.setSurveyTime(hzhGeneral.getSurveyTime().replaceAll("-",""));
            //将字符串解析成省份城市区县
            if (pct.length == 3) {
                hzhGeneral.setProvince(pct[0]);
                hzhGeneral.setCity(pct[1]);
                hzhGeneral.setTown(pct[2]);
            } else if (pct.length == 2) {
                hzhGeneral.setProvince(pct[0]);
                hzhGeneral.setCity(pct[1]);
            } else if (pct.length == 1) {
                hzhGeneral.setProvince(pct[0]);
            }

        hzhGeneralMapper.insert(hzhGeneral);
    }

    @Override
    public void delHzhGeneralByPK(Integer id) {
        hzhGeneralMapper.deleteByPrimaryKey(id);
    }

    /**
     * 更新信息
     * */
    @Override
    public void updateGeneral(HzhGeneral hzhGeneral) {
        updateAge(hzhGeneral);
        hzhGeneral.setBirthday(hzhGeneral.getBirthday().replaceAll("-",""));
        hzhGeneral.setSurveyTime(hzhGeneral.getSurveyTime().replaceAll("-",""));
        hzhGeneralMapper.updateByPrimaryKey(hzhGeneral);
    }

    /**
     * 模糊查询 未启用
     * */
    @Override
    public void fuzzySearch(String key) {
        hzhGeneralMapper.fuzzySearch(key);
    }

    /**
     * 计算年龄的方法
     * */
    private void updateAge(HzhGeneral hzhGeneral){
        Integer birthMonth = 0;
        Integer curMonth = 0;
        String birth;
        String cur;
        String[] splits = null;
        String[] curSplits = null;
        //计算出生月
        if(!hzhGeneral.getBirthday().equals("")) {
            birth = hzhGeneral.getBirthday();
            splits = birth.split("-");
            birthMonth = Integer.valueOf(splits[1]);
        }
        //计算就诊时月份
        if (!hzhGeneral.getSurveyTime().equals("")) {
            cur = hzhGeneral.getSurveyTime();
            curSplits = cur.split("-");
            curMonth = Integer.valueOf(splits[1]);
        }
        if (!hzhGeneral.getBirthday().equals("")&&!hzhGeneral.getSurveyTime().equals("")) {
            //以年份初始化生日
            int age = Integer.valueOf(curSplits[0]) - Integer.valueOf(splits[0]);
            //如果今年没过生日月份 就给年龄减1
            if (curMonth < birthMonth) {
                age--;
            }
            //如果月份相等 判断是否已经过了生日 如果没过 年龄减1
            else if (Integer.valueOf(curSplits[2]) < Integer.valueOf(splits[2]) && curMonth == birthMonth) {
                age--;
            }
            hzhGeneral.setAge(age);
        }
    }

    /**
     * 转换标准日期格式到yyyy-mm-dd的形式，已弃用
     * */
    private String formatDateFromFront(String originDate){
        if (originDate.length()<11){
            return originDate;
        }
        String[] splits = originDate.split(" ");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(splits[3]+"-"+String.format("%02d",Month.valueOf(splits[1]).ordinal())+"-"+String.format("%02d",Integer.valueOf(splits[2])));
        return stringBuffer.toString();
    }
}
