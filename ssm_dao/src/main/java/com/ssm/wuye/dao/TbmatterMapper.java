package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Tbmatter;
import com.ssm.wuye.domain.TbmatterExample;
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

public interface TbmatterMapper {
    @SelectProvider(type=TbmatterSqlProvider.class, method="countByExample")
    long countByExample(TbmatterExample example);

    @DeleteProvider(type=TbmatterSqlProvider.class, method="deleteByExample")
    int deleteByExample(TbmatterExample example);

    @Delete({
        "delete from tb_matter",
        "where matterId = #{matterid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer matterid);

    @Insert({
        "insert into tb_matter (matterId, matterName, ",
        "matterNum, matterPrice, ",
        "matterSortId, inStorageTime, ",
        "outStorageTime, matterState)",
        "values (#{matterid,jdbcType=INTEGER}, #{mattername,jdbcType=VARCHAR}, ",
        "#{matternum,jdbcType=INTEGER}, #{matterprice,jdbcType=DOUBLE}, ",
        "#{mattersortid,jdbcType=INTEGER}, #{instoragetime,jdbcType=DATE}, ",
        "#{outstoragetime,jdbcType=DATE}, #{matterstate,jdbcType=VARCHAR})"
    })
    int insert(Tbmatter record);

    @InsertProvider(type=TbmatterSqlProvider.class, method="insertSelective")
    int insertSelective(Tbmatter record);

    @SelectProvider(type=TbmatterSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="matterId", property="matterid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="matterName", property="mattername", jdbcType=JdbcType.VARCHAR),
        @Result(column="matterNum", property="matternum", jdbcType=JdbcType.INTEGER),
        @Result(column="matterPrice", property="matterprice", jdbcType=JdbcType.DOUBLE),
        @Result(column="matterSortId", property="mattersortid", jdbcType=JdbcType.INTEGER),
        @Result(column="inStorageTime", property="instoragetime", jdbcType=JdbcType.DATE),
        @Result(column="outStorageTime", property="outstoragetime", jdbcType=JdbcType.DATE),
        @Result(column="matterState", property="matterstate", jdbcType=JdbcType.VARCHAR)
    })
    List<Tbmatter> selectByExampleWithRowbounds(TbmatterExample example, RowBounds rowBounds);

    @SelectProvider(type=TbmatterSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="matterId", property="matterid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="matterName", property="mattername", jdbcType=JdbcType.VARCHAR),
        @Result(column="matterNum", property="matternum", jdbcType=JdbcType.INTEGER),
        @Result(column="matterPrice", property="matterprice", jdbcType=JdbcType.DOUBLE),
        @Result(column="matterSortId", property="mattersortid", jdbcType=JdbcType.INTEGER),
        @Result(column="inStorageTime", property="instoragetime", jdbcType=JdbcType.DATE),
        @Result(column="outStorageTime", property="outstoragetime", jdbcType=JdbcType.DATE),
        @Result(column="matterState", property="matterstate", jdbcType=JdbcType.VARCHAR)
    })
    List<Tbmatter> selectByExample(TbmatterExample example);

    @Select({
        "select",
        "matterId, matterName, matterNum, matterPrice, matterSortId, inStorageTime, outStorageTime, ",
        "matterState",
        "from tb_matter",
        "where matterId = #{matterid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="matterId", property="matterid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="matterName", property="mattername", jdbcType=JdbcType.VARCHAR),
        @Result(column="matterNum", property="matternum", jdbcType=JdbcType.INTEGER),
        @Result(column="matterPrice", property="matterprice", jdbcType=JdbcType.DOUBLE),
        @Result(column="matterSortId", property="mattersortid", jdbcType=JdbcType.INTEGER),
        @Result(column="inStorageTime", property="instoragetime", jdbcType=JdbcType.DATE),
        @Result(column="outStorageTime", property="outstoragetime", jdbcType=JdbcType.DATE),
        @Result(column="matterState", property="matterstate", jdbcType=JdbcType.VARCHAR)
    })
    Tbmatter selectByPrimaryKey(Integer matterid);

    @UpdateProvider(type=TbmatterSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Tbmatter record, @Param("example") TbmatterExample example);

    @UpdateProvider(type=TbmatterSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Tbmatter record, @Param("example") TbmatterExample example);

    @UpdateProvider(type=TbmatterSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Tbmatter record);

    @Update({
        "update tb_matter",
        "set matterName = #{mattername,jdbcType=VARCHAR},",
          "matterNum = #{matternum,jdbcType=INTEGER},",
          "matterPrice = #{matterprice,jdbcType=DOUBLE},",
          "matterSortId = #{mattersortid,jdbcType=INTEGER},",
          "inStorageTime = #{instoragetime,jdbcType=DATE},",
          "outStorageTime = #{outstoragetime,jdbcType=DATE},",
          "matterState = #{matterstate,jdbcType=VARCHAR}",
        "where matterId = #{matterid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Tbmatter record);
}