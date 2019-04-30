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
public class NewsTypeServiceImpl implements NewsTypeService {


    @Resource
    NewsTypeMapper newsTypeMapper;


    /*
     *查询总 条数
     */
    public long countByExample(NewsTypeExample example) {
        return newsTypeMapper.countByExample(example);
    }

    /**
     * 删除数据
     *
     * @param cid
     * @return
     */
    public int deleteByExample(Integer cid) {
        return newsTypeMapper.deleteByPrimaryKey(cid);
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
    public List<NewsType> selectByExampleWithRowbounds(NewsTypeExample example, RowBounds rowBounds) {
        return newsTypeMapper.selectByExampleWithRowbounds(example,rowBounds);
    }

    /**
     * 多条件查询
     *
     * @param example
     * @return
     */
    public List<NewsType> selectByExample(NewsTypeExample example) {
        return newsTypeMapper.selectByExample(example);
    }

    /**
     * 主键返回一条数据
     *
     * @param tid
     * @return
     */
    public NewsType selectByPrimaryKey(Integer tid) {
        return newsTypeMapper.selectByPrimaryKey(tid);
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
}
