package com.ssm.wuye.service; /*
 *desc:
 *author:wjs
 *time:2019/4/30 0030
 *version:1.2.3
 */


import com.ssm.wuye.domain.ContractTypeExample;
import com.ssm.wuye.domain.Houqin;
import com.ssm.wuye.domain.HouqinExample;

import java.util.List;

public interface HouqinService {

    /*
     *带条件查询
     */
    List<Houqin> selectByExample(HouqinExample example);

    /*
     *查询总条数
     */
    long countByExample( ContractTypeExample example);

}
