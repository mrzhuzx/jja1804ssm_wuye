package com.ssm.wuye.dao;

import com.ssm.wuye.domain.ContractType;
import com.ssm.wuye.domain.ContractTypeExample;
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

public interface ContractTypeMapper {
    @SelectProvider(type=ContractTypeSqlProvider.class, method="countByExample")
    long countByExample(ContractTypeExample example);

    @DeleteProvider(type=ContractTypeSqlProvider.class, method="deleteByExample")
    int deleteByExample(ContractTypeExample example);

    @Delete({
        "delete from contract_type",
        "where contypeId = #{contypeid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer contypeid);

    @Insert({
        "insert into contract_type (contypeId, contractType)",
        "values (#{contypeid,jdbcType=INTEGER}, #{contracttype,jdbcType=VARCHAR})"
    })
    int insert(ContractType record);

    @InsertProvider(type=ContractTypeSqlProvider.class, method="insertSelective")
    int insertSelective(ContractType record);

    @SelectProvider(type=ContractTypeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="contypeId", property="contypeid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="contractType", property="contracttype", jdbcType=JdbcType.VARCHAR)
    })
    List<ContractType> selectByExampleWithRowbounds(ContractTypeExample example, RowBounds rowBounds);

    @SelectProvider(type=ContractTypeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="contypeId", property="contypeid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="contractType", property="contracttype", jdbcType=JdbcType.VARCHAR)
    })
    List<ContractType> selectByExample(ContractTypeExample example);

    @Select({
        "select",
        "contypeId, contractType",
        "from contract_type",
        "where contypeId = #{contypeid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="contypeId", property="contypeid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="contractType", property="contracttype", jdbcType=JdbcType.VARCHAR)
    })
    ContractType selectByPrimaryKey(Integer contypeid);

    @UpdateProvider(type=ContractTypeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ContractType record, @Param("example") ContractTypeExample example);

    @UpdateProvider(type=ContractTypeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ContractType record, @Param("example") ContractTypeExample example);

    @UpdateProvider(type=ContractTypeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ContractType record);

    @Update({
        "update contract_type",
        "set contractType = #{contracttype,jdbcType=VARCHAR}",
        "where contypeId = #{contypeid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ContractType record);
}