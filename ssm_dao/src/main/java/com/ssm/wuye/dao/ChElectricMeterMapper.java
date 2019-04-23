package com.ssm.wuye.dao;

import com.ssm.wuye.domain.ChElectricMeter;
import com.ssm.wuye.domain.ChElectricMeterExample;
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

public interface ChElectricMeterMapper {
    @SelectProvider(type=ChElectricMeterSqlProvider.class, method="countByExample")
    long countByExample(ChElectricMeterExample example);

    @DeleteProvider(type=ChElectricMeterSqlProvider.class, method="deleteByExample")
    int deleteByExample(ChElectricMeterExample example);

    @Delete({
        "delete from ch_electric_meter",
        "where electricid = #{electricid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer electricid);

    @Insert({
        "insert into ch_electric_meter (electricid, enumber, ",
        "houseid, electric, ",
        "month)",
        "values (#{electricid,jdbcType=INTEGER}, #{enumber,jdbcType=VARCHAR}, ",
        "#{houseid,jdbcType=INTEGER}, #{electric,jdbcType=DOUBLE}, ",
        "#{month,jdbcType=DATE})"
    })
    int insert(ChElectricMeter record);

    @InsertProvider(type=ChElectricMeterSqlProvider.class, method="insertSelective")
    int insertSelective(ChElectricMeter record);

    @SelectProvider(type=ChElectricMeterSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="electricid", property="electricid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="enumber", property="enumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="houseid", property="houseid", jdbcType=JdbcType.INTEGER),
        @Result(column="electric", property="electric", jdbcType=JdbcType.DOUBLE),
        @Result(column="month", property="month", jdbcType=JdbcType.DATE)
    })
    List<ChElectricMeter> selectByExampleWithRowbounds(ChElectricMeterExample example, RowBounds rowBounds);

    @SelectProvider(type=ChElectricMeterSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="electricid", property="electricid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="enumber", property="enumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="houseid", property="houseid", jdbcType=JdbcType.INTEGER),
        @Result(column="electric", property="electric", jdbcType=JdbcType.DOUBLE),
        @Result(column="month", property="month", jdbcType=JdbcType.DATE)
    })
    List<ChElectricMeter> selectByExample(ChElectricMeterExample example);

    @Select({
        "select",
        "electricid, enumber, houseid, electric, month",
        "from ch_electric_meter",
        "where electricid = #{electricid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="electricid", property="electricid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="enumber", property="enumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="houseid", property="houseid", jdbcType=JdbcType.INTEGER),
        @Result(column="electric", property="electric", jdbcType=JdbcType.DOUBLE),
        @Result(column="month", property="month", jdbcType=JdbcType.DATE)
    })
    ChElectricMeter selectByPrimaryKey(Integer electricid);

    @UpdateProvider(type=ChElectricMeterSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ChElectricMeter record, @Param("example") ChElectricMeterExample example);

    @UpdateProvider(type=ChElectricMeterSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ChElectricMeter record, @Param("example") ChElectricMeterExample example);

    @UpdateProvider(type=ChElectricMeterSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ChElectricMeter record);

    @Update({
        "update ch_electric_meter",
        "set enumber = #{enumber,jdbcType=VARCHAR},",
          "houseid = #{houseid,jdbcType=INTEGER},",
          "electric = #{electric,jdbcType=DOUBLE},",
          "month = #{month,jdbcType=DATE}",
        "where electricid = #{electricid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ChElectricMeter record);
}