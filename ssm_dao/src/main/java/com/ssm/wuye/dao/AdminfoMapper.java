package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Adminfo;
import com.ssm.wuye.domain.AdminfoExample;
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

public interface AdminfoMapper {
    @SelectProvider(type=AdminfoSqlProvider.class, method="countByExample")
    long countByExample(AdminfoExample example);

    @DeleteProvider(type=AdminfoSqlProvider.class, method="deleteByExample")
    int deleteByExample(AdminfoExample example);

    @Delete({
        "delete from adminfo",
        "where userid = #{userid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer userid);

    @Insert({
        "insert into adminfo (userid, username, ",
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
    int insert(Adminfo record);

    @InsertProvider(type=AdminfoSqlProvider.class, method="insertSelective")
    int insertSelective(Adminfo record);

    @SelectProvider(type=AdminfoSqlProvider.class, method="selectByExample")
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
    List<Adminfo> selectByExampleWithRowbounds(AdminfoExample example, RowBounds rowBounds);

    @SelectProvider(type=AdminfoSqlProvider.class, method="selectByExample")
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
    List<Adminfo> selectByExample(AdminfoExample example);

    @Select({
        "select",
        "userid, username, userpass, userphone, usermail, userqqface, userflag, userstyle, ",
        "roleid",
        "from adminfo",
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
    Adminfo selectByPrimaryKey(Integer userid);

    @UpdateProvider(type=AdminfoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Adminfo record, @Param("example") AdminfoExample example);

    @UpdateProvider(type=AdminfoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Adminfo record, @Param("example") AdminfoExample example);

    @UpdateProvider(type=AdminfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Adminfo record);

    @Update({
        "update adminfo",
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
    int updateByPrimaryKey(Adminfo record);
}