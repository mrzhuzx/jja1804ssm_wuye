package com.ssm.wuye.service.impl;

import com.ssm.wuye.dao.ChElectricMeterMapper;
import com.ssm.wuye.dao.MyHouseMapper;
import com.ssm.wuye.dao.SysOwerMapper;
import com.ssm.wuye.domain.*;

import com.ssm.wuye.service.ChElectricService;
import com.ssm.wuye.vo.ElectricAndOwer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * time：2019/4/27--16:17
 * Author:蓝鑫杰
 * desc:
 * version:1.3.22
 */

@Service
public class ChElectricSerciceImpl implements ChElectricService {
    @Resource
    ChElectricMeterMapper chElectricMeterMapper;
    @Resource
    MyHouseMapper myHouseMapper;
    @Resource
    SysOwerMapper sysOwerMapper;

    public List<ChElectricMeter> selectByExample(ChElectricMeterExample example) {
        return chElectricMeterMapper.selectByExample(example);
    }

    public ChElectricMeter selectByPrimaryKey(Integer electricid) {
        return chElectricMeterMapper.selectByPrimaryKey(electricid);
    }

    public int insertSelective(ChElectricMeter record) {
        return chElectricMeterMapper.insertSelective(record);
    }

    public List<ElectricAndOwer> selectAll() {

        List<ChElectricMeter> meterList = chElectricMeterMapper.selectByExample(null);
        List<ElectricAndOwer> electricAndOwers=new ArrayList<ElectricAndOwer>();
        for (ChElectricMeter chElectricMeter : meterList) {
            MyHouseExample houseExample=new MyHouseExample();
            SysOwerExample owerExample=new SysOwerExample();
            ElectricAndOwer eao=new ElectricAndOwer();
            houseExample.createCriteria().andHidEqualTo(chElectricMeter.getHouseid());
            List<MyHouse> myHouses = myHouseMapper.selectByExample(houseExample);
            MyHouse mh=new MyHouse();
            SysOwer so=new SysOwer();
            for (MyHouse myHouse : myHouses) {
                mh=myHouse;

            }

            owerExample.createCriteria().andOlidEqualTo(mh.getOlid());
            List<SysOwer> sysOwers = sysOwerMapper.selectByExample(owerExample);
            for (SysOwer sysOwer : sysOwers) {
                so=sysOwer;
            }
            eao.setHouseid(chElectricMeter.getHouseid());
            eao.setMonth(chElectricMeter.getMonth());
            eao.setOlname(so.getOlname());
            eao.setOlphone(so.getOlphone());
            eao.setElectric(chElectricMeter.getElectric());
            eao.setEnumber(chElectricMeter.getEnumber());
            eao.setElectricid(chElectricMeter.getElectricid());
            electricAndOwers.add(eao);
        }
        return electricAndOwers;
    }

    public int updateByExampleSelective(ChElectricMeter record,ChElectricMeterExample example) {
        return chElectricMeterMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int deleteByPrimaryKey(Integer electricid) {
        return chElectricMeterMapper.deleteByPrimaryKey(electricid);
    }
}
