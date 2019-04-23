package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Program_type;
import com.ssm.wuye.domain.Program_typeExample;
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

public interface Program_typeMapper {
    @SelectProvider(type=Program_typeSqlProvider.class, method="countByExample")
    long countByExample(Program_typeExample example);

    @DeleteProvider(type=Program_typeSqlProvider.class, method="deleteByExample")
    int deleteByExample(Program_typeExample example);

    @Delete({
        "delete from program_type",
        "where ptid = #{ptid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer ptid);

    @Insert({
        "insert into program_type (ptid, ptypename)",
        "values (#{ptid,jdbcType=INTEGER}, #{ptypename,jdbcType=VARCHAR})"
    })
    int insert(Program_type record);

    @InsertProvider(type=Program_typeSqlProvider.class, method="insertSelective")
    int insertSelective(Program_type record);

    @SelectProvider(type=Program_typeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ptid", property="ptid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ptypename", property="ptypename", jdbcType=JdbcType.VARCHAR)
    })
    List<Program_type> selectByExampleWithRowbounds(Program_typeExample example, RowBounds rowBounds);

    @SelectProvider(type=Program_typeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ptid", property="ptid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ptypename", property="ptypename", jdbcType=JdbcType.VARCHAR)
    })
    List<Program_type> selectByExample(Program_typeExample example);

    @Select({
        "select",
        "ptid, ptypename",
        "from program_type",
        "where ptid = #{ptid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ptid", property="ptid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ptypename", property="ptypename", jdbcType=JdbcType.VARCHAR)
    })
    Program_type selectByPrimaryKey(Integer ptid);

    @UpdateProvider(type=Program_typeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Program_type record, @Param("example") Program_typeExample example);

    @UpdateProvider(type=Program_typeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Program_type record, @Param("example") Program_typeExample example);

    @UpdateProvider(type=Program_typeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Program_type record);

    @Update({
        "update program_type",
        "set ptypename = #{ptypename,jdbcType=VARCHAR}",
        "where ptid = #{ptid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Program_type record);
}