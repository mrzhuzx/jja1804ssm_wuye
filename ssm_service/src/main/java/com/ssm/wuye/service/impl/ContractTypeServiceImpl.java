package com.ssm.wuye.service.impl;

import com.ssm.wuye.dao.ContractTypeMapper;
import com.ssm.wuye.domain.ContractType;
import com.ssm.wuye.domain.ContractTypeExample;
import com.ssm.wuye.service.ContractTypeService;
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
public class ContractTypeServiceImpl implements ContractTypeService {
    @Resource
    ContractTypeMapper contractTypeMapper;


    public long countByExample(ContractTypeExample example) {
        return contractTypeMapper.countByExample(example);
    }

    public int deleteByPrimaryKey(Integer contypeid) {
        return contractTypeMapper.deleteByPrimaryKey(contypeid);
    }

    public int insertSelective(ContractType record) {
        return contractTypeMapper.insertSelective(record);
    }

    public List<ContractType> selectByExample(ContractTypeExample example) {
        return contractTypeMapper.selectByExample(example);
    }

    public List<ContractType> selectByExampleWithRowbounds(ContractTypeExample example, RowBounds rowBounds) {
        return contractTypeMapper.selectByExampleWithRowbounds(example,rowBounds);
    }

    public ContractType selectByPrimaryKey(Integer contypeid) {
        return contractTypeMapper.selectByPrimaryKey(contypeid);
    }

    public int updateByPrimaryKeySelective(ContractType record) {
        return contractTypeMapper.updateByPrimaryKeySelective(record);
    }
}
