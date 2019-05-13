package com.ssm.wuye.service.impl; /*
 *desc:
 *author:wjs
 *time:2019/5/6 0006
 *version:1.2.3
 */

import com.ssm.wuye.dao.ProgramMapper;
import com.ssm.wuye.domain.Program;
import com.ssm.wuye.domain.ProgramExample;
import com.ssm.wuye.service.ProgramService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProgramServiceImpl implements ProgramService {

    @Resource
    ProgramMapper programMapper;

    /**
     * 主键修改
     * @param record
     * @return
     */ @Override
    public int updateByPrimaryKeySelective(Program record) {
        return programMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 查询总条数
     * @param example
     * @return
     */
    @Override
    public long countByExample(ProgramExample example) {
        return programMapper.countByExample(example);
    }

    /**
     * 根据ID删除
     * @param pid
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Integer pid) {
        return programMapper.deleteByPrimaryKey(pid);
    }

    /**
     * 增加
     * @param record
     * @return
     */
    @Override
    public int insertSelective(Program record) {
        return programMapper.insertSelective(record);
    }

    /**
     * 带分页查询
     * @param example
     * @param rowBounds
     * @return
     */
    @Override
    public List<Program> selectByExampleWithRowbounds(ProgramExample example, RowBounds rowBounds) {
        return programMapper.selectByExampleWithRowbounds(example,rowBounds);
    }

    /**
     * 带条件查询
     * @param example
     * @return
     */
    @Override
    public List<Program> selectByExample(ProgramExample example) {
        return programMapper.selectByExample(example);
    }

    /**
     * 查询一条数据
     * @param pid
     * @return
     */
    @Override
    public Program selectByPrimaryKey(Integer pid) {
        return programMapper.selectByPrimaryKey(pid);
    }
}
