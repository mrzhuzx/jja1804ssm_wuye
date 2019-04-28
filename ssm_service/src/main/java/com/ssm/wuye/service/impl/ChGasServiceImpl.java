package com.ssm.wuye.service.impl;

import com.ssm.wuye.dao.ChGasMeterMapper;
import com.ssm.wuye.dao.MyHouseMapper;
import com.ssm.wuye.dao.SysOwerMapper;
import com.ssm.wuye.domain.*;
import com.ssm.wuye.service.ChGasService;
import com.ssm.wuye.vo.GasAndOwer;
import com.ssm.wuye.vo.WaterAndOwer;
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
public class ChGasServiceImpl implements ChGasService {
    @Resource
    ChGasMeterMapper chGasMeterMapper;
    @Resource
    MyHouseMapper myHouseMapper;
    @Resource
    SysOwerMapper sysOwerMapper;

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
}
