package com.ssm.wuye.dao;

import com.ssm.wuye.domain.HouseGasVo;
import com.ssm.wuye.domain.HouseGasVoExample;
import java.util.List;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface HouseGasVoMapper {
    @SelectProvider(type=HouseGasVoSqlProvider.class, method="countByExample")
    long countByExample(HouseGasVoExample example);

    @DeleteProvider(type=HouseGasVoSqlProvider.class, method="deleteByExample")
    int deleteByExample(HouseGasVoExample example);

    @Insert({
        "insert into house_gas_vo (hid, hBulidingName, ",
        "id, gasNumber, gas, ",
        "month, olId, olName)",
        "values (#{hid,jdbcType=INTEGER}, #{hbulidingname,jdbcType=VARCHAR}, ",
        "#{id,jdbcType=INTEGER}, #{gasnumber,jdbcType=VARCHAR}, #{gas,jdbcType=DOUBLE}, ",
        "#{month,jdbcType=DATE}, #{olid,jdbcType=INTEGER}, #{olname,jdbcType=VARCHAR})"
    })
    int insert(HouseGasVo record);

    @InsertProvider(type=HouseGasVoSqlProvider.class, method="insertSelective")
    int insertSelective(HouseGasVo record);

    @SelectProvider(type=HouseGasVoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="hid", property="hid", jdbcType=JdbcType.INTEGER),
        @Result(column="hBulidingName", property="hbulidingname", jdbcType=JdbcType.VARCHAR),
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="gasNumber", property="gasnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="gas", property="gas", jdbcType=JdbcType.DOUBLE),
        @Result(column="month", property="month", jdbcType=JdbcType.DATE),
        @Result(column="olId", property="olid", jdbcType=JdbcType.INTEGER),
        @Result(column="olName", property="olname", jdbcType=JdbcType.VARCHAR)
    })
    List<HouseGasVo> selectByExampleWithRowbounds(HouseGasVoExample example, RowBounds rowBounds);

    @SelectProvider(type=HouseGasVoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="hid", property="hid", jdbcType=JdbcType.INTEGER),
        @Result(column="hBulidingName", property="hbulidingname", jdbcType=JdbcType.VARCHAR),
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="gasNumber", property="gasnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="gas", property="gas", jdbcType=JdbcType.DOUBLE),
        @Result(column="month", property="month", jdbcType=JdbcType.DATE),
        @Result(column="olId", property="olid", jdbcType=JdbcType.INTEGER),
        @Result(column="olName", property="olname", jdbcType=JdbcType.VARCHAR)
    })
    List<HouseGasVo> selectByExample(HouseGasVoExample example);

    @UpdateProvider(type=HouseGasVoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") HouseGasVo record, @Param("example") HouseGasVoExample example);

    @UpdateProvider(type=HouseGasVoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") HouseGasVo record, @Param("example") HouseGasVoExample example);
}