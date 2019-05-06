package com.ssm.wuye.service.impl;

import com.ssm.wuye.dao.RepairInfoMapper;
import com.ssm.wuye.domain.RepairInfo;
import com.ssm.wuye.domain.RepairInfoExample;
import com.ssm.wuye.service.RepairService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * desc:
 * author:czf
 * time:2019\5\5 0005
 * version:
 */
@Service
public class RepairServiceImpl implements RepairService {
    @Resource
    RepairInfoMapper repairInfoMapper;

    @Override
    public long countByExample(RepairInfo example) {
        return 0;
    }

    @Override
    public int deleteByExample(RepairInfo example) {
        return 0;
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Integer id) {

        RepairInfoExample repairInfoExample = new RepairInfoExample();
        repairInfoExample.createCriteria().andIdEqualTo(id);
        return repairInfoMapper.deleteByPrimaryKey(id);
    }

    /**
     * 插入
     * @param repairInfo
     * @return
     */

    @Override
    public int insert(RepairInfo repairInfo) {
        return repairInfoMapper.insert(repairInfo);
    }

    @Override
    public List<RepairInfo> selectByExampleWithRowbounds(RepairInfo example, RowBounds rowBounds) {
        return null;
    }

    /**
     * 查询
     * @param example
     * @return
     */

    @Override
    public List<RepairInfo> selectByExample(RepairInfo example) {
        RepairInfoExample repairInfoExample = new RepairInfoExample();

        return repairInfoMapper.selectByExample(repairInfoExample);
    }

    /**
     * 查询一条数据
     * @param ntid
     * @return
     */
    @Override
    public RepairInfo selectByPrimaryKey(Integer ntid) {
        return repairInfoMapper.selectByPrimaryKey(ntid);
    }

    @Override
    public int updateByExampleSelective(RepairInfo repairInfo, RepairInfo example) {
        return 0;
    }

    @Override
    public int updateByExample(RepairInfo repairInfo, RepairInfo example) {
        return 0;
    }

    /**
     * 修改
     * @param repairInfo
     * @return
     */
    @Override
    public int updateByPrimaryKeySelective(RepairInfo repairInfo) {
        return repairInfoMapper.updateByPrimaryKey(repairInfo);
    }

    @Override
    public int updateByPrimaryKey(RepairInfo repairInfo) {
        return 0;
    }
}
