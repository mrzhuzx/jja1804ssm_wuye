package com.ssm.wuye.dao;

import com.ssm.wuye.domain.TbCharge;
import com.ssm.wuye.domain.TbChargeExample;
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

public interface TbChargeMapper {
    @SelectProvider(type=TbChargeSqlProvider.class, method="countByExample")
    long countByExample(TbChargeExample example);

    @DeleteProvider(type=TbChargeSqlProvider.class, method="deleteByExample")
    int deleteByExample(TbChargeExample example);

    @Delete({
        "delete from tb_charge",
        "where chargeId = #{chargeid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer chargeid);

    @Insert({
        "insert into tb_charge (chargeId, chargeName, ",
        "chargeStandard, chargeDescription, ",
        "chargeYear)",
        "values (#{chargeid,jdbcType=INTEGER}, #{chargename,jdbcType=VARCHAR}, ",
        "#{chargestandard,jdbcType=DOUBLE}, #{chargedescription,jdbcType=VARCHAR}, ",
        "#{chargeyear,jdbcType=VARCHAR})"
    })
    int insert(TbCharge record);

    @InsertProvider(type=TbChargeSqlProvider.class, method="insertSelective")
    int insertSelective(TbCharge record);

    @SelectProvider(type=TbChargeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="chargeId", property="chargeid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="chargeName", property="chargename", jdbcType=JdbcType.VARCHAR),
        @Result(column="chargeStandard", property="chargestandard", jdbcType=JdbcType.DOUBLE),
        @Result(column="chargeDescription", property="chargedescription", jdbcType=JdbcType.VARCHAR),
        @Result(column="chargeYear", property="chargeyear", jdbcType=JdbcType.VARCHAR)
    })
    List<TbCharge> selectByExampleWithRowbounds(TbChargeExample example, RowBounds rowBounds);

    @SelectProvider(type=TbChargeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="chargeId", property="chargeid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="chargeName", property="chargename", jdbcType=JdbcType.VARCHAR),
        @Result(column="chargeStandard", property="chargestandard", jdbcType=JdbcType.DOUBLE),
        @Result(column="chargeDescription", property="chargedescription", jdbcType=JdbcType.VARCHAR),
        @Result(column="chargeYear", property="chargeyear", jdbcType=JdbcType.VARCHAR)
    })
    List<TbCharge> selectByExample(TbChargeExample example);

    @Select({
        "select",
        "chargeId, chargeName, chargeStandard, chargeDescription, chargeYear",
        "from tb_charge",
        "where chargeId = #{chargeid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="chargeId", property="chargeid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="chargeName", property="chargename", jdbcType=JdbcType.VARCHAR),
        @Result(column="chargeStandard", property="chargestandard", jdbcType=JdbcType.DOUBLE),
        @Result(column="chargeDescription", property="chargedescription", jdbcType=JdbcType.VARCHAR),
        @Result(column="chargeYear", property="chargeyear", jdbcType=JdbcType.VARCHAR)
    })
    TbCharge selectByPrimaryKey(Integer chargeid);

    @UpdateProvider(type=TbChargeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TbCharge record, @Param("example") TbChargeExample example);

    @UpdateProvider(type=TbChargeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TbCharge record, @Param("example") TbChargeExample example);

    @UpdateProvider(type=TbChargeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TbCharge record);

    @Update({
        "update tb_charge",
        "set chargeName = #{chargename,jdbcType=VARCHAR},",
          "chargeStandard = #{chargestandard,jdbcType=DOUBLE},",
          "chargeDescription = #{chargedescription,jdbcType=VARCHAR},",
          "chargeYear = #{chargeyear,jdbcType=VARCHAR}",
        "where chargeId = #{chargeid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TbCharge record);
}