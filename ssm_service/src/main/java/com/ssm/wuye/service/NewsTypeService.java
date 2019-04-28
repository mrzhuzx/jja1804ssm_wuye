package com.ssm.wuye.service;

import com.ssm.wuye.appcomm.BaseService;
import com.ssm.wuye.domain.NewsType;
import com.ssm.wuye.domain.NewsTypeExample;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * desc:  方法在
 * author : tzhu
 * time :2019/4/18 0018
 * version: 1.2.3
 */
public interface NewsTypeService {

    /*
     *查询总 条数
     */
    long countByExample(NewsTypeExample example);
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
    int insert(NewsType record);

    /**
     * 查询带分页
     * @param example
     * @param rowBounds
     * @return
     */
    List<NewsType> selectByExampleWithRowbounds(NewsTypeExample example, RowBounds rowBounds);

    /**
     * 多条件查询
     * @param example
     * @return
     */
    List<NewsType> selectByExample(NewsTypeExample example);


    /**
     * 主键返回一条数据
     * @param tid
     * @return
     */
    NewsType selectByPrimaryKey(Integer tid);

    /**
     * 修改
     * @param
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(NewsType record);





}
