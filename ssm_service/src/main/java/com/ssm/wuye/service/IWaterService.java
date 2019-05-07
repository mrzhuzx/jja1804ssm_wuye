package com.ssm.wuye.service;/*
 * desc:
 * author:tanghuaming
 * time:2019\5\6 0006
 */

import com.ssm.wuye.domain.PuElectric;
import com.ssm.wuye.domain.PuWater;

import java.util.List;

public interface IWaterService {
    List<PuWater> findAll();

    PuWater findById(String id);

    void delete(Integer id);

    void updata(PuWater electric);

    PuWater findIdMax();

    void add(PuWater electric);
}
