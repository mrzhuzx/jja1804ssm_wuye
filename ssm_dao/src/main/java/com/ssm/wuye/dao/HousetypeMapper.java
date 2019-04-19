package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Housetype;
import com.ssm.wuye.domain.HousetypeExample;
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

public interface HousetypeMapper {
    @SelectProvider(type=HousetypeSqlProvider.class, method="countByExample")
    long countByExample(HousetypeExample example);

    @DeleteProvider(type=HousetypeSqlProvider.class, method="deleteByExample")
    int deleteByExample(HousetypeExample example);

    @Delete({
        "delete from housetype",
        "where hTypeId = #{htypeid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer htypeid);

    @Insert({
        "insert into housetype (hTypeId, hTypeName, ",
        "htPropertyRight)",
        "values (#{htypeid,jdbcType=INTEGER}, #{htypename,jdbcType=VARCHAR}, ",
        "#{htpropertyright,jdbcType=VARCHAR})"
    })
    int insert(Housetype record);

    @InsertProvider(type=HousetypeSqlProvider.class, method="insertSelective")
    int insertSelective(Housetype record);

    @SelectProvider(type=HousetypeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="hTypeId", property="htypeid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="hTypeName", property="htypename", jdbcType=JdbcType.VARCHAR),
        @Result(column="htPropertyRight", property="htpropertyright", jdbcType=JdbcType.VARCHAR)
    })
    List<Housetype> selectByExampleWithRowbounds(HousetypeExample example, RowBounds rowBounds);

    @SelectProvider(type=HousetypeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="hTypeId", property="htypeid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="hTypeName", property="htypename", jdbcType=JdbcType.VARCHAR),
        @Result(column="htPropertyRight", property="htpropertyright", jdbcType=JdbcType.VARCHAR)
    })
    List<Housetype> selectByExample(HousetypeExample example);

    @Select({
        "select",
        "hTypeId, hTypeName, htPropertyRight",
        "from housetype",
        "where hTypeId = #{htypeid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="hTypeId", property="htypeid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="hTypeName", property="htypename", jdbcType=JdbcType.VARCHAR),
        @Result(column="htPropertyRight", property="htpropertyright", jdbcType=JdbcType.VARCHAR)
    })
    Housetype selectByPrimaryKey(Integer htypeid);

    @UpdateProvider(type=HousetypeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Housetype record, @Param("example") HousetypeExample example);

    @UpdateProvider(type=HousetypeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Housetype record, @Param("example") HousetypeExample example);

    @UpdateProvider(type=HousetypeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Housetype record);

    @Update({
        "update housetype",
        "set hTypeName = #{htypename,jdbcType=VARCHAR},",
          "htPropertyRight = #{htpropertyright,jdbcType=VARCHAR}",
        "where hTypeId = #{htypeid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Housetype record);
}