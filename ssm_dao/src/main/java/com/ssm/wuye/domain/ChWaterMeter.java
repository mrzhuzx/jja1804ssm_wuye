package com.ssm.wuye.domain;

import com.ssm.wuye.appcomm.BaseEntity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.type.Alias;

/**
 * ch_water_meter
 */
@Table(name = "ch_water_meter")
@Alias("chWaterMeter")
public class ChWaterMeter extends BaseEntity {
    /**
     * 
     */
    @Id
    @Column(name = "waterid")
    private Integer waterid;

    /**
     * 水表编号
     */
    @Column(name = "wnumber")
    private String wnumber;

    /**
     * 房屋号/引用house表的houseid
     */
    @Column(name = "houseid")
    private Integer houseid;

    /**
     * 用水量（吨）
     */
    @Column(name = "waterVolume")
    private Double watervolume;

    /**
     * 年月份
     */
    @Column(name = "month")
    private Date month;

    /**
     * 
     * @return waterid 
     */
    public Integer getWaterid() {
        return waterid;
    }

    /**
     * 
     * @param waterid 
     */
    public void setWaterid(Integer waterid) {
        this.waterid = waterid;
    }

    /**
     * 水表编号
     * @return wnumber 水表编号
     */
    public String getWnumber() {
        return wnumber;
    }

    /**
     * 水表编号
     * @param wnumber 水表编号
     */
    public void setWnumber(String wnumber) {
        this.wnumber = wnumber == null ? null : wnumber.trim();
    }

    /**
     * 房屋号/引用house表的houseid
     * @return houseid 房屋号/引用house表的houseid
     */
    public Integer getHouseid() {
        return houseid;
    }

    /**
     * 房屋号/引用house表的houseid
     * @param houseid 房屋号/引用house表的houseid
     */
    public void setHouseid(Integer houseid) {
        this.houseid = houseid;
    }

    /**
     * 用水量（吨）
     * @return waterVolume 用水量（吨）
     */
    public Double getWatervolume() {
        return watervolume;
    }

    /**
     * 用水量（吨）
     * @param watervolume 用水量（吨）
     */
    public void setWatervolume(Double watervolume) {
        this.watervolume = watervolume;
    }

    /**
     * 年月份
     * @return month 年月份
     */
    public Date getMonth() {
        return month;
    }

    /**
     * 年月份
     * @param month 年月份
     */
    public void setMonth(Date month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "ChWaterMeter{" +
                "waterid=" + waterid +
                ", wnumber='" + wnumber + '\'' +
                ", houseid=" + houseid +
                ", watervolume=" + watervolume +
                ", month=" + month +
                '}';
    }
}