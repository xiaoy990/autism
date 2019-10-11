package com.join.autism.service.hzhRtmService;

import com.join.autism.entity.HzhGeneral.HzhGeneral;
import com.join.autism.entity.HzhRtm.HzhRtm;
import com.join.autism.entity.HzhRtm.HzhRtmDto;

import java.util.List;

public interface HzhRtmService {
    List<HzhRtmDto> selectHzhRtm(HzhRtm hzhRtm, HzhGeneral hzhGeneral);
    HzhRtm selectHzhRtmByPK(Integer id);
    void insertHzhRtm(HzhRtm hzhRtm);
    void delHzhRtmByPK(Integer id);
    void updateHzhRtm(HzhRtm hzhRtm);
}
