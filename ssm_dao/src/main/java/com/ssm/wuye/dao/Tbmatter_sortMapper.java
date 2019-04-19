package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Tbmatter_sort;
import com.ssm.wuye.domain.Tbmatter_sortExample;
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

public interface Tbmatter_sortMapper {
    @SelectProvider(type=Tbmatter_sortSqlProvider.class, method="countByExample")
    long countByExample(Tbmatter_sortExample example);

    @DeleteProvider(type=Tbmatter_sortSqlProvider.class, method="deleteByExample")
    int deleteByExample(Tbmatter_sortExample example);

    @Delete({
        "delete from tb_matter_sort",
        "where matterSortId = #{mattersortid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer mattersortid);

    @Insert({
        "insert into tb_matter_sort (matterSortId, matterSort)",
        "values (#{mattersortid,jdbcType=INTEGER}, #{mattersort,jdbcType=VARCHAR})"
    })
    int insert(Tbmatter_sort record);

    @InsertProvider(type=Tbmatter_sortSqlProvider.class, method="insertSelective")
    int insertSelective(Tbmatter_sort record);

    @SelectProvider(type=Tbmatter_sortSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="matterSortId", property="mattersortid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="matterSort", property="mattersort", jdbcType=JdbcType.VARCHAR)
    })
    List<Tbmatter_sort> selectByExampleWithRowbounds(Tbmatter_sortExample example, RowBounds rowBounds);

    @SelectProvider(type=Tbmatter_sortSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="matterSortId", property="mattersortid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="matterSort", property="mattersort", jdbcType=JdbcType.VARCHAR)
    })
    List<Tbmatter_sort> selectByExample(Tbmatter_sortExample example);

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
    Tbmatter_sort selectByPrimaryKey(Integer mattersortid);

    @UpdateProvider(type=Tbmatter_sortSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Tbmatter_sort record, @Param("example") Tbmatter_sortExample example);

    @UpdateProvider(type=Tbmatter_sortSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Tbmatter_sort record, @Param("example") Tbmatter_sortExample example);

    @UpdateProvider(type=Tbmatter_sortSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Tbmatter_sort record);

    @Update({
        "update tb_matter_sort",
        "set matterSort = #{mattersort,jdbcType=VARCHAR}",
        "where matterSortId = #{mattersortid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Tbmatter_sort record);
}