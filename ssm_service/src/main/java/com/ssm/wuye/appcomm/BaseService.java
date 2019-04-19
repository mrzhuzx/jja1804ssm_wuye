package com.ssm.wuye.appcomm;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

/**
 * desc:  方便业务层的抽象
 * author : tzhu
 * time :2019/4/18 0018
 * version: 1.2.3
 */
public interface BaseService<T> {
    /**
     * 条件下个数
     * @param example
     * @return
     */
    long countByExample(T example);

    /**
     * 删除数据
     * @param example
     * @return
     */
    int deleteByExample(T example);

    /**
     * 主键删除
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 添加
     * @param t
     * @return
     */
    int insert(T t);

    /**
     * 查询带分页
     * @param example
     * @param rowBounds
     * @return
     */
    List<T> selectByExampleWithRowbounds(T example, RowBounds rowBounds);

    /**
     * 多条件查询
     * @param example
     * @return
     */
    List<T> selectByExample(T example);

    /**
     * 主键返回一条数据
     * @param ntid
     * @return
     */
    T selectByPrimaryKey(Integer ntid);

    /**
     * 修改
     * @param t
     * @param example
     * @return
     */
    int updateByExampleSelective(T t,  T example);

    /**
     *
     * @param t
     * @param example
     * @return
     */
    int updateByExample( T t, T example);

    /**
     * 修改
     * @param t
     * @return
     */
    int updateByPrimaryKeySelective(T t);

    /**
     * 主键修改
     * @param t
     * @return
     */
    int updateByPrimaryKey(T t);



}
