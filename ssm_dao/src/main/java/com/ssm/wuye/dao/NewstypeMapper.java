package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Newstype;
import com.ssm.wuye.domain.NewstypeExample;
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

public interface NewstypeMapper {
    @SelectProvider(type=NewstypeSqlProvider.class, method="countByExample")
    long countByExample(NewstypeExample example);

    @DeleteProvider(type=NewstypeSqlProvider.class, method="deleteByExample")
    int deleteByExample(NewstypeExample example);

    @Delete({
        "delete from newstype",
        "where ntid = #{ntid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer ntid);

    @Insert({
        "insert into newstype (ntid, ntypename)",
        "values (#{ntid,jdbcType=INTEGER}, #{ntypename,jdbcType=VARCHAR})"
    })
    int insert(Newstype record);

    @InsertProvider(type=NewstypeSqlProvider.class, method="insertSelective")
    int insertSelective(Newstype record);

    @SelectProvider(type=NewstypeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ntid", property="ntid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ntypename", property="ntypename", jdbcType=JdbcType.VARCHAR)
    })
    List<Newstype> selectByExampleWithRowbounds(NewstypeExample example, RowBounds rowBounds);

    @SelectProvider(type=NewstypeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ntid", property="ntid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ntypename", property="ntypename", jdbcType=JdbcType.VARCHAR)
    })
    List<Newstype> selectByExample(NewstypeExample example);

    @Select({
        "select",
        "ntid, ntypename",
        "from newstype",
        "where ntid = #{ntid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ntid", property="ntid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ntypename", property="ntypename", jdbcType=JdbcType.VARCHAR)
    })
    Newstype selectByPrimaryKey(Integer ntid);

    @UpdateProvider(type=NewstypeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Newstype record, @Param("example") NewstypeExample example);

    @UpdateProvider(type=NewstypeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Newstype record, @Param("example") NewstypeExample example);

    @UpdateProvider(type=NewstypeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Newstype record);

    @Update({
        "update newstype",
        "set ntypename = #{ntypename,jdbcType=VARCHAR}",
        "where ntid = #{ntid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Newstype record);
}