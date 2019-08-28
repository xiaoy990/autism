package com.join.autism.service.hzhBirthService;

import com.join.autism.entity.HzhBirth.HzhBirth;
import com.join.autism.entity.HzhBirth.HzhBirthDto;
import com.join.autism.entity.HzhSpirit.HzhSpirit;

import java.util.List;

public interface HzhBirthService {
    List<HzhBirthDto> selectHzhBirth(HzhBirth hzhBirth);
    HzhBirth selectHzhBirthByPK(Integer id);
    void insertHzhBirth(HzhBirth hzhBirth);
    void delHzhBirthByPK(Integer id);
    void updateBirth(HzhBirth hzhBirth);
}
