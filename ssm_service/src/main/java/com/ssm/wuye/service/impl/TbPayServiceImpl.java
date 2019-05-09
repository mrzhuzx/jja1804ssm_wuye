package com.ssm.wuye.service.impl;

import com.ssm.wuye.dao.*;
import com.ssm.wuye.domain.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * time：2019/4/27--16:28
 * Author:蓝鑫杰
 * desc:
 * version:1.3.22
 */
@Service
public class TbPayServiceImpl {
    @Resource
    HouseGasVoMapper houseGasVoMapper;
    @Resource
    HouseElectricVoMapper houseElectricVoMapper;
    @Resource
    HouseWaterVoMapper houseWaterVoMapper;
    @Resource
    TbChargeMapper tbChargeMapper;
    @Resource
    TbPayMapper tbPayMapper;

    public List<HouseWaterVo> searchWaterByHid(Integer hid){
        HouseWaterVoExample example=new HouseWaterVoExample();

        example.createCriteria().andHidEqualTo(hid);
        List<HouseWaterVo> houseWaterVos = houseWaterVoMapper.selectByExample(example);

        return houseWaterVos;
    }

    public List<HouseGasVo> searchGasByHid(Integer hid){
        HouseGasVoExample example=new HouseGasVoExample();
        example.createCriteria().andHidEqualTo(hid);
        List<HouseGasVo> houseGasVos = houseGasVoMapper.selectByExample(example);
        return houseGasVos;
    }

    public List<HouseElectricVo> searchElectricByHid(Integer hid){
        HouseElectricVoExample example=new HouseElectricVoExample();
        example.createCriteria().andHidEqualTo(hid);
        List<HouseElectricVo> houseElectricVos = houseElectricVoMapper.selectByExample(example);
        return houseElectricVos;
    }


}
