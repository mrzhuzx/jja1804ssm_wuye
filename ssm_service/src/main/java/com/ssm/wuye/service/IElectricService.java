package com.ssm.wuye.service;/*
 * desc:
 * author:tanghuaming
 * time:2019\4\25 0025
 */

import com.ssm.wuye.domain.Electric;
import com.ssm.wuye.domain.PuElectric;

import java.util.List;

public interface IElectricService {

    List<PuElectric> findAll();

    void delete(Integer id);

    PuElectric findById(String id);

    void updata(Electric electric);

    void add(Electric electric);


    List<Integer> findAllhouseid();
}
