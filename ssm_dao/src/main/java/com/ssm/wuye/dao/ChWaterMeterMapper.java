package com.ssm.wuye.dao;

import com.ssm.wuye.domain.ChWaterMeter;
import com.ssm.wuye.domain.ChWaterMeterExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface ChWaterMeterMapper {
    @SelectProvider(type=ChWaterMeterSqlProvider.class, method="countByExample")
    long countByExample(ChWaterMeterExample example);

    @DeleteProvider(type=ChWaterMeterSqlProvider.class, method="deleteByExample")
    int deleteByExample(ChWaterMeterExample example);

    @Delete({
        "delete from ch_water_meter",
        "where waterid = #{waterid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer waterid);

    @Insert({
        "insert into ch_water_meter (waterid, wnumber, ",
        "houseid, waterVolume, ",
        "month)",
        "values (#{waterid,jdbcType=INTEGER}, #{wnumber,jdbcType=VARCHAR}, ",
        "#{houseid,jdbcType=INTEGER}, #{watervolume,jdbcType=DOUBLE}, ",
        "#{month,jdbcType=DATE})"
    })
    int insert(ChWaterMeter record);

    @InsertProvider(type=ChWaterMeterSqlProvider.class, method="insertSelective")
    int insertSelective(ChWaterMeter record);

    @SelectProvider(type=ChWaterMeterSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="waterid", property="waterid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="wnumber", property="wnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="houseid", property="houseid", jdbcType=JdbcType.INTEGER),
        @Result(column="waterVolume", property="watervolume", jdbcType=JdbcType.DOUBLE),
        @Result(column="month", property="month", jdbcType=JdbcType.DATE)
    })
    List<ChWaterMeter> selectByExampleWithRowbounds(ChWaterMeterExample example, RowBounds rowBounds);

    @SelectProvider(type=ChWaterMeterSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="waterid", property="waterid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="wnumber", property="wnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="houseid", property="houseid", jdbcType=JdbcType.INTEGER),
        @Result(column="waterVolume", property="watervolume", jdbcType=JdbcType.DOUBLE),
        @Result(column="month", property="month", jdbcType=JdbcType.DATE)
    })
    List<ChWaterMeter> selectByExample(ChWaterMeterExample example);

    @Select({
        "select",
        "waterid, wnumber, houseid, waterVolume, month",
        "from ch_water_meter",
        "where waterid = #{waterid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="waterid", property="waterid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="wnumber", property="wnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="houseid", property="houseid", jdbcType=JdbcType.INTEGER),
        @Result(column="waterVolume", property="watervolume", jdbcType=JdbcType.DOUBLE),
        @Result(column="month", property="month", jdbcType=JdbcType.DATE)
    })
    ChWaterMeter selectByPrimaryKey(Integer waterid);

    @UpdateProvider(type=ChWaterMeterSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ChWaterMeter record, @Param("example") ChWaterMeterExample example);

    @UpdateProvider(type=ChWaterMeterSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ChWaterMeter record, @Param("example") ChWaterMeterExample example);

    @UpdateProvider(type=ChWaterMeterSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ChWaterMeter record);

    @Update({
        "update ch_water_meter",
        "set wnumber = #{wnumber,jdbcType=VARCHAR},",
          "houseid = #{houseid,jdbcType=INTEGER},",
          "waterVolume = #{watervolume,jdbcType=DOUBLE},",
          "month = #{month,jdbcType=DATE}",
        "where waterid = #{waterid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ChWaterMeter record);
}