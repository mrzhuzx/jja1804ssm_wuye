package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Programtype;
import com.ssm.wuye.domain.ProgramtypeExample;
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

public interface ProgramtypeMapper {
    @SelectProvider(type=ProgramtypeSqlProvider.class, method="countByExample")
    long countByExample(ProgramtypeExample example);

    @DeleteProvider(type=ProgramtypeSqlProvider.class, method="deleteByExample")
    int deleteByExample(ProgramtypeExample example);

    @Delete({
        "delete from programtype",
        "where ptid = #{ptid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer ptid);

    @Insert({
        "insert into programtype (ptid, ptypename)",
        "values (#{ptid,jdbcType=INTEGER}, #{ptypename,jdbcType=VARCHAR})"
    })
    int insert(Programtype record);

    @InsertProvider(type=ProgramtypeSqlProvider.class, method="insertSelective")
    int insertSelective(Programtype record);

    @SelectProvider(type=ProgramtypeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ptid", property="ptid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ptypename", property="ptypename", jdbcType=JdbcType.VARCHAR)
    })
    List<Programtype> selectByExampleWithRowbounds(ProgramtypeExample example, RowBounds rowBounds);

    @SelectProvider(type=ProgramtypeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ptid", property="ptid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ptypename", property="ptypename", jdbcType=JdbcType.VARCHAR)
    })
    List<Programtype> selectByExample(ProgramtypeExample example);

    @Select({
        "select",
        "ptid, ptypename",
        "from programtype",
        "where ptid = #{ptid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ptid", property="ptid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ptypename", property="ptypename", jdbcType=JdbcType.VARCHAR)
    })
    Programtype selectByPrimaryKey(Integer ptid);

    @UpdateProvider(type=ProgramtypeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Programtype record, @Param("example") ProgramtypeExample example);

    @UpdateProvider(type=ProgramtypeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Programtype record, @Param("example") ProgramtypeExample example);

    @UpdateProvider(type=ProgramtypeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Programtype record);

    @Update({
        "update programtype",
        "set ptypename = #{ptypename,jdbcType=VARCHAR}",
        "where ptid = #{ptid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Programtype record);
}