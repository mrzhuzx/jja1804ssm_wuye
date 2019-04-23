package com.ssm.wuye.dao;

import com.ssm.wuye.domain.RepairInfo;
import com.ssm.wuye.domain.RepairInfoExample;
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

public interface RepairInfoMapper {
    @SelectProvider(type=RepairInfoSqlProvider.class, method="countByExample")
    long countByExample(RepairInfoExample example);

    @DeleteProvider(type=RepairInfoSqlProvider.class, method="deleteByExample")
    int deleteByExample(RepairInfoExample example);

    @Delete({
        "delete from repair_info",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into repair_info (id, repairname, ",
        "repairphone, category, ",
        "repdesc, reportdate, ",
        "means, status, repairdate, ",
        "principal, material, ",
        "upkeep, completedate, ",
        "ispay, paydate)",
        "values (#{id,jdbcType=INTEGER}, #{repairname,jdbcType=VARCHAR}, ",
        "#{repairphone,jdbcType=VARCHAR}, #{category,jdbcType=VARCHAR}, ",
        "#{repdesc,jdbcType=VARCHAR}, #{reportdate,jdbcType=TIMESTAMP}, ",
        "#{means,jdbcType=INTEGER}, #{status,jdbcType=INTEGER}, #{repairdate,jdbcType=TIMESTAMP}, ",
        "#{principal,jdbcType=VARCHAR}, #{material,jdbcType=DOUBLE}, ",
        "#{upkeep,jdbcType=DOUBLE}, #{completedate,jdbcType=DATE}, ",
        "#{ispay,jdbcType=INTEGER}, #{paydate,jdbcType=TIMESTAMP})"
    })
    int insert(RepairInfo record);

    @InsertProvider(type=RepairInfoSqlProvider.class, method="insertSelective")
    int insertSelective(RepairInfo record);

    @SelectProvider(type=RepairInfoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="repairname", property="repairname", jdbcType=JdbcType.VARCHAR),
        @Result(column="repairphone", property="repairphone", jdbcType=JdbcType.VARCHAR),
        @Result(column="category", property="category", jdbcType=JdbcType.VARCHAR),
        @Result(column="repdesc", property="repdesc", jdbcType=JdbcType.VARCHAR),
        @Result(column="reportdate", property="reportdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="means", property="means", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="repairdate", property="repairdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="principal", property="principal", jdbcType=JdbcType.VARCHAR),
        @Result(column="material", property="material", jdbcType=JdbcType.DOUBLE),
        @Result(column="upkeep", property="upkeep", jdbcType=JdbcType.DOUBLE),
        @Result(column="completedate", property="completedate", jdbcType=JdbcType.DATE),
        @Result(column="ispay", property="ispay", jdbcType=JdbcType.INTEGER),
        @Result(column="paydate", property="paydate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<RepairInfo> selectByExampleWithRowbounds(RepairInfoExample example, RowBounds rowBounds);

    @SelectProvider(type=RepairInfoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="repairname", property="repairname", jdbcType=JdbcType.VARCHAR),
        @Result(column="repairphone", property="repairphone", jdbcType=JdbcType.VARCHAR),
        @Result(column="category", property="category", jdbcType=JdbcType.VARCHAR),
        @Result(column="repdesc", property="repdesc", jdbcType=JdbcType.VARCHAR),
        @Result(column="reportdate", property="reportdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="means", property="means", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="repairdate", property="repairdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="principal", property="principal", jdbcType=JdbcType.VARCHAR),
        @Result(column="material", property="material", jdbcType=JdbcType.DOUBLE),
        @Result(column="upkeep", property="upkeep", jdbcType=JdbcType.DOUBLE),
        @Result(column="completedate", property="completedate", jdbcType=JdbcType.DATE),
        @Result(column="ispay", property="ispay", jdbcType=JdbcType.INTEGER),
        @Result(column="paydate", property="paydate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<RepairInfo> selectByExample(RepairInfoExample example);

    @Select({
        "select",
        "id, repairname, repairphone, category, repdesc, reportdate, means, status, repairdate, ",
        "principal, material, upkeep, completedate, ispay, paydate",
        "from repair_info",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="repairname", property="repairname", jdbcType=JdbcType.VARCHAR),
        @Result(column="repairphone", property="repairphone", jdbcType=JdbcType.VARCHAR),
        @Result(column="category", property="category", jdbcType=JdbcType.VARCHAR),
        @Result(column="repdesc", property="repdesc", jdbcType=JdbcType.VARCHAR),
        @Result(column="reportdate", property="reportdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="means", property="means", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="repairdate", property="repairdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="principal", property="principal", jdbcType=JdbcType.VARCHAR),
        @Result(column="material", property="material", jdbcType=JdbcType.DOUBLE),
        @Result(column="upkeep", property="upkeep", jdbcType=JdbcType.DOUBLE),
        @Result(column="completedate", property="completedate", jdbcType=JdbcType.DATE),
        @Result(column="ispay", property="ispay", jdbcType=JdbcType.INTEGER),
        @Result(column="paydate", property="paydate", jdbcType=JdbcType.TIMESTAMP)
    })
    RepairInfo selectByPrimaryKey(Integer id);

    @UpdateProvider(type=RepairInfoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") RepairInfo record, @Param("example") RepairInfoExample example);

    @UpdateProvider(type=RepairInfoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") RepairInfo record, @Param("example") RepairInfoExample example);

    @UpdateProvider(type=RepairInfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(RepairInfo record);

    @Update({
        "update repair_info",
        "set repairname = #{repairname,jdbcType=VARCHAR},",
          "repairphone = #{repairphone,jdbcType=VARCHAR},",
          "category = #{category,jdbcType=VARCHAR},",
          "repdesc = #{repdesc,jdbcType=VARCHAR},",
          "reportdate = #{reportdate,jdbcType=TIMESTAMP},",
          "means = #{means,jdbcType=INTEGER},",
          "status = #{status,jdbcType=INTEGER},",
          "repairdate = #{repairdate,jdbcType=TIMESTAMP},",
          "principal = #{principal,jdbcType=VARCHAR},",
          "material = #{material,jdbcType=DOUBLE},",
          "upkeep = #{upkeep,jdbcType=DOUBLE},",
          "completedate = #{completedate,jdbcType=DATE},",
          "ispay = #{ispay,jdbcType=INTEGER},",
          "paydate = #{paydate,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(RepairInfo record);
}