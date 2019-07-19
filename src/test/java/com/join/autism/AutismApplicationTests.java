package com.join.autism;

import com.join.autism.entity.HzhAssist.HzhAssist;
import com.join.autism.entity.HzhAssist.HzhAssistExample;
import com.join.autism.entity.HzhGeneral.HzhGeneral;
import com.join.autism.entity.HzhGeneral.HzhGeneralExample;
import com.join.autism.mapper.HzhAssistMapper;
import com.join.autism.mapper.HzhGeneralMapper;
import com.join.autism.service.HzhAssistService.HzhAssistService;
import com.join.autism.service.hzhGeneralService.HzhGeneralService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AutismApplicationTests {

    @Resource
    HzhAssistService hzhAssistService;
    @Resource
    HzhGeneralService generalService;
    @Resource
    HzhGeneralMapper hzhGeneralMapper;

    @Test
    public void contextLoads() {
//        HzhAssist hzhAssist = new HzhAssist();
////        hzhAssist.setColorbody("test");
////        hzhAssist.setPic("test");
////        hzhAssist.setBloodwater("test");
//        List<HzhAssist> hzhAssists = hzhAssistService.selectHzhAssists(hzhAssist);
//        System.out.println(hzhAssists);
    }

    @Test
    public void generalTest(){
        HzhGeneral hzhGeneral = new HzhGeneral();
        hzhGeneral.setAdder("test");
        hzhGeneral.setAddress("test");
        hzhGeneral.setNation("test");
        System.out.println(hzhGeneral);
        generalService.insertHzhGeneral(hzhGeneral);
        System.out.println(generalService.selectHzhGeneral(hzhGeneral));
        hzhGeneral.setAdder("test new");
        hzhGeneral.setName("test  new3");
//        hzhGeneral.setId(136);
        System.out.println(hzhGeneral);
        hzhGeneralMapper.updateByPrimaryKeySelective(hzhGeneral);
    }

    @Test
    public void test(){
        HzhGeneral hzhGeneral = new HzhGeneral();
        hzhGeneral.setName("test  new2");
        generalService.selectHzhGeneral(hzhGeneral);
        System.out.println(hzhGeneralMapper.updateByPrimaryKeySelective(hzhGeneral));
        System.out.println(hzhGeneral);
    }

}
