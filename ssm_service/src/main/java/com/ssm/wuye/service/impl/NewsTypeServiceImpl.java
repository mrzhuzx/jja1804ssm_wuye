package com.ssm.wuye.service.impl;

import com.ssm.wuye.dao.NewsTypeMapper;
import com.ssm.wuye.domain.NewsType;
import com.ssm.wuye.domain.NewsTypeExample;
import com.ssm.wuye.service.NewsTypeService;
import org.apache.ibatis.session.RowBounds;

import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

/**
 * desc:
 * author : tzhu
 * time :2019/4/18 0018
 * version: 1.2.3
 */
@Service
class NewsTypeServiceImpl  implements NewsTypeService {


    @Resource
    NewsTypeMapper newsTypeMapper;


    /**
     * 条件下个数
     *
     * @param example
     * @return
     */
    public long countByExample(NewsType example) {
        NewsTypeExample newsTypeExample=new NewsTypeExample();

        return newsTypeMapper.countByExample(newsTypeExample);
    }

    /**
     * 删除数据
     *
     * @param example
     * @return
     */
    public int deleteByExample(NewsType example) {

        NewsTypeExample newsTypeExample=new NewsTypeExample();

        return newsTypeMapper.deleteByExample(newsTypeExample);
    }

    /**
     * 主键删除
     *
     * @param id
     * @return
     */

    public int deleteByPrimaryKey(Integer id) {
        NewsTypeExample newsTypeExample=new NewsTypeExample();
        newsTypeExample.createCriteria().andNtidEqualTo(id);//where  ntid=?
        return newsTypeMapper.deleteByExample(newsTypeExample);
    }

    /**
     * 添加
     *
     * @param record
     * @return
     */
    public int insert(NewsType record) {

        return newsTypeMapper.insert(record);
    }

    /**
     * 查询带分页
     *
     * @param example
     * @param rowBounds
     * @return
     */
    public List<NewsType> selectByExampleWithRowbounds(NewsType example, RowBounds rowBounds) {

        NewsTypeExample newsTypeExample=new NewsTypeExample();

        return newsTypeMapper.selectByExampleWithRowbounds(newsTypeExample,rowBounds);
    }

    /**
     * 多条件查询
     *
     * @param example
     * @return
     */
    public List<NewsType> selectByExample(NewsType example) {

        NewsTypeExample newsTypeExample=new NewsTypeExample();

        return newsTypeMapper.selectByExample(newsTypeExample);
    }

    /**
     * 主键返回一条数据
     *
     * @param ntid
     * @return
     */
    public NewsType selectByPrimaryKey(Integer ntid) {


        return newsTypeMapper.selectByPrimaryKey(ntid);
    }

    /**
     * 修改
     *
     * @param record
     * @param example
     * @return
     */
    public int updateByExampleSelective(NewsType record, NewsType example) {

        NewsTypeExample newsTypeExample=new NewsTypeExample();
        //  record,newsTypeExample  ??
        return newsTypeMapper.updateByExampleSelective(record,newsTypeExample);
    }

    /**
     * @param record
     * @param example
     * @return
     */
    public int updateByExample(NewsType record, NewsType example) {
        NewsTypeExample newsTypeExample=new NewsTypeExample();
        //  record,newsTypeExample  ??
        return newsTypeMapper.updateByExampleSelective(record,newsTypeExample);
    }

    /**
     * 修改
     *
     * @param record
     * @return
     */
    public int updateByPrimaryKeySelective(NewsType record) {
        return newsTypeMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 主键修改
     *
     * @param record
     * @return
     */
    public int updateByPrimaryKey(NewsType record) {

        return newsTypeMapper.updateByPrimaryKey(record);
    }
}
