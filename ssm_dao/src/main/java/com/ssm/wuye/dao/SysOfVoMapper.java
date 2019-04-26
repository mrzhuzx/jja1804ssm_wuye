package com.ssm.wuye.dao;

import com.ssm.wuye.domain.SysOfVo;
import com.ssm.wuye.domain.SysOfVoExample;
import java.util.List;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface SysOfVoMapper {
    @SelectProvider(type=SysOfVoSqlProvider.class, method="countByExample")
    long countByExample(SysOfVoExample example);

    @DeleteProvider(type=SysOfVoSqlProvider.class, method="deleteByExample")
    int deleteByExample(SysOfVoExample example);

    @Insert({
        "insert into sys_of_vo (ofId, ofName, ",
        "ofSex, ofHomeplace, ",
        "ofTel, ofNexus, ",
        "olName)",
        "values (#{ofid,jdbcType=INTEGER}, #{ofname,jdbcType=VARCHAR}, ",
        "#{ofsex,jdbcType=VARCHAR}, #{ofhomeplace,jdbcType=VARCHAR}, ",
        "#{oftel,jdbcType=VARCHAR}, #{ofnexus,jdbcType=VARCHAR}, ",
        "#{olname,jdbcType=VARCHAR})"
    })
    int insert(SysOfVo record);

    @InsertProvider(type=SysOfVoSqlProvider.class, method="insertSelective")
    int insertSelective(SysOfVo record);

    @SelectProvider(type=SysOfVoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ofId", property="ofid", jdbcType=JdbcType.INTEGER),
        @Result(column="ofName", property="ofname", jdbcType=JdbcType.VARCHAR),
        @Result(column="ofSex", property="ofsex", jdbcType=JdbcType.VARCHAR),
        @Result(column="ofHomeplace", property="ofhomeplace", jdbcType=JdbcType.VARCHAR),
        @Result(column="ofTel", property="oftel", jdbcType=JdbcType.VARCHAR),
        @Result(column="ofNexus", property="ofnexus", jdbcType=JdbcType.VARCHAR),
        @Result(column="olName", property="olname", jdbcType=JdbcType.VARCHAR)
    })
    List<SysOfVo> selectByExampleWithRowbounds(SysOfVoExample example, RowBounds rowBounds);

    @SelectProvider(type=SysOfVoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ofId", property="ofid", jdbcType=JdbcType.INTEGER),
        @Result(column="ofName", property="ofname", jdbcType=JdbcType.VARCHAR),
        @Result(column="ofSex", property="ofsex", jdbcType=JdbcType.VARCHAR),
        @Result(column="ofHomeplace", property="ofhomeplace", jdbcType=JdbcType.VARCHAR),
        @Result(column="ofTel", property="oftel", jdbcType=JdbcType.VARCHAR),
        @Result(column="ofNexus", property="ofnexus", jdbcType=JdbcType.VARCHAR),
        @Result(column="olName", property="olname", jdbcType=JdbcType.VARCHAR)
    })
    List<SysOfVo> selectByExample(SysOfVoExample example);

    @UpdateProvider(type=SysOfVoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SysOfVo record, @Param("example") SysOfVoExample example);

    @UpdateProvider(type=SysOfVoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SysOfVo record, @Param("example") SysOfVoExample example);
}