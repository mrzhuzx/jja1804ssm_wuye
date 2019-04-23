package com.ssm.wuye.dao;

import com.ssm.wuye.domain.HouseType;
import com.ssm.wuye.domain.HouseTypeExample;
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

public interface HouseTypeMapper {
    @SelectProvider(type=HouseTypeSqlProvider.class, method="countByExample")
    long countByExample(HouseTypeExample example);

    @DeleteProvider(type=HouseTypeSqlProvider.class, method="deleteByExample")
    int deleteByExample(HouseTypeExample example);

    @Delete({
        "delete from house_type",
        "where hTypeId = #{htypeid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer htypeid);

    @Insert({
        "insert into house_type (hTypeId, hTypeName, ",
        "htPropertyRight)",
        "values (#{htypeid,jdbcType=INTEGER}, #{htypename,jdbcType=VARCHAR}, ",
        "#{htpropertyright,jdbcType=VARCHAR})"
    })
    int insert(HouseType record);

    @InsertProvider(type=HouseTypeSqlProvider.class, method="insertSelective")
    int insertSelective(HouseType record);

    @SelectProvider(type=HouseTypeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="hTypeId", property="htypeid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="hTypeName", property="htypename", jdbcType=JdbcType.VARCHAR),
        @Result(column="htPropertyRight", property="htpropertyright", jdbcType=JdbcType.VARCHAR)
    })
    List<HouseType> selectByExampleWithRowbounds(HouseTypeExample example, RowBounds rowBounds);

    @SelectProvider(type=HouseTypeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="hTypeId", property="htypeid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="hTypeName", property="htypename", jdbcType=JdbcType.VARCHAR),
        @Result(column="htPropertyRight", property="htpropertyright", jdbcType=JdbcType.VARCHAR)
    })
    List<HouseType> selectByExample(HouseTypeExample example);

    @Select({
        "select",
        "hTypeId, hTypeName, htPropertyRight",
        "from house_type",
        "where hTypeId = #{htypeid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="hTypeId", property="htypeid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="hTypeName", property="htypename", jdbcType=JdbcType.VARCHAR),
        @Result(column="htPropertyRight", property="htpropertyright", jdbcType=JdbcType.VARCHAR)
    })
    HouseType selectByPrimaryKey(Integer htypeid);

    @UpdateProvider(type=HouseTypeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") HouseType record, @Param("example") HouseTypeExample example);

    @UpdateProvider(type=HouseTypeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") HouseType record, @Param("example") HouseTypeExample example);

    @UpdateProvider(type=HouseTypeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(HouseType record);

    @Update({
        "update house_type",
        "set hTypeName = #{htypename,jdbcType=VARCHAR},",
          "htPropertyRight = #{htpropertyright,jdbcType=VARCHAR}",
        "where hTypeId = #{htypeid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(HouseType record);
}