package com.ssm.wuye.dao;

import com.ssm.wuye.domain.ProgramType;
import com.ssm.wuye.domain.ProgramTypeExample;
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

public interface ProgramTypeMapper {
    @SelectProvider(type=ProgramTypeSqlProvider.class, method="countByExample")
    long countByExample(ProgramTypeExample example);

    @DeleteProvider(type=ProgramTypeSqlProvider.class, method="deleteByExample")
    int deleteByExample(ProgramTypeExample example);

    @Delete({
        "delete from program_type",
        "where ptid = #{ptid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer ptid);

    @Insert({
        "insert into program_type (ptid, ptypename)",
        "values (#{ptid,jdbcType=INTEGER}, #{ptypename,jdbcType=VARCHAR})"
    })
    int insert(ProgramType record);

    @InsertProvider(type=ProgramTypeSqlProvider.class, method="insertSelective")
    int insertSelective(ProgramType record);

    @SelectProvider(type=ProgramTypeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ptid", property="ptid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ptypename", property="ptypename", jdbcType=JdbcType.VARCHAR)
    })
    List<ProgramType> selectByExampleWithRowbounds(ProgramTypeExample example, RowBounds rowBounds);

    @SelectProvider(type=ProgramTypeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ptid", property="ptid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ptypename", property="ptypename", jdbcType=JdbcType.VARCHAR)
    })
    List<ProgramType> selectByExample(ProgramTypeExample example);

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
    ProgramType selectByPrimaryKey(Integer ptid);

    @UpdateProvider(type=ProgramTypeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ProgramType record, @Param("example") ProgramTypeExample example);

    @UpdateProvider(type=ProgramTypeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ProgramType record, @Param("example") ProgramTypeExample example);

    @UpdateProvider(type=ProgramTypeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ProgramType record);

    @Update({
        "update program_type",
        "set ptypename = #{ptypename,jdbcType=VARCHAR}",
        "where ptid = #{ptid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ProgramType record);
}