package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Parkingplaceinfo;
import com.ssm.wuye.domain.ParkingplaceinfoExample;
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

public interface ParkingplaceinfoMapper {
    @SelectProvider(type=ParkingplaceinfoSqlProvider.class, method="countByExample")
    long countByExample(ParkingplaceinfoExample example);

    @DeleteProvider(type=ParkingplaceinfoSqlProvider.class, method="deleteByExample")
    int deleteByExample(ParkingplaceinfoExample example);

    @Delete({
        "delete from parkingplaceinfo",
        "where hid = #{hid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer hid);

    @Insert({
        "insert into parkingplaceinfo (hid, pid, ",
        "olid, hname, hphone, ",
        "hcards, descr)",
        "values (#{hid,jdbcType=INTEGER}, #{pid,jdbcType=VARCHAR}, ",
        "#{olid,jdbcType=INTEGER}, #{hname,jdbcType=VARCHAR}, #{hphone,jdbcType=VARCHAR}, ",
        "#{hcards,jdbcType=VARCHAR}, #{descr,jdbcType=VARCHAR})"
    })
    int insert(Parkingplaceinfo record);

    @InsertProvider(type=ParkingplaceinfoSqlProvider.class, method="insertSelective")
    int insertSelective(Parkingplaceinfo record);

    @SelectProvider(type=ParkingplaceinfoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="hid", property="hid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="pid", property="pid", jdbcType=JdbcType.VARCHAR),
        @Result(column="olid", property="olid", jdbcType=JdbcType.INTEGER),
        @Result(column="hname", property="hname", jdbcType=JdbcType.VARCHAR),
        @Result(column="hphone", property="hphone", jdbcType=JdbcType.VARCHAR),
        @Result(column="hcards", property="hcards", jdbcType=JdbcType.VARCHAR),
        @Result(column="descr", property="descr", jdbcType=JdbcType.VARCHAR)
    })
    List<Parkingplaceinfo> selectByExampleWithRowbounds(ParkingplaceinfoExample example, RowBounds rowBounds);

    @SelectProvider(type=ParkingplaceinfoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="hid", property="hid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="pid", property="pid", jdbcType=JdbcType.VARCHAR),
        @Result(column="olid", property="olid", jdbcType=JdbcType.INTEGER),
        @Result(column="hname", property="hname", jdbcType=JdbcType.VARCHAR),
        @Result(column="hphone", property="hphone", jdbcType=JdbcType.VARCHAR),
        @Result(column="hcards", property="hcards", jdbcType=JdbcType.VARCHAR),
        @Result(column="descr", property="descr", jdbcType=JdbcType.VARCHAR)
    })
    List<Parkingplaceinfo> selectByExample(ParkingplaceinfoExample example);

    @Select({
        "select",
        "hid, pid, olid, hname, hphone, hcards, descr",
        "from parkingplaceinfo",
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
    Parkingplaceinfo selectByPrimaryKey(Integer hid);

    @UpdateProvider(type=ParkingplaceinfoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Parkingplaceinfo record, @Param("example") ParkingplaceinfoExample example);

    @UpdateProvider(type=ParkingplaceinfoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Parkingplaceinfo record, @Param("example") ParkingplaceinfoExample example);

    @UpdateProvider(type=ParkingplaceinfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Parkingplaceinfo record);

    @Update({
        "update parkingplaceinfo",
        "set pid = #{pid,jdbcType=VARCHAR},",
          "olid = #{olid,jdbcType=INTEGER},",
          "hname = #{hname,jdbcType=VARCHAR},",
          "hphone = #{hphone,jdbcType=VARCHAR},",
          "hcards = #{hcards,jdbcType=VARCHAR},",
          "descr = #{descr,jdbcType=VARCHAR}",
        "where hid = #{hid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Parkingplaceinfo record);
}