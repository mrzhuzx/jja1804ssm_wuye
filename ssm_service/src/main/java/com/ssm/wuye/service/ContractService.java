package com.ssm.wuye.service;

import com.ssm.wuye.domain.Contract;
import com.ssm.wuye.domain.ContractExample;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * desc:
 * author:lzp
 * {time}2019-4-25 10:25:46
 * version:1.2.3
 */
public interface ContractService {

    /*
     *查询总条数
     */
    long countByExample(ContractExample example);
    /*
     *根据id删除
     */
    int deleteByPrimaryKey(Integer contractid);
    /*
     *增加
     */
    int insertSelective(Contract record);
    /*
     *带条件查询
     */
    List<Contract> selectByExample(ContractExample example);
    /*
     *带分页查询
     */
    List<Contract> selectByExampleWithRowbounds(ContractExample example, RowBounds rowBounds);
    /*
     *查询一条数据
     */
    Contract selectByPrimaryKey(Integer contractid);
    /*
     *主键修改
     */
    int updateByPrimaryKeySelective(Contract record);


}
