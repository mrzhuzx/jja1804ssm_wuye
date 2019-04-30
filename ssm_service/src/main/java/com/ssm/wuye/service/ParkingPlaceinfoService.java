package com.ssm.wuye.service;

import com.ssm.wuye.domain.ParkingPlaceinfo;
import com.ssm.wuye.domain.ParkingPlaceinfoExample;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * desc:
 * author:zhs
 * time:time
 */
public interface ParkingPlaceinfoService {


    /*
     *查询总 条数
     */
    long countByExample(ParkingPlaceinfoExample example);
    /**
     * 删除数据
     * @param cid
     * @return
     */
    int deleteByExample(Integer cid);

    /**
     * 添加
     * @param record
     * @return
     */
    int insert(ParkingPlaceinfo record);

    /**
     * 查询带分页
     * @param example
     * @param rowBounds
     * @return
     */
    List<ParkingPlaceinfo> selectByExampleWithRowbounds(ParkingPlaceinfoExample example, RowBounds rowBounds);

    /**
     * 多条件查询
     * @param example
     * @return
     */
    List<ParkingPlaceinfo> selectByExample(ParkingPlaceinfoExample example);


    /**
     * 主键返回一条数据
     * @param pid
     * @return
     */
    ParkingPlaceinfo selectByPrimaryKey(Integer pid);

    /**
     * 修改
     * @param
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(ParkingPlaceinfo record);


}
