package com.ssm.wuye.dao;/*
 * desc:
 * author:tanghuaming
 * time:2019\4\25 0025
 */


import com.ssm.wuye.domain.Electric;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IElectricDao {
    @Select("SELECT * FROM ch_electric_meter")
    public List<Electric> findAll();


    @Delete("delete from ch_electric_meter where ch_electric_meter.electricid=#{id}")
    void delete(Integer id);

    @Select("select * from ch_electric_meter where electricid=#{id}")
    Electric findById(String id);

    @Update("UPDATE ch_electric_meter SET enumber=#{enumber},electric=#{electric},month=#{month} where electricid=#{electricid} ")
    void updata(Electric electric);

    @Insert("insert into ch_electric_meter (enumber,houseid,electric,month) values(#{enumber},#{houseid},#{electric},#{month})")
    void add(Electric electric);

    @Select("SELECT hid FROM wy_house")
    List<Integer> findAllhouseid();
}
