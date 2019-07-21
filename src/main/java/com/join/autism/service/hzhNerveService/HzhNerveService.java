package com.join.autism.service.hzhNerveService;

import com.join.autism.entity.HzhGeneral.HzhGeneral;
import com.join.autism.entity.HzhNerve.HzhNerve;

import java.util.List;

public interface HzhNerveService {
    List<HzhNerve> selectHzhNerve(HzhNerve hzhNerve);
    HzhNerve selectHzhNerveByPK(Integer id);
    void insertHzhNerve(HzhNerve hzhNerve);
    void delHzhNerveByPK(Integer id);
}
