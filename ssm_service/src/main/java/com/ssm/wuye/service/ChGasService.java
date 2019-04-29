package com.ssm.wuye.service;

import com.ssm.wuye.domain.ChGasMeter;
import com.ssm.wuye.domain.ChGasMeterExample;
import com.ssm.wuye.vo.GasAndOwer;


import java.util.List;

/**
 * time：2019/4/27--16:16
 * Author:蓝鑫杰
 * desc:
 * version:1.3.22
 */
public interface ChGasService {
    List<ChGasMeter> selectByExample(ChGasMeterExample example);

    List<GasAndOwer> selectAll();
}
