package com.ssm.wuye.service;

import com.ssm.wuye.domain.News;
import com.ssm.wuye.domain.NewsExample;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * desc:
 * author:zhs
 * time:2019-04-25  17:03:10
 */
public interface NewsService {

    /*
     *查询总 条数
     */
    long countByExample(NewsExample example);
    /**
     * 删除数据
     * @param cid
     * @return
     */
    int deleteByExample(Integer cid);




    /**
     * 添加
     * @param record
     * @return
     */
    int insert(News record);


    /**
     * 查询带分页
     * @param example
     * @param rowBounds
     * @return
     */
    List<News> selectByExampleWithRowbounds(NewsExample example, RowBounds rowBounds);


    /**
     * 多条件查询
     * @param example
     * @return
     */
    List<News> selectByExample(NewsExample example);


    /**
     * 主键返回一条数据
     * @param hid
     * @return
     */
    News selectByPrimaryKey(Integer hid);

    /**
     * 修改
     * @param
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(News record);



}
