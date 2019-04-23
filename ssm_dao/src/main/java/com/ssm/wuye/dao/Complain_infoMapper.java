package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Complain_info;
import com.ssm.wuye.domain.Complain_infoExample;
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

public interface Complain_infoMapper {
    @SelectProvider(type=Complain_infoSqlProvider.class, method="countByExample")
    long countByExample(Complain_infoExample example);

    @DeleteProvider(type=Complain_infoSqlProvider.class, method="deleteByExample")
    int deleteByExample(Complain_infoExample example);

    @Delete({
        "delete from complain_info",
        "where cid = #{cid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer cid);

    @Insert({
        "insert into complain_info (cid, title, ",
        "descr, cname, cphone, ",
        "rname, status, means, ",
        "cdate, dealdescr)",
        "values (#{cid,jdbcType=INTEGER}, #{title,jdbcType=VARCHAR}, ",
        "#{descr,jdbcType=VARCHAR}, #{cname,jdbcType=VARCHAR}, #{cphone,jdbcType=VARCHAR}, ",
        "#{rname,jdbcType=VARCHAR}, #{status,jdbcType=INTEGER}, #{means,jdbcType=INTEGER}, ",
        "#{cdate,jdbcType=TIMESTAMP}, #{dealdescr,jdbcType=VARCHAR})"
    })
    int insert(Complain_info record);

    @InsertProvider(type=Complain_infoSqlProvider.class, method="insertSelective")
    int insertSelective(Complain_info record);

    @SelectProvider(type=Complain_infoSqlProvider.class, method="selectByExample")
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
    List<Complain_info> selectByExampleWithRowbounds(Complain_infoExample example, RowBounds rowBounds);

    @SelectProvider(type=Complain_infoSqlProvider.class, method="selectByExample")
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
    List<Complain_info> selectByExample(Complain_infoExample example);

    @Select({
        "select",
        "cid, title, descr, cname, cphone, rname, status, means, cdate, dealdescr",
        "from complain_info",
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
    Complain_info selectByPrimaryKey(Integer cid);

    @UpdateProvider(type=Complain_infoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Complain_info record, @Param("example") Complain_infoExample example);

    @UpdateProvider(type=Complain_infoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Complain_info record, @Param("example") Complain_infoExample example);

    @UpdateProvider(type=Complain_infoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Complain_info record);

    @Update({
        "update complain_info",
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
    int updateByPrimaryKey(Complain_info record);
}