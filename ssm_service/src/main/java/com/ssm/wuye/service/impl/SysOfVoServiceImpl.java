package com.ssm.wuye.service.impl;

import com.ssm.wuye.dao.SysOfVoMapper;
import com.ssm.wuye.dao.SysOwerMapper;
import com.ssm.wuye.domain.SysOfVo;
import com.ssm.wuye.domain.SysOfVoExample;
import com.ssm.wuye.service.SysOfVoService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class SysOfVoServiceImpl implements SysOfVoService {
    @Resource
    SysOfVoMapper sysOfVoMapper;


    public long countByExample(SysOfVoExample example) {
        return sysOfVoMapper.countByExample(example);
    }

    public List<SysOfVo> selectByExampleWithRowbounds(SysOfVoExample example, RowBounds rowBounds) {
        return sysOfVoMapper.selectByExampleWithRowbounds(example, rowBounds);
    }

    public List<SysOfVo> selectByExample(SysOfVoExample example) {
        return sysOfVoMapper.selectByExample(example);
    }
}
