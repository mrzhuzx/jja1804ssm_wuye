package com.ssm.wuye.domain;/*
 * desc:
 * author:tanghuaming
 * time:2019\5\5 0005
 */

import com.ssm.wuye.appcomm.DateUtils;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class PuWater {
    private Integer waterid;
    private String enumber;
    private Integer typeid;
    private Integer partitionid;
    private Integer subitemid;
    private Double water;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date month;
    private String monthStr;
    public String getMonthStr() {
        if (month!=null){
            monthStr= DateUtils.date2String(month,"yyyy-MM-dd");
        }
        return monthStr;
    }

    public Integer getWaterid() {
        return waterid;
    }

    public void setWaterid(Integer waterid) {
        this.waterid = waterid;
    }

    public String getEnumber() {
        return enumber;
    }

    public void setEnumber(String enumber) {
        this.enumber = enumber;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getPartitionid() {
        return partitionid;
    }

    public void setPartitionid(Integer partitionid) {
        this.partitionid = partitionid;
    }

    public Integer getSubitemid() {
        return subitemid;
    }

    public void setSubitemid(Integer subitemid) {
        this.subitemid = subitemid;
    }

    public Double getWater() {
        return water;
    }

    public void setWater(Double water) {
        this.water = water;
    }

    public Date getMonth() {
        return month;
    }

    public void setMonth(Date month) {
        this.month = month;
    }

    public void setMonthStr(String monthStr) {
        this.monthStr = monthStr;
    }
}
