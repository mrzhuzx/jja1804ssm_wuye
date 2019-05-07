package com.ssm.wuye.service;/*
 * desc:
 * author:tanghuaming
 * time:2019\4\25 0025
 */

import com.ssm.wuye.domain.PuElectric;

import java.util.List;

public interface IElectricService {

    List<PuElectric> findAll();

    void delete(Integer id);

    PuElectric findById(String id);

    void updata(PuElectric puElectric);

    void add(PuElectric puElectric);


    List<Integer> findAllhouseid();

    PuElectric findIdMax();
}
