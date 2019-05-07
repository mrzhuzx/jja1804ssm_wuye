package com.ssm.wuye.service;/*
 * desc:
 * author:tanghuaming
 * time:2019\5\7 0007
 */

import com.ssm.wuye.domain.PuGas;

import java.util.List;

public interface IGasService {
    List<PuGas> findAll();

    void delete(Integer id);

    PuGas findById(String id);

    void updata(PuGas electric);

    PuGas findIdMax();

    void add(PuGas electric);
}
