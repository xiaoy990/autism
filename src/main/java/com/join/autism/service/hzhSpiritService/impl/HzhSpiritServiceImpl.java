package com.join.autism.service.hzhSpiritService.impl;

import com.join.autism.entity.HzhGeneral.HzhGeneral;
import com.join.autism.entity.HzhSpirit.HzhSpirit;
import com.join.autism.entity.HzhSpirit.HzhSpiritDto;
import com.join.autism.mapper.HzhSpiritMapper;
import com.join.autism.service.hzhSpiritService.HzhSpiritService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.List;

@Service
public class HzhSpiritServiceImpl implements HzhSpiritService {

    @Autowired
    HzhSpiritMapper hzhSpiritMapper;

    @Override
    public List<HzhSpiritDto> selectHzhSpirit(HzhSpirit hzhSpirit, HzhGeneral hzhGeneral) {
        return hzhSpiritMapper.mutiSelect(hzhSpirit,hzhGeneral);
    }

    @Override
    // 由于字符解析的原因，在这里手动生成了json数据。具体逻辑大概是：遍历查询到的所有对象，内层循环遍历该对象的全部属性，
    // 将不需要拆分的属性直接拼在json中，将需要拆分的属性拆分后封装到json中
    public String queryAllSpirits(HzhSpirit hzhSpirit) throws IllegalAccessException {
        List<HzhSpiritDto> hzhSpiritDtos = hzhSpiritMapper.mutiSelect(hzhSpirit,new HzhGeneral());
        Field[] declaredFields = HzhSpiritDto.class.getDeclaredFields();
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (HzhSpiritDto s:hzhSpiritDtos
             ) {
            sb.append("{");
            for (Field f:declaredFields
                 ) {
                f.setAccessible(true);
                String fv = null;
                if (f.get(s)!=null){
                    fv = String.valueOf(f.get(s));
                }
                else {
                    sb.append("\""+f.getName()+"\":"+"\""+f.get(s)+"\",");
                    continue;
                }
                if (fv.contains("|")){
                    String[] split = fv.split("\\|");
                    for (int i = 0; i < split.length; i++) {
                        sb.append("\""+f.getName()+i+"\":\""+split[i]+"\",");
                    }
                } else{
                    sb.append("\""+f.getName()+"\":"+"\""+f.get(s)+"\",");
                }
            }
            sb.deleteCharAt(sb.length()-1);
            sb.append("},");
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append("]");
        String s = sb.toString();
        return s;
    }

  @Override
    public HzhSpirit selectHzhSpiritByPK(Integer id) {
        return hzhSpiritMapper.selectByPrimaryKey(id);
    }

    @Override
    public void insertHzhSpirit(HzhSpirit hzhSpirit) {
        hzhSpiritMapper.insert(hzhSpirit);
    }

    @Override
    public void delHzhSpiritByPK(Integer id) {
        hzhSpiritMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateHzhSpirit(HzhSpirit hzhSpirit) {
        hzhSpiritMapper.updateByPrimaryKey(hzhSpirit);
    }
}
