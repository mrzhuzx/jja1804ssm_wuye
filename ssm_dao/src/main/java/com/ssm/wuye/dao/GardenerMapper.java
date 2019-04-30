package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Gardener;
import com.ssm.wuye.domain.GardenerExample;
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

public interface GardenerMapper {
    @SelectProvider(type=GardenerSqlProvider.class, method="countByExample")
    long countByExample(GardenerExample example);

    @DeleteProvider(type=GardenerSqlProvider.class, method="deleteByExample")
    int deleteByExample(GardenerExample example);

    @Insert({
        "insert into gardener (garid, garname, ",
        "garphone, garflag, ",
        "roleid)",
        "values (#{garid,jdbcType=INTEGER}, #{garname,jdbcType=VARCHAR}, ",
        "#{garphone,jdbcType=VARCHAR}, #{garflag,jdbcType=VARCHAR}, ",
        "#{roleid,jdbcType=INTEGER})"
    })
    int insert(Gardener record);

    @InsertProvider(type=GardenerSqlProvider.class, method="insertSelective")
    int insertSelective(Gardener record);

    @SelectProvider(type=GardenerSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="garid", property="garid", jdbcType=JdbcType.INTEGER),
        @Result(column="garname", property="garname", jdbcType=JdbcType.VARCHAR),
        @Result(column="garphone", property="garphone", jdbcType=JdbcType.VARCHAR),
        @Result(column="garflag", property="garflag", jdbcType=JdbcType.VARCHAR),
        @Result(column="roleid", property="roleid", jdbcType=JdbcType.INTEGER)
    })
    List<Gardener> selectByExampleWithRowbounds(GardenerExample example, RowBounds rowBounds);

    @SelectProvider(type=GardenerSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="garid", property="garid", jdbcType=JdbcType.INTEGER),
        @Result(column="garname", property="garname", jdbcType=JdbcType.VARCHAR),
        @Result(column="garphone", property="garphone", jdbcType=JdbcType.VARCHAR),
        @Result(column="garflag", property="garflag", jdbcType=JdbcType.VARCHAR),
        @Result(column="roleid", property="roleid", jdbcType=JdbcType.INTEGER)
    })
    List<Gardener> selectByExample(GardenerExample example);

    @UpdateProvider(type=GardenerSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Gardener record, @Param("example") GardenerExample example);

    @UpdateProvider(type=GardenerSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Gardener record, @Param("example") GardenerExample example);
}