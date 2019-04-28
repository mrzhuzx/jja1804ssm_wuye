package com.ssm.wuye.service.impl;

import com.ssm.wuye.dao.ChWaterMeterMapper;
import com.ssm.wuye.dao.MyHouseMapper;
import com.ssm.wuye.dao.SysOwerMapper;
import com.ssm.wuye.domain.*;
import com.ssm.wuye.service.ChWaterService;
import com.ssm.wuye.vo.WaterAndOwer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * time：2019/4/27--16:18
 * Author:蓝鑫杰
 * desc:
 * version:1.3.22
 */
@Service
public class ChWaterServiceImpl implements ChWaterService {
    @Resource
    ChWaterMeterMapper chWaterMeterMapper;
    @Resource
    MyHouseMapper myHouseMapper;
    @Resource
    SysOwerMapper sysOwerMapper;


    public List<ChWaterMeter> selectByExample(ChWaterMeterExample example) {
        return chWaterMeterMapper.selectByExample(example);
    }

    /**
     * 查询水费加用户信息
     * @return
     */
    public List<WaterAndOwer> selectAll() {
        List<ChWaterMeter> meterList = chWaterMeterMapper.selectByExample(null);
        List<WaterAndOwer> waterAndOwerList=new ArrayList<WaterAndOwer>();
        for (ChWaterMeter chWaterMeter : meterList) {
            MyHouseExample houseExample=new MyHouseExample();
            SysOwerExample owerExample=new SysOwerExample();
            WaterAndOwer wao=new WaterAndOwer();
            houseExample.createCriteria().andHidEqualTo(chWaterMeter.getHouseid());
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
            wao.setHouseid(chWaterMeter.getHouseid());
            wao.setMonth(chWaterMeter.getMonth());
            wao.setOlname(so.getOlname());
            wao.setOlphone(so.getOlphone());
            wao.setWaterid(chWaterMeter.getWaterid());
            wao.setWatervolume(chWaterMeter.getWatervolume());
            wao.setWnumber(chWaterMeter.getWnumber());
            waterAndOwerList.add(wao);
        }
        return waterAndOwerList;
    }
}
