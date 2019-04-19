package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Outsidecarparkinginfo;
import com.ssm.wuye.domain.OutsidecarparkinginfoExample;
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

public interface OutsidecarparkinginfoMapper {
    @SelectProvider(type=OutsidecarparkinginfoSqlProvider.class, method="countByExample")
    long countByExample(OutsidecarparkinginfoExample example);

    @DeleteProvider(type=OutsidecarparkinginfoSqlProvider.class, method="deleteByExample")
    int deleteByExample(OutsidecarparkinginfoExample example);

    @Delete({
        "delete from outsidecarparkinginfo",
        "where parkingid = #{parkingid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer parkingid);

    @Insert({
        "insert into outsidecarparkinginfo (parkingid, Parkingcards, ",
        "Parkingcost, Parkingintime, ",
        "Parkingouttime, paymentMethod, ",
        "PaymentStatus)",
        "values (#{parkingid,jdbcType=INTEGER}, #{parkingcards,jdbcType=VARCHAR}, ",
        "#{parkingcost,jdbcType=VARCHAR}, #{parkingintime,jdbcType=TIMESTAMP}, ",
        "#{parkingouttime,jdbcType=TIMESTAMP}, #{paymentmethod,jdbcType=INTEGER}, ",
        "#{paymentstatus,jdbcType=INTEGER})"
    })
    int insert(Outsidecarparkinginfo record);

    @InsertProvider(type=OutsidecarparkinginfoSqlProvider.class, method="insertSelective")
    int insertSelective(Outsidecarparkinginfo record);

    @SelectProvider(type=OutsidecarparkinginfoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="parkingid", property="parkingid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="Parkingcards", property="parkingcards", jdbcType=JdbcType.VARCHAR),
        @Result(column="Parkingcost", property="parkingcost", jdbcType=JdbcType.VARCHAR),
        @Result(column="Parkingintime", property="parkingintime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="Parkingouttime", property="parkingouttime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="paymentMethod", property="paymentmethod", jdbcType=JdbcType.INTEGER),
        @Result(column="PaymentStatus", property="paymentstatus", jdbcType=JdbcType.INTEGER)
    })
    List<Outsidecarparkinginfo> selectByExampleWithRowbounds(OutsidecarparkinginfoExample example, RowBounds rowBounds);

    @SelectProvider(type=OutsidecarparkinginfoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="parkingid", property="parkingid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="Parkingcards", property="parkingcards", jdbcType=JdbcType.VARCHAR),
        @Result(column="Parkingcost", property="parkingcost", jdbcType=JdbcType.VARCHAR),
        @Result(column="Parkingintime", property="parkingintime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="Parkingouttime", property="parkingouttime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="paymentMethod", property="paymentmethod", jdbcType=JdbcType.INTEGER),
        @Result(column="PaymentStatus", property="paymentstatus", jdbcType=JdbcType.INTEGER)
    })
    List<Outsidecarparkinginfo> selectByExample(OutsidecarparkinginfoExample example);

    @Select({
        "select",
        "parkingid, Parkingcards, Parkingcost, Parkingintime, Parkingouttime, paymentMethod, ",
        "PaymentStatus",
        "from outsidecarparkinginfo",
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
    Outsidecarparkinginfo selectByPrimaryKey(Integer parkingid);

    @UpdateProvider(type=OutsidecarparkinginfoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Outsidecarparkinginfo record, @Param("example") OutsidecarparkinginfoExample example);

    @UpdateProvider(type=OutsidecarparkinginfoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Outsidecarparkinginfo record, @Param("example") OutsidecarparkinginfoExample example);

    @UpdateProvider(type=OutsidecarparkinginfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Outsidecarparkinginfo record);

    @Update({
        "update outsidecarparkinginfo",
        "set Parkingcards = #{parkingcards,jdbcType=VARCHAR},",
          "Parkingcost = #{parkingcost,jdbcType=VARCHAR},",
          "Parkingintime = #{parkingintime,jdbcType=TIMESTAMP},",
          "Parkingouttime = #{parkingouttime,jdbcType=TIMESTAMP},",
          "paymentMethod = #{paymentmethod,jdbcType=INTEGER},",
          "PaymentStatus = #{paymentstatus,jdbcType=INTEGER}",
        "where parkingid = #{parkingid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Outsidecarparkinginfo record);
}