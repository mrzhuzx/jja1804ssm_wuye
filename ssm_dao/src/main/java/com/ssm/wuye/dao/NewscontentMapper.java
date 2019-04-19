package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Newscontent;
import com.ssm.wuye.domain.NewscontentExample;
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

public interface NewscontentMapper {
    @SelectProvider(type=NewscontentSqlProvider.class, method="countByExample")
    long countByExample(NewscontentExample example);

    @DeleteProvider(type=NewscontentSqlProvider.class, method="deleteByExample")
    int deleteByExample(NewscontentExample example);

    @Delete({
        "delete from newscontent",
        "where ncid = #{ncid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer ncid);

    @Insert({
        "insert into newscontent (ncid, nctitle, ",
        "nccontent, nctime, ",
        "nctypeid)",
        "values (#{ncid,jdbcType=INTEGER}, #{nctitle,jdbcType=VARCHAR}, ",
        "#{nccontent,jdbcType=VARCHAR}, #{nctime,jdbcType=DATE}, ",
        "#{nctypeid,jdbcType=INTEGER})"
    })
    int insert(Newscontent record);

    @InsertProvider(type=NewscontentSqlProvider.class, method="insertSelective")
    int insertSelective(Newscontent record);

    @SelectProvider(type=NewscontentSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ncid", property="ncid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="nctitle", property="nctitle", jdbcType=JdbcType.VARCHAR),
        @Result(column="nccontent", property="nccontent", jdbcType=JdbcType.VARCHAR),
        @Result(column="nctime", property="nctime", jdbcType=JdbcType.DATE),
        @Result(column="nctypeid", property="nctypeid", jdbcType=JdbcType.INTEGER)
    })
    List<Newscontent> selectByExampleWithRowbounds(NewscontentExample example, RowBounds rowBounds);

    @SelectProvider(type=NewscontentSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ncid", property="ncid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="nctitle", property="nctitle", jdbcType=JdbcType.VARCHAR),
        @Result(column="nccontent", property="nccontent", jdbcType=JdbcType.VARCHAR),
        @Result(column="nctime", property="nctime", jdbcType=JdbcType.DATE),
        @Result(column="nctypeid", property="nctypeid", jdbcType=JdbcType.INTEGER)
    })
    List<Newscontent> selectByExample(NewscontentExample example);

    @Select({
        "select",
        "ncid, nctitle, nccontent, nctime, nctypeid",
        "from newscontent",
        "where ncid = #{ncid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ncid", property="ncid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="nctitle", property="nctitle", jdbcType=JdbcType.VARCHAR),
        @Result(column="nccontent", property="nccontent", jdbcType=JdbcType.VARCHAR),
        @Result(column="nctime", property="nctime", jdbcType=JdbcType.DATE),
        @Result(column="nctypeid", property="nctypeid", jdbcType=JdbcType.INTEGER)
    })
    Newscontent selectByPrimaryKey(Integer ncid);

    @UpdateProvider(type=NewscontentSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Newscontent record, @Param("example") NewscontentExample example);

    @UpdateProvider(type=NewscontentSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Newscontent record, @Param("example") NewscontentExample example);

    @UpdateProvider(type=NewscontentSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Newscontent record);

    @Update({
        "update newscontent",
        "set nctitle = #{nctitle,jdbcType=VARCHAR},",
          "nccontent = #{nccontent,jdbcType=VARCHAR},",
          "nctime = #{nctime,jdbcType=DATE},",
          "nctypeid = #{nctypeid,jdbcType=INTEGER}",
        "where ncid = #{ncid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Newscontent record);
}