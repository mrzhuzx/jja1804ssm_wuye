package com.ssm.wuye.dao;

import com.ssm.wuye.domain.MyHouse;
import com.ssm.wuye.domain.MyHouseExample;
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

public interface MyHouseMapper {
    @SelectProvider(type=MyHouseSqlProvider.class, method="countByExample")
    long countByExample(MyHouseExample example);

    @DeleteProvider(type=MyHouseSqlProvider.class, method="deleteByExample")
    int deleteByExample(MyHouseExample example);

    @Delete({
        "delete from wy_house",
        "where hid = #{hid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer hid);

    @Insert({
        "insert into wy_house (hid, hNumber, ",
        "hState, hBulidingName, ",
        "hUnitNumber, hFloor, ",
        "hTypeid, hDirection, ",
        "hArea, hRemarks, ",
        "olid, Loan)",
        "values (#{hid,jdbcType=INTEGER}, #{hnumber,jdbcType=VARCHAR}, ",
        "#{hstate,jdbcType=VARCHAR}, #{hbulidingname,jdbcType=VARCHAR}, ",
        "#{hunitnumber,jdbcType=INTEGER}, #{hfloor,jdbcType=INTEGER}, ",
        "#{htypeid,jdbcType=INTEGER}, #{hdirection,jdbcType=VARCHAR}, ",
        "#{harea,jdbcType=VARCHAR}, #{hremarks,jdbcType=VARCHAR}, ",
        "#{olid,jdbcType=INTEGER}, #{loan,jdbcType=INTEGER})"
    })
    int insert(MyHouse record);

    @InsertProvider(type=MyHouseSqlProvider.class, method="insertSelective")
    int insertSelective(MyHouse record);

    @SelectProvider(type=MyHouseSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="hid", property="hid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="hNumber", property="hnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="hState", property="hstate", jdbcType=JdbcType.VARCHAR),
        @Result(column="hBulidingName", property="hbulidingname", jdbcType=JdbcType.VARCHAR),
        @Result(column="hUnitNumber", property="hunitnumber", jdbcType=JdbcType.INTEGER),
        @Result(column="hFloor", property="hfloor", jdbcType=JdbcType.INTEGER),
        @Result(column="hTypeid", property="htypeid", jdbcType=JdbcType.INTEGER),
        @Result(column="hDirection", property="hdirection", jdbcType=JdbcType.VARCHAR),
        @Result(column="hArea", property="harea", jdbcType=JdbcType.VARCHAR),
        @Result(column="hRemarks", property="hremarks", jdbcType=JdbcType.VARCHAR),
        @Result(column="olid", property="olid", jdbcType=JdbcType.INTEGER),
        @Result(column="Loan", property="loan", jdbcType=JdbcType.INTEGER)
    })
    List<MyHouse> selectByExampleWithRowbounds(MyHouseExample example, RowBounds rowBounds);

    @SelectProvider(type=MyHouseSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="hid", property="hid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="hNumber", property="hnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="hState", property="hstate", jdbcType=JdbcType.VARCHAR),
        @Result(column="hBulidingName", property="hbulidingname", jdbcType=JdbcType.VARCHAR),
        @Result(column="hUnitNumber", property="hunitnumber", jdbcType=JdbcType.INTEGER),
        @Result(column="hFloor", property="hfloor", jdbcType=JdbcType.INTEGER),
        @Result(column="hTypeid", property="htypeid", jdbcType=JdbcType.INTEGER),
        @Result(column="hDirection", property="hdirection", jdbcType=JdbcType.VARCHAR),
        @Result(column="hArea", property="harea", jdbcType=JdbcType.VARCHAR),
        @Result(column="hRemarks", property="hremarks", jdbcType=JdbcType.VARCHAR),
        @Result(column="olid", property="olid", jdbcType=JdbcType.INTEGER),
        @Result(column="Loan", property="loan", jdbcType=JdbcType.INTEGER)
    })
    List<MyHouse> selectByExample(MyHouseExample example);

    @Select({
        "select",
        "hid, hNumber, hState, hBulidingName, hUnitNumber, hFloor, hTypeid, hDirection, ",
        "hArea, hRemarks, olid, Loan",
        "from wy_house",
        "where hid = #{hid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="hid", property="hid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="hNumber", property="hnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="hState", property="hstate", jdbcType=JdbcType.VARCHAR),
        @Result(column="hBulidingName", property="hbulidingname", jdbcType=JdbcType.VARCHAR),
        @Result(column="hUnitNumber", property="hunitnumber", jdbcType=JdbcType.INTEGER),
        @Result(column="hFloor", property="hfloor", jdbcType=JdbcType.INTEGER),
        @Result(column="hTypeid", property="htypeid", jdbcType=JdbcType.INTEGER),
        @Result(column="hDirection", property="hdirection", jdbcType=JdbcType.VARCHAR),
        @Result(column="hArea", property="harea", jdbcType=JdbcType.VARCHAR),
        @Result(column="hRemarks", property="hremarks", jdbcType=JdbcType.VARCHAR),
        @Result(column="olid", property="olid", jdbcType=JdbcType.INTEGER),
        @Result(column="Loan", property="loan", jdbcType=JdbcType.INTEGER)
    })
    MyHouse selectByPrimaryKey(Integer hid);

    @UpdateProvider(type=MyHouseSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MyHouse record, @Param("example") MyHouseExample example);

    @UpdateProvider(type=MyHouseSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MyHouse record, @Param("example") MyHouseExample example);

    @UpdateProvider(type=MyHouseSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MyHouse record);

    @Update({
        "update wy_house",
        "set hNumber = #{hnumber,jdbcType=VARCHAR},",
          "hState = #{hstate,jdbcType=VARCHAR},",
          "hBulidingName = #{hbulidingname,jdbcType=VARCHAR},",
          "hUnitNumber = #{hunitnumber,jdbcType=INTEGER},",
          "hFloor = #{hfloor,jdbcType=INTEGER},",
          "hTypeid = #{htypeid,jdbcType=INTEGER},",
          "hDirection = #{hdirection,jdbcType=VARCHAR},",
          "hArea = #{harea,jdbcType=VARCHAR},",
          "hRemarks = #{hremarks,jdbcType=VARCHAR},",
          "olid = #{olid,jdbcType=INTEGER},",
          "Loan = #{loan,jdbcType=INTEGER}",
        "where hid = #{hid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(MyHouse record);
}