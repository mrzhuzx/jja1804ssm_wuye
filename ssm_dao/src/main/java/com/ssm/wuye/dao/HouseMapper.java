package com.ssm.wuye.dao;

import com.ssm.wuye.domain.House;
import com.ssm.wuye.domain.HouseExample;
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

public interface HouseMapper {
    @SelectProvider(type=HouseSqlProvider.class, method="countByExample")
    long countByExample(HouseExample example);

    @DeleteProvider(type=HouseSqlProvider.class, method="deleteByExample")
    int deleteByExample(HouseExample example);

    @Insert({
        "insert into house (id, user_id, ",
        "type_id, title, description, ",
        "price, pubdate, floorage, ",
        "contact, street_id)",
        "values (#{id,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{typeId,jdbcType=INTEGER}, #{title,jdbcType=VARCHAR}, #{description,jdbcType=VARCHAR}, ",
        "#{price,jdbcType=INTEGER}, #{pubdate,jdbcType=DATE}, #{floorage,jdbcType=INTEGER}, ",
        "#{contact,jdbcType=VARCHAR}, #{streetId,jdbcType=INTEGER})"
    })
    int insert(House record);

    @InsertProvider(type=HouseSqlProvider.class, method="insertSelective")
    int insertSelective(House record);

    @SelectProvider(type=HouseSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="type_id", property="typeId", jdbcType=JdbcType.INTEGER),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="price", property="price", jdbcType=JdbcType.INTEGER),
        @Result(column="pubdate", property="pubdate", jdbcType=JdbcType.DATE),
        @Result(column="floorage", property="floorage", jdbcType=JdbcType.INTEGER),
        @Result(column="contact", property="contact", jdbcType=JdbcType.VARCHAR),
        @Result(column="street_id", property="streetId", jdbcType=JdbcType.INTEGER)
    })
    List<House> selectByExampleWithRowbounds(HouseExample example, RowBounds rowBounds);

    @SelectProvider(type=HouseSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="type_id", property="typeId", jdbcType=JdbcType.INTEGER),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="price", property="price", jdbcType=JdbcType.INTEGER),
        @Result(column="pubdate", property="pubdate", jdbcType=JdbcType.DATE),
        @Result(column="floorage", property="floorage", jdbcType=JdbcType.INTEGER),
        @Result(column="contact", property="contact", jdbcType=JdbcType.VARCHAR),
        @Result(column="street_id", property="streetId", jdbcType=JdbcType.INTEGER)
    })
    List<House> selectByExample(HouseExample example);

    @UpdateProvider(type=HouseSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") House record, @Param("example") HouseExample example);

    @UpdateProvider(type=HouseSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") House record, @Param("example") HouseExample example);
}