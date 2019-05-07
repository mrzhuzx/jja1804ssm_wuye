package com.ssm.wuye.dao;

import com.ssm.wuye.domain.News;
import com.ssm.wuye.domain.NewsExample;
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

public interface NewsMapper {
    @SelectProvider(type=NewsSqlProvider.class, method="countByExample")
    int countByExample(NewsExample example);

    @DeleteProvider(type=NewsSqlProvider.class, method="deleteByExample")
    int deleteByExample(NewsExample example);

    @Delete({
        "delete from news",
        "where ncid = #{ncid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer ncid);

    @Insert({
        "insert into news (ncid, nctitle, ",
        "nccontent, nctime, ",
        "nctypeid)",
        "values (#{ncid,jdbcType=INTEGER}, #{nctitle,jdbcType=VARCHAR}, ",
        "#{nccontent,jdbcType=VARCHAR}, #{nctime,jdbcType=DATE}, ",
        "#{nctypeid,jdbcType=INTEGER})"
    })
    int insert(News record);

    @InsertProvider(type=NewsSqlProvider.class, method="insertSelective")
    int insertSelective(News record);

    @SelectProvider(type=NewsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ncid", property="ncid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="nctitle", property="nctitle", jdbcType=JdbcType.VARCHAR),
        @Result(column="nccontent", property="nccontent", jdbcType=JdbcType.VARCHAR),
        @Result(column="nctime", property="nctime", jdbcType=JdbcType.DATE),
        @Result(column="nctypeid", property="nctypeid", jdbcType=JdbcType.INTEGER)
    })
    List<News> selectByExampleWithRowbounds(NewsExample example, RowBounds rowBounds);

    @SelectProvider(type=NewsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ncid", property="ncid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="nctitle", property="nctitle", jdbcType=JdbcType.VARCHAR),
        @Result(column="nccontent", property="nccontent", jdbcType=JdbcType.VARCHAR),
        @Result(column="nctime", property="nctime", jdbcType=JdbcType.DATE),
        @Result(column="nctypeid", property="nctypeid", jdbcType=JdbcType.INTEGER)
    })
    List<News> selectByExample(NewsExample example);

    @Select({
        "select",
        "ncid, nctitle, nccontent, nctime, nctypeid",
        "from news",
        "where ncid = #{ncid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ncid", property="ncid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="nctitle", property="nctitle", jdbcType=JdbcType.VARCHAR),
        @Result(column="nccontent", property="nccontent", jdbcType=JdbcType.VARCHAR),
        @Result(column="nctime", property="nctime", jdbcType=JdbcType.DATE),
        @Result(column="nctypeid", property="nctypeid", jdbcType=JdbcType.INTEGER)
    })
    News selectByPrimaryKey(Integer ncid);

    @UpdateProvider(type=NewsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") News record, @Param("example") NewsExample example);

    @UpdateProvider(type=NewsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") News record, @Param("example") NewsExample example);

    @UpdateProvider(type=NewsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(News record);

    @Update({
        "update news",
        "set nctitle = #{nctitle,jdbcType=VARCHAR},",
          "nccontent = #{nccontent,jdbcType=VARCHAR},",
          "nctime = #{nctime,jdbcType=DATE},",
          "nctypeid = #{nctypeid,jdbcType=INTEGER}",
        "where ncid = #{ncid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(News record);
}