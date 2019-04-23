package com.ssm.wuye.dao;

import com.ssm.wuye.domain.House_type;
import com.ssm.wuye.domain.House_typeExample;
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

public interface House_typeMapper {
    @SelectProvider(type=House_typeSqlProvider.class, method="countByExample")
    long countByExample(House_typeExample example);

    @DeleteProvider(type=House_typeSqlProvider.class, method="deleteByExample")
    int deleteByExample(House_typeExample example);

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
    int insert(House_type record);

    @InsertProvider(type=House_typeSqlProvider.class, method="insertSelective")
    int insertSelective(House_type record);

    @SelectProvider(type=House_typeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="hTypeId", property="htypeid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="hTypeName", property="htypename", jdbcType=JdbcType.VARCHAR),
        @Result(column="htPropertyRight", property="htpropertyright", jdbcType=JdbcType.VARCHAR)
    })
    List<House_type> selectByExampleWithRowbounds(House_typeExample example, RowBounds rowBounds);

    @SelectProvider(type=House_typeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="hTypeId", property="htypeid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="hTypeName", property="htypename", jdbcType=JdbcType.VARCHAR),
        @Result(column="htPropertyRight", property="htpropertyright", jdbcType=JdbcType.VARCHAR)
    })
    List<House_type> selectByExample(House_typeExample example);

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
    House_type selectByPrimaryKey(Integer htypeid);

    @UpdateProvider(type=House_typeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") House_type record, @Param("example") House_typeExample example);

    @UpdateProvider(type=House_typeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") House_type record, @Param("example") House_typeExample example);

    @UpdateProvider(type=House_typeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(House_type record);

    @Update({
        "update house_type",
        "set hTypeName = #{htypename,jdbcType=VARCHAR},",
          "htPropertyRight = #{htpropertyright,jdbcType=VARCHAR}",
        "where hTypeId = #{htypeid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(House_type record);
}