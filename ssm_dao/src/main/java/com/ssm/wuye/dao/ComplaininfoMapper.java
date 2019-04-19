package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Complaininfo;
import com.ssm.wuye.domain.ComplaininfoExample;
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

public interface ComplaininfoMapper {
    @SelectProvider(type=ComplaininfoSqlProvider.class, method="countByExample")
    long countByExample(ComplaininfoExample example);

    @DeleteProvider(type=ComplaininfoSqlProvider.class, method="deleteByExample")
    int deleteByExample(ComplaininfoExample example);

    @Delete({
        "delete from complaininfo",
        "where cid = #{cid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer cid);

    @Insert({
        "insert into complaininfo (cid, title, ",
        "descr, cname, cphone, ",
        "rname, status, means, ",
        "cdate, dealdescr)",
        "values (#{cid,jdbcType=INTEGER}, #{title,jdbcType=VARCHAR}, ",
        "#{descr,jdbcType=VARCHAR}, #{cname,jdbcType=VARCHAR}, #{cphone,jdbcType=VARCHAR}, ",
        "#{rname,jdbcType=VARCHAR}, #{status,jdbcType=INTEGER}, #{means,jdbcType=INTEGER}, ",
        "#{cdate,jdbcType=TIMESTAMP}, #{dealdescr,jdbcType=VARCHAR})"
    })
    int insert(Complaininfo record);

    @InsertProvider(type=ComplaininfoSqlProvider.class, method="insertSelective")
    int insertSelective(Complaininfo record);

    @SelectProvider(type=ComplaininfoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="cid", property="cid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="descr", property="descr", jdbcType=JdbcType.VARCHAR),
        @Result(column="cname", property="cname", jdbcType=JdbcType.VARCHAR),
        @Result(column="cphone", property="cphone", jdbcType=JdbcType.VARCHAR),
        @Result(column="rname", property="rname", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="means", property="means", jdbcType=JdbcType.INTEGER),
        @Result(column="cdate", property="cdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="dealdescr", property="dealdescr", jdbcType=JdbcType.VARCHAR)
    })
    List<Complaininfo> selectByExampleWithRowbounds(ComplaininfoExample example, RowBounds rowBounds);

    @SelectProvider(type=ComplaininfoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="cid", property="cid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="descr", property="descr", jdbcType=JdbcType.VARCHAR),
        @Result(column="cname", property="cname", jdbcType=JdbcType.VARCHAR),
        @Result(column="cphone", property="cphone", jdbcType=JdbcType.VARCHAR),
        @Result(column="rname", property="rname", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="means", property="means", jdbcType=JdbcType.INTEGER),
        @Result(column="cdate", property="cdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="dealdescr", property="dealdescr", jdbcType=JdbcType.VARCHAR)
    })
    List<Complaininfo> selectByExample(ComplaininfoExample example);

    @Select({
        "select",
        "cid, title, descr, cname, cphone, rname, status, means, cdate, dealdescr",
        "from complaininfo",
        "where cid = #{cid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="cid", property="cid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="descr", property="descr", jdbcType=JdbcType.VARCHAR),
        @Result(column="cname", property="cname", jdbcType=JdbcType.VARCHAR),
        @Result(column="cphone", property="cphone", jdbcType=JdbcType.VARCHAR),
        @Result(column="rname", property="rname", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="means", property="means", jdbcType=JdbcType.INTEGER),
        @Result(column="cdate", property="cdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="dealdescr", property="dealdescr", jdbcType=JdbcType.VARCHAR)
    })
    Complaininfo selectByPrimaryKey(Integer cid);

    @UpdateProvider(type=ComplaininfoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Complaininfo record, @Param("example") ComplaininfoExample example);

    @UpdateProvider(type=ComplaininfoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Complaininfo record, @Param("example") ComplaininfoExample example);

    @UpdateProvider(type=ComplaininfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Complaininfo record);

    @Update({
        "update complaininfo",
        "set title = #{title,jdbcType=VARCHAR},",
          "descr = #{descr,jdbcType=VARCHAR},",
          "cname = #{cname,jdbcType=VARCHAR},",
          "cphone = #{cphone,jdbcType=VARCHAR},",
          "rname = #{rname,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=INTEGER},",
          "means = #{means,jdbcType=INTEGER},",
          "cdate = #{cdate,jdbcType=TIMESTAMP},",
          "dealdescr = #{dealdescr,jdbcType=VARCHAR}",
        "where cid = #{cid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Complaininfo record);
}