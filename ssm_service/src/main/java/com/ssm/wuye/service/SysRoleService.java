package com.ssm.wuye.service;

import com.ssm.wuye.domain.SysRole;
import com.ssm.wuye.domain.SysRoleExample;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * desc:
 * author:lzp
 * {time}
 * version:1.2.3
 */
public interface SysRoleService {

    /*
     *查询总条数
     */
    long countByExample(SysRoleExample example);
    /*
     *根据id删除
     */
    int deleteByPrimaryKey(Integer roleid);
    /*
     *增加
     */
    int insertSelective(SysRole record);
    /*
     *带条件查询
     */
    List<SysRole> selectByExample(SysRoleExample example);
    /*
     *带条件分页查询
     */
    List<SysRole> selectByExampleWithRowbounds(SysRoleExample example, RowBounds rowBounds);
    /*
     *查询一条数据
     */
    SysRole selectByPrimaryKey(Integer roleid);
    /*
     *主键修改
     */
    int updateByPrimaryKeySelective(SysRole record);

 }
