package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Gasmeter;
import com.ssm.wuye.domain.GasmeterExample;
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

public interface GasmeterMapper {
    @SelectProvider(type=GasmeterSqlProvider.class, method="countByExample")
    long countByExample(GasmeterExample example);

    @DeleteProvider(type=GasmeterSqlProvider.class, method="deleteByExample")
    int deleteByExample(GasmeterExample example);

    @Delete({
        "delete from gasmeter",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into gasmeter (id, gasNumber, ",
        "houseid, gas, month)",
        "values (#{id,jdbcType=INTEGER}, #{gasnumber,jdbcType=VARCHAR}, ",
        "#{houseid,jdbcType=INTEGER}, #{gas,jdbcType=DOUBLE}, #{month,jdbcType=DATE})"
    })
    int insert(Gasmeter record);

    @InsertProvider(type=GasmeterSqlProvider.class, method="insertSelective")
    int insertSelective(Gasmeter record);

    @SelectProvider(type=GasmeterSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="gasNumber", property="gasnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="houseid", property="houseid", jdbcType=JdbcType.INTEGER),
        @Result(column="gas", property="gas", jdbcType=JdbcType.DOUBLE),
        @Result(column="month", property="month", jdbcType=JdbcType.DATE)
    })
    List<Gasmeter> selectByExampleWithRowbounds(GasmeterExample example, RowBounds rowBounds);

    @SelectProvider(type=GasmeterSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="gasNumber", property="gasnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="houseid", property="houseid", jdbcType=JdbcType.INTEGER),
        @Result(column="gas", property="gas", jdbcType=JdbcType.DOUBLE),
        @Result(column="month", property="month", jdbcType=JdbcType.DATE)
    })
    List<Gasmeter> selectByExample(GasmeterExample example);

    @Select({
        "select",
        "id, gasNumber, houseid, gas, month",
        "from gasmeter",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="gasNumber", property="gasnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="houseid", property="houseid", jdbcType=JdbcType.INTEGER),
        @Result(column="gas", property="gas", jdbcType=JdbcType.DOUBLE),
        @Result(column="month", property="month", jdbcType=JdbcType.DATE)
    })
    Gasmeter selectByPrimaryKey(Integer id);

    @UpdateProvider(type=GasmeterSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Gasmeter record, @Param("example") GasmeterExample example);

    @UpdateProvider(type=GasmeterSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Gasmeter record, @Param("example") GasmeterExample example);

    @UpdateProvider(type=GasmeterSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Gasmeter record);

    @Update({
        "update gasmeter",
        "set gasNumber = #{gasnumber,jdbcType=VARCHAR},",
          "houseid = #{houseid,jdbcType=INTEGER},",
          "gas = #{gas,jdbcType=DOUBLE},",
          "month = #{month,jdbcType=DATE}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Gasmeter record);
}