package com.join.autism.service.hzhGeneralService;

import com.join.autism.entity.HzhGeneral.CriteriaSupportGeneral;
import com.join.autism.entity.HzhGeneral.HzhGeneral;

import java.util.List;

public interface HzhGeneralService {
    List<HzhGeneral> selectHzhGeneral(HzhGeneral hzhGeneral, CriteriaSupportGeneral criteriaSupportGeneral);
    HzhGeneral selectHzhGeneralByPK(Integer id);
    void insertHzhGeneral(HzhGeneral hzhGeneral,String[] pct);
    void delHzhGeneralByPK(Integer id);
    void updateGeneral(HzhGeneral hzhGeneral);
    void fuzzySearch(String key);
}
