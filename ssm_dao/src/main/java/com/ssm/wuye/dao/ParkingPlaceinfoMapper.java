package com.ssm.wuye.dao;

import com.ssm.wuye.domain.ParkingPlaceinfo;
import com.ssm.wuye.domain.ParkingPlaceinfoExample;
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

public interface ParkingPlaceinfoMapper {
    @SelectProvider(type=ParkingPlaceinfoSqlProvider.class, method="countByExample")
    long countByExample(ParkingPlaceinfoExample example);

    @DeleteProvider(type=ParkingPlaceinfoSqlProvider.class, method="deleteByExample")
    int deleteByExample(ParkingPlaceinfoExample example);

    @Delete({
        "delete from parking_placeinfo",
        "where hid = #{hid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer hid);

    @Insert({
        "insert into parking_placeinfo (hid, pid, ",
        "olid, hname, hphone, ",
        "hcards, descr)",
        "values (#{hid,jdbcType=INTEGER}, #{pid,jdbcType=VARCHAR}, ",
        "#{olid,jdbcType=INTEGER}, #{hname,jdbcType=VARCHAR}, #{hphone,jdbcType=VARCHAR}, ",
        "#{hcards,jdbcType=VARCHAR}, #{descr,jdbcType=VARCHAR})"
    })
    int insert(ParkingPlaceinfo record);

    @InsertProvider(type=ParkingPlaceinfoSqlProvider.class, method="insertSelective")
    int insertSelective(ParkingPlaceinfo record);

    @SelectProvider(type=ParkingPlaceinfoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="hid", property="hid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="pid", property="pid", jdbcType=JdbcType.VARCHAR),
        @Result(column="olid", property="olid", jdbcType=JdbcType.INTEGER),
        @Result(column="hname", property="hname", jdbcType=JdbcType.VARCHAR),
        @Result(column="hphone", property="hphone", jdbcType=JdbcType.VARCHAR),
        @Result(column="hcards", property="hcards", jdbcType=JdbcType.VARCHAR),
        @Result(column="descr", property="descr", jdbcType=JdbcType.VARCHAR)
    })
    List<ParkingPlaceinfo> selectByExampleWithRowbounds(ParkingPlaceinfoExample example, RowBounds rowBounds);

    @SelectProvider(type=ParkingPlaceinfoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="hid", property="hid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="pid", property="pid", jdbcType=JdbcType.VARCHAR),
        @Result(column="olid", property="olid", jdbcType=JdbcType.INTEGER),
        @Result(column="hname", property="hname", jdbcType=JdbcType.VARCHAR),
        @Result(column="hphone", property="hphone", jdbcType=JdbcType.VARCHAR),
        @Result(column="hcards", property="hcards", jdbcType=JdbcType.VARCHAR),
        @Result(column="descr", property="descr", jdbcType=JdbcType.VARCHAR)
    })
    List<ParkingPlaceinfo> selectByExample(ParkingPlaceinfoExample example);

    @Select({
        "select",
        "hid, pid, olid, hname, hphone, hcards, descr",
        "from parking_placeinfo",
        "where hid = #{hid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="hid", property="hid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="pid", property="pid", jdbcType=JdbcType.VARCHAR),
        @Result(column="olid", property="olid", jdbcType=JdbcType.INTEGER),
        @Result(column="hname", property="hname", jdbcType=JdbcType.VARCHAR),
        @Result(column="hphone", property="hphone", jdbcType=JdbcType.VARCHAR),
        @Result(column="hcards", property="hcards", jdbcType=JdbcType.VARCHAR),
        @Result(column="descr", property="descr", jdbcType=JdbcType.VARCHAR)
    })
    ParkingPlaceinfo selectByPrimaryKey(Integer hid);

    @UpdateProvider(type=ParkingPlaceinfoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ParkingPlaceinfo record, @Param("example") ParkingPlaceinfoExample example);

    @UpdateProvider(type=ParkingPlaceinfoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ParkingPlaceinfo record, @Param("example") ParkingPlaceinfoExample example);

    @UpdateProvider(type=ParkingPlaceinfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ParkingPlaceinfo record);

    @Update({
        "update parking_placeinfo",
        "set pid = #{pid,jdbcType=VARCHAR},",
          "olid = #{olid,jdbcType=INTEGER},",
          "hname = #{hname,jdbcType=VARCHAR},",
          "hphone = #{hphone,jdbcType=VARCHAR},",
          "hcards = #{hcards,jdbcType=VARCHAR},",
          "descr = #{descr,jdbcType=VARCHAR}",
        "where hid = #{hid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ParkingPlaceinfo record);
}