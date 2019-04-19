package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Role;
import com.ssm.wuye.domain.RoleExample;
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

public interface RoleMapper {
    @SelectProvider(type=RoleSqlProvider.class, method="countByExample")
    long countByExample(RoleExample example);

    @DeleteProvider(type=RoleSqlProvider.class, method="deleteByExample")
    int deleteByExample(RoleExample example);

    @Delete({
        "delete from role",
        "where roleId = #{roleid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer roleid);

    @Insert({
        "insert into role (roleId, roleName, ",
        "roleStatus)",
        "values (#{roleid,jdbcType=INTEGER}, #{rolename,jdbcType=VARCHAR}, ",
        "#{rolestatus,jdbcType=VARCHAR})"
    })
    int insert(Role record);

    @InsertProvider(type=RoleSqlProvider.class, method="insertSelective")
    int insertSelective(Role record);

    @SelectProvider(type=RoleSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="roleId", property="roleid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="roleName", property="rolename", jdbcType=JdbcType.VARCHAR),
        @Result(column="roleStatus", property="rolestatus", jdbcType=JdbcType.VARCHAR)
    })
    List<Role> selectByExampleWithRowbounds(RoleExample example, RowBounds rowBounds);

    @SelectProvider(type=RoleSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="roleId", property="roleid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="roleName", property="rolename", jdbcType=JdbcType.VARCHAR),
        @Result(column="roleStatus", property="rolestatus", jdbcType=JdbcType.VARCHAR)
    })
    List<Role> selectByExample(RoleExample example);

    @Select({
        "select",
        "roleId, roleName, roleStatus",
        "from role",
        "where roleId = #{roleid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="roleId", property="roleid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="roleName", property="rolename", jdbcType=JdbcType.VARCHAR),
        @Result(column="roleStatus", property="rolestatus", jdbcType=JdbcType.VARCHAR)
    })
    Role selectByPrimaryKey(Integer roleid);

    @UpdateProvider(type=RoleSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    @UpdateProvider(type=RoleSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    @UpdateProvider(type=RoleSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Role record);

    @Update({
        "update role",
        "set roleName = #{rolename,jdbcType=VARCHAR},",
          "roleStatus = #{rolestatus,jdbcType=VARCHAR}",
        "where roleId = #{roleid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Role record);
}