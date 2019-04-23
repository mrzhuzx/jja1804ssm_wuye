package com.ssm.wuye.dao;

import com.ssm.wuye.domain.News_type;
import com.ssm.wuye.domain.News_typeExample;
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

public interface News_typeMapper {
    @SelectProvider(type=News_typeSqlProvider.class, method="countByExample")
    long countByExample(News_typeExample example);

    @DeleteProvider(type=News_typeSqlProvider.class, method="deleteByExample")
    int deleteByExample(News_typeExample example);

    @Delete({
        "delete from news_type",
        "where ntid = #{ntid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer ntid);

    @Insert({
        "insert into news_type (ntid, ntypename)",
        "values (#{ntid,jdbcType=INTEGER}, #{ntypename,jdbcType=VARCHAR})"
    })
    int insert(News_type record);

    @InsertProvider(type=News_typeSqlProvider.class, method="insertSelective")
    int insertSelective(News_type record);

    @SelectProvider(type=News_typeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ntid", property="ntid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ntypename", property="ntypename", jdbcType=JdbcType.VARCHAR)
    })
    List<News_type> selectByExampleWithRowbounds(News_typeExample example, RowBounds rowBounds);

    @SelectProvider(type=News_typeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ntid", property="ntid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ntypename", property="ntypename", jdbcType=JdbcType.VARCHAR)
    })
    List<News_type> selectByExample(News_typeExample example);

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
    News_type selectByPrimaryKey(Integer ntid);

    @UpdateProvider(type=News_typeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") News_type record, @Param("example") News_typeExample example);

    @UpdateProvider(type=News_typeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") News_type record, @Param("example") News_typeExample example);

    @UpdateProvider(type=News_typeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(News_type record);

    @Update({
        "update news_type",
        "set ntypename = #{ntypename,jdbcType=VARCHAR}",
        "where ntid = #{ntid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(News_type record);
}