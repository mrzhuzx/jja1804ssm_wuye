package com.ssm.wuye.service;

import com.ssm.wuye.domain.TbCharge;
import com.ssm.wuye.domain.TbChargeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * time：2019/4/25--15:29
 * Author:蓝鑫杰
 * desc:
 * version:1.3.22
 */
public interface TbChargeService {
    /**
     * 多条件查询水电气收费标准
     * @param example
     * @return
     */
    List<TbCharge> selectByExample(TbChargeExample example);

    /**
     * 增加水电气费价格收费标准
     * @param tbCharge
     * @return
     */
    int insert(TbCharge tbCharge);

    /**
     * 多条件修改水电气费标准
     * @param tbCharge
     * @param example
     * @return
     */
    int updateByExampleSelective( TbCharge tbCharge, TbChargeExample example);
}
