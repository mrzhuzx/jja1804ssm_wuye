package com.ssm.wuye.dao;

import com.ssm.wuye.domain.HouseWaterVo;
import com.ssm.wuye.domain.HouseWaterVoExample;
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

public interface HouseWaterVoMapper {
    @SelectProvider(type=HouseWaterVoSqlProvider.class, method="countByExample")
    long countByExample(HouseWaterVoExample example);

    @DeleteProvider(type=HouseWaterVoSqlProvider.class, method="deleteByExample")
    int deleteByExample(HouseWaterVoExample example);

    @Insert({
        "insert into house_water_vo (hid, olid, ",
        "hBulidingName, waterid, ",
        "wnumber, waterVolume, ",
        "month, olName)",
        "values (#{hid,jdbcType=INTEGER}, #{olid,jdbcType=INTEGER}, ",
        "#{hbulidingname,jdbcType=VARCHAR}, #{waterid,jdbcType=INTEGER}, ",
        "#{wnumber,jdbcType=VARCHAR}, #{watervolume,jdbcType=DOUBLE}, ",
        "#{month,jdbcType=DATE}, #{olname,jdbcType=VARCHAR})"
    })
    int insert(HouseWaterVo record);

    @InsertProvider(type=HouseWaterVoSqlProvider.class, method="insertSelective")
    int insertSelective(HouseWaterVo record);

    @SelectProvider(type=HouseWaterVoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="hid", property="hid", jdbcType=JdbcType.INTEGER),
        @Result(column="olid", property="olid", jdbcType=JdbcType.INTEGER),
        @Result(column="hBulidingName", property="hbulidingname", jdbcType=JdbcType.VARCHAR),
        @Result(column="waterid", property="waterid", jdbcType=JdbcType.INTEGER),
        @Result(column="wnumber", property="wnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="waterVolume", property="watervolume", jdbcType=JdbcType.DOUBLE),
        @Result(column="month", property="month", jdbcType=JdbcType.DATE),
        @Result(column="olName", property="olname", jdbcType=JdbcType.VARCHAR)
    })
    List<HouseWaterVo> selectByExampleWithRowbounds(HouseWaterVoExample example, RowBounds rowBounds);

    @SelectProvider(type=HouseWaterVoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="hid", property="hid", jdbcType=JdbcType.INTEGER),
        @Result(column="olid", property="olid", jdbcType=JdbcType.INTEGER),
        @Result(column="hBulidingName", property="hbulidingname", jdbcType=JdbcType.VARCHAR),
        @Result(column="waterid", property="waterid", jdbcType=JdbcType.INTEGER),
        @Result(column="wnumber", property="wnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="waterVolume", property="watervolume", jdbcType=JdbcType.DOUBLE),
        @Result(column="month", property="month", jdbcType=JdbcType.DATE),
        @Result(column="olName", property="olname", jdbcType=JdbcType.VARCHAR)
    })
    List<HouseWaterVo> selectByExample(HouseWaterVoExample example);

    @UpdateProvider(type=HouseWaterVoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") HouseWaterVo record, @Param("example") HouseWaterVoExample example);

    @UpdateProvider(type=HouseWaterVoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") HouseWaterVo record, @Param("example") HouseWaterVoExample example);
}