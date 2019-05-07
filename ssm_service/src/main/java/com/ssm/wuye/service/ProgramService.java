package com.ssm.wuye.service; /*
 *desc:
 *author:wjs
 *time:2019/5/6 0006
 *version:1.2.3
 */

import com.ssm.wuye.domain.Program;
import com.ssm.wuye.domain.ProgramExample;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface ProgramService {

    /**
     * 主键修改
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Program record);

    /**
     * 查询总条数
     * @param example
     * @return
     */
    long countByExample(ProgramExample example);

    /**
     * 根据ID删除
     * @param pid
     * @return
     */
    int deleteByPrimaryKey(Integer pid);

    /**
     * 增加
     * @param record
     * @return
     */
    int insertSelective (Program record);

    /**
     * 带分页查询
     * @param example
     * @param rowBounds
     * @return
     */
    List<Program> selectByExampleWithRowbounds(ProgramExample example, RowBounds rowBounds);

    /**
     * 带条件查询
     * @param example
     * @return
     */
    List<Program> selectByExample(ProgramExample example);

    /**
     * 查询一条数据
     * @param pid
     * @return
     */
    Program selectByPrimaryKey(Integer pid);
}














