package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Program;
import com.ssm.wuye.domain.ProgramExample;
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

public interface ProgramMapper {
    @SelectProvider(type=ProgramSqlProvider.class, method="countByExample")
    long countByExample(ProgramExample example);

    @DeleteProvider(type=ProgramSqlProvider.class, method="deleteByExample")
    int deleteByExample(ProgramExample example);

    @Delete({
        "delete from program",
        "where pid = #{pid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer pid);

    @Insert({
        "insert into program (pid, pname, ",
        "ppicture, pintroduce, ",
        "padress, ptid)",
        "values (#{pid,jdbcType=INTEGER}, #{pname,jdbcType=VARCHAR}, ",
        "#{ppicture,jdbcType=VARCHAR}, #{pintroduce,jdbcType=VARCHAR}, ",
        "#{padress,jdbcType=VARCHAR}, #{ptid,jdbcType=INTEGER})"
    })
    int insert(Program record);

    @InsertProvider(type=ProgramSqlProvider.class, method="insertSelective")
    int insertSelective(Program record);

    @SelectProvider(type=ProgramSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="pid", property="pid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="pname", property="pname", jdbcType=JdbcType.VARCHAR),
        @Result(column="ppicture", property="ppicture", jdbcType=JdbcType.VARCHAR),
        @Result(column="pintroduce", property="pintroduce", jdbcType=JdbcType.VARCHAR),
        @Result(column="padress", property="padress", jdbcType=JdbcType.VARCHAR),
        @Result(column="ptid", property="ptid", jdbcType=JdbcType.INTEGER)
    })
    List<Program> selectByExampleWithRowbounds(ProgramExample example, RowBounds rowBounds);

    @SelectProvider(type=ProgramSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="pid", property="pid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="pname", property="pname", jdbcType=JdbcType.VARCHAR),
        @Result(column="ppicture", property="ppicture", jdbcType=JdbcType.VARCHAR),
        @Result(column="pintroduce", property="pintroduce", jdbcType=JdbcType.VARCHAR),
        @Result(column="padress", property="padress", jdbcType=JdbcType.VARCHAR),
        @Result(column="ptid", property="ptid", jdbcType=JdbcType.INTEGER)
    })
    List<Program> selectByExample(ProgramExample example);

    @Select({
        "select",
        "pid, pname, ppicture, pintroduce, padress, ptid",
        "from program",
        "where pid = #{pid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="pid", property="pid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="pname", property="pname", jdbcType=JdbcType.VARCHAR),
        @Result(column="ppicture", property="ppicture", jdbcType=JdbcType.VARCHAR),
        @Result(column="pintroduce", property="pintroduce", jdbcType=JdbcType.VARCHAR),
        @Result(column="padress", property="padress", jdbcType=JdbcType.VARCHAR),
        @Result(column="ptid", property="ptid", jdbcType=JdbcType.INTEGER)
    })
    Program selectByPrimaryKey(Integer pid);

    @UpdateProvider(type=ProgramSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Program record, @Param("example") ProgramExample example);

    @UpdateProvider(type=ProgramSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Program record, @Param("example") ProgramExample example);

    @UpdateProvider(type=ProgramSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Program record);

    @Update({
        "update program",
        "set pname = #{pname,jdbcType=VARCHAR},",
          "ppicture = #{ppicture,jdbcType=VARCHAR},",
          "pintroduce = #{pintroduce,jdbcType=VARCHAR},",
          "padress = #{padress,jdbcType=VARCHAR},",
          "ptid = #{ptid,jdbcType=INTEGER}",
        "where pid = #{pid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Program record);
}