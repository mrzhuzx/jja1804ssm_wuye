package com.ssm.wuye.service.impl;

import com.ssm.wuye.dao.NewsMapper;
import com.ssm.wuye.domain.News;
import com.ssm.wuye.domain.NewsExample;
import com.ssm.wuye.service.NewsService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * desc:
 * author:zhs
 * time:time
 */
@Service
public class NewsServiceImpl implements NewsService {
    @Resource
    NewsMapper  newsMapper;
    /*
     *查询总 条数
     */
    public long countByExample(NewsExample example) {
        return newsMapper.countByExample(example);
    }

    /**
     * 删除数据
     *
     * @param cid
     * @return
     */
    public int deleteByExample(Integer cid) {
        return newsMapper.deleteByPrimaryKey(cid);
    }

    /**
     * 添加
     *
     * @param record
     * @return
     */
    public int insert(News record) {
        return newsMapper.insert(record);
    }

    /**
     * 查询带分页
     *
     * @param example
     * @param rowBounds
     * @return
     */
    public List<News> selectByExampleWithRowbounds(NewsExample example, RowBounds rowBounds) {
        return newsMapper.selectByExampleWithRowbounds(example,rowBounds);
    }

    /**
     * 多条件查询
     *
     * @param example
     * @return
     */
    public List<News> selectByExample(NewsExample example) {
        return newsMapper.selectByExample(example);
    }

    /**
     * 主键返回一条数据
     *
     * @param hid
     * @return
     */
    public News selectByPrimaryKey(Integer hid) {
        return newsMapper.selectByPrimaryKey(hid);
    }

    /**
     * 修改
     *
     * @param record
     * @return
     */
    public int updateByPrimaryKeySelective(News record) {
        return newsMapper.updateByPrimaryKeySelective(record);
    }
}
