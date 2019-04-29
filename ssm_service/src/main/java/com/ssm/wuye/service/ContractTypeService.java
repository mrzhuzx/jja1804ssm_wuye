package com.ssm.wuye.service;

import com.ssm.wuye.domain.ContractType;
import com.ssm.wuye.domain.ContractTypeExample;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * desc:
 * author:lzp
 * {time}
 * version:1.2.3
 */
public interface ContractTypeService {

    /*
     *查询总条数
     */
    long countByExample( ContractTypeExample example);
    /*
     *根据id删除
     */
    int deleteByPrimaryKey(Integer contypeid);
    /*
     *增加
     */
    int insertSelective(ContractType record);
    /*
     *带条件查询
     */
    List<ContractType> selectByExample(ContractTypeExample example);
    /*
     *带条件分页查询
     */
    List<ContractType> selectByExampleWithRowbounds(ContractTypeExample example, RowBounds rowBounds);
    /*
     *查询一条数据
     */
    ContractType selectByPrimaryKey(Integer contypeid);
    /*
     *主键修改
     */
    int updateByPrimaryKeySelective(ContractType record);



}
