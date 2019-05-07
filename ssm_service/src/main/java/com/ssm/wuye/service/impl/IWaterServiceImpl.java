package com.ssm.wuye.service.impl;/*
 * desc:
 * author:tanghuaming
 * time:2019\5\6 0006
 */

import com.ssm.wuye.dao.IWaterDao;
import com.ssm.wuye.domain.PuElectric;
import com.ssm.wuye.domain.PuWater;
import com.ssm.wuye.service.IWaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class IWaterServiceImpl implements IWaterService {
    @Autowired
     IWaterDao waterDao;
    @Override
    public List<PuWater> findAll() {
        return waterDao.findAll();
    }

    @Override
    public PuWater findById(String id) {
        return waterDao.findById(id);
    }

    @Override
    public void delete(Integer id) {
        waterDao.delete(id);
    }

    @Override
    public void updata(PuWater electric) {
//        System.out.println(electric.getMonth()+"----------");
        waterDao.updata(electric);
    }

    @Override
    public PuWater findIdMax() {
        return waterDao.findIdMax();
    }

    @Override
    public void add(PuWater electric) {
        waterDao.add(electric);
    }
}
