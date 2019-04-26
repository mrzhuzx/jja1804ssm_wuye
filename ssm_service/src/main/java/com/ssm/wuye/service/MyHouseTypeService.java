package com.ssm.wuye.service;


import com.ssm.wuye.domain.MyHouseType;
import com.ssm.wuye.domain.MyHouseTypeExample;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface MyHouseTypeService {
    /*
     *查询总条数
     */
    long countByExample(MyHouseTypeExample example);
    /*
     *根据id删除
     */
    int deleteByPrimaryKey(Integer htypeid);
    /*
     *增加
     */
    int insertSelective(MyHouseType record);
    /*
     *带条件查询
     */
    List<MyHouseType> selectByExample(MyHouseTypeExample example);
    /*
     *带分页查询
     */
    List<MyHouseType> selectByExampleWithRowbounds(MyHouseTypeExample example, RowBounds rowBounds);
    /*
     *查询一条数据
     */
    MyHouseType selectByPrimaryKey(Integer htypeid);
    /*
     *主键修改
     */
    int updateByPrimaryKeySelective(MyHouseType record);
}
