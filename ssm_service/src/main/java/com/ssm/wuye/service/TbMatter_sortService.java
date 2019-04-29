package com.ssm.wuye.service;

import com.ssm.wuye.domain.MyHouse;
import com.ssm.wuye.domain.MyHouseExample;
import com.ssm.wuye.domain.TbMatter_sort;
import com.ssm.wuye.domain.TbMatter_sortExample;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * desc:
 * author :you
 * time: ${DatE}
 */
public interface TbMatter_sortService {

    /*
     *根据id删除
     */
    int deleteByPrimaryKey(Integer mattersortid);
    /*
     *增加
     */
    int insertSelective(TbMatter_sort record);
    /*
     *带条件查询
     */
    List<TbMatter_sort> selectByExample(TbMatter_sortExample example);
    /*
     *带分页查询
     */
    List<TbMatter_sort> selectByExampleWithRowbounds(TbMatter_sortExample example, RowBounds rowBounds);
    /*
     *查询一条数据
     */
    TbMatter_sort selectByPrimaryKey(Integer mattersortid);
    /*
     *主键修改
     */
    int updateByPrimaryKeySelective(TbMatter_sort record);
}
