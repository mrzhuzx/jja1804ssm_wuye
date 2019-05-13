package com.ssm.wuye.dao;

import com.ssm.wuye.domain.HouseElectricVo;
import com.ssm.wuye.domain.HouseElectricVoExample;
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

public interface HouseElectricVoMapper {
    @SelectProvider(type=HouseElectricVoSqlProvider.class, method="countByExample")
    long countByExample(HouseElectricVoExample example);

    @DeleteProvider(type=HouseElectricVoSqlProvider.class, method="deleteByExample")
    int deleteByExample(HouseElectricVoExample example);

    @Insert({
        "insert into house_electric_vo (olId, olName, ",
        "electricid, enumber, ",
        "electric, month, hid, ",
        "hBulidingName)",
        "values (#{olid,jdbcType=INTEGER}, #{olname,jdbcType=VARCHAR}, ",
        "#{electricid,jdbcType=INTEGER}, #{enumber,jdbcType=VARCHAR}, ",
        "#{electric,jdbcType=DOUBLE}, #{month,jdbcType=DATE}, #{hid,jdbcType=INTEGER}, ",
        "#{hbulidingname,jdbcType=VARCHAR})"
    })
    int insert(HouseElectricVo record);

    @InsertProvider(type=HouseElectricVoSqlProvider.class, method="insertSelective")
    int insertSelective(HouseElectricVo record);

    @SelectProvider(type=HouseElectricVoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="olId", property="olid", jdbcType=JdbcType.INTEGER),
        @Result(column="olName", property="olname", jdbcType=JdbcType.VARCHAR),
        @Result(column="electricid", property="electricid", jdbcType=JdbcType.INTEGER),
        @Result(column="enumber", property="enumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="electric", property="electric", jdbcType=JdbcType.DOUBLE),
        @Result(column="month", property="month", jdbcType=JdbcType.DATE),
        @Result(column="hid", property="hid", jdbcType=JdbcType.INTEGER),
        @Result(column="hBulidingName", property="hbulidingname", jdbcType=JdbcType.VARCHAR)
    })
    List<HouseElectricVo> selectByExampleWithRowbounds(HouseElectricVoExample example, RowBounds rowBounds);

    @SelectProvider(type=HouseElectricVoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="olId", property="olid", jdbcType=JdbcType.INTEGER),
        @Result(column="olName", property="olname", jdbcType=JdbcType.VARCHAR),
        @Result(column="electricid", property="electricid", jdbcType=JdbcType.INTEGER),
        @Result(column="enumber", property="enumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="electric", property="electric", jdbcType=JdbcType.DOUBLE),
        @Result(column="month", property="month", jdbcType=JdbcType.DATE),
        @Result(column="hid", property="hid", jdbcType=JdbcType.INTEGER),
        @Result(column="hBulidingName", property="hbulidingname", jdbcType=JdbcType.VARCHAR)
    })
    List<HouseElectricVo> selectByExample(HouseElectricVoExample example);

    @UpdateProvider(type=HouseElectricVoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") HouseElectricVo record, @Param("example") HouseElectricVoExample example);

    @UpdateProvider(type=HouseElectricVoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") HouseElectricVo record, @Param("example") HouseElectricVoExample example);
}