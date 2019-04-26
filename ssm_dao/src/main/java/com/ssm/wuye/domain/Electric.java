package com.ssm.wuye.domain;/*
 * desc:
 * author:tanghuaming
 * time:2019\4\25 0025
 */


import com.ssm.wuye.appcomm.DateUtils;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Electric {

    private Integer electricid;
    private String enumber;
    private Integer houseid;
    private Double electric;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date month;
    private String monthStr;

//    public String getDateStr() {
//        if (month!=null){
//            DateStr= DateUtils.date2String(month,"yyyy-MM-dd");
//        }
//        return DateStr;
//    }
//
//    public void setDateStr(String dateStr) {
//        DateStr = dateStr;
//    }

    public String getMonthStr() {
        if (month!=null){
            monthStr= DateUtils.date2String(month,"yyyy-MM-dd");
        }
        return monthStr;
    }

    public void setMonthStr(String monthStr) {
        this.monthStr = monthStr;
    }

    public Integer getElectricid() {
        return electricid;
    }

    public void setElectricid(Integer electricid) {
        this.electricid = electricid;
    }

    public String getEnumber() {
        return enumber;
    }

    public void setEnumber(String enumber) {
        this.enumber = enumber;
    }

    public Integer getHouseid() {
        return houseid;
    }

    public void setHouseid(Integer houseid) {
        this.houseid = houseid;
    }

    public Double getElectric() {
        return electric;
    }

    public void setElectric(Double electric) {
        this.electric = electric;
    }

    public Date getMonth() {
        return month;
    }

    public void setMonth(Date month) {
        this.month = month;
    }
}
