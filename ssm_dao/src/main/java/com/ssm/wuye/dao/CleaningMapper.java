package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Cleaning;
import com.ssm.wuye.domain.CleaningExample;
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

public interface CleaningMapper {
    @SelectProvider(type=CleaningSqlProvider.class, method="countByExample")
    long countByExample(CleaningExample example);

    @DeleteProvider(type=CleaningSqlProvider.class, method="deleteByExample")
    int deleteByExample(CleaningExample example);

    @Insert({
        "insert into cleaning (cleid, clename, ",
        "clephone, cleflag, ",
        "roleid)",
        "values (#{cleid,jdbcType=INTEGER}, #{clename,jdbcType=VARCHAR}, ",
        "#{clephone,jdbcType=VARCHAR}, #{cleflag,jdbcType=VARCHAR}, ",
        "#{roleid,jdbcType=INTEGER})"
    })
    int insert(Cleaning record);

    @InsertProvider(type=CleaningSqlProvider.class, method="insertSelective")
    int insertSelective(Cleaning record);

    @SelectProvider(type=CleaningSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="cleid", property="cleid", jdbcType=JdbcType.INTEGER),
        @Result(column="clename", property="clename", jdbcType=JdbcType.VARCHAR),
        @Result(column="clephone", property="clephone", jdbcType=JdbcType.VARCHAR),
        @Result(column="cleflag", property="cleflag", jdbcType=JdbcType.VARCHAR),
        @Result(column="roleid", property="roleid", jdbcType=JdbcType.INTEGER)
    })
    List<Cleaning> selectByExampleWithRowbounds(CleaningExample example, RowBounds rowBounds);

    @SelectProvider(type=CleaningSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="cleid", property="cleid", jdbcType=JdbcType.INTEGER),
        @Result(column="clename", property="clename", jdbcType=JdbcType.VARCHAR),
        @Result(column="clephone", property="clephone", jdbcType=JdbcType.VARCHAR),
        @Result(column="cleflag", property="cleflag", jdbcType=JdbcType.VARCHAR),
        @Result(column="roleid", property="roleid", jdbcType=JdbcType.INTEGER)
    })
    List<Cleaning> selectByExample(CleaningExample example);

    @UpdateProvider(type=CleaningSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Cleaning record, @Param("example") CleaningExample example);

    @UpdateProvider(type=CleaningSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Cleaning record, @Param("example") CleaningExample example);
}