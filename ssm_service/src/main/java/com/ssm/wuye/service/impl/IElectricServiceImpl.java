package com.ssm.wuye.service.impl;/*
 * desc:
 * author:tanghuaming
 * time:2019\4\25 0025
 */

import com.ssm.wuye.dao.IElectricDao;
import com.ssm.wuye.domain.Electric;
import com.ssm.wuye.service.IElectricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class IElectricServiceImpl implements IElectricService {
    @Autowired
    private IElectricDao electricDao;


    @Override
    public List<Electric> findAll() {
        return electricDao.findAll();
    }

    @Override
    public void delete(Integer id) {
        electricDao.delete(id);
    }
}
