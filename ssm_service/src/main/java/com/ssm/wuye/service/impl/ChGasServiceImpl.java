package com.ssm.wuye.service.impl;

import com.ssm.wuye.dao.*;
import com.ssm.wuye.domain.*;
import com.ssm.wuye.service.ChGasService;
import com.ssm.wuye.vo.GasAndOwer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * time：2019/4/27--16:17
 * Author:蓝鑫杰
 * desc:
 * version:1.3.22
 */
@Service
public class ChGasServiceImpl implements ChGasService {
    @Resource
    ChGasMeterMapper chGasMeterMapper;
    @Resource
    MyHouseMapper myHouseMapper;
    @Resource
    SysOwerMapper sysOwerMapper;
    @Resource
    TbPayMapper payMapper;
    @Resource
    TbChargeMapper tbChargeMapper;

    public List<ChGasMeter> selectByExample(ChGasMeterExample example) {
        return chGasMeterMapper.selectByExample(example);
    }

    public List<GasAndOwer> selectAll() {
        List<ChGasMeter> meterList = chGasMeterMapper.selectByExample(null);
        List<GasAndOwer> gasAndOwers=new ArrayList<GasAndOwer>();
        for (ChGasMeter chGasMeter : meterList) {
            MyHouseExample houseExample=new MyHouseExample();
            SysOwerExample owerExample=new SysOwerExample();
            GasAndOwer gao=new GasAndOwer();
            houseExample.createCriteria().andHidEqualTo(chGasMeter.getHouseid());
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
            gao.setHouseid(chGasMeter.getHouseid());
            gao.setMonth(chGasMeter.getMonth());
            gao.setOlname(so.getOlname());
            gao.setOlphone(so.getOlphone());
            gao.setGas(chGasMeter.getGas());
            gao.setGasnumber(chGasMeter.getGasnumber());
            gao.setId(chGasMeter.getId());
            gasAndOwers.add(gao);
        }
        return gasAndOwers;
    }

    public ChGasMeter selectByPrimaryKey(Integer id) {
        return chGasMeterMapper.selectByPrimaryKey(id);
    }

    public int insertSelective(ChGasMeter record) {
        TbPay tbPay=new TbPay();
        TbChargeExample tbChargeExample=new TbChargeExample();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        String year=sdf.format(record.getMonth());
        tbChargeExample.createCriteria().andChargenameEqualTo("燃气费").andChargeyearEqualTo(year);
        List<TbCharge> tbCharges = tbChargeMapper.selectByExample(tbChargeExample);
        TbCharge tbCharge=new TbCharge();
        for (TbCharge charge : tbCharges) {
            tbCharge=charge;
        }
        tbPay.setChargeid(tbCharge.getChargeid());
        tbPay.setChargestandard(tbCharge.getChargestandard()*record.getGas());
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM");
        String month=sdf1.format(record.getMonth());
        tbPay.setPaymonth(month);
        tbPay.setHouseid(record.getHouseid());
        tbPay.setPaystate(0);
        payMapper.insertSelective(tbPay);
        return chGasMeterMapper.insertSelective(record);
    }

    public int updateByExampleSelective(ChGasMeter record, ChGasMeterExample example) {
        return chGasMeterMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return chGasMeterMapper.deleteByPrimaryKey(id);
    }
}
