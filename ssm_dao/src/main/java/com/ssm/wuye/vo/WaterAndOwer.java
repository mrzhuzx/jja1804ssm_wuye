package com.ssm.wuye.vo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

/**
 * time：2019/4/28--10:19
 * Author:蓝鑫杰
 * desc:业主，用水量视图
 * version:1.3.22
 */
@Data
public class WaterAndOwer {
    private Integer waterid;
    /**
     * 水表编号
     */
    private String wnumber;
    /**
     * 房屋号/引用house表的houseid
     */
    private Integer houseid;
    /**
     * 用水量（吨）
     */
    private Double watervolume;
    /**
     * 年月份
     */
    private Date month;
    /**
     * 业主姓名
     */
    private String olname;
    /**
     * 业主手机号
     */
    private String olphone;
}
