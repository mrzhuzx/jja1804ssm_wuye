package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Ower;
import com.ssm.wuye.domain.OwerExample;
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

public interface OwerMapper {
    @SelectProvider(type=OwerSqlProvider.class, method="countByExample")
    long countByExample(OwerExample example);

    @DeleteProvider(type=OwerSqlProvider.class, method="deleteByExample")
    int deleteByExample(OwerExample example);

    @Delete({
        "delete from ower",
        "where olId = #{olid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer olid);

    @Insert({
        "insert into ower (olId, olName, ",
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
    int insert(Ower record);

    @InsertProvider(type=OwerSqlProvider.class, method="insertSelective")
    int insertSelective(Ower record);

    @SelectProvider(type=OwerSqlProvider.class, method="selectByExample")
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
    List<Ower> selectByExampleWithRowbounds(OwerExample example, RowBounds rowBounds);

    @SelectProvider(type=OwerSqlProvider.class, method="selectByExample")
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
    List<Ower> selectByExample(OwerExample example);

    @Select({
        "select",
        "olId, olName, olAccount, olPasswd, powerId, olPhone, olHeadimg, olMember, roleId",
        "from ower",
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
    Ower selectByPrimaryKey(Integer olid);

    @UpdateProvider(type=OwerSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Ower record, @Param("example") OwerExample example);

    @UpdateProvider(type=OwerSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Ower record, @Param("example") OwerExample example);

    @UpdateProvider(type=OwerSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Ower record);

    @Update({
        "update ower",
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
    int updateByPrimaryKey(Ower record);
}