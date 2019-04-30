package com.ssm.wuye.service.impl;

import com.ssm.wuye.dao.TbMatterMapper;
import com.ssm.wuye.domain.TbMatter;
import com.ssm.wuye.domain.TbMatterExample;
import com.ssm.wuye.service.TbMatterService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * desc:
 * author :you
 * time: ${DatE}
 */
@Service
public class TbMatterServiceImpl implements TbMatterService {
    @Resource
    /*
     *查询总条数
     */
    TbMatterMapper tbMatterMapper;
    public long countByExample(TbMatterExample example) {
        return tbMatterMapper.countByExample(example);
    }
    /*
     *根据id删除
     */
    public int deleteByPrimaryKey(Integer  matterid) {
        return tbMatterMapper.deleteByPrimaryKey( matterid);
    }
    /*
     *增加
     */
    public int insertSelective(TbMatter record) {
        return tbMatterMapper.insertSelective(record);
    }
    /*
     *带条件查询
     */
    public List<TbMatter> selectByExample(TbMatterExample example) {
        return tbMatterMapper.selectByExample(example);
    }
    /*
     *带分页查询
     */
    public List<TbMatter> selectByExampleWithRowbounds(TbMatterExample example, RowBounds rowBounds) {
        return tbMatterMapper.selectByExampleWithRowbounds(example,rowBounds);
    }
    /*
     *查询一条数据
     */
    public TbMatter selectByPrimaryKey(Integer matterid) {
        return tbMatterMapper.selectByPrimaryKey(matterid);
    }
    /*
     *主键修改
     */
    public int updateByPrimaryKeySelective(TbMatter record) {
        return tbMatterMapper.updateByPrimaryKeySelective(record);
    }
}
