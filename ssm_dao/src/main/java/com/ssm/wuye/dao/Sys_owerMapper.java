package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Sys_ower;
import com.ssm.wuye.domain.Sys_owerExample;
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

public interface Sys_owerMapper {
    @SelectProvider(type=Sys_owerSqlProvider.class, method="countByExample")
    long countByExample(Sys_owerExample example);

    @DeleteProvider(type=Sys_owerSqlProvider.class, method="deleteByExample")
    int deleteByExample(Sys_owerExample example);

    @Delete({
        "delete from sys_ower",
        "where olId = #{olid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer olid);

    @Insert({
        "insert into sys_ower (olId, olName, ",
        "olAccount, olPasswd, ",
        "powerId, olPhone, ",
        "olHeadimg, olMember, ",
        "roleId)",
        "values (#{olid,jdbcType=INTEGER}, #{olname,jdbcType=VARCHAR}, ",
        "#{olaccount,jdbcType=VARCHAR}, #{olpasswd,jdbcType=VARCHAR}, ",
        "#{powerid,jdbcType=VARCHAR}, #{olphone,jdbcType=VARCHAR}, ",
        "#{olheadimg,jdbcType=VARCHAR}, #{olmember,jdbcType=INTEGER}, ",
        "#{roleid,jdbcType=INTEGER})"
    })
    int insert(Sys_ower record);

    @InsertProvider(type=Sys_owerSqlProvider.class, method="insertSelective")
    int insertSelective(Sys_ower record);

    @SelectProvider(type=Sys_owerSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="olId", property="olid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="olName", property="olname", jdbcType=JdbcType.VARCHAR),
        @Result(column="olAccount", property="olaccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="olPasswd", property="olpasswd", jdbcType=JdbcType.VARCHAR),
        @Result(column="powerId", property="powerid", jdbcType=JdbcType.VARCHAR),
        @Result(column="olPhone", property="olphone", jdbcType=JdbcType.VARCHAR),
        @Result(column="olHeadimg", property="olheadimg", jdbcType=JdbcType.VARCHAR),
        @Result(column="olMember", property="olmember", jdbcType=JdbcType.INTEGER),
        @Result(column="roleId", property="roleid", jdbcType=JdbcType.INTEGER)
    })
    List<Sys_ower> selectByExampleWithRowbounds(Sys_owerExample example, RowBounds rowBounds);

    @SelectProvider(type=Sys_owerSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="olId", property="olid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="olName", property="olname", jdbcType=JdbcType.VARCHAR),
        @Result(column="olAccount", property="olaccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="olPasswd", property="olpasswd", jdbcType=JdbcType.VARCHAR),
        @Result(column="powerId", property="powerid", jdbcType=JdbcType.VARCHAR),
        @Result(column="olPhone", property="olphone", jdbcType=JdbcType.VARCHAR),
        @Result(column="olHeadimg", property="olheadimg", jdbcType=JdbcType.VARCHAR),
        @Result(column="olMember", property="olmember", jdbcType=JdbcType.INTEGER),
        @Result(column="roleId", property="roleid", jdbcType=JdbcType.INTEGER)
    })
    List<Sys_ower> selectByExample(Sys_owerExample example);

    @Select({
        "select",
        "olId, olName, olAccount, olPasswd, powerId, olPhone, olHeadimg, olMember, roleId",
        "from sys_ower",
        "where olId = #{olid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="olId", property="olid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="olName", property="olname", jdbcType=JdbcType.VARCHAR),
        @Result(column="olAccount", property="olaccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="olPasswd", property="olpasswd", jdbcType=JdbcType.VARCHAR),
        @Result(column="powerId", property="powerid", jdbcType=JdbcType.VARCHAR),
        @Result(column="olPhone", property="olphone", jdbcType=JdbcType.VARCHAR),
        @Result(column="olHeadimg", property="olheadimg", jdbcType=JdbcType.VARCHAR),
        @Result(column="olMember", property="olmember", jdbcType=JdbcType.INTEGER),
        @Result(column="roleId", property="roleid", jdbcType=JdbcType.INTEGER)
    })
    Sys_ower selectByPrimaryKey(Integer olid);

    @UpdateProvider(type=Sys_owerSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Sys_ower record, @Param("example") Sys_owerExample example);

    @UpdateProvider(type=Sys_owerSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Sys_ower record, @Param("example") Sys_owerExample example);

    @UpdateProvider(type=Sys_owerSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Sys_ower record);

    @Update({
        "update sys_ower",
        "set olName = #{olname,jdbcType=VARCHAR},",
          "olAccount = #{olaccount,jdbcType=VARCHAR},",
          "olPasswd = #{olpasswd,jdbcType=VARCHAR},",
          "powerId = #{powerid,jdbcType=VARCHAR},",
          "olPhone = #{olphone,jdbcType=VARCHAR},",
          "olHeadimg = #{olheadimg,jdbcType=VARCHAR},",
          "olMember = #{olmember,jdbcType=INTEGER},",
          "roleId = #{roleid,jdbcType=INTEGER}",
        "where olId = #{olid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Sys_ower record);
}