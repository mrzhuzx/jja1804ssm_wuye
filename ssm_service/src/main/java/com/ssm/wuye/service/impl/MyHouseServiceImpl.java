package com.ssm.wuye.service.impl;

import com.ssm.wuye.dao.MyHouseMapper;
import com.ssm.wuye.domain.MyHouse;
import com.ssm.wuye.domain.MyHouseExample;
import com.ssm.wuye.service.MyHouseService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class MyHouseServiceImpl implements MyHouseService {

    @Resource
    MyHouseMapper myHouseMapper;

    public long countByExample(MyHouseExample example) {
        return myHouseMapper.countByExample(example);
    }

    public int deleteByPrimaryKey(Integer hid) {
        return myHouseMapper.deleteByPrimaryKey(hid);
    }

    public int insertSelective(MyHouse record) {
        return myHouseMapper.insertSelective(record);
    }

    public List<MyHouse> selectByExample(MyHouseExample example) {
        return myHouseMapper.selectByExample(example);
    }

    public List<MyHouse> selectByExampleWithRowbounds(MyHouseExample example, RowBounds rowBounds) {
        return myHouseMapper.selectByExampleWithRowbounds(example, rowBounds);
    }

    public MyHouse selectByPrimaryKey(Integer hid) {
        return myHouseMapper.selectByPrimaryKey(hid);
    }

    public int updateByPrimaryKeySelective(MyHouse record) {
        return myHouseMapper.updateByPrimaryKeySelective(record);
    }
}
