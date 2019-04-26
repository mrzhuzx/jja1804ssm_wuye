package com.ssm.wuye.service;

import com.ssm.wuye.domain.SysOfVo;
import com.ssm.wuye.domain.SysOfVoExample;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface SysOfVoService {
    long countByExample(SysOfVoExample example);

    List<SysOfVo> selectByExampleWithRowbounds(SysOfVoExample example, RowBounds rowBounds);

    List<SysOfVo> selectByExample(SysOfVoExample example);


}
