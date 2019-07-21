package com.join.autism.service.hzhRtmService;

import com.join.autism.entity.HzhRtm.HzhRtm;

import java.util.List;

public interface HzhRtmService {
    List<HzhRtm> selectHzhRtm(HzhRtm hzhRtm);
    HzhRtm selectHzhRtmByPK(Integer id);
    void insertHzhRtm(HzhRtm hzhRtm);
    void delHzhRtmByPK(Integer id);
    void updateHzhRtm(HzhRtm hzhRtm);
}
