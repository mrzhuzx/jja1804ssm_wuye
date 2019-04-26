package com.ssm.wuye.service;/*
 * desc:
 * author:tanghuaming
 * time:2019\4\25 0025
 */

import com.ssm.wuye.domain.Electric;

import java.util.List;

public interface IElectricService {

    List<Electric> findAll();

    void delete(Integer id);

    Electric findById(String id);

    void updata(Electric electric);

    void add(Electric electric);


    List<Integer> findAllhouseid();
}
