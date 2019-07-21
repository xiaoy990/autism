package com.join.autism.service.hzhInbornService;

import com.join.autism.entity.HzhInborn.HzhInborn;

import java.util.List;

public interface HzhInbornService {
    List<HzhInborn> selectHzhInborn(HzhInborn hzhInborn);
    HzhInborn selectHzhInbornByPK(Integer id);
    void insertHzhInborn(HzhInborn hzhInborn);
    void delHzhInbornByPK(Integer id);
    void updateInborn(HzhInborn hzhInborn);
}