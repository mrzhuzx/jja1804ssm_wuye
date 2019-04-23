package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Ch_gas_meter;
import com.ssm.wuye.domain.Ch_gas_meterExample;
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

public interface Ch_gas_meterMapper {
    @SelectProvider(type=Ch_gas_meterSqlProvider.class, method="countByExample")
    long countByExample(Ch_gas_meterExample example);

    @DeleteProvider(type=Ch_gas_meterSqlProvider.class, method="deleteByExample")
    int deleteByExample(Ch_gas_meterExample example);

    @Delete({
        "delete from ch_gas_meter",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into ch_gas_meter (id, gasNumber, ",
        "houseid, gas, month)",
        "values (#{id,jdbcType=INTEGER}, #{gasnumber,jdbcType=VARCHAR}, ",
        "#{houseid,jdbcType=INTEGER}, #{gas,jdbcType=DOUBLE}, #{month,jdbcType=DATE})"
    })
    int insert(Ch_gas_meter record);

    @InsertProvider(type=Ch_gas_meterSqlProvider.class, method="insertSelective")
    int insertSelective(Ch_gas_meter record);

    @SelectProvider(type=Ch_gas_meterSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="gasNumber", property="gasnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="houseid", property="houseid", jdbcType=JdbcType.INTEGER),
        @Result(column="gas", property="gas", jdbcType=JdbcType.DOUBLE),
        @Result(column="month", property="month", jdbcType=JdbcType.DATE)
    })
    List<Ch_gas_meter> selectByExampleWithRowbounds(Ch_gas_meterExample example, RowBounds rowBounds);

    @SelectProvider(type=Ch_gas_meterSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="gasNumber", property="gasnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="houseid", property="houseid", jdbcType=JdbcType.INTEGER),
        @Result(column="gas", property="gas", jdbcType=JdbcType.DOUBLE),
        @Result(column="month", property="month", jdbcType=JdbcType.DATE)
    })
    List<Ch_gas_meter> selectByExample(Ch_gas_meterExample example);

    @Select({
        "select",
        "id, gasNumber, houseid, gas, month",
        "from ch_gas_meter",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="gasNumber", property="gasnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="houseid", property="houseid", jdbcType=JdbcType.INTEGER),
        @Result(column="gas", property="gas", jdbcType=JdbcType.DOUBLE),
        @Result(column="month", property="month", jdbcType=JdbcType.DATE)
    })
    Ch_gas_meter selectByPrimaryKey(Integer id);

    @UpdateProvider(type=Ch_gas_meterSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Ch_gas_meter record, @Param("example") Ch_gas_meterExample example);

    @UpdateProvider(type=Ch_gas_meterSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Ch_gas_meter record, @Param("example") Ch_gas_meterExample example);

    @UpdateProvider(type=Ch_gas_meterSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Ch_gas_meter record);

    @Update({
        "update ch_gas_meter",
        "set gasNumber = #{gasnumber,jdbcType=VARCHAR},",
          "houseid = #{houseid,jdbcType=INTEGER},",
          "gas = #{gas,jdbcType=DOUBLE},",
          "month = #{month,jdbcType=DATE}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Ch_gas_meter record);
}