package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Sys_admin_info;
import com.ssm.wuye.domain.Sys_admin_infoExample;
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

public interface Sys_admin_infoMapper {
    @SelectProvider(type=Sys_admin_infoSqlProvider.class, method="countByExample")
    long countByExample(Sys_admin_infoExample example);

    @DeleteProvider(type=Sys_admin_infoSqlProvider.class, method="deleteByExample")
    int deleteByExample(Sys_admin_infoExample example);

    @Delete({
        "delete from sys_admin_info",
        "where userid = #{userid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer userid);

    @Insert({
        "insert into sys_admin_info (userid, username, ",
        "userpass, userphone, ",
        "usermail, userqqface, ",
        "userflag, userstyle, ",
        "roleid)",
        "values (#{userid,jdbcType=INTEGER}, #{username,jdbcType=VARCHAR}, ",
        "#{userpass,jdbcType=VARCHAR}, #{userphone,jdbcType=VARCHAR}, ",
        "#{usermail,jdbcType=VARCHAR}, #{userqqface,jdbcType=VARCHAR}, ",
        "#{userflag,jdbcType=VARCHAR}, #{userstyle,jdbcType=VARCHAR}, ",
        "#{roleid,jdbcType=INTEGER})"
    })
    int insert(Sys_admin_info record);

    @InsertProvider(type=Sys_admin_infoSqlProvider.class, method="insertSelective")
    int insertSelective(Sys_admin_info record);

    @SelectProvider(type=Sys_admin_infoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="userid", property="userid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="userpass", property="userpass", jdbcType=JdbcType.VARCHAR),
        @Result(column="userphone", property="userphone", jdbcType=JdbcType.VARCHAR),
        @Result(column="usermail", property="usermail", jdbcType=JdbcType.VARCHAR),
        @Result(column="userqqface", property="userqqface", jdbcType=JdbcType.VARCHAR),
        @Result(column="userflag", property="userflag", jdbcType=JdbcType.VARCHAR),
        @Result(column="userstyle", property="userstyle", jdbcType=JdbcType.VARCHAR),
        @Result(column="roleid", property="roleid", jdbcType=JdbcType.INTEGER)
    })
    List<Sys_admin_info> selectByExampleWithRowbounds(Sys_admin_infoExample example, RowBounds rowBounds);

    @SelectProvider(type=Sys_admin_infoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="userid", property="userid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="userpass", property="userpass", jdbcType=JdbcType.VARCHAR),
        @Result(column="userphone", property="userphone", jdbcType=JdbcType.VARCHAR),
        @Result(column="usermail", property="usermail", jdbcType=JdbcType.VARCHAR),
        @Result(column="userqqface", property="userqqface", jdbcType=JdbcType.VARCHAR),
        @Result(column="userflag", property="userflag", jdbcType=JdbcType.VARCHAR),
        @Result(column="userstyle", property="userstyle", jdbcType=JdbcType.VARCHAR),
        @Result(column="roleid", property="roleid", jdbcType=JdbcType.INTEGER)
    })
    List<Sys_admin_info> selectByExample(Sys_admin_infoExample example);

    @Select({
        "select",
        "userid, username, userpass, userphone, usermail, userqqface, userflag, userstyle, ",
        "roleid",
        "from sys_admin_info",
        "where userid = #{userid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="userid", property="userid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="userpass", property="userpass", jdbcType=JdbcType.VARCHAR),
        @Result(column="userphone", property="userphone", jdbcType=JdbcType.VARCHAR),
        @Result(column="usermail", property="usermail", jdbcType=JdbcType.VARCHAR),
        @Result(column="userqqface", property="userqqface", jdbcType=JdbcType.VARCHAR),
        @Result(column="userflag", property="userflag", jdbcType=JdbcType.VARCHAR),
        @Result(column="userstyle", property="userstyle", jdbcType=JdbcType.VARCHAR),
        @Result(column="roleid", property="roleid", jdbcType=JdbcType.INTEGER)
    })
    Sys_admin_info selectByPrimaryKey(Integer userid);

    @UpdateProvider(type=Sys_admin_infoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Sys_admin_info record, @Param("example") Sys_admin_infoExample example);

    @UpdateProvider(type=Sys_admin_infoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Sys_admin_info record, @Param("example") Sys_admin_infoExample example);

    @UpdateProvider(type=Sys_admin_infoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Sys_admin_info record);

    @Update({
        "update sys_admin_info",
        "set username = #{username,jdbcType=VARCHAR},",
          "userpass = #{userpass,jdbcType=VARCHAR},",
          "userphone = #{userphone,jdbcType=VARCHAR},",
          "usermail = #{usermail,jdbcType=VARCHAR},",
          "userqqface = #{userqqface,jdbcType=VARCHAR},",
          "userflag = #{userflag,jdbcType=VARCHAR},",
          "userstyle = #{userstyle,jdbcType=VARCHAR},",
          "roleid = #{roleid,jdbcType=INTEGER}",
        "where userid = #{userid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Sys_admin_info record);
}