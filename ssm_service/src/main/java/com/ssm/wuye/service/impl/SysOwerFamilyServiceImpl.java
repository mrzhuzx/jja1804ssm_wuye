package com.ssm.wuye.service.impl;

import com.ssm.wuye.dao.SysOwerFamilyMapper;
import com.ssm.wuye.domain.SysOwerFamily;
import com.ssm.wuye.domain.SysOwerFamilyExample;
import com.ssm.wuye.service.SysOwerFamilyService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class SysOwerFamilyServiceImpl implements SysOwerFamilyService {
    @Resource
    SysOwerFamilyMapper sysOwerFamilyMapper;
    public long countByExample(SysOwerFamilyExample example) {
        return sysOwerFamilyMapper.countByExample(example);
    }

    public int deleteByPrimaryKey(Integer ofid) {
        return sysOwerFamilyMapper.deleteByPrimaryKey(ofid);
    }

    public int insertSelective(SysOwerFamily record) {
        return sysOwerFamilyMapper.insertSelective(record);
    }

    public List<SysOwerFamily> selectByExample(SysOwerFamilyExample example) {
        return sysOwerFamilyMapper.selectByExample(example);
    }

    public List<SysOwerFamily> selectByExampleWithRowbounds(SysOwerFamilyExample example, RowBounds rowBounds) {
        return sysOwerFamilyMapper.selectByExampleWithRowbounds(example, rowBounds);
    }

    public SysOwerFamily selectByPrimaryKey(Integer ofid) {
        return sysOwerFamilyMapper.selectByPrimaryKey(ofid);
    }

    public int updateByPrimaryKeySelective(SysOwerFamily record) {
        return sysOwerFamilyMapper.updateByPrimaryKeySelective(record);
    }
}
