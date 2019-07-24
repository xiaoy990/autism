package com.join.autism;

import com.join.autism.entity.HzhGeneral.CriteriaSupportGeneral;
import com.join.autism.entity.HzhGeneral.HzhGeneral;
import com.join.autism.service.hzhGeneralService.HzhGeneralService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AutismApplicationTests {

    @Autowired
    HzhGeneralService hzhGeneralService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void test(){
        HzhGeneral hzhGeneral = new HzhGeneral();
        hzhGeneral.setName("1");
        List<HzhGeneral> hzhGenerals = hzhGeneralService.selectHzhGeneral(hzhGeneral, new CriteriaSupportGeneral());
        System.out.println(hzhGenerals);
    }

}
