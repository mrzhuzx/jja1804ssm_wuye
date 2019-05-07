package com.ssm.wuye.service; /*
 *desc:
 *author:wjs
 *time:2019/5/6 0006
 *version:1.2.3
 */

import com.ssm.wuye.domain.ProgramType;
import com.ssm.wuye.domain.ProgramTypeExample;

import java.util.List;

public interface ProgramTypeService {

    /**
     * 查询一条数据
     * @param ptid
     * @return
     */
    ProgramType selectByPrimaryKey(Integer ptid);

    /**
     * 带条件查询
     * @param example
     * @return
     */
    List<ProgramType> selectByExample(ProgramTypeExample example);
}
