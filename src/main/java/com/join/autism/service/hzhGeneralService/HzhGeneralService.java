package com.join.autism.service.hzhGeneralService;

import com.join.autism.entity.HzhGeneral.HzhGeneral;

import java.util.List;

public interface HzhGeneralService {
    public List<HzhGeneral> selectHzhGeneral(HzhGeneral hzhGeneral);
    public HzhGeneral selectHzhAssistByPK(Integer id);
    public void insertHzhGeneral(HzhGeneral hzhGeneral);
    public void delHzhAssistByPK(Integer id);
}
