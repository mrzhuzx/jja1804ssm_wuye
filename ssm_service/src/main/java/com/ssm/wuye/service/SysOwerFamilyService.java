package com.ssm.wuye.service;


import com.ssm.wuye.domain.SysOwerFamily;
import com.ssm.wuye.domain.SysOwerFamilyExample;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface SysOwerFamilyService {
    long countByExample(SysOwerFamilyExample example);
    /*
     *根据id删除
     */
    int deleteByPrimaryKey(Integer ofid);
    /*
     *增加
     */
    int insertSelective(SysOwerFamily record);
    /*
     *带条件查询
     */
    List<SysOwerFamily> selectByExample(SysOwerFamilyExample example);
    /*
     *带分页查询
     */
    List<SysOwerFamily> selectByExampleWithRowbounds(SysOwerFamilyExample example, RowBounds rowBounds);
    /*
     *查询一条数据
     */
    SysOwerFamily selectByPrimaryKey(Integer ofid);
    /*
     *主键修改
     */
    int updateByPrimaryKeySelective(SysOwerFamily record);
}
