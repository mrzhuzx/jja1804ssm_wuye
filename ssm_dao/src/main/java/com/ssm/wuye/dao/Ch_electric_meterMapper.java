package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Ch_electric_meter;
import com.ssm.wuye.domain.Ch_electric_meterExample;
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

public interface Ch_electric_meterMapper {
    @SelectProvider(type=Ch_electric_meterSqlProvider.class, method="countByExample")
    long countByExample(Ch_electric_meterExample example);

    @DeleteProvider(type=Ch_electric_meterSqlProvider.class, method="deleteByExample")
    int deleteByExample(Ch_electric_meterExample example);

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
    int insert(Ch_electric_meter record);

    @InsertProvider(type=Ch_electric_meterSqlProvider.class, method="insertSelective")
    int insertSelective(Ch_electric_meter record);

    @SelectProvider(type=Ch_electric_meterSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="electricid", property="electricid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="enumber", property="enumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="houseid", property="houseid", jdbcType=JdbcType.INTEGER),
        @Result(column="electric", property="electric", jdbcType=JdbcType.DOUBLE),
        @Result(column="month", property="month", jdbcType=JdbcType.DATE)
    })
    List<Ch_electric_meter> selectByExampleWithRowbounds(Ch_electric_meterExample example, RowBounds rowBounds);

    @SelectProvider(type=Ch_electric_meterSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="electricid", property="electricid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="enumber", property="enumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="houseid", property="houseid", jdbcType=JdbcType.INTEGER),
        @Result(column="electric", property="electric", jdbcType=JdbcType.DOUBLE),
        @Result(column="month", property="month", jdbcType=JdbcType.DATE)
    })
    List<Ch_electric_meter> selectByExample(Ch_electric_meterExample example);

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
    Ch_electric_meter selectByPrimaryKey(Integer electricid);

    @UpdateProvider(type=Ch_electric_meterSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Ch_electric_meter record, @Param("example") Ch_electric_meterExample example);

    @UpdateProvider(type=Ch_electric_meterSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Ch_electric_meter record, @Param("example") Ch_electric_meterExample example);

    @UpdateProvider(type=Ch_electric_meterSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Ch_electric_meter record);

    @Update({
        "update ch_electric_meter",
        "set enumber = #{enumber,jdbcType=VARCHAR},",
          "houseid = #{houseid,jdbcType=INTEGER},",
          "electric = #{electric,jdbcType=DOUBLE},",
          "month = #{month,jdbcType=DATE}",
        "where electricid = #{electricid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Ch_electric_meter record);
}