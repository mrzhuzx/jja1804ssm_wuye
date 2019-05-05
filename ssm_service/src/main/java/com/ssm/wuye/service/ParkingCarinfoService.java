package com.ssm.wuye.service;

import com.ssm.wuye.domain.ParkingCarinfo;
import com.ssm.wuye.domain.ParkingCarinfoExample;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * desc:
 * author:zhs
 * time:2019-04-25  18:02:49
 */
public interface ParkingCarinfoService {
    /*
     *查询总 条数
     */
    long countByExample(ParkingCarinfoExample example);
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
    int insert(ParkingCarinfo record);


    /**
     * 查询带分页
     * @param example
     * @param rowBounds
     * @return
     */
    List<ParkingCarinfo> selectByExampleWithRowbounds(ParkingCarinfoExample example, RowBounds rowBounds);


    /**
     * 多条件查询
     * @param example
     * @return
     */
    List<ParkingCarinfo> selectByExample(ParkingCarinfoExample example);


    /**
     * 主键返回一条数据
     * @param hid
     * @return
     */
    ParkingCarinfo selectByPrimaryKey(Integer hid);

    /**
     * 修改
     * @param
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(ParkingCarinfo record);



}
