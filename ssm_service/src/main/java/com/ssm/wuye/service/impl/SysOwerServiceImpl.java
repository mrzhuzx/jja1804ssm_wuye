package com.ssm.wuye.service.impl;

import com.ssm.wuye.dao.SysOwerMapper;
import com.ssm.wuye.domain.SysOwer;
import com.ssm.wuye.domain.SysOwerExample;
import com.ssm.wuye.service.SysOwerService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class SysOwerServiceImpl implements SysOwerService {
    @Resource
    SysOwerMapper sysOwerMapper;
    public long countByExample(SysOwerExample example) {
        return sysOwerMapper.countByExample(example);
    }

    public int deleteByPrimaryKey(Integer olid) {
        return sysOwerMapper.deleteByPrimaryKey(olid);
    }

    public int insertSelective(SysOwer record) {
        return sysOwerMapper.insertSelective(record);
    }

    public List<SysOwer> selectByExample(SysOwerExample example) {
        return sysOwerMapper.selectByExample(example);
    }

    public List<SysOwer> selectByExampleWithRowbounds(SysOwerExample example, RowBounds rowBounds) {
        return sysOwerMapper.selectByExampleWithRowbounds(example, rowBounds);
    }

    public SysOwer selectByPrimaryKey(Integer olid) {
        return sysOwerMapper.selectByPrimaryKey(olid);
    }

    public int updateByPrimaryKeySelective(SysOwer record) {
        return sysOwerMapper.updateByPrimaryKeySelective(record);
    }
}
