package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Houqin;
import com.ssm.wuye.domain.HouqinExample;
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

public interface HouqinMapper {
    @SelectProvider(type=HouqinSqlProvider.class, method="countByExample")
    long countByExample(HouqinExample example);

    @DeleteProvider(type=HouqinSqlProvider.class, method="deleteByExample")
    int deleteByExample(HouqinExample example);

    @Insert({
        "insert into houqin (userid, username, ",
        "userpass, userphone, ",
        "usermail, userqqface, ",
        "userflag, userstyle, ",
        "roleId, roleName, ",
        "roleStatus)",
        "values (#{userid,jdbcType=INTEGER}, #{username,jdbcType=VARCHAR}, ",
        "#{userpass,jdbcType=VARCHAR}, #{userphone,jdbcType=VARCHAR}, ",
        "#{usermail,jdbcType=VARCHAR}, #{userqqface,jdbcType=VARCHAR}, ",
        "#{userflag,jdbcType=VARCHAR}, #{userstyle,jdbcType=VARCHAR}, ",
        "#{roleid,jdbcType=INTEGER}, #{rolename,jdbcType=VARCHAR}, ",
        "#{rolestatus,jdbcType=VARCHAR})"
    })
    int insert(Houqin record);

    @InsertProvider(type=HouqinSqlProvider.class, method="insertSelective")
    int insertSelective(Houqin record);

    @SelectProvider(type=HouqinSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="userid", property="userid", jdbcType=JdbcType.INTEGER),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="userpass", property="userpass", jdbcType=JdbcType.VARCHAR),
        @Result(column="userphone", property="userphone", jdbcType=JdbcType.VARCHAR),
        @Result(column="usermail", property="usermail", jdbcType=JdbcType.VARCHAR),
        @Result(column="userqqface", property="userqqface", jdbcType=JdbcType.VARCHAR),
        @Result(column="userflag", property="userflag", jdbcType=JdbcType.VARCHAR),
        @Result(column="userstyle", property="userstyle", jdbcType=JdbcType.VARCHAR),
        @Result(column="roleId", property="roleid", jdbcType=JdbcType.INTEGER),
        @Result(column="roleName", property="rolename", jdbcType=JdbcType.VARCHAR),
        @Result(column="roleStatus", property="rolestatus", jdbcType=JdbcType.VARCHAR)
    })
    List<Houqin> selectByExampleWithRowbounds(HouqinExample example, RowBounds rowBounds);

    @SelectProvider(type=HouqinSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="userid", property="userid", jdbcType=JdbcType.INTEGER),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="userpass", property="userpass", jdbcType=JdbcType.VARCHAR),
        @Result(column="userphone", property="userphone", jdbcType=JdbcType.VARCHAR),
        @Result(column="usermail", property="usermail", jdbcType=JdbcType.VARCHAR),
        @Result(column="userqqface", property="userqqface", jdbcType=JdbcType.VARCHAR),
        @Result(column="userflag", property="userflag", jdbcType=JdbcType.VARCHAR),
        @Result(column="userstyle", property="userstyle", jdbcType=JdbcType.VARCHAR),
        @Result(column="roleId", property="roleid", jdbcType=JdbcType.INTEGER),
        @Result(column="roleName", property="rolename", jdbcType=JdbcType.VARCHAR),
        @Result(column="roleStatus", property="rolestatus", jdbcType=JdbcType.VARCHAR)
    })
    List<Houqin> selectByExample(HouqinExample example);

    @UpdateProvider(type=HouqinSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Houqin record, @Param("example") HouqinExample example);

    @UpdateProvider(type=HouqinSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Houqin record, @Param("example") HouqinExample example);
}