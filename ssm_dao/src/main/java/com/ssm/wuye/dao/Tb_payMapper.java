package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Tb_pay;
import com.ssm.wuye.domain.Tb_payExample;
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

public interface Tb_payMapper {
    @SelectProvider(type=Tb_paySqlProvider.class, method="countByExample")
    long countByExample(Tb_payExample example);

    @DeleteProvider(type=Tb_paySqlProvider.class, method="deleteByExample")
    int deleteByExample(Tb_payExample example);

    @Delete({
        "delete from tb_pay",
        "where payId = #{payid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer payid);

    @Insert({
        "insert into tb_pay (payId, chargeId, ",
        "chargeStandard, Latepayment, ",
        "payReal, payBalance, ",
        "houseId, chargeTime, ",
        "payName, payState, ",
        "payMonth, owerId)",
        "values (#{payid,jdbcType=INTEGER}, #{chargeid,jdbcType=INTEGER}, ",
        "#{chargestandard,jdbcType=DOUBLE}, #{latepayment,jdbcType=DOUBLE}, ",
        "#{payreal,jdbcType=DOUBLE}, #{paybalance,jdbcType=DOUBLE}, ",
        "#{houseid,jdbcType=INTEGER}, #{chargetime,jdbcType=TIMESTAMP}, ",
        "#{payname,jdbcType=VARCHAR}, #{paystate,jdbcType=INTEGER}, ",
        "#{paymonth,jdbcType=VARCHAR}, #{owerid,jdbcType=INTEGER})"
    })
    int insert(Tb_pay record);

    @InsertProvider(type=Tb_paySqlProvider.class, method="insertSelective")
    int insertSelective(Tb_pay record);

    @SelectProvider(type=Tb_paySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="payId", property="payid", jdbcType=JdbcType.INTEGER, id=true),
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
        @Result(column="owerId", property="owerid", jdbcType=JdbcType.INTEGER)
    })
    List<Tb_pay> selectByExampleWithRowbounds(Tb_payExample example, RowBounds rowBounds);

    @SelectProvider(type=Tb_paySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="payId", property="payid", jdbcType=JdbcType.INTEGER, id=true),
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
        @Result(column="owerId", property="owerid", jdbcType=JdbcType.INTEGER)
    })
    List<Tb_pay> selectByExample(Tb_payExample example);

    @Select({
        "select",
        "payId, chargeId, chargeStandard, Latepayment, payReal, payBalance, houseId, ",
        "chargeTime, payName, payState, payMonth, owerId",
        "from tb_pay",
        "where payId = #{payid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="payId", property="payid", jdbcType=JdbcType.INTEGER, id=true),
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
        @Result(column="owerId", property="owerid", jdbcType=JdbcType.INTEGER)
    })
    Tb_pay selectByPrimaryKey(Integer payid);

    @UpdateProvider(type=Tb_paySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Tb_pay record, @Param("example") Tb_payExample example);

    @UpdateProvider(type=Tb_paySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Tb_pay record, @Param("example") Tb_payExample example);

    @UpdateProvider(type=Tb_paySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Tb_pay record);

    @Update({
        "update tb_pay",
        "set chargeId = #{chargeid,jdbcType=INTEGER},",
          "chargeStandard = #{chargestandard,jdbcType=DOUBLE},",
          "Latepayment = #{latepayment,jdbcType=DOUBLE},",
          "payReal = #{payreal,jdbcType=DOUBLE},",
          "payBalance = #{paybalance,jdbcType=DOUBLE},",
          "houseId = #{houseid,jdbcType=INTEGER},",
          "chargeTime = #{chargetime,jdbcType=TIMESTAMP},",
          "payName = #{payname,jdbcType=VARCHAR},",
          "payState = #{paystate,jdbcType=INTEGER},",
          "payMonth = #{paymonth,jdbcType=VARCHAR},",
          "owerId = #{owerid,jdbcType=INTEGER}",
        "where payId = #{payid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Tb_pay record);
}