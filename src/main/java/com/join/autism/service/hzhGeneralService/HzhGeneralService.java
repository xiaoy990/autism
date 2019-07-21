package com.join.autism.service.hzhGeneralService;

import com.join.autism.entity.HzhGeneral.HzhGeneral;

import java.util.List;

public interface HzhGeneralService {
    public List<HzhGeneral> selectHzhGeneral(HzhGeneral hzhGeneral);
    public HzhGeneral selectHzhGeneralByPK(Integer id);
    public void insertHzhGeneral(HzhGeneral hzhGeneral);
    public void delHzhGeneralByPK(Integer id);
    public void updateGeneral(HzhGeneral hzhGeneral);
}
