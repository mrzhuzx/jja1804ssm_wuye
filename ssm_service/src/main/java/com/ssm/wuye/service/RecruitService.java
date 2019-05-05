package com.ssm.wuye.service;

import com.ssm.wuye.domain.Recruit;
import com.ssm.wuye.domain.RecruitExample;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * desc:
 * author:lzp
 * {time}
 * version:1.2.3
 */
public interface RecruitService {

    /*
     *查询总条数
     */
    long countByExample(RecruitExample example);
    /*
     *根据id删除
     */
    int deleteByPrimaryKey(Integer recruitid);
    /*
     *增加
     */
    int insertSelective(Recruit record);
    /*
     *带条件查询
     */
    List<Recruit> selectByExample(RecruitExample example);
    /*
     *带条件分页查询
     */
    List<Recruit> selectByExampleWithRowbounds(RecruitExample example, RowBounds rowBounds);
    /*
     *查询一条数据
     */
    Recruit selectByPrimaryKey(Integer recruitid);
    /*
     *主键修改
     */
    int updateByPrimaryKeySelective(Recruit record);

}
