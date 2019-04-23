package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Tb_charge;
import com.ssm.wuye.domain.Tb_chargeExample;
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

public interface Tb_chargeMapper {
    @SelectProvider(type=Tb_chargeSqlProvider.class, method="countByExample")
    long countByExample(Tb_chargeExample example);

    @DeleteProvider(type=Tb_chargeSqlProvider.class, method="deleteByExample")
    int deleteByExample(Tb_chargeExample example);

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
    int insert(Tb_charge record);

    @InsertProvider(type=Tb_chargeSqlProvider.class, method="insertSelective")
    int insertSelective(Tb_charge record);

    @SelectProvider(type=Tb_chargeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="chargeId", property="chargeid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="chargeName", property="chargename", jdbcType=JdbcType.VARCHAR),
        @Result(column="chargeStandard", property="chargestandard", jdbcType=JdbcType.DOUBLE),
        @Result(column="chargeDescription", property="chargedescription", jdbcType=JdbcType.VARCHAR),
        @Result(column="chargeYear", property="chargeyear", jdbcType=JdbcType.VARCHAR)
    })
    List<Tb_charge> selectByExampleWithRowbounds(Tb_chargeExample example, RowBounds rowBounds);

    @SelectProvider(type=Tb_chargeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="chargeId", property="chargeid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="chargeName", property="chargename", jdbcType=JdbcType.VARCHAR),
        @Result(column="chargeStandard", property="chargestandard", jdbcType=JdbcType.DOUBLE),
        @Result(column="chargeDescription", property="chargedescription", jdbcType=JdbcType.VARCHAR),
        @Result(column="chargeYear", property="chargeyear", jdbcType=JdbcType.VARCHAR)
    })
    List<Tb_charge> selectByExample(Tb_chargeExample example);

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
    Tb_charge selectByPrimaryKey(Integer chargeid);

    @UpdateProvider(type=Tb_chargeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Tb_charge record, @Param("example") Tb_chargeExample example);

    @UpdateProvider(type=Tb_chargeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Tb_charge record, @Param("example") Tb_chargeExample example);

    @UpdateProvider(type=Tb_chargeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Tb_charge record);

    @Update({
        "update tb_charge",
        "set chargeName = #{chargename,jdbcType=VARCHAR},",
          "chargeStandard = #{chargestandard,jdbcType=DOUBLE},",
          "chargeDescription = #{chargedescription,jdbcType=VARCHAR},",
          "chargeYear = #{chargeyear,jdbcType=VARCHAR}",
        "where chargeId = #{chargeid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Tb_charge record);
}