package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Parking_carinfo;
import com.ssm.wuye.domain.Parking_carinfoExample;
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

public interface Parking_carinfoMapper {
    @SelectProvider(type=Parking_carinfoSqlProvider.class, method="countByExample")
    long countByExample(Parking_carinfoExample example);

    @DeleteProvider(type=Parking_carinfoSqlProvider.class, method="deleteByExample")
    int deleteByExample(Parking_carinfoExample example);

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
    int insert(Parking_carinfo record);

    @InsertProvider(type=Parking_carinfoSqlProvider.class, method="insertSelective")
    int insertSelective(Parking_carinfo record);

    @SelectProvider(type=Parking_carinfoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="parkingid", property="parkingid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="Parkingcards", property="parkingcards", jdbcType=JdbcType.VARCHAR),
        @Result(column="Parkingcost", property="parkingcost", jdbcType=JdbcType.VARCHAR),
        @Result(column="Parkingintime", property="parkingintime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="Parkingouttime", property="parkingouttime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="paymentMethod", property="paymentmethod", jdbcType=JdbcType.INTEGER),
        @Result(column="PaymentStatus", property="paymentstatus", jdbcType=JdbcType.INTEGER)
    })
    List<Parking_carinfo> selectByExampleWithRowbounds(Parking_carinfoExample example, RowBounds rowBounds);

    @SelectProvider(type=Parking_carinfoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="parkingid", property="parkingid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="Parkingcards", property="parkingcards", jdbcType=JdbcType.VARCHAR),
        @Result(column="Parkingcost", property="parkingcost", jdbcType=JdbcType.VARCHAR),
        @Result(column="Parkingintime", property="parkingintime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="Parkingouttime", property="parkingouttime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="paymentMethod", property="paymentmethod", jdbcType=JdbcType.INTEGER),
        @Result(column="PaymentStatus", property="paymentstatus", jdbcType=JdbcType.INTEGER)
    })
    List<Parking_carinfo> selectByExample(Parking_carinfoExample example);

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
    Parking_carinfo selectByPrimaryKey(Integer parkingid);

    @UpdateProvider(type=Parking_carinfoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Parking_carinfo record, @Param("example") Parking_carinfoExample example);

    @UpdateProvider(type=Parking_carinfoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Parking_carinfo record, @Param("example") Parking_carinfoExample example);

    @UpdateProvider(type=Parking_carinfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Parking_carinfo record);

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
    int updateByPrimaryKey(Parking_carinfo record);
}