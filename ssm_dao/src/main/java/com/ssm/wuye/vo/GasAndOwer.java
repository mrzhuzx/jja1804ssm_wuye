package com.ssm.wuye.vo;

import lombok.Data;

import javax.persistence.Column;
import java.util.Date;

/**
 * time：2019/4/28--15:18
 * Author:蓝鑫杰
 * desc:
 * version:1.3.22
 */
@Data
public class GasAndOwer {
    private Integer id;

    /**
     * 燃气表编号
     */
    private String gasnumber;

    /**
     * 房屋号/引用house表的houseid
     */
    private Integer houseid;

    /**
     * 燃气用量（立方）
     */
    private Double gas;

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
