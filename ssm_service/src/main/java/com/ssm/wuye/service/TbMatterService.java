package com.ssm.wuye.service;

import com.ssm.wuye.domain.TbMatter;
import com.ssm.wuye.domain.TbMatterExample;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * desc:
 * author :you
 * time: ${DatE}
 */
public interface TbMatterService {
    /*
     *查询总条数
     */
    long countByExample(TbMatterExample example);
    /*
     *根据id删除
     */
    int deleteByPrimaryKey(Integer  matterid);
    /*
     *增加
     */
    int insertSelective(TbMatter record);
    /*
     *带条件查询
     */
    List<TbMatter> selectByExample(TbMatterExample example);
    /*
     *带分页查询
     */
    List<TbMatter> selectByExampleWithRowbounds(TbMatterExample example, RowBounds rowBounds);
    /*
     *查询一条数据
     */
    TbMatter selectByPrimaryKey(Integer matterid);
    /*
     *主键修改
     */
    int updateByPrimaryKeySelective(TbMatter record);

}
