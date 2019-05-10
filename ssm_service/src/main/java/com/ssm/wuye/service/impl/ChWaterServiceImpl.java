package com.ssm.wuye.service.impl;

import com.ssm.wuye.dao.*;
import com.ssm.wuye.domain.*;
import com.ssm.wuye.service.ChWaterService;
import com.ssm.wuye.vo.WaterAndOwer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
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
    @Resource
    TbPayMapper payMapper;
    @Resource
    TbChargeMapper tbChargeMapper;


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

    public ChWaterMeter selectByPrimaryKey(Integer waterid) {
        return chWaterMeterMapper.selectByPrimaryKey(waterid);
    }

    public int insertSelective(ChWaterMeter record) {
        TbPay tbPay=new TbPay();
        TbChargeExample tbChargeExample=new TbChargeExample();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        String year=sdf.format(record.getMonth());
        tbChargeExample.createCriteria().andChargenameEqualTo("水费").andChargeyearEqualTo(year);
        List<TbCharge> tbCharges = tbChargeMapper.selectByExample(tbChargeExample);
        TbCharge tbCharge=new TbCharge();
        for (TbCharge charge : tbCharges) {
            tbCharge=charge;
        }
        tbPay.setChargeid(tbCharge.getChargeid());
        tbPay.setChargestandard(tbCharge.getChargestandard()*record.getWatervolume());
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM");
        String month=sdf1.format(record.getMonth());
        tbPay.setPaymonth(month);
        tbPay.setHouseid(record.getHouseid());
        tbPay.setPaystate(0);
        payMapper.insertSelective(tbPay);
        return chWaterMeterMapper.insertSelective(record);
    }

    public int updateByExampleSelective(ChWaterMeter record, ChWaterMeterExample example) {
        return chWaterMeterMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int deleteByPrimaryKey(Integer waterid) {
        return chWaterMeterMapper.deleteByPrimaryKey(waterid);
    }
}
