package com.ssm.wuye.service.impl; /*
 *desc:
 *author:wjs
 *time:2019/4/25 0025
 *version:1.2.3
 */

import com.ssm.wuye.dao.SysAdminInfoMapper;
import com.ssm.wuye.domain.SysAdminInfo;
import com.ssm.wuye.domain.SysAdminInfoExample;
import com.ssm.wuye.service.SysAdminInfoService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysAdminInfoServiceImpl implements SysAdminInfoService {

    @Resource
    SysAdminInfoMapper sysAdminInfoMapper;



    /**
     * 查询总条数
     * @param example
     * @return
     */
    public long countByExample(SysAdminInfoExample example) {
        return sysAdminInfoMapper.countByExample(example);
    }

    public int deleteByExample(SysAdminInfoExample example) {
        return 0;
    }

    public long countByExample(SysAdminInfo example) {
        return 0;
    }

    public int deleteByExample(SysAdminInfo example) {
        return 0;
    }

    /**
     * 根据ID删除
     * @param userid
     * @return
     */
    public int deleteByPrimaryKey(Integer userid) {
        return sysAdminInfoMapper.deleteByPrimaryKey(userid);
    }

    public int insert(SysAdminInfo record) {
        return 0;
    }

    public List<SysAdminInfo> selectByExampleWithRowbounds(SysAdminInfo example, RowBounds rowBounds) {
        return null;
    }

    public List<SysAdminInfo> selectByExample(SysAdminInfo example) {
        return null;
    }

    /**
     * 增加
     * @param record
     * @return
     */
    public int insertSelective(SysAdminInfo record) {
        return sysAdminInfoMapper.insertSelective(record);
    }

    /**
     * 带分页查询
     * @param example
     * @param rowBounds
     * @return
     */
    public List<SysAdminInfo> selectByExampleWithRowbounds(SysAdminInfoExample example, RowBounds rowBounds) {
        return sysAdminInfoMapper.selectByExampleWithRowbounds(example,rowBounds);
    }

    /**
     * 带条件查询
     * @param example
     * @return
     */
    public List<SysAdminInfo> selectByExample(SysAdminInfoExample example) {
        return sysAdminInfoMapper.selectByExample(example);
    }

    /**
     * 查询一条数据
     * @param userid
     * @return
     */
    public SysAdminInfo selectByPrimaryKey(Integer userid) {
        return sysAdminInfoMapper.selectByPrimaryKey(userid);
    }

    public int updateByExampleSelective(SysAdminInfo sysAdminInfo, SysAdminInfo example) {
        return 0;
    }

    public int updateByExample(SysAdminInfo sysAdminInfo, SysAdminInfo example) {
        return 0;
    }

    /**
     * 主键修改
     * @param record
     * @return
     */
    public int updateByPrimaryKeySelective(SysAdminInfo record) {
        return sysAdminInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(SysAdminInfo record) {
        return 0;
    }
}
