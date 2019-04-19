package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Electricmenter;
import com.ssm.wuye.domain.ElectricmenterExample;
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

public interface ElectricmenterMapper {
    @SelectProvider(type=ElectricmenterSqlProvider.class, method="countByExample")
    long countByExample(ElectricmenterExample example);

    @DeleteProvider(type=ElectricmenterSqlProvider.class, method="deleteByExample")
    int deleteByExample(ElectricmenterExample example);

    @Delete({
        "delete from electricmenter",
        "where electricid = #{electricid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer electricid);

    @Insert({
        "insert into electricmenter (electricid, enumber, ",
        "houseid, electric, ",
        "month)",
        "values (#{electricid,jdbcType=INTEGER}, #{enumber,jdbcType=VARCHAR}, ",
        "#{houseid,jdbcType=INTEGER}, #{electric,jdbcType=DOUBLE}, ",
        "#{month,jdbcType=DATE})"
    })
    int insert(Electricmenter record);

    @InsertProvider(type=ElectricmenterSqlProvider.class, method="insertSelective")
    int insertSelective(Electricmenter record);

    @SelectProvider(type=ElectricmenterSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="electricid", property="electricid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="enumber", property="enumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="houseid", property="houseid", jdbcType=JdbcType.INTEGER),
        @Result(column="electric", property="electric", jdbcType=JdbcType.DOUBLE),
        @Result(column="month", property="month", jdbcType=JdbcType.DATE)
    })
    List<Electricmenter> selectByExampleWithRowbounds(ElectricmenterExample example, RowBounds rowBounds);

    @SelectProvider(type=ElectricmenterSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="electricid", property="electricid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="enumber", property="enumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="houseid", property="houseid", jdbcType=JdbcType.INTEGER),
        @Result(column="electric", property="electric", jdbcType=JdbcType.DOUBLE),
        @Result(column="month", property="month", jdbcType=JdbcType.DATE)
    })
    List<Electricmenter> selectByExample(ElectricmenterExample example);

    @Select({
        "select",
        "electricid, enumber, houseid, electric, month",
        "from electricmenter",
        "where electricid = #{electricid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="electricid", property="electricid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="enumber", property="enumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="houseid", property="houseid", jdbcType=JdbcType.INTEGER),
        @Result(column="electric", property="electric", jdbcType=JdbcType.DOUBLE),
        @Result(column="month", property="month", jdbcType=JdbcType.DATE)
    })
    Electricmenter selectByPrimaryKey(Integer electricid);

    @UpdateProvider(type=ElectricmenterSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Electricmenter record, @Param("example") ElectricmenterExample example);

    @UpdateProvider(type=ElectricmenterSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Electricmenter record, @Param("example") ElectricmenterExample example);

    @UpdateProvider(type=ElectricmenterSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Electricmenter record);

    @Update({
        "update electricmenter",
        "set enumber = #{enumber,jdbcType=VARCHAR},",
          "houseid = #{houseid,jdbcType=INTEGER},",
          "electric = #{electric,jdbcType=DOUBLE},",
          "month = #{month,jdbcType=DATE}",
        "where electricid = #{electricid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Electricmenter record);
}