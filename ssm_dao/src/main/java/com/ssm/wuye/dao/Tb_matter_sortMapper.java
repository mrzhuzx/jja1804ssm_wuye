package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Tb_matter_sort;
import com.ssm.wuye.domain.Tb_matter_sortExample;
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

public interface Tb_matter_sortMapper {
    @SelectProvider(type=Tb_matter_sortSqlProvider.class, method="countByExample")
    long countByExample(Tb_matter_sortExample example);

    @DeleteProvider(type=Tb_matter_sortSqlProvider.class, method="deleteByExample")
    int deleteByExample(Tb_matter_sortExample example);

    @Delete({
        "delete from tb_matter_sort",
        "where matterSortId = #{mattersortid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer mattersortid);

    @Insert({
        "insert into tb_matter_sort (matterSortId, matterSort)",
        "values (#{mattersortid,jdbcType=INTEGER}, #{mattersort,jdbcType=VARCHAR})"
    })
    int insert(Tb_matter_sort record);

    @InsertProvider(type=Tb_matter_sortSqlProvider.class, method="insertSelective")
    int insertSelective(Tb_matter_sort record);

    @SelectProvider(type=Tb_matter_sortSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="matterSortId", property="mattersortid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="matterSort", property="mattersort", jdbcType=JdbcType.VARCHAR)
    })
    List<Tb_matter_sort> selectByExampleWithRowbounds(Tb_matter_sortExample example, RowBounds rowBounds);

    @SelectProvider(type=Tb_matter_sortSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="matterSortId", property="mattersortid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="matterSort", property="mattersort", jdbcType=JdbcType.VARCHAR)
    })
    List<Tb_matter_sort> selectByExample(Tb_matter_sortExample example);

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
    Tb_matter_sort selectByPrimaryKey(Integer mattersortid);

    @UpdateProvider(type=Tb_matter_sortSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Tb_matter_sort record, @Param("example") Tb_matter_sortExample example);

    @UpdateProvider(type=Tb_matter_sortSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Tb_matter_sort record, @Param("example") Tb_matter_sortExample example);

    @UpdateProvider(type=Tb_matter_sortSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Tb_matter_sort record);

    @Update({
        "update tb_matter_sort",
        "set matterSort = #{mattersort,jdbcType=VARCHAR}",
        "where matterSortId = #{mattersortid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Tb_matter_sort record);
}