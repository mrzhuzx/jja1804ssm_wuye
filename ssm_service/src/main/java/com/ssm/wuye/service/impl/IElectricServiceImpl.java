package com.ssm.wuye.service.impl;/*
 * desc:
 * author:tanghuaming
 * time:2019\4\25 0025
 */


import com.ssm.wuye.dao.IElectricDao;
import com.ssm.wuye.domain.PuElectric;
import com.ssm.wuye.service.IElectricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class IElectricServiceImpl implements IElectricService {
    @Autowired
    private IElectricDao electricDao;



    public List<PuElectric> findAll() {
        return electricDao.findAll();
    }


    public void delete(Integer id) {
        electricDao.delete(id);
    }


    public PuElectric findById(String Id) {
        return electricDao.findById(Id);
    }


    public void updata(PuElectric puElectric) {
         electricDao.updata(puElectric);
    }


    public void add(PuElectric puElectric) {
        electricDao.add(puElectric);
    }


    public List<Integer> findAllhouseid() {
        return electricDao.findAllhouseid();
    }

    @Override
    public PuElectric findIdMax() {
        return electricDao.findIdMax();
    }
}
