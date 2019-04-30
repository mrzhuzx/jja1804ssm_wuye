package com.ssm.wuye.service.impl;

import com.ssm.wuye.dao.TbChargeMapper;
import com.ssm.wuye.domain.TbCharge;
import com.ssm.wuye.domain.TbChargeExample;
import com.ssm.wuye.service.TbChargeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * time：2019/4/25--15:33
 * Author:蓝鑫杰
 * desc:
 * version:1.3.22
 */
@Service
public class TbChargeServiceImpl implements TbChargeService {

    @Resource
    TbChargeMapper tbChargeMapper;


    public List<TbCharge> selectByExample(TbChargeExample example) {

        return tbChargeMapper.selectByExample(example);
    }

    public int insert(TbCharge tbCharge) {
        return tbChargeMapper.insert(tbCharge);
    }

    public int updateByExampleSelective(TbCharge tbCharge, TbChargeExample example) {
        return tbChargeMapper.updateByExampleSelective(tbCharge,example);
    }
}
