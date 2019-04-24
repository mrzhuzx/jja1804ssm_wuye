package com.ssm.wuye.dao;

import com.ssm.wuye.domain.MyHouseType;
import com.ssm.wuye.domain.MyHouseTypeExample;
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

public interface MyHouseTypeMapper {
    @SelectProvider(type=MyHouseTypeSqlProvider.class, method="countByExample")
    long countByExample(MyHouseTypeExample example);

    @DeleteProvider(type=MyHouseTypeSqlProvider.class, method="deleteByExample")
    int deleteByExample(MyHouseTypeExample example);

    @Delete({
        "delete from wy_house_type",
        "where hTypeId = #{htypeid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer htypeid);

    @Insert({
        "insert into wy_house_type (hTypeId, hTypeName, ",
        "htPropertyRight)",
        "values (#{htypeid,jdbcType=INTEGER}, #{htypename,jdbcType=VARCHAR}, ",
        "#{htpropertyright,jdbcType=VARCHAR})"
    })
    int insert(MyHouseType record);

    @InsertProvider(type=MyHouseTypeSqlProvider.class, method="insertSelective")
    int insertSelective(MyHouseType record);

    @SelectProvider(type=MyHouseTypeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="hTypeId", property="htypeid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="hTypeName", property="htypename", jdbcType=JdbcType.VARCHAR),
        @Result(column="htPropertyRight", property="htpropertyright", jdbcType=JdbcType.VARCHAR)
    })
    List<MyHouseType> selectByExampleWithRowbounds(MyHouseTypeExample example, RowBounds rowBounds);

    @SelectProvider(type=MyHouseTypeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="hTypeId", property="htypeid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="hTypeName", property="htypename", jdbcType=JdbcType.VARCHAR),
        @Result(column="htPropertyRight", property="htpropertyright", jdbcType=JdbcType.VARCHAR)
    })
    List<MyHouseType> selectByExample(MyHouseTypeExample example);

    @Select({
        "select",
        "hTypeId, hTypeName, htPropertyRight",
        "from wy_house_type",
        "where hTypeId = #{htypeid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="hTypeId", property="htypeid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="hTypeName", property="htypename", jdbcType=JdbcType.VARCHAR),
        @Result(column="htPropertyRight", property="htpropertyright", jdbcType=JdbcType.VARCHAR)
    })
    MyHouseType selectByPrimaryKey(Integer htypeid);

    @UpdateProvider(type=MyHouseTypeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MyHouseType record, @Param("example") MyHouseTypeExample example);

    @UpdateProvider(type=MyHouseTypeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MyHouseType record, @Param("example") MyHouseTypeExample example);

    @UpdateProvider(type=MyHouseTypeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MyHouseType record);

    @Update({
        "update wy_house_type",
        "set hTypeName = #{htypename,jdbcType=VARCHAR},",
          "htPropertyRight = #{htpropertyright,jdbcType=VARCHAR}",
        "where hTypeId = #{htypeid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(MyHouseType record);
}