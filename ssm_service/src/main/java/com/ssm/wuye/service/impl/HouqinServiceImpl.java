package com.ssm.wuye.service.impl;
/*
 *desc:
 *author:wjs
 *time:2019/4/30 0030
 *version:1.2.3
 */

import com.ssm.wuye.dao.HouqinMapper;
import com.ssm.wuye.domain.Houqin;
import com.ssm.wuye.domain.HouqinExample;
import com.ssm.wuye.service.HouqinService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HouqinServiceImpl implements HouqinService {

    @Resource
    HouqinMapper houqinMapper;

    /**
     * 带条件查询
     * @param example
     * @return
     */

    public List<Houqin> selectByExample(HouqinExample example) {
        return houqinMapper.selectByExample(example);
    }


    /**
     * 查询总条数
     * @param example
     * @return
     */

    public long countByExample(HouqinExample example) {
        return houqinMapper.countByExample(example);
    }


    public int updateByPrimaryKeySelective(Houqin record) {
        return 0;
    }


    public int deleteByPrimaryKey(Integer userid) {
        return 0;
    }



    public int insertSelective(Houqin record) {
        return 0;
    }


    public List<Houqin> selectByExampleWithRowbounds(HouqinExample example, RowBounds rowBounds) {
        return null;
    }


    public Houqin selectByPrimaryKey(Integer userid) {
        return null;
    }
}
