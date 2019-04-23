package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Contract_type;
import com.ssm.wuye.domain.Contract_typeExample;
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

public interface Contract_typeMapper {
    @SelectProvider(type=Contract_typeSqlProvider.class, method="countByExample")
    long countByExample(Contract_typeExample example);

    @DeleteProvider(type=Contract_typeSqlProvider.class, method="deleteByExample")
    int deleteByExample(Contract_typeExample example);

    @Delete({
        "delete from contract_type",
        "where contypeId = #{contypeid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer contypeid);

    @Insert({
        "insert into contract_type (contypeId, contractType)",
        "values (#{contypeid,jdbcType=INTEGER}, #{contracttype,jdbcType=VARCHAR})"
    })
    int insert(Contract_type record);

    @InsertProvider(type=Contract_typeSqlProvider.class, method="insertSelective")
    int insertSelective(Contract_type record);

    @SelectProvider(type=Contract_typeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="contypeId", property="contypeid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="contractType", property="contracttype", jdbcType=JdbcType.VARCHAR)
    })
    List<Contract_type> selectByExampleWithRowbounds(Contract_typeExample example, RowBounds rowBounds);

    @SelectProvider(type=Contract_typeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="contypeId", property="contypeid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="contractType", property="contracttype", jdbcType=JdbcType.VARCHAR)
    })
    List<Contract_type> selectByExample(Contract_typeExample example);

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
    Contract_type selectByPrimaryKey(Integer contypeid);

    @UpdateProvider(type=Contract_typeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Contract_type record, @Param("example") Contract_typeExample example);

    @UpdateProvider(type=Contract_typeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Contract_type record, @Param("example") Contract_typeExample example);

    @UpdateProvider(type=Contract_typeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Contract_type record);

    @Update({
        "update contract_type",
        "set contractType = #{contracttype,jdbcType=VARCHAR}",
        "where contypeId = #{contypeid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Contract_type record);
}