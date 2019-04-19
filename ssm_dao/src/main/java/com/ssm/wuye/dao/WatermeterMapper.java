package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Watermeter;
import com.ssm.wuye.domain.WatermeterExample;
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

public interface WatermeterMapper {
    @SelectProvider(type=WatermeterSqlProvider.class, method="countByExample")
    long countByExample(WatermeterExample example);

    @DeleteProvider(type=WatermeterSqlProvider.class, method="deleteByExample")
    int deleteByExample(WatermeterExample example);

    @Delete({
        "delete from watermeter",
        "where waterid = #{waterid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer waterid);

    @Insert({
        "insert into watermeter (waterid, wnumber, ",
        "houseid, waterVolume, ",
        "month)",
        "values (#{waterid,jdbcType=INTEGER}, #{wnumber,jdbcType=VARCHAR}, ",
        "#{houseid,jdbcType=INTEGER}, #{watervolume,jdbcType=DOUBLE}, ",
        "#{month,jdbcType=DATE})"
    })
    int insert(Watermeter record);

    @InsertProvider(type=WatermeterSqlProvider.class, method="insertSelective")
    int insertSelective(Watermeter record);

    @SelectProvider(type=WatermeterSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="waterid", property="waterid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="wnumber", property="wnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="houseid", property="houseid", jdbcType=JdbcType.INTEGER),
        @Result(column="waterVolume", property="watervolume", jdbcType=JdbcType.DOUBLE),
        @Result(column="month", property="month", jdbcType=JdbcType.DATE)
    })
    List<Watermeter> selectByExampleWithRowbounds(WatermeterExample example, RowBounds rowBounds);

    @SelectProvider(type=WatermeterSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="waterid", property="waterid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="wnumber", property="wnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="houseid", property="houseid", jdbcType=JdbcType.INTEGER),
        @Result(column="waterVolume", property="watervolume", jdbcType=JdbcType.DOUBLE),
        @Result(column="month", property="month", jdbcType=JdbcType.DATE)
    })
    List<Watermeter> selectByExample(WatermeterExample example);

    @Select({
        "select",
        "waterid, wnumber, houseid, waterVolume, month",
        "from watermeter",
        "where waterid = #{waterid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="waterid", property="waterid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="wnumber", property="wnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="houseid", property="houseid", jdbcType=JdbcType.INTEGER),
        @Result(column="waterVolume", property="watervolume", jdbcType=JdbcType.DOUBLE),
        @Result(column="month", property="month", jdbcType=JdbcType.DATE)
    })
    Watermeter selectByPrimaryKey(Integer waterid);

    @UpdateProvider(type=WatermeterSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Watermeter record, @Param("example") WatermeterExample example);

    @UpdateProvider(type=WatermeterSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Watermeter record, @Param("example") WatermeterExample example);

    @UpdateProvider(type=WatermeterSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Watermeter record);

    @Update({
        "update watermeter",
        "set wnumber = #{wnumber,jdbcType=VARCHAR},",
          "houseid = #{houseid,jdbcType=INTEGER},",
          "waterVolume = #{watervolume,jdbcType=DOUBLE},",
          "month = #{month,jdbcType=DATE}",
        "where waterid = #{waterid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Watermeter record);
}