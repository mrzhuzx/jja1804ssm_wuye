package com.ssm.wuye.service;

import com.ssm.wuye.domain.OwerHouseType;
import com.ssm.wuye.domain.OwerHouseTypeExample;
import com.ssm.wuye.domain.SysOwer;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface OwerHouseTypeService {

    long countByExample(OwerHouseTypeExample example);

    List<OwerHouseType> selectByExampleWithRowbounds(OwerHouseTypeExample example, RowBounds rowBounds);

    List<OwerHouseType> selectByExample(OwerHouseTypeExample example);

}
