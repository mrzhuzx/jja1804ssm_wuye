package com.ssm.wuye.dao;

import com.ssm.wuye.domain.ParkingCarinfo;
import com.ssm.wuye.domain.ParkingCarinfoExample;
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

public interface ParkingCarinfoMapper {
    @SelectProvider(type=ParkingCarinfoSqlProvider.class, method="countByExample")
    long countByExample(ParkingCarinfoExample example);

    @DeleteProvider(type=ParkingCarinfoSqlProvider.class, method="deleteByExample")
    int deleteByExample(ParkingCarinfoExample example);

    @Delete({
        "delete from parking_carinfo",
        "where parkingid = #{parkingid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer parkingid);

    @Insert({
        "insert into parking_carinfo (parkingid, Parkingcards, ",
        "Parkingcost, Parkingintime, ",
        "Parkingouttime, paymentMethod, ",
        "PaymentStatus)",
        "values (#{parkingid,jdbcType=INTEGER}, #{parkingcards,jdbcType=VARCHAR}, ",
        "#{parkingcost,jdbcType=VARCHAR}, #{parkingintime,jdbcType=TIMESTAMP}, ",
        "#{parkingouttime,jdbcType=TIMESTAMP}, #{paymentmethod,jdbcType=INTEGER}, ",
        "#{paymentstatus,jdbcType=INTEGER})"
    })
    int insert(ParkingCarinfo record);

    @InsertProvider(type=ParkingCarinfoSqlProvider.class, method="insertSelective")
    int insertSelective(ParkingCarinfo record);

    @SelectProvider(type=ParkingCarinfoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="parkingid", property="parkingid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="Parkingcards", property="parkingcards", jdbcType=JdbcType.VARCHAR),
        @Result(column="Parkingcost", property="parkingcost", jdbcType=JdbcType.VARCHAR),
        @Result(column="Parkingintime", property="parkingintime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="Parkingouttime", property="parkingouttime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="paymentMethod", property="paymentmethod", jdbcType=JdbcType.INTEGER),
        @Result(column="PaymentStatus", property="paymentstatus", jdbcType=JdbcType.INTEGER)
    })
    List<ParkingCarinfo> selectByExampleWithRowbounds(ParkingCarinfoExample example, RowBounds rowBounds);

    @SelectProvider(type=ParkingCarinfoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="parkingid", property="parkingid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="Parkingcards", property="parkingcards", jdbcType=JdbcType.VARCHAR),
        @Result(column="Parkingcost", property="parkingcost", jdbcType=JdbcType.VARCHAR),
        @Result(column="Parkingintime", property="parkingintime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="Parkingouttime", property="parkingouttime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="paymentMethod", property="paymentmethod", jdbcType=JdbcType.INTEGER),
        @Result(column="PaymentStatus", property="paymentstatus", jdbcType=JdbcType.INTEGER)
    })
    List<ParkingCarinfo> selectByExample(ParkingCarinfoExample example);

    @Select({
        "select",
        "parkingid, Parkingcards, Parkingcost, Parkingintime, Parkingouttime, paymentMethod, ",
        "PaymentStatus",
        "from parking_carinfo",
        "where parkingid = #{parkingid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="parkingid", property="parkingid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="Parkingcards", property="parkingcards", jdbcType=JdbcType.VARCHAR),
        @Result(column="Parkingcost", property="parkingcost", jdbcType=JdbcType.VARCHAR),
        @Result(column="Parkingintime", property="parkingintime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="Parkingouttime", property="parkingouttime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="paymentMethod", property="paymentmethod", jdbcType=JdbcType.INTEGER),
        @Result(column="PaymentStatus", property="paymentstatus", jdbcType=JdbcType.INTEGER)
    })
    ParkingCarinfo selectByPrimaryKey(Integer parkingid);

    @UpdateProvider(type=ParkingCarinfoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ParkingCarinfo record, @Param("example") ParkingCarinfoExample example);

    @UpdateProvider(type=ParkingCarinfoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ParkingCarinfo record, @Param("example") ParkingCarinfoExample example);

    @UpdateProvider(type=ParkingCarinfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ParkingCarinfo record);

    @Update({
        "update parking_carinfo",
        "set Parkingcards = #{parkingcards,jdbcType=VARCHAR},",
          "Parkingcost = #{parkingcost,jdbcType=VARCHAR},",
          "Parkingintime = #{parkingintime,jdbcType=TIMESTAMP},",
          "Parkingouttime = #{parkingouttime,jdbcType=TIMESTAMP},",
          "paymentMethod = #{paymentmethod,jdbcType=INTEGER},",
          "PaymentStatus = #{paymentstatus,jdbcType=INTEGER}",
        "where parkingid = #{parkingid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ParkingCarinfo record);
}