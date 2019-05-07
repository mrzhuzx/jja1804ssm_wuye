package com.ssm.wuye.service.impl;/*
 * desc:
 * author:tanghuaming
 * time:2019\5\7 0007
 */

import com.ssm.wuye.dao.IGasDao;
import com.ssm.wuye.domain.PuGas;
import com.ssm.wuye.service.IGasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class IGasServiceImpl implements IGasService {

    @Autowired
    IGasDao gasDao;
    @Override
    public List<PuGas> findAll() {
        return gasDao.findAll();
    }

    @Override
    public void delete(Integer id) {
        gasDao.delete(id);
    }

    @Override
    public PuGas findById(String id) {
        return gasDao.findById(id);
    }

    @Override
    public void updata(PuGas electric) {
        gasDao.updata(electric);
    }

    @Override
    public PuGas findIdMax() {
        return gasDao.findIdMax();
    }

    @Override
    public void add(PuGas electric) {
        gasDao.add(electric);
    }
}
