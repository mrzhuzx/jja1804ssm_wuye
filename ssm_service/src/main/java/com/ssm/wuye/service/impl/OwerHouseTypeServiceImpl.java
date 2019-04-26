package com.ssm.wuye.service.impl;

import com.ssm.wuye.dao.OwerHouseTypeMapper;
import com.ssm.wuye.domain.OwerHouseType;
import com.ssm.wuye.domain.OwerHouseTypeExample;
import com.ssm.wuye.service.OwerHouseTypeService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OwerHouseTypeServiceImpl implements OwerHouseTypeService {

    @Resource
    OwerHouseTypeMapper owerHouseTypeMapper;

    public long countByExample(OwerHouseTypeExample example) {
        return  owerHouseTypeMapper.countByExample(example);
    }

    public List<OwerHouseType> selectByExampleWithRowbounds(OwerHouseTypeExample example, RowBounds rowBounds) {
        return owerHouseTypeMapper.selectByExampleWithRowbounds(example, rowBounds);
    }

    public List<OwerHouseType> selectByExample(OwerHouseTypeExample example) {
        return owerHouseTypeMapper.selectByExample(example);
    }
}
