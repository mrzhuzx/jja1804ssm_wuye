package com.ssm.wuye.dao;

import com.ssm.wuye.domain.SysOwerFamily;
import com.ssm.wuye.domain.SysOwerFamilyExample;
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

public interface SysOwerFamilyMapper {
    @SelectProvider(type=SysOwerFamilySqlProvider.class, method="countByExample")
    long countByExample(SysOwerFamilyExample example);

    @DeleteProvider(type=SysOwerFamilySqlProvider.class, method="deleteByExample")
    int deleteByExample(SysOwerFamilyExample example);

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
    int insert(SysOwerFamily record);

    @InsertProvider(type=SysOwerFamilySqlProvider.class, method="insertSelective")
    int insertSelective(SysOwerFamily record);

    @SelectProvider(type=SysOwerFamilySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ofId", property="ofid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ofName", property="ofname", jdbcType=JdbcType.VARCHAR),
        @Result(column="ofSex", property="ofsex", jdbcType=JdbcType.VARCHAR),
        @Result(column="ofHomeplace", property="ofhomeplace", jdbcType=JdbcType.VARCHAR),
        @Result(column="ofTel", property="oftel", jdbcType=JdbcType.VARCHAR),
        @Result(column="ofNexus", property="ofnexus", jdbcType=JdbcType.VARCHAR),
        @Result(column="olId", property="olid", jdbcType=JdbcType.INTEGER)
    })
    List<SysOwerFamily> selectByExampleWithRowbounds(SysOwerFamilyExample example, RowBounds rowBounds);

    @SelectProvider(type=SysOwerFamilySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ofId", property="ofid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ofName", property="ofname", jdbcType=JdbcType.VARCHAR),
        @Result(column="ofSex", property="ofsex", jdbcType=JdbcType.VARCHAR),
        @Result(column="ofHomeplace", property="ofhomeplace", jdbcType=JdbcType.VARCHAR),
        @Result(column="ofTel", property="oftel", jdbcType=JdbcType.VARCHAR),
        @Result(column="ofNexus", property="ofnexus", jdbcType=JdbcType.VARCHAR),
        @Result(column="olId", property="olid", jdbcType=JdbcType.INTEGER)
    })
    List<SysOwerFamily> selectByExample(SysOwerFamilyExample example);

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
    SysOwerFamily selectByPrimaryKey(Integer ofid);

    @UpdateProvider(type=SysOwerFamilySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SysOwerFamily record, @Param("example") SysOwerFamilyExample example);

    @UpdateProvider(type=SysOwerFamilySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SysOwerFamily record, @Param("example") SysOwerFamilyExample example);

    @UpdateProvider(type=SysOwerFamilySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SysOwerFamily record);

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
    int updateByPrimaryKey(SysOwerFamily record);
}