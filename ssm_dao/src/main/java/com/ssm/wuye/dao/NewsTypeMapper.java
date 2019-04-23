package com.ssm.wuye.dao;

import com.ssm.wuye.domain.NewsType;
import com.ssm.wuye.domain.NewsTypeExample;
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

public interface NewsTypeMapper {
    @SelectProvider(type=NewsTypeSqlProvider.class, method="countByExample")
    long countByExample(NewsTypeExample example);

    @DeleteProvider(type=NewsTypeSqlProvider.class, method="deleteByExample")
    int deleteByExample(NewsTypeExample example);

    @Delete({
        "delete from news_type",
        "where ntid = #{ntid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer ntid);

    @Insert({
        "insert into news_type (ntid, ntypename)",
        "values (#{ntid,jdbcType=INTEGER}, #{ntypename,jdbcType=VARCHAR})"
    })
    int insert(NewsType record);

    @InsertProvider(type=NewsTypeSqlProvider.class, method="insertSelective")
    int insertSelective(NewsType record);

    @SelectProvider(type=NewsTypeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ntid", property="ntid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ntypename", property="ntypename", jdbcType=JdbcType.VARCHAR)
    })
    List<NewsType> selectByExampleWithRowbounds(NewsTypeExample example, RowBounds rowBounds);

    @SelectProvider(type=NewsTypeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ntid", property="ntid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ntypename", property="ntypename", jdbcType=JdbcType.VARCHAR)
    })
    List<NewsType> selectByExample(NewsTypeExample example);

    @Select({
        "select",
        "ntid, ntypename",
        "from news_type",
        "where ntid = #{ntid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ntid", property="ntid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ntypename", property="ntypename", jdbcType=JdbcType.VARCHAR)
    })
    NewsType selectByPrimaryKey(Integer ntid);

    @UpdateProvider(type=NewsTypeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") NewsType record, @Param("example") NewsTypeExample example);

    @UpdateProvider(type=NewsTypeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") NewsType record, @Param("example") NewsTypeExample example);

    @UpdateProvider(type=NewsTypeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(NewsType record);

    @Update({
        "update news_type",
        "set ntypename = #{ntypename,jdbcType=VARCHAR}",
        "where ntid = #{ntid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(NewsType record);
}