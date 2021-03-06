package com.join.autism.service.hzhNerveService;

import com.join.autism.entity.HzhGeneral.HzhGeneral;
import com.join.autism.entity.HzhNerve.HzhNerve;
import com.join.autism.entity.HzhNerve.HzhNerveDto;

import java.util.List;

public interface HzhNerveService {
    List<HzhNerveDto> selectHzhNerve(HzhNerve hzhNerve,HzhGeneral hzhGeneral);
    HzhNerve selectHzhNerveByPK(Integer id);
    void insertHzhNerve(HzhNerve hzhNerve);
    void delHzhNerveByPK(Integer id);

    void updateNerve(HzhNerve hzhNerve);
}
