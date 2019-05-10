package com.ssm.wuye.service;

import com.ssm.wuye.domain.PayCharge;
import com.ssm.wuye.domain.TbPay;

import java.util.List;

/**
 * time：2019/4/27--16:28
 * Author:蓝鑫杰
 * desc:
 * version:1.3.22
 */
public interface TbPayService {
    List<PayCharge> selectByExample(Integer houseid, String chargename,Integer paystate);
    int updateByPrimaryKeySelective(TbPay tbPay);

}
