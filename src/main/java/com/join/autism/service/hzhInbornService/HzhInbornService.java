package com.join.autism.service.hzhInbornService;

import com.join.autism.entity.HzhGeneral.HzhGeneral;
import com.join.autism.entity.HzhInborn.HzhInbornDto;
import com.join.autism.entity.HzhInborn.HzhInborn;

import java.util.List;

public interface HzhInbornService {
    List<HzhInbornDto> selectHzhInborn(HzhInborn hzhInborn, HzhGeneral hzhGeneral);
    HzhInborn selectHzhInbornByPK(Integer id);
    void insertHzhInborn(HzhInborn hzhInborn);
    void delHzhInbornByPK(Integer id);
    void updateInborn(HzhInborn hzhInborn);
}
