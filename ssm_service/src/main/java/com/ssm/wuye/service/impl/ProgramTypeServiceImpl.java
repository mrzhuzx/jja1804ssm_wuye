package com.ssm.wuye.service.impl; /*
 *desc:
 *author:wjs
 *time:2019/5/6 0006
 *version:1.2.3
 */

import com.ssm.wuye.dao.ProgramTypeMapper;
import com.ssm.wuye.domain.ProgramType;
import com.ssm.wuye.domain.ProgramTypeExample;
import com.ssm.wuye.service.ProgramService;
import com.ssm.wuye.service.ProgramTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProgramTypeServiceImpl implements ProgramTypeService {

    @Resource
    ProgramTypeMapper programTypeMapper;

    /**
     * 获取一条数据
     * @param ptid
     * @return
     */
    @Override
    public ProgramType selectByPrimaryKey(Integer ptid) {
        return programTypeMapper.selectByPrimaryKey(ptid);
    }

    /**
     * 带条件查询
     * @param example
     * @return
     */
    @Override
    public List<ProgramType> selectByExample(ProgramTypeExample example) {
        return programTypeMapper.selectByExample(example);
    }
}
