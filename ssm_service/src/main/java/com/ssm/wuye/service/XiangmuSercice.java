package com.ssm.wuye.service; /*
 *desc:
 *author:wjs
 *time:2019/5/5 0005
 *version:1.2.3
 */

import com.ssm.wuye.domain.Xiangmu;
import com.ssm.wuye.domain.XiangmuExample;

import java.util.List;

public interface XiangmuSercice {

    /*
     *视图带条件查询
     */
    List<Xiangmu> selectByExample(XiangmuExample example);
}
