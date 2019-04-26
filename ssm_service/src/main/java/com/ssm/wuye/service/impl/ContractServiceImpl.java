package com.ssm.wuye.service.impl;

import com.ssm.wuye.dao.ContractMapper;
import com.ssm.wuye.domain.Contract;
import com.ssm.wuye.domain.ContractExample;
import com.ssm.wuye.service.ContractService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * desc:
 * author:lzp
 * {time}
 * version:1.2.3
 */

@Service
public class ContractServiceImpl implements ContractService {


    @Resource
    ContractMapper contractMapper;

    public long countByExample(ContractExample example) {
        return contractMapper.countByExample(example);
    }

    public int deleteByPrimaryKey(Integer contractid) {
        return contractMapper.deleteByPrimaryKey(contractid);
    }

    public int insertSelective(Contract record) {
        return contractMapper.insertSelective(record);
    }

    public List<Contract> selectByExample(ContractExample example) {

        return contractMapper.selectByExample(example);
    }

    public List<Contract> selectByExampleWithRowbounds(ContractExample example, RowBounds rowBounds) {
        return contractMapper.selectByExampleWithRowbounds(example,rowBounds);
    }

    public Contract selectByPrimaryKey(Integer contractid) {
        return contractMapper.selectByPrimaryKey(contractid);
    }

    public int updateByPrimaryKeySelective(Contract record) {
        return contractMapper.updateByPrimaryKeySelective(record);
    }
}
