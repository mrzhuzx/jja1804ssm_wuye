package com.ssm.wuye.service;


import com.ssm.wuye.domain.SysOwer;
import com.ssm.wuye.domain.SysOwerExample;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface SysOwerService {
    long countByExample(SysOwerExample example);
    /*
     *根据id删除
     */
    int deleteByPrimaryKey(Integer olid);
    /*
     *增加
     */
    int insertSelective(SysOwer record);
    /*
     *带条件查询
     */
    List<SysOwer> selectByExample(SysOwerExample example);
    /*
     *带分页查询
     */
    List<SysOwer> selectByExampleWithRowbounds(SysOwerExample example, RowBounds rowBounds);
    /*
     *查询一条数据
     */
    SysOwer selectByPrimaryKey(Integer olid);
    /*
     *主键修改
     */
    int updateByPrimaryKeySelective(SysOwer record);
}
