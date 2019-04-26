package com.ssm.wuye.service.impl;

import com.ssm.wuye.dao.MyHouseMapper;
import com.ssm.wuye.dao.MyHouseTypeMapper;
import com.ssm.wuye.domain.MyHouseType;
import com.ssm.wuye.domain.MyHouseTypeExample;
import com.ssm.wuye.service.MyHouseTypeService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class MyHouseTypeServiceImpl implements MyHouseTypeService {
    @Resource
    MyHouseTypeMapper myHouseTypeMapper;

    public long countByExample(MyHouseTypeExample example) {
        return myHouseTypeMapper.countByExample(example);
    }

    public int deleteByPrimaryKey(Integer htypeid) {
        return myHouseTypeMapper.deleteByPrimaryKey(htypeid);
    }

    public int insertSelective(MyHouseType record) {
        return myHouseTypeMapper.insertSelective(record);
    }

    public List<MyHouseType> selectByExample(MyHouseTypeExample example) {
        return myHouseTypeMapper.selectByExample(example);
    }

    public List<MyHouseType> selectByExampleWithRowbounds(MyHouseTypeExample example, RowBounds rowBounds) {
        return myHouseTypeMapper.selectByExampleWithRowbounds(example, rowBounds);
    }

    public MyHouseType selectByPrimaryKey(Integer htypeid) {
        return myHouseTypeMapper.selectByPrimaryKey(htypeid);
    }

    public int updateByPrimaryKeySelective(MyHouseType record) {
        return myHouseTypeMapper.updateByPrimaryKeySelective(record);
    }
}
