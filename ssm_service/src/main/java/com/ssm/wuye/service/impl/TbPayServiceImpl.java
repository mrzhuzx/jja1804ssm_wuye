package com.ssm.wuye.service.impl;

import com.ssm.wuye.dao.PayChargeMapper;
import com.ssm.wuye.dao.TbPayMapper;
import com.ssm.wuye.domain.PayCharge;
import com.ssm.wuye.domain.PayChargeExample;
import com.ssm.wuye.domain.TbPay;
import com.ssm.wuye.service.TbPayService;
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
public class TbPayServiceImpl implements TbPayService {

    @Resource
    TbPayMapper payMapper;
    @Resource
    PayChargeMapper payChargeMapper;

    public List<PayCharge> selectByExample(Integer houseid,String chargename,Integer paystate){
        PayChargeExample payChargeExample=new PayChargeExample();


        payChargeExample.createCriteria().andHouseidEqualTo(houseid).andChargenameEqualTo(chargename).andPaystateEqualTo(paystate);
        List<PayCharge> payCharges = payChargeMapper.selectByExample(payChargeExample);
        return payCharges;
    }

    public int updateByPrimaryKeySelective(TbPay tbPay){
        return payMapper.updateByPrimaryKeySelective(tbPay);

    }




}
