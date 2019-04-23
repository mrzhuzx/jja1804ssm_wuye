package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Sys_role;
import com.ssm.wuye.domain.Sys_roleExample;
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

public interface Sys_roleMapper {
    @SelectProvider(type=Sys_roleSqlProvider.class, method="countByExample")
    long countByExample(Sys_roleExample example);

    @DeleteProvider(type=Sys_roleSqlProvider.class, method="deleteByExample")
    int deleteByExample(Sys_roleExample example);

    @Delete({
        "delete from sys_role",
        "where roleId = #{roleid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer roleid);

    @Insert({
        "insert into sys_role (roleId, roleName, ",
        "roleStatus)",
        "values (#{roleid,jdbcType=INTEGER}, #{rolename,jdbcType=VARCHAR}, ",
        "#{rolestatus,jdbcType=VARCHAR})"
    })
    int insert(Sys_role record);

    @InsertProvider(type=Sys_roleSqlProvider.class, method="insertSelective")
    int insertSelective(Sys_role record);

    @SelectProvider(type=Sys_roleSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="roleId", property="roleid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="roleName", property="rolename", jdbcType=JdbcType.VARCHAR),
        @Result(column="roleStatus", property="rolestatus", jdbcType=JdbcType.VARCHAR)
    })
    List<Sys_role> selectByExampleWithRowbounds(Sys_roleExample example, RowBounds rowBounds);

    @SelectProvider(type=Sys_roleSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="roleId", property="roleid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="roleName", property="rolename", jdbcType=JdbcType.VARCHAR),
        @Result(column="roleStatus", property="rolestatus", jdbcType=JdbcType.VARCHAR)
    })
    List<Sys_role> selectByExample(Sys_roleExample example);

    @Select({
        "select",
        "roleId, roleName, roleStatus",
        "from sys_role",
        "where roleId = #{roleid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="roleId", property="roleid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="roleName", property="rolename", jdbcType=JdbcType.VARCHAR),
        @Result(column="roleStatus", property="rolestatus", jdbcType=JdbcType.VARCHAR)
    })
    Sys_role selectByPrimaryKey(Integer roleid);

    @UpdateProvider(type=Sys_roleSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Sys_role record, @Param("example") Sys_roleExample example);

    @UpdateProvider(type=Sys_roleSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Sys_role record, @Param("example") Sys_roleExample example);

    @UpdateProvider(type=Sys_roleSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Sys_role record);

    @Update({
        "update sys_role",
        "set roleName = #{rolename,jdbcType=VARCHAR},",
          "roleStatus = #{rolestatus,jdbcType=VARCHAR}",
        "where roleId = #{roleid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Sys_role record);
}