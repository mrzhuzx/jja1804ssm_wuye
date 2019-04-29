package com.ssm.wuye.dao;

import com.ssm.wuye.domain.NewsTypeVoiw;
import com.ssm.wuye.domain.NewsTypeVoiwExample;
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

public interface NewsTypeVoiwMapper {
    @SelectProvider(type=NewsTypeVoiwSqlProvider.class, method="countByExample")
    long countByExample(NewsTypeVoiwExample example);

    @DeleteProvider(type=NewsTypeVoiwSqlProvider.class, method="deleteByExample")
    int deleteByExample(NewsTypeVoiwExample example);

    @Insert({
        "insert into newstype_voiw (ntypename, ncid, ",
        "nctitle, nccontent, ",
        "nctime, ntid)",
        "values (#{ntypename,jdbcType=VARCHAR}, #{ncid,jdbcType=INTEGER}, ",
        "#{nctitle,jdbcType=VARCHAR}, #{nccontent,jdbcType=VARCHAR}, ",
        "#{nctime,jdbcType=DATE}, #{ntid,jdbcType=INTEGER})"
    })
    int insert(NewsTypeVoiw record);

    @InsertProvider(type=NewsTypeVoiwSqlProvider.class, method="insertSelective")
    int insertSelective(NewsTypeVoiw record);

    @SelectProvider(type=NewsTypeVoiwSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ntypename", property="ntypename", jdbcType=JdbcType.VARCHAR),
        @Result(column="ncid", property="ncid", jdbcType=JdbcType.INTEGER),
        @Result(column="nctitle", property="nctitle", jdbcType=JdbcType.VARCHAR),
        @Result(column="nccontent", property="nccontent", jdbcType=JdbcType.VARCHAR),
        @Result(column="nctime", property="nctime", jdbcType=JdbcType.DATE),
        @Result(column="ntid", property="ntid", jdbcType=JdbcType.INTEGER)
    })
    List<NewsTypeVoiw> selectByExampleWithRowbounds(NewsTypeVoiwExample example, RowBounds rowBounds);

    @SelectProvider(type=NewsTypeVoiwSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ntypename", property="ntypename", jdbcType=JdbcType.VARCHAR),
        @Result(column="ncid", property="ncid", jdbcType=JdbcType.INTEGER),
        @Result(column="nctitle", property="nctitle", jdbcType=JdbcType.VARCHAR),
        @Result(column="nccontent", property="nccontent", jdbcType=JdbcType.VARCHAR),
        @Result(column="nctime", property="nctime", jdbcType=JdbcType.DATE),
        @Result(column="ntid", property="ntid", jdbcType=JdbcType.INTEGER)
    })
    List<NewsTypeVoiw> selectByExample(NewsTypeVoiwExample example);

    @UpdateProvider(type=NewsTypeVoiwSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") NewsTypeVoiw record, @Param("example") NewsTypeVoiwExample example);

    @UpdateProvider(type=NewsTypeVoiwSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") NewsTypeVoiw record, @Param("example") NewsTypeVoiwExample example);
}