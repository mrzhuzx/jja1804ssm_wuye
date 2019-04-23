package com.ssm.wuye.dao;

import com.ssm.wuye.domain.TbMatter_sort;
import com.ssm.wuye.domain.TbMatter_sortExample;
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

public interface TbMatter_sortMapper {
    @SelectProvider(type=TbMatter_sortSqlProvider.class, method="countByExample")
    long countByExample(TbMatter_sortExample example);

    @DeleteProvider(type=TbMatter_sortSqlProvider.class, method="deleteByExample")
    int deleteByExample(TbMatter_sortExample example);

    @Delete({
        "delete from tb_matter_sort",
        "where matterSortId = #{mattersortid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer mattersortid);

    @Insert({
        "insert into tb_matter_sort (matterSortId, matterSort)",
        "values (#{mattersortid,jdbcType=INTEGER}, #{mattersort,jdbcType=VARCHAR})"
    })
    int insert(TbMatter_sort record);

    @InsertProvider(type=TbMatter_sortSqlProvider.class, method="insertSelective")
    int insertSelective(TbMatter_sort record);

    @SelectProvider(type=TbMatter_sortSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="matterSortId", property="mattersortid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="matterSort", property="mattersort", jdbcType=JdbcType.VARCHAR)
    })
    List<TbMatter_sort> selectByExampleWithRowbounds(TbMatter_sortExample example, RowBounds rowBounds);

    @SelectProvider(type=TbMatter_sortSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="matterSortId", property="mattersortid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="matterSort", property="mattersort", jdbcType=JdbcType.VARCHAR)
    })
    List<TbMatter_sort> selectByExample(TbMatter_sortExample example);

    @Select({
        "select",
        "matterSortId, matterSort",
        "from tb_matter_sort",
        "where matterSortId = #{mattersortid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="matterSortId", property="mattersortid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="matterSort", property="mattersort", jdbcType=JdbcType.VARCHAR)
    })
    TbMatter_sort selectByPrimaryKey(Integer mattersortid);

    @UpdateProvider(type=TbMatter_sortSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TbMatter_sort record, @Param("example") TbMatter_sortExample example);

    @UpdateProvider(type=TbMatter_sortSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TbMatter_sort record, @Param("example") TbMatter_sortExample example);

    @UpdateProvider(type=TbMatter_sortSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TbMatter_sort record);

    @Update({
        "update tb_matter_sort",
        "set matterSort = #{mattersort,jdbcType=VARCHAR}",
        "where matterSortId = #{mattersortid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TbMatter_sort record);
}