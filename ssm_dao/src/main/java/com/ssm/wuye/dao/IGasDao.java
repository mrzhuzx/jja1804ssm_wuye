package com.ssm.wuye.dao;/*
 * desc:
 * author:tanghuaming
 * time:2019\5\6 0006
 */

import com.ssm.wuye.domain.PuGas;
import com.ssm.wuye.domain.PuWater;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IGasDao {
    @Select("SELECT * FROM pu_gas")
     List<PuGas> findAll();
    @Select("select * from pu_gas where gasid=#{id}")
    PuGas findById(String id);
    @Delete("delete from pu_gas where pu_gas.gasid=#{id}")
    void delete(Integer id);
    @Update("UPDATE pu_gas SET enumber=#{enumber},gas=#{gas},month=#{month} where gasid=#{gasid} ")
    void updata(PuGas electric);
    @Select("SELECT * FROM pu_gas WHERE pu_gas.gasid=(SELECT Max(pu_gas.gasid) FROM pu_gas)")
    PuGas findIdMax();
    @Insert("insert into pu_gas (gasid,enumber,gas,month) values(#{gasid},#{enumber},#{gas},#{month})")
    void add(PuGas electric);
}
