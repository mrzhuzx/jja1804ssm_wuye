package com.ssm.wuye.dao;

import com.ssm.wuye.domain.OwerHouseType;
import com.ssm.wuye.domain.OwerHouseTypeExample;
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

public interface OwerHouseTypeMapper {
    @SelectProvider(type=OwerHouseTypeSqlProvider.class, method="countByExample")
    long countByExample(OwerHouseTypeExample example);

    @DeleteProvider(type=OwerHouseTypeSqlProvider.class, method="deleteByExample")
    int deleteByExample(OwerHouseTypeExample example);

    @Insert({
        "insert into ower_house_type (olName, hNumber, ",
        "hState, hBulidingName, ",
        "hUnitNumber, hFloor, ",
        "hTypeid, hDirection, ",
        "hArea, hRemarks, ",
        "Loan, hTypeName, ",
        "htPropertyRight, olPhone)",
        "values (#{olname,jdbcType=VARCHAR}, #{hnumber,jdbcType=VARCHAR}, ",
        "#{hstate,jdbcType=VARCHAR}, #{hbulidingname,jdbcType=VARCHAR}, ",
        "#{hunitnumber,jdbcType=INTEGER}, #{hfloor,jdbcType=INTEGER}, ",
        "#{htypeid,jdbcType=INTEGER}, #{hdirection,jdbcType=VARCHAR}, ",
        "#{harea,jdbcType=VARCHAR}, #{hremarks,jdbcType=VARCHAR}, ",
        "#{loan,jdbcType=INTEGER}, #{htypename,jdbcType=VARCHAR}, ",
        "#{htpropertyright,jdbcType=VARCHAR}, #{olphone,jdbcType=VARCHAR})"
    })
    int insert(OwerHouseType record);

    @InsertProvider(type=OwerHouseTypeSqlProvider.class, method="insertSelective")
    int insertSelective(OwerHouseType record);

    @SelectProvider(type=OwerHouseTypeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="olName", property="olname", jdbcType=JdbcType.VARCHAR),
        @Result(column="hNumber", property="hnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="hState", property="hstate", jdbcType=JdbcType.VARCHAR),
        @Result(column="hBulidingName", property="hbulidingname", jdbcType=JdbcType.VARCHAR),
        @Result(column="hUnitNumber", property="hunitnumber", jdbcType=JdbcType.INTEGER),
        @Result(column="hFloor", property="hfloor", jdbcType=JdbcType.INTEGER),
        @Result(column="hTypeid", property="htypeid", jdbcType=JdbcType.INTEGER),
        @Result(column="hDirection", property="hdirection", jdbcType=JdbcType.VARCHAR),
        @Result(column="hArea", property="harea", jdbcType=JdbcType.VARCHAR),
        @Result(column="hRemarks", property="hremarks", jdbcType=JdbcType.VARCHAR),
        @Result(column="Loan", property="loan", jdbcType=JdbcType.INTEGER),
        @Result(column="hTypeName", property="htypename", jdbcType=JdbcType.VARCHAR),
        @Result(column="htPropertyRight", property="htpropertyright", jdbcType=JdbcType.VARCHAR),
        @Result(column="olPhone", property="olphone", jdbcType=JdbcType.VARCHAR)
    })
    List<OwerHouseType> selectByExampleWithRowbounds(OwerHouseTypeExample example, RowBounds rowBounds);

    @SelectProvider(type=OwerHouseTypeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="olName", property="olname", jdbcType=JdbcType.VARCHAR),
        @Result(column="hNumber", property="hnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="hState", property="hstate", jdbcType=JdbcType.VARCHAR),
        @Result(column="hBulidingName", property="hbulidingname", jdbcType=JdbcType.VARCHAR),
        @Result(column="hUnitNumber", property="hunitnumber", jdbcType=JdbcType.INTEGER),
        @Result(column="hFloor", property="hfloor", jdbcType=JdbcType.INTEGER),
        @Result(column="hTypeid", property="htypeid", jdbcType=JdbcType.INTEGER),
        @Result(column="hDirection", property="hdirection", jdbcType=JdbcType.VARCHAR),
        @Result(column="hArea", property="harea", jdbcType=JdbcType.VARCHAR),
        @Result(column="hRemarks", property="hremarks", jdbcType=JdbcType.VARCHAR),
        @Result(column="Loan", property="loan", jdbcType=JdbcType.INTEGER),
        @Result(column="hTypeName", property="htypename", jdbcType=JdbcType.VARCHAR),
        @Result(column="htPropertyRight", property="htpropertyright", jdbcType=JdbcType.VARCHAR),
        @Result(column="olPhone", property="olphone", jdbcType=JdbcType.VARCHAR)
    })
    List<OwerHouseType> selectByExample(OwerHouseTypeExample example);

    @UpdateProvider(type=OwerHouseTypeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") OwerHouseType record, @Param("example") OwerHouseTypeExample example);

    @UpdateProvider(type=OwerHouseTypeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") OwerHouseType record, @Param("example") OwerHouseTypeExample example);
}