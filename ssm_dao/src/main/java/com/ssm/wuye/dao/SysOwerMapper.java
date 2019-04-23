package com.ssm.wuye.dao;

import com.ssm.wuye.domain.SysOwer;
import com.ssm.wuye.domain.SysOwerExample;
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

public interface SysOwerMapper {
    @SelectProvider(type=SysOwerSqlProvider.class, method="countByExample")
    long countByExample(SysOwerExample example);

    @DeleteProvider(type=SysOwerSqlProvider.class, method="deleteByExample")
    int deleteByExample(SysOwerExample example);

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
    int insert(SysOwer record);

    @InsertProvider(type=SysOwerSqlProvider.class, method="insertSelective")
    int insertSelective(SysOwer record);

    @SelectProvider(type=SysOwerSqlProvider.class, method="selectByExample")
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
    List<SysOwer> selectByExampleWithRowbounds(SysOwerExample example, RowBounds rowBounds);

    @SelectProvider(type=SysOwerSqlProvider.class, method="selectByExample")
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
    List<SysOwer> selectByExample(SysOwerExample example);

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
    SysOwer selectByPrimaryKey(Integer olid);

    @UpdateProvider(type=SysOwerSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SysOwer record, @Param("example") SysOwerExample example);

    @UpdateProvider(type=SysOwerSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SysOwer record, @Param("example") SysOwerExample example);

    @UpdateProvider(type=SysOwerSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SysOwer record);

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
    int updateByPrimaryKey(SysOwer record);
}