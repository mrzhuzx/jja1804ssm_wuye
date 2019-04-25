package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Contract;
import com.ssm.wuye.domain.ContractExample;
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

public interface ContractMapper {
    @SelectProvider(type=ContractSqlProvider.class, method="countByExample")
    long countByExample(ContractExample example);

    @DeleteProvider(type=ContractSqlProvider.class, method="deleteByExample")
    int deleteByExample(ContractExample example);

    @Delete({
        "delete from contract",
        "where contractId = #{contractid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer contractid);

    @Insert({
        "insert into contract (contractId, contractName, ",
        "contractType, contractStart, ",
        "contractEnd, contractDes, ",
        "signingPeople, signatoryTelephone, ",
        "contractNum)",
        "values (#{contractid,jdbcType=INTEGER}, #{contractname,jdbcType=VARCHAR}, ",
        "#{contracttype,jdbcType=VARCHAR}, #{contractstart,jdbcType=DATE}, ",
        "#{contractend,jdbcType=DATE}, #{contractdes,jdbcType=VARCHAR}, ",
        "#{signingpeople,jdbcType=VARCHAR}, #{signatorytelephone,jdbcType=VARCHAR}, ",
        "#{contractnum,jdbcType=VARCHAR})"
    })
    int insert(Contract record);

    @InsertProvider(type=ContractSqlProvider.class, method="insertSelective")
    int insertSelective(Contract record);

    @SelectProvider(type=ContractSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="contractId", property="contractid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="contractName", property="contractname", jdbcType=JdbcType.VARCHAR),
        @Result(column="contractType", property="contracttype", jdbcType=JdbcType.VARCHAR),
        @Result(column="contractStart", property="contractstart", jdbcType=JdbcType.DATE),
        @Result(column="contractEnd", property="contractend", jdbcType=JdbcType.DATE),
        @Result(column="contractDes", property="contractdes", jdbcType=JdbcType.VARCHAR),
        @Result(column="signingPeople", property="signingpeople", jdbcType=JdbcType.VARCHAR),
        @Result(column="signatoryTelephone", property="signatorytelephone", jdbcType=JdbcType.VARCHAR),
        @Result(column="contractNum", property="contractnum", jdbcType=JdbcType.VARCHAR)
    })
    List<Contract> selectByExampleWithRowbounds(ContractExample example, RowBounds rowBounds);

    @SelectProvider(type=ContractSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="contractId", property="contractid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="contractName", property="contractname", jdbcType=JdbcType.VARCHAR),
        @Result(column="contractType", property="contracttype", jdbcType=JdbcType.VARCHAR),
        @Result(column="contractStart", property="contractstart", jdbcType=JdbcType.DATE),
        @Result(column="contractEnd", property="contractend", jdbcType=JdbcType.DATE),
        @Result(column="contractDes", property="contractdes", jdbcType=JdbcType.VARCHAR),
        @Result(column="signingPeople", property="signingpeople", jdbcType=JdbcType.VARCHAR),
        @Result(column="signatoryTelephone", property="signatorytelephone", jdbcType=JdbcType.VARCHAR),
        @Result(column="contractNum", property="contractnum", jdbcType=JdbcType.VARCHAR)
    })
    List<Contract> selectByExample(ContractExample example);

    @Select({
        "select",
        "contractId, contractName, contractType, contractStart, contractEnd, contractDes, ",
        "signingPeople, signatoryTelephone, contractNum",
        "from contract",
        "where contractId = #{contractid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="contractId", property="contractid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="contractName", property="contractname", jdbcType=JdbcType.VARCHAR),
        @Result(column="contractType", property="contracttype", jdbcType=JdbcType.VARCHAR),
        @Result(column="contractStart", property="contractstart", jdbcType=JdbcType.DATE),
        @Result(column="contractEnd", property="contractend", jdbcType=JdbcType.DATE),
        @Result(column="contractDes", property="contractdes", jdbcType=JdbcType.VARCHAR),
        @Result(column="signingPeople", property="signingpeople", jdbcType=JdbcType.VARCHAR),
        @Result(column="signatoryTelephone", property="signatorytelephone", jdbcType=JdbcType.VARCHAR),
        @Result(column="contractNum", property="contractnum", jdbcType=JdbcType.VARCHAR)
    })
    Contract selectByPrimaryKey(Integer contractid);

    @UpdateProvider(type=ContractSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Contract record, @Param("example") ContractExample example);

    @UpdateProvider(type=ContractSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Contract record, @Param("example") ContractExample example);

    @UpdateProvider(type=ContractSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Contract record);

    @Update({
        "update contract",
        "set contractName = #{contractname,jdbcType=VARCHAR},",
          "contractType = #{contracttype,jdbcType=VARCHAR},",
          "contractStart = #{contractstart,jdbcType=DATE},",
          "contractEnd = #{contractend,jdbcType=DATE},",
          "contractDes = #{contractdes,jdbcType=VARCHAR},",
          "signingPeople = #{signingpeople,jdbcType=VARCHAR},",
          "signatoryTelephone = #{signatorytelephone,jdbcType=VARCHAR},",
          "contractNum = #{contractnum,jdbcType=VARCHAR}",
        "where contractId = #{contractid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Contract record);
}