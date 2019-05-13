package com.ssm.wuye.service;

import com.ssm.wuye.domain.ParkingPlaceinfo;
import com.ssm.wuye.domain.ParkingPlaceinfoExample;
import com.ssm.wuye.domain.SysOwer;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * desc:
 * author:zhs
 * time:2019-05-05  09:01:06
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
     * @param tid
     * @return
     */
    ParkingPlaceinfo selectByPrimaryKey(Integer tid);

    /**
     * 修改
     * @param
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(ParkingPlaceinfo record);

    /**
     * 不是根据注解修改           Selective（默认判断没给条件不修改）
     * @param record
     * @param example
     * @return
     */
    int updateByExampleSelective(ParkingPlaceinfo record,ParkingPlaceinfoExample example);

}
