package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Xiangmu;
import com.ssm.wuye.domain.XiangmuExample;
import java.util.List;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface XiangmuMapper {
    @SelectProvider(type=XiangmuSqlProvider.class, method="countByExample")
    long countByExample(XiangmuExample example);

    @DeleteProvider(type=XiangmuSqlProvider.class, method="deleteByExample")
    int deleteByExample(XiangmuExample example);

    @Insert({
        "insert into xiangmu (pid, pname, ",
        "ppicture, pintroduce, ",
        "padress, ptid, ptypename)",
        "values (#{pid,jdbcType=INTEGER}, #{pname,jdbcType=VARCHAR}, ",
        "#{ppicture,jdbcType=VARCHAR}, #{pintroduce,jdbcType=VARCHAR}, ",
        "#{padress,jdbcType=VARCHAR}, #{ptid,jdbcType=INTEGER}, #{ptypename,jdbcType=VARCHAR})"
    })
    int insert(Xiangmu record);

    @InsertProvider(type=XiangmuSqlProvider.class, method="insertSelective")
    int insertSelective(Xiangmu record);

    @SelectProvider(type=XiangmuSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="pid", property="pid", jdbcType=JdbcType.INTEGER),
        @Result(column="pname", property="pname", jdbcType=JdbcType.VARCHAR),
        @Result(column="ppicture", property="ppicture", jdbcType=JdbcType.VARCHAR),
        @Result(column="pintroduce", property="pintroduce", jdbcType=JdbcType.VARCHAR),
        @Result(column="padress", property="padress", jdbcType=JdbcType.VARCHAR),
        @Result(column="ptid", property="ptid", jdbcType=JdbcType.INTEGER),
        @Result(column="ptypename", property="ptypename", jdbcType=JdbcType.VARCHAR)
    })
    List<Xiangmu> selectByExampleWithRowbounds(XiangmuExample example, RowBounds rowBounds);

    @SelectProvider(type=XiangmuSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="pid", property="pid", jdbcType=JdbcType.INTEGER),
        @Result(column="pname", property="pname", jdbcType=JdbcType.VARCHAR),
        @Result(column="ppicture", property="ppicture", jdbcType=JdbcType.VARCHAR),
        @Result(column="pintroduce", property="pintroduce", jdbcType=JdbcType.VARCHAR),
        @Result(column="padress", property="padress", jdbcType=JdbcType.VARCHAR),
        @Result(column="ptid", property="ptid", jdbcType=JdbcType.INTEGER),
        @Result(column="ptypename", property="ptypename", jdbcType=JdbcType.VARCHAR)
    })
    List<Xiangmu> selectByExample(XiangmuExample example);

    @UpdateProvider(type=XiangmuSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Xiangmu record, @Param("example") XiangmuExample example);

    @UpdateProvider(type=XiangmuSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Xiangmu record, @Param("example") XiangmuExample example);
}