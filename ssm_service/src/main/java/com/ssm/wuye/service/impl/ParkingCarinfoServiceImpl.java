package com.ssm.wuye.service.impl;

import com.ssm.wuye.dao.ParkingCarinfoMapper;
import com.ssm.wuye.domain.ParkingCarinfo;
import com.ssm.wuye.domain.ParkingCarinfoExample;
import com.ssm.wuye.service.ParkingCarinfoService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * desc:
 * author:zhs
 * time:2019-04-25  10:51:14
 */
@Service
public class ParkingCarinfoServiceImpl implements ParkingCarinfoService {

    @Resource
    ParkingCarinfoMapper  parkingCarinfoMapper;

    public long countByExample(ParkingCarinfoExample example) {
        return parkingCarinfoMapper.countByExample(example);
    }

    /**
     * 删除数据
     *
     * @param cid
     * @return
     */
    public int deleteByExample(Integer cid) {

        return  parkingCarinfoMapper.deleteByPrimaryKey(cid);
    }

    /**
     * 添加
     *
     * @param record
     * @return
     */
    public int insert(ParkingCarinfo record) {
        return parkingCarinfoMapper.insert(record);
    }

    /**
     * 查询带分页
     *
     * @param example
     * @param rowBounds
     * @return
     */
    public List<ParkingCarinfo> selectByExampleWithRowbounds(ParkingCarinfoExample example, RowBounds rowBounds) {
        return parkingCarinfoMapper.selectByExampleWithRowbounds(example,rowBounds);
    }

    /**
     * 多条件查询
     *
     * @param example
     * @return
     */
    public List<ParkingCarinfo> selectByExample(ParkingCarinfoExample example) {
        return parkingCarinfoMapper.selectByExample(example);
    }

    /**
     * 主键返回一条数据
     *
     * @param hid
     * @return
     */
    public ParkingCarinfo selectByPrimaryKey(Integer hid) {
        return parkingCarinfoMapper.selectByPrimaryKey(hid);
    }

    /**
     * 修改
     * @param record
     * @return
     */
    public int updateByPrimaryKeySelective(ParkingCarinfo record) {
        return parkingCarinfoMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 添加
     *
     * @param record
     * @return
     */
    @Override
    public int insertSelective(ParkingCarinfo record) {
        return parkingCarinfoMapper.insertSelective(record);
    }


}
