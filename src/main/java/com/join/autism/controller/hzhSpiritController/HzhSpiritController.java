package com.join.autism.controller.hzhSpiritController;

import com.join.autism.entity.HzhSpirit.HzhSpirit;
import com.join.autism.entity.HzhSpirit.HzhSpiritDto;
import com.join.autism.service.hzhSpiritService.HzhSpiritService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * 精神和神经系统疾病的家族史
 * */
@RestController
@CrossOrigin
@RequestMapping("spirit")
public class HzhSpiritController {

    private final HzhSpiritService hzhSpiritService;

    public HzhSpiritController(HzhSpiritService hzhSpiritService) {
        this.hzhSpiritService = hzhSpiritService;
    }

    @RequestMapping("selectSpirit")
    public List<HzhSpiritDto> queryAll(HzhSpirit hzhSpirit){
        return hzhSpiritService.selectHzhSpirit(hzhSpirit);
    }

    @RequestMapping("insertSpirit")
    public void insertSpirit(HzhSpirit hzhSpirit){
        hzhSpiritService.insertHzhSpirit(hzhSpirit);
    }

    @RequestMapping("deleteSpirit")
    public void delSpirit(HzhSpirit hzhSpirit){
        hzhSpiritService.delHzhSpiritByPK(hzhSpirit.getId());
    }

    @RequestMapping("updateSpirit")
    public void update(HzhSpirit hzhSpirit){
        hzhSpiritService.updateHzhSpirit(hzhSpirit);
    }

    @RequestMapping("querySpiritWithParser")
    public List<HzhSpiritDto> queryAllSpiritAndParse(HzhSpirit hzhSpirit, HttpServletResponse resp) throws IOException {
        resp.setCharacterEncoding("utf-8");
        PrintWriter writer = resp.getWriter();
        try {
            writer.write(hzhSpiritService.queryAllSpirits(hzhSpirit));
            writer.flush();
            return null;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
