package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Sys_ower_family;
import com.ssm.wuye.domain.Sys_ower_familyExample;
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

public interface Sys_ower_familyMapper {
    @SelectProvider(type=Sys_ower_familySqlProvider.class, method="countByExample")
    long countByExample(Sys_ower_familyExample example);

    @DeleteProvider(type=Sys_ower_familySqlProvider.class, method="deleteByExample")
    int deleteByExample(Sys_ower_familyExample example);

    @Delete({
        "delete from sys_ower_family",
        "where ofId = #{ofid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer ofid);

    @Insert({
        "insert into sys_ower_family (ofId, ofName, ",
        "ofSex, ofHomeplace, ",
        "ofTel, ofNexus, ",
        "olId)",
        "values (#{ofid,jdbcType=INTEGER}, #{ofname,jdbcType=VARCHAR}, ",
        "#{ofsex,jdbcType=VARCHAR}, #{ofhomeplace,jdbcType=VARCHAR}, ",
        "#{oftel,jdbcType=VARCHAR}, #{ofnexus,jdbcType=VARCHAR}, ",
        "#{olid,jdbcType=INTEGER})"
    })
    int insert(Sys_ower_family record);

    @InsertProvider(type=Sys_ower_familySqlProvider.class, method="insertSelective")
    int insertSelective(Sys_ower_family record);

    @SelectProvider(type=Sys_ower_familySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ofId", property="ofid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ofName", property="ofname", jdbcType=JdbcType.VARCHAR),
        @Result(column="ofSex", property="ofsex", jdbcType=JdbcType.VARCHAR),
        @Result(column="ofHomeplace", property="ofhomeplace", jdbcType=JdbcType.VARCHAR),
        @Result(column="ofTel", property="oftel", jdbcType=JdbcType.VARCHAR),
        @Result(column="ofNexus", property="ofnexus", jdbcType=JdbcType.VARCHAR),
        @Result(column="olId", property="olid", jdbcType=JdbcType.INTEGER)
    })
    List<Sys_ower_family> selectByExampleWithRowbounds(Sys_ower_familyExample example, RowBounds rowBounds);

    @SelectProvider(type=Sys_ower_familySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ofId", property="ofid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ofName", property="ofname", jdbcType=JdbcType.VARCHAR),
        @Result(column="ofSex", property="ofsex", jdbcType=JdbcType.VARCHAR),
        @Result(column="ofHomeplace", property="ofhomeplace", jdbcType=JdbcType.VARCHAR),
        @Result(column="ofTel", property="oftel", jdbcType=JdbcType.VARCHAR),
        @Result(column="ofNexus", property="ofnexus", jdbcType=JdbcType.VARCHAR),
        @Result(column="olId", property="olid", jdbcType=JdbcType.INTEGER)
    })
    List<Sys_ower_family> selectByExample(Sys_ower_familyExample example);

    @Select({
        "select",
        "ofId, ofName, ofSex, ofHomeplace, ofTel, ofNexus, olId",
        "from sys_ower_family",
        "where ofId = #{ofid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ofId", property="ofid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ofName", property="ofname", jdbcType=JdbcType.VARCHAR),
        @Result(column="ofSex", property="ofsex", jdbcType=JdbcType.VARCHAR),
        @Result(column="ofHomeplace", property="ofhomeplace", jdbcType=JdbcType.VARCHAR),
        @Result(column="ofTel", property="oftel", jdbcType=JdbcType.VARCHAR),
        @Result(column="ofNexus", property="ofnexus", jdbcType=JdbcType.VARCHAR),
        @Result(column="olId", property="olid", jdbcType=JdbcType.INTEGER)
    })
    Sys_ower_family selectByPrimaryKey(Integer ofid);

    @UpdateProvider(type=Sys_ower_familySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Sys_ower_family record, @Param("example") Sys_ower_familyExample example);

    @UpdateProvider(type=Sys_ower_familySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Sys_ower_family record, @Param("example") Sys_ower_familyExample example);

    @UpdateProvider(type=Sys_ower_familySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Sys_ower_family record);

    @Update({
        "update sys_ower_family",
        "set ofName = #{ofname,jdbcType=VARCHAR},",
          "ofSex = #{ofsex,jdbcType=VARCHAR},",
          "ofHomeplace = #{ofhomeplace,jdbcType=VARCHAR},",
          "ofTel = #{oftel,jdbcType=VARCHAR},",
          "ofNexus = #{ofnexus,jdbcType=VARCHAR},",
          "olId = #{olid,jdbcType=INTEGER}",
        "where ofId = #{ofid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Sys_ower_family record);
}