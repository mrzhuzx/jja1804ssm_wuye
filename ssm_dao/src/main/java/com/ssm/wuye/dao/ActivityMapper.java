package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Activity;
import com.ssm.wuye.domain.ActivityExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface ActivityMapper {
    @SelectProvider(type=ActivitySqlProvider.class, method="countByExample")
    long countByExample(ActivityExample example);

    @DeleteProvider(type=ActivitySqlProvider.class, method="deleteByExample")
    int deleteByExample(ActivityExample example);

    @Delete({
        "delete from activity",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into activity (id, activityname, ",
        "activitydesc, activitycont, ",
        "activitytime, activityworker, ",
        "activityward)",
        "values (#{id,jdbcType=INTEGER}, #{activityname,jdbcType=VARCHAR}, ",
        "#{activitydesc,jdbcType=VARCHAR}, #{activitycont,jdbcType=VARCHAR}, ",
        "#{activitytime,jdbcType=DATE}, #{activityworker,jdbcType=VARCHAR}, ",
        "#{activityward,jdbcType=VARCHAR})"
    })
    int insert(Activity record);

    @InsertProvider(type=ActivitySqlProvider.class, method="insertSelective")
    int insertSelective(Activity record);

    @SelectProvider(type=ActivitySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
        @Result(column="activityname", property="activityname", jdbcType=JdbcType.VARCHAR),
        @Result(column="activitydesc", property="activitydesc", jdbcType=JdbcType.VARCHAR),
        @Result(column="activitycont", property="activitycont", jdbcType=JdbcType.VARCHAR),
        @Result(column="activitytime", property="activitytime", jdbcType=JdbcType.DATE),
        @Result(column="activityworker", property="activityworker", jdbcType=JdbcType.VARCHAR),
        @Result(column="activityward", property="activityward", jdbcType=JdbcType.VARCHAR)
    })
    List<Activity> selectByExampleWithRowbounds(ActivityExample example, RowBounds rowBounds);

    @SelectProvider(type=ActivitySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="activityname", property="activityname", jdbcType=JdbcType.VARCHAR),
        @Result(column="activitydesc", property="activitydesc", jdbcType=JdbcType.VARCHAR),
        @Result(column="activitycont", property="activitycont", jdbcType=JdbcType.VARCHAR),
        @Result(column="activitytime", property="activitytime", jdbcType=JdbcType.DATE),
        @Result(column="activityworker", property="activityworker", jdbcType=JdbcType.VARCHAR),
        @Result(column="activityward", property="activityward", jdbcType=JdbcType.VARCHAR)
    })
    List<Activity> selectByExample(ActivityExample example);

    @Select({
        "select",
        "id, activityname, activitydesc, activitycont, activitytime, activityworker, ",
        "activityward",
        "from activity",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="activityname", property="activityname", jdbcType=JdbcType.VARCHAR),
        @Result(column="activitydesc", property="activitydesc", jdbcType=JdbcType.VARCHAR),
        @Result(column="activitycont", property="activitycont", jdbcType=JdbcType.VARCHAR),
        @Result(column="activitytime", property="activitytime", jdbcType=JdbcType.DATE),
        @Result(column="activityworker", property="activityworker", jdbcType=JdbcType.VARCHAR),
        @Result(column="activityward", property="activityward", jdbcType=JdbcType.VARCHAR)
    })
    Activity selectByPrimaryKey(Integer id);

    @UpdateProvider(type=ActivitySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Activity record, @Param("example") ActivityExample example);

    @UpdateProvider(type=ActivitySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Activity record, @Param("example") ActivityExample example);

    @UpdateProvider(type=ActivitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Activity record);

    @Update({
        "update activity",
        "set activityname = #{activityname,jdbcType=VARCHAR},",
          "activitydesc = #{activitydesc,jdbcType=VARCHAR},",
          "activitycont = #{activitycont,jdbcType=VARCHAR},",
          "activitytime = #{activitytime,jdbcType=DATE},",
          "activityworker = #{activityworker,jdbcType=VARCHAR},",
          "activityward = #{activityward,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Activity record);
}