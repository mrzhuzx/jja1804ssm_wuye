package com.ssm.wuye.dao;/*
 * desc:
 * author:tanghuaming
 * time:2019\4\25 0025
 */


import com.ssm.wuye.domain.Electric;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IElectricDao {
    @Select("SELECT * FROM ch_electric_meter;")
    public List<Electric> findAll();


    @Delete("delete from ch_electric_meter where ch_electric_meter.electricid=#{id}")
    void delete(Integer id);
}
