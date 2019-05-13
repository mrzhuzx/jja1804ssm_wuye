package com.ssm.wuye.service.impl;

import com.ssm.wuye.dao.ParkingPlaceinfoMapper;
import com.ssm.wuye.domain.ParkingPlaceinfo;
import com.ssm.wuye.domain.ParkingPlaceinfoExample;
import com.ssm.wuye.service.ParkingPlaceinfoService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * desc:
 * author:zhs
 * time:time
 */
@Service
public class ParkingPlaceinfoServiceImpl implements ParkingPlaceinfoService {

    @Resource
    ParkingPlaceinfoMapper  parkingPlaceinfoMapper;
    public long countByExample(ParkingPlaceinfoExample example) {
        return parkingPlaceinfoMapper.countByExample(example);
    }

    /**
     * 删除数据
     *
     * @param cid
     * @return
     */
    public int deleteByExample(Integer cid) {
        return parkingPlaceinfoMapper.deleteByPrimaryKey(cid);
    }

    /**
     * 添加
     *
     * @param record
     * @return
     */
    public int insert(ParkingPlaceinfo record) {
        return parkingPlaceinfoMapper.insert(record);
    }

    /**
     * 查询带分页
     *
     * @param example
     * @param rowBounds
     * @return
     */
    public List<ParkingPlaceinfo> selectByExampleWithRowbounds(ParkingPlaceinfoExample example, RowBounds rowBounds) {
        return parkingPlaceinfoMapper.selectByExampleWithRowbounds(example,rowBounds);
    }

    /**
     * 多条件查询
     *
     * @param example
     * @return
     */
    public List<ParkingPlaceinfo> selectByExample(ParkingPlaceinfoExample example) {
        return parkingPlaceinfoMapper.selectByExample(example);
    }

    /**
     * 主键返回一条数据
     *
     * @param pid
     * @return
     */
    public ParkingPlaceinfo selectByPrimaryKey(Integer pid) {
        return parkingPlaceinfoMapper.selectByPrimaryKey(pid);
    }

    /**
     * 修改
     *
     * @param record
     * @return
     */
    public int updateByPrimaryKeySelective(ParkingPlaceinfo record) {
        return parkingPlaceinfoMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByExampleSelective(ParkingPlaceinfo record, ParkingPlaceinfoExample example) {
        return parkingPlaceinfoMapper.updateByExampleSelective(record,example);
    }
}
