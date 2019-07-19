package com.join.autism.service.HzhAssistService;

import com.join.autism.entity.HzhAssist.HzhAssist;

import java.util.List;

public interface HzhAssistService {

    public List<HzhAssist> selectHzhAssists(HzhAssist hzhAssist);
    public HzhAssist selectHzhAssistByPK(Integer id);
    public void insertHzhAssist(HzhAssist hzhAssist);
    public void delHzhAssistByPK(Integer id);
}
