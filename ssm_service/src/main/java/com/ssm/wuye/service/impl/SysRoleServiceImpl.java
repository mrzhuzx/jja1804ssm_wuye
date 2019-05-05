package com.ssm.wuye.service.impl;

import com.ssm.wuye.dao.SysRoleMapper;
import com.ssm.wuye.domain.SysRole;
import com.ssm.wuye.domain.SysRoleExample;
import com.ssm.wuye.service.SysRoleService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * desc:
 * author:lzp
 * {time}
 * version:1.2.3
 */
@Service
public class SysRoleServiceImpl  implements SysRoleService {
    @Resource
    SysRoleMapper sysRoleMapper;

    public long countByExample(SysRoleExample example) {
        return sysRoleMapper.countByExample(example);
    }

    public int deleteByPrimaryKey(Integer roleid) {
        return sysRoleMapper.deleteByPrimaryKey(roleid);
    }

    public int insertSelective(SysRole record) {
        return sysRoleMapper.insertSelective(record);
    }

    public List<SysRole> selectByExample(SysRoleExample example) {
        return sysRoleMapper.selectByExample(example);
    }

    public List<SysRole> selectByExampleWithRowbounds(SysRoleExample example, RowBounds rowBounds) {
        return sysRoleMapper.selectByExampleWithRowbounds(example,rowBounds);
    }

    public SysRole selectByPrimaryKey(Integer roleid) {
        return sysRoleMapper.selectByPrimaryKey(roleid);
    }

    public int updateByPrimaryKeySelective(SysRole record) {
        return sysRoleMapper.updateByPrimaryKeySelective(record);
    }
}
