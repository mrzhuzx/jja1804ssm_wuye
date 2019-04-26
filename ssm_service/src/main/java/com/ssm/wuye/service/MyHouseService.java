package com.ssm.wuye.service;


import com.ssm.wuye.domain.MyHouse;
import com.ssm.wuye.domain.MyHouseExample;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface MyHouseService  {

    /*
    *查询总条数
     */
    long countByExample(MyHouseExample example);
    /*
    *根据id删除
     */
    int deleteByPrimaryKey(Integer hid);
    /*
    *增加
    */
    int insertSelective(MyHouse record);
    /*
    *带条件查询
     */
    List<MyHouse> selectByExample(MyHouseExample example);
    /*
    *带分页查询
     */
    List<MyHouse> selectByExampleWithRowbounds(MyHouseExample example, RowBounds rowBounds);
    /*
    *查询一条数据
     */
    MyHouse selectByPrimaryKey(Integer hid);
    /*
    *主键修改
     */
    int updateByPrimaryKeySelective(MyHouse record);
}
