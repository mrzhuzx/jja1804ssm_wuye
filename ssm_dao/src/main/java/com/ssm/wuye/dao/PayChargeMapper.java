package com.ssm.wuye.dao;

import com.ssm.wuye.domain.PayCharge;
import com.ssm.wuye.domain.PayChargeExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface PayChargeMapper {
    @SelectProvider(type=PayChargeSqlProvider.class, method="countByExample")
    long countByExample(PayChargeExample example);

    @DeleteProvider(type=PayChargeSqlProvider.class, method="deleteByExample")
    int deleteByExample(PayChargeExample example);

    @Insert({
        "insert into pay_charge (payId, chargeId, ",
        "chargeStandard, Latepayment, ",
        "payReal, payBalance, ",
        "houseId, chargeTime, ",
        "payName, payState, ",
        "payMonth, owerId, ",
        "chargeName, chargeYear, ",
        "cs)",
        "values (#{payid,jdbcType=INTEGER}, #{chargeid,jdbcType=INTEGER}, ",
        "#{chargestandard,jdbcType=DOUBLE}, #{latepayment,jdbcType=DOUBLE}, ",
        "#{payreal,jdbcType=DOUBLE}, #{paybalance,jdbcType=DOUBLE}, ",
        "#{houseid,jdbcType=INTEGER}, #{chargetime,jdbcType=TIMESTAMP}, ",
        "#{payname,jdbcType=VARCHAR}, #{paystate,jdbcType=INTEGER}, ",
        "#{paymonth,jdbcType=VARCHAR}, #{owerid,jdbcType=INTEGER}, ",
        "#{chargename,jdbcType=VARCHAR}, #{chargeyear,jdbcType=VARCHAR}, ",
        "#{cs,jdbcType=DOUBLE})"
    })
    int insert(PayCharge record);

    @InsertProvider(type=PayChargeSqlProvider.class, method="insertSelective")
    int insertSelective(PayCharge record);

    @SelectProvider(type=PayChargeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="payId", property="payid", jdbcType=JdbcType.INTEGER),
        @Result(column="chargeId", property="chargeid", jdbcType=JdbcType.INTEGER),
        @Result(column="chargeStandard", property="chargestandard", jdbcType=JdbcType.DOUBLE),
        @Result(column="Latepayment", property="latepayment", jdbcType=JdbcType.DOUBLE),
        @Result(column="payReal", property="payreal", jdbcType=JdbcType.DOUBLE),
        @Result(column="payBalance", property="paybalance", jdbcType=JdbcType.DOUBLE),
        @Result(column="houseId", property="houseid", jdbcType=JdbcType.INTEGER),
        @Result(column="chargeTime", property="chargetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="payName", property="payname", jdbcType=JdbcType.VARCHAR),
        @Result(column="payState", property="paystate", jdbcType=JdbcType.INTEGER),
        @Result(column="payMonth", property="paymonth", jdbcType=JdbcType.VARCHAR),
        @Result(column="owerId", property="owerid", jdbcType=JdbcType.INTEGER),
        @Result(column="chargeName", property="chargename", jdbcType=JdbcType.VARCHAR),
        @Result(column="chargeYear", property="chargeyear", jdbcType=JdbcType.VARCHAR),
        @Result(column="cs", property="cs", jdbcType=JdbcType.DOUBLE)
    })
    List<PayCharge> selectByExampleWithRowbounds(PayChargeExample example, RowBounds rowBounds);

    @SelectProvider(type=PayChargeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="payId", property="payid", jdbcType=JdbcType.INTEGER),
        @Result(column="chargeId", property="chargeid", jdbcType=JdbcType.INTEGER),
        @Result(column="chargeStandard", property="chargestandard", jdbcType=JdbcType.DOUBLE),
        @Result(column="Latepayment", property="latepayment", jdbcType=JdbcType.DOUBLE),
        @Result(column="payReal", property="payreal", jdbcType=JdbcType.DOUBLE),
        @Result(column="payBalance", property="paybalance", jdbcType=JdbcType.DOUBLE),
        @Result(column="houseId", property="houseid", jdbcType=JdbcType.INTEGER),
        @Result(column="chargeTime", property="chargetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="payName", property="payname", jdbcType=JdbcType.VARCHAR),
        @Result(column="payState", property="paystate", jdbcType=JdbcType.INTEGER),
        @Result(column="payMonth", property="paymonth", jdbcType=JdbcType.VARCHAR),
        @Result(column="owerId", property="owerid", jdbcType=JdbcType.INTEGER),
        @Result(column="chargeName", property="chargename", jdbcType=JdbcType.VARCHAR),
        @Result(column="chargeYear", property="chargeyear", jdbcType=JdbcType.VARCHAR),
        @Result(column="cs", property="cs", jdbcType=JdbcType.DOUBLE)
    })
    List<PayCharge> selectByExample(PayChargeExample example);

    @UpdateProvider(type=PayChargeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") PayCharge record, @Param("example") PayChargeExample example);

    @UpdateProvider(type=PayChargeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") PayCharge record, @Param("example") PayChargeExample example);
}