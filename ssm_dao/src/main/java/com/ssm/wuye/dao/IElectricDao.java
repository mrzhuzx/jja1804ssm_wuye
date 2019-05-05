package com.ssm.wuye.dao;/*
 * desc:
 * author:tanghuaming
 * time:2019\4\25 0025
 */


import com.ssm.wuye.domain.Electric;
import com.ssm.wuye.domain.PuElectric;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IElectricDao {
    @Select("SELECT * FROM pu_electric")
    public List<PuElectric> findAll();


    @Delete("delete from pu_electric where pu_electric.electricid=#{id}")
    void delete(Integer id);

    @Select("select * from pu_electric where electricid=#{id}")
    PuElectric findById(String id);

    @Update("UPDATE ch_electric_meter SET enumber=#{enumber},electric=#{electric},month=#{month} where electricid=#{electricid} ")
    void updata(Electric electric);

    @Insert("insert into ch_electric_meter (enumber,houseid,electric,month) values(#{enumber},#{houseid},#{electric},#{month})")
    void add(Electric electric);

    @Select("SELECT hid FROM wy_house")
    List<Integer> findAllhouseid();
}
