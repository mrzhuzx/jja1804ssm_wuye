package com.ssm.wuye.dao;

import com.ssm.wuye.domain.SysRole;
import com.ssm.wuye.domain.SysRoleExample;
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

public interface SysRoleMapper {
    @SelectProvider(type=SysRoleSqlProvider.class, method="countByExample")
    long countByExample(SysRoleExample example);

    @DeleteProvider(type=SysRoleSqlProvider.class, method="deleteByExample")
    int deleteByExample(SysRoleExample example);

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
    int insert(SysRole record);

    @InsertProvider(type=SysRoleSqlProvider.class, method="insertSelective")
    int insertSelective(SysRole record);

    @SelectProvider(type=SysRoleSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="roleId", property="roleid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="roleName", property="rolename", jdbcType=JdbcType.VARCHAR),
        @Result(column="roleStatus", property="rolestatus", jdbcType=JdbcType.VARCHAR)
    })
    List<SysRole> selectByExampleWithRowbounds(SysRoleExample example, RowBounds rowBounds);

    @SelectProvider(type=SysRoleSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="roleId", property="roleid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="roleName", property="rolename", jdbcType=JdbcType.VARCHAR),
        @Result(column="roleStatus", property="rolestatus", jdbcType=JdbcType.VARCHAR)
    })
    List<SysRole> selectByExample(SysRoleExample example);

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
    SysRole selectByPrimaryKey(Integer roleid);

    @UpdateProvider(type=SysRoleSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    @UpdateProvider(type=SysRoleSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    @UpdateProvider(type=SysRoleSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SysRole record);

    @Update({
        "update sys_role",
        "set roleName = #{rolename,jdbcType=VARCHAR},",
          "roleStatus = #{rolestatus,jdbcType=VARCHAR}",
        "where roleId = #{roleid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SysRole record);
}