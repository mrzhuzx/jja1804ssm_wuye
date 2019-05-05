package com.ssm.wuye.vo;

import lombok.Data;


import java.util.Date;

/**
 * time：2019/4/28--15:19
 * Author:蓝鑫杰
 * desc:
 * version:1.3.22
 */
@Data
public class ElectricAndOwer {

    private Integer electricid;

    /**
     * 电表编号
     */
    private String enumber;

    /**
     * 房屋号/引用house表的houseid
     */
    private Integer houseid;

    /**
     * 用电量/度
     */
    private Double electric;

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
