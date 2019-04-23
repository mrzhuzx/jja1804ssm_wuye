package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Ch_water_meter;
import com.ssm.wuye.domain.Ch_water_meterExample;
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

public interface Ch_water_meterMapper {
    @SelectProvider(type=Ch_water_meterSqlProvider.class, method="countByExample")
    long countByExample(Ch_water_meterExample example);

    @DeleteProvider(type=Ch_water_meterSqlProvider.class, method="deleteByExample")
    int deleteByExample(Ch_water_meterExample example);

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
    int insert(Ch_water_meter record);

    @InsertProvider(type=Ch_water_meterSqlProvider.class, method="insertSelective")
    int insertSelective(Ch_water_meter record);

    @SelectProvider(type=Ch_water_meterSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="waterid", property="waterid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="wnumber", property="wnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="houseid", property="houseid", jdbcType=JdbcType.INTEGER),
        @Result(column="waterVolume", property="watervolume", jdbcType=JdbcType.DOUBLE),
        @Result(column="month", property="month", jdbcType=JdbcType.DATE)
    })
    List<Ch_water_meter> selectByExampleWithRowbounds(Ch_water_meterExample example, RowBounds rowBounds);

    @SelectProvider(type=Ch_water_meterSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="waterid", property="waterid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="wnumber", property="wnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="houseid", property="houseid", jdbcType=JdbcType.INTEGER),
        @Result(column="waterVolume", property="watervolume", jdbcType=JdbcType.DOUBLE),
        @Result(column="month", property="month", jdbcType=JdbcType.DATE)
    })
    List<Ch_water_meter> selectByExample(Ch_water_meterExample example);

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
    Ch_water_meter selectByPrimaryKey(Integer waterid);

    @UpdateProvider(type=Ch_water_meterSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Ch_water_meter record, @Param("example") Ch_water_meterExample example);

    @UpdateProvider(type=Ch_water_meterSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Ch_water_meter record, @Param("example") Ch_water_meterExample example);

    @UpdateProvider(type=Ch_water_meterSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Ch_water_meter record);

    @Update({
        "update ch_water_meter",
        "set wnumber = #{wnumber,jdbcType=VARCHAR},",
          "houseid = #{houseid,jdbcType=INTEGER},",
          "waterVolume = #{watervolume,jdbcType=DOUBLE},",
          "month = #{month,jdbcType=DATE}",
        "where waterid = #{waterid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Ch_water_meter record);
}