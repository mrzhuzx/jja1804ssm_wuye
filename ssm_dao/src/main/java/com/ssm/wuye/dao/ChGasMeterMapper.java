package com.ssm.wuye.dao;

import com.ssm.wuye.domain.ChGasMeter;
import com.ssm.wuye.domain.ChGasMeterExample;
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

public interface ChGasMeterMapper {
    @SelectProvider(type=ChGasMeterSqlProvider.class, method="countByExample")
    long countByExample(ChGasMeterExample example);

    @DeleteProvider(type=ChGasMeterSqlProvider.class, method="deleteByExample")
    int deleteByExample(ChGasMeterExample example);

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
    int insert(ChGasMeter record);

    @InsertProvider(type=ChGasMeterSqlProvider.class, method="insertSelective")
    int insertSelective(ChGasMeter record);

    @SelectProvider(type=ChGasMeterSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="gasNumber", property="gasnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="houseid", property="houseid", jdbcType=JdbcType.INTEGER),
        @Result(column="gas", property="gas", jdbcType=JdbcType.DOUBLE),
        @Result(column="month", property="month", jdbcType=JdbcType.DATE)
    })
    List<ChGasMeter> selectByExampleWithRowbounds(ChGasMeterExample example, RowBounds rowBounds);

    @SelectProvider(type=ChGasMeterSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="gasNumber", property="gasnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="houseid", property="houseid", jdbcType=JdbcType.INTEGER),
        @Result(column="gas", property="gas", jdbcType=JdbcType.DOUBLE),
        @Result(column="month", property="month", jdbcType=JdbcType.DATE)
    })
    List<ChGasMeter> selectByExample(ChGasMeterExample example);

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
    ChGasMeter selectByPrimaryKey(Integer id);

    @UpdateProvider(type=ChGasMeterSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ChGasMeter record, @Param("example") ChGasMeterExample example);

    @UpdateProvider(type=ChGasMeterSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ChGasMeter record, @Param("example") ChGasMeterExample example);

    @UpdateProvider(type=ChGasMeterSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ChGasMeter record);

    @Update({
        "update ch_gas_meter",
        "set gasNumber = #{gasnumber,jdbcType=VARCHAR},",
          "houseid = #{houseid,jdbcType=INTEGER},",
          "gas = #{gas,jdbcType=DOUBLE},",
          "month = #{month,jdbcType=DATE}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ChGasMeter record);
}