package com.ssm.wuye.dao;/*
 * desc:
 * author:tanghuaming
 * time:2019\5\6 0006
 */

import com.ssm.wuye.domain.PuElectric;
import com.ssm.wuye.domain.PuWater;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IWaterDao {
    @Select("SELECT * FROM pu_water")
     List<PuWater> findAll();
    @Select("select * from pu_water where waterid=#{id}")
    PuWater findById(String id);
    @Delete("delete from pu_water where pu_water.waterid=#{id}")
    void delete(Integer id);
    @Update("UPDATE pu_water SET enumber=#{enumber},water=#{water},month=#{month} where waterid=#{waterid} ")
    void updata(PuWater electric);
    @Select("SELECT * FROM pu_water WHERE pu_water.waterid=(SELECT Max(pu_water.waterid) FROM pu_water)")
    PuWater findIdMax();
    @Insert("insert into pu_water (waterid,enumber,water,month) values(#{waterid},#{enumber},#{water},#{month})")
    void add(PuWater electric);
}
