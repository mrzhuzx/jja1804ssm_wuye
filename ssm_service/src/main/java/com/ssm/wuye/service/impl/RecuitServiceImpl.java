package com.ssm.wuye.service.impl;

import com.ssm.wuye.dao.RecruitMapper;
import com.ssm.wuye.domain.Recruit;
import com.ssm.wuye.domain.RecruitExample;
import com.ssm.wuye.service.RecruitService;
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
public class RecuitServiceImpl implements RecruitService {

    @Resource
    RecruitMapper recruitMapper;


    @Override
    public long countByExample(RecruitExample example) {
        return recruitMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer recruitid) {
        return recruitMapper.deleteByPrimaryKey(recruitid);
    }

    @Override
    public int insertSelective(Recruit record) {
        return recruitMapper.insertSelective(record);
    }

    @Override
    public List<Recruit> selectByExample(RecruitExample example) {
        return recruitMapper.selectByExample(example);
    }

    @Override
    public List<Recruit> selectByExampleWithRowbounds(RecruitExample example, RowBounds rowBounds) {
        return recruitMapper.selectByExampleWithRowbounds(example,rowBounds);
    }

    @Override
    public Recruit selectByPrimaryKey(Integer recruitid) {
        return recruitMapper.selectByPrimaryKey(recruitid);
    }

    @Override
    public int updateByPrimaryKeySelective(Recruit record) {
        return recruitMapper.updateByPrimaryKeySelective(record);
    }
}
