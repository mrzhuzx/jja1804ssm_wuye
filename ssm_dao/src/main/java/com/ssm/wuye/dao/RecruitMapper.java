package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Recruit;
import com.ssm.wuye.domain.RecruitExample;
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

public interface RecruitMapper {
    @SelectProvider(type=RecruitSqlProvider.class, method="countByExample")
    long countByExample(RecruitExample example);

    @DeleteProvider(type=RecruitSqlProvider.class, method="deleteByExample")
    int deleteByExample(RecruitExample example);

    @Delete({
        "delete from recruit",
        "where recruitId = #{recruitid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer recruitid);

    @Insert({
        "insert into recruit (recruitId, companyName, ",
        "postName, recruitDes, ",
        "Duty, Salary, recruitNum, ",
        "recruitNumber, recruitEnd, ",
        "Address)",
        "values (#{recruitid,jdbcType=INTEGER}, #{companyname,jdbcType=VARCHAR}, ",
        "#{postname,jdbcType=VARCHAR}, #{recruitdes,jdbcType=VARCHAR}, ",
        "#{duty,jdbcType=VARCHAR}, #{salary,jdbcType=VARCHAR}, #{recruitnum,jdbcType=INTEGER}, ",
        "#{recruitnumber,jdbcType=VARCHAR}, #{recruitend,jdbcType=DATE}, ",
        "#{address,jdbcType=VARCHAR})"
    })
    int insert(Recruit record);

    @InsertProvider(type=RecruitSqlProvider.class, method="insertSelective")
    int insertSelective(Recruit record);

    @SelectProvider(type=RecruitSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="recruitId", property="recruitid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="companyName", property="companyname", jdbcType=JdbcType.VARCHAR),
        @Result(column="postName", property="postname", jdbcType=JdbcType.VARCHAR),
        @Result(column="recruitDes", property="recruitdes", jdbcType=JdbcType.VARCHAR),
        @Result(column="Duty", property="duty", jdbcType=JdbcType.VARCHAR),
        @Result(column="Salary", property="salary", jdbcType=JdbcType.VARCHAR),
        @Result(column="recruitNum", property="recruitnum", jdbcType=JdbcType.INTEGER),
        @Result(column="recruitNumber", property="recruitnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="recruitEnd", property="recruitend", jdbcType=JdbcType.DATE),
        @Result(column="Address", property="address", jdbcType=JdbcType.VARCHAR)
    })
    List<Recruit> selectByExampleWithRowbounds(RecruitExample example, RowBounds rowBounds);

    @SelectProvider(type=RecruitSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="recruitId", property="recruitid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="companyName", property="companyname", jdbcType=JdbcType.VARCHAR),
        @Result(column="postName", property="postname", jdbcType=JdbcType.VARCHAR),
        @Result(column="recruitDes", property="recruitdes", jdbcType=JdbcType.VARCHAR),
        @Result(column="Duty", property="duty", jdbcType=JdbcType.VARCHAR),
        @Result(column="Salary", property="salary", jdbcType=JdbcType.VARCHAR),
        @Result(column="recruitNum", property="recruitnum", jdbcType=JdbcType.INTEGER),
        @Result(column="recruitNumber", property="recruitnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="recruitEnd", property="recruitend", jdbcType=JdbcType.DATE),
        @Result(column="Address", property="address", jdbcType=JdbcType.VARCHAR)
    })
    List<Recruit> selectByExample(RecruitExample example);

    @Select({
        "select",
        "recruitId, companyName, postName, recruitDes, Duty, Salary, recruitNum, recruitNumber, ",
        "recruitEnd, Address",
        "from recruit",
        "where recruitId = #{recruitid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="recruitId", property="recruitid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="companyName", property="companyname", jdbcType=JdbcType.VARCHAR),
        @Result(column="postName", property="postname", jdbcType=JdbcType.VARCHAR),
        @Result(column="recruitDes", property="recruitdes", jdbcType=JdbcType.VARCHAR),
        @Result(column="Duty", property="duty", jdbcType=JdbcType.VARCHAR),
        @Result(column="Salary", property="salary", jdbcType=JdbcType.VARCHAR),
        @Result(column="recruitNum", property="recruitnum", jdbcType=JdbcType.INTEGER),
        @Result(column="recruitNumber", property="recruitnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="recruitEnd", property="recruitend", jdbcType=JdbcType.DATE),
        @Result(column="Address", property="address", jdbcType=JdbcType.VARCHAR)
    })
    Recruit selectByPrimaryKey(Integer recruitid);

    @UpdateProvider(type=RecruitSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Recruit record, @Param("example") RecruitExample example);

    @UpdateProvider(type=RecruitSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Recruit record, @Param("example") RecruitExample example);

    @UpdateProvider(type=RecruitSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Recruit record);

    @Update({
        "update recruit",
        "set companyName = #{companyname,jdbcType=VARCHAR},",
          "postName = #{postname,jdbcType=VARCHAR},",
          "recruitDes = #{recruitdes,jdbcType=VARCHAR},",
          "Duty = #{duty,jdbcType=VARCHAR},",
          "Salary = #{salary,jdbcType=VARCHAR},",
          "recruitNum = #{recruitnum,jdbcType=INTEGER},",
          "recruitNumber = #{recruitnumber,jdbcType=VARCHAR},",
          "recruitEnd = #{recruitend,jdbcType=DATE},",
          "Address = #{address,jdbcType=VARCHAR}",
        "where recruitId = #{recruitid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Recruit record);
}