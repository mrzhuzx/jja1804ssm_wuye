package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Owerfamily;
import com.ssm.wuye.domain.OwerfamilyExample;
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

public interface OwerfamilyMapper {
    @SelectProvider(type=OwerfamilySqlProvider.class, method="countByExample")
    long countByExample(OwerfamilyExample example);

    @DeleteProvider(type=OwerfamilySqlProvider.class, method="deleteByExample")
    int deleteByExample(OwerfamilyExample example);

    @Delete({
        "delete from owerfamily",
        "where ofId = #{ofid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer ofid);

    @Insert({
        "insert into owerfamily (ofId, ofName, ",
        "ofSex, ofHomeplace, ",
        "ofTel, ofNexus, ",
        "olId)",
        "values (#{ofid,jdbcType=INTEGER}, #{ofname,jdbcType=VARCHAR}, ",
        "#{ofsex,jdbcType=VARCHAR}, #{ofhomeplace,jdbcType=VARCHAR}, ",
        "#{oftel,jdbcType=VARCHAR}, #{ofnexus,jdbcType=VARCHAR}, ",
        "#{olid,jdbcType=INTEGER})"
    })
    int insert(Owerfamily record);

    @InsertProvider(type=OwerfamilySqlProvider.class, method="insertSelective")
    int insertSelective(Owerfamily record);

    @SelectProvider(type=OwerfamilySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ofId", property="ofid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ofName", property="ofname", jdbcType=JdbcType.VARCHAR),
        @Result(column="ofSex", property="ofsex", jdbcType=JdbcType.VARCHAR),
        @Result(column="ofHomeplace", property="ofhomeplace", jdbcType=JdbcType.VARCHAR),
        @Result(column="ofTel", property="oftel", jdbcType=JdbcType.VARCHAR),
        @Result(column="ofNexus", property="ofnexus", jdbcType=JdbcType.VARCHAR),
        @Result(column="olId", property="olid", jdbcType=JdbcType.INTEGER)
    })
    List<Owerfamily> selectByExampleWithRowbounds(OwerfamilyExample example, RowBounds rowBounds);

    @SelectProvider(type=OwerfamilySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ofId", property="ofid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ofName", property="ofname", jdbcType=JdbcType.VARCHAR),
        @Result(column="ofSex", property="ofsex", jdbcType=JdbcType.VARCHAR),
        @Result(column="ofHomeplace", property="ofhomeplace", jdbcType=JdbcType.VARCHAR),
        @Result(column="ofTel", property="oftel", jdbcType=JdbcType.VARCHAR),
        @Result(column="ofNexus", property="ofnexus", jdbcType=JdbcType.VARCHAR),
        @Result(column="olId", property="olid", jdbcType=JdbcType.INTEGER)
    })
    List<Owerfamily> selectByExample(OwerfamilyExample example);

    @Select({
        "select",
        "ofId, ofName, ofSex, ofHomeplace, ofTel, ofNexus, olId",
        "from owerfamily",
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
    Owerfamily selectByPrimaryKey(Integer ofid);

    @UpdateProvider(type=OwerfamilySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Owerfamily record, @Param("example") OwerfamilyExample example);

    @UpdateProvider(type=OwerfamilySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Owerfamily record, @Param("example") OwerfamilyExample example);

    @UpdateProvider(type=OwerfamilySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Owerfamily record);

    @Update({
        "update owerfamily",
        "set ofName = #{ofname,jdbcType=VARCHAR},",
          "ofSex = #{ofsex,jdbcType=VARCHAR},",
          "ofHomeplace = #{ofhomeplace,jdbcType=VARCHAR},",
          "ofTel = #{oftel,jdbcType=VARCHAR},",
          "ofNexus = #{ofnexus,jdbcType=VARCHAR},",
          "olId = #{olid,jdbcType=INTEGER}",
        "where ofId = #{ofid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Owerfamily record);
}