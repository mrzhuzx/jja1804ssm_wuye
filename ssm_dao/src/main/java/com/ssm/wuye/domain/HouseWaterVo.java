package com.ssm.wuye.domain;

import com.ssm.wuye.appcomm.BaseEntity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.type.Alias;

/**
 * house_water_vo
 */
@Table(name = "house_water_vo")
@Alias("houseWaterVo")
public class HouseWaterVo extends BaseEntity {
    /**
     * 编号
     */
    @Column(name = "hid")
    private Integer hid;

    /**
     * 业主ID（外键应用）
     */
    @Column(name = "olid")
    private Integer olid;

    /**
     * 楼宇名称
     */
    @Column(name = "hBulidingName")
    private String hbulidingname;

    /**
     * 
     */
    @Column(name = "waterid")
    private Integer waterid;

    /**
     * 水表编号
     */
    @Column(name = "wnumber")
    private String wnumber;

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
     * 业主姓名
     */
    @Column(name = "olName")
    private String olname;

    /**
     * 编号
     * @return hid 编号
     */
    public Integer getHid() {
        return hid;
    }

    /**
     * 编号
     * @param hid 编号
     */
    public void setHid(Integer hid) {
        this.hid = hid;
    }

    /**
     * 业主ID（外键应用）
     * @return olid 业主ID（外键应用）
     */
    public Integer getOlid() {
        return olid;
    }

    /**
     * 业主ID（外键应用）
     * @param olid 业主ID（外键应用）
     */
    public void setOlid(Integer olid) {
        this.olid = olid;
    }

    /**
     * 楼宇名称
     * @return hBulidingName 楼宇名称
     */
    public String getHbulidingname() {
        return hbulidingname;
    }

    /**
     * 楼宇名称
     * @param hbulidingname 楼宇名称
     */
    public void setHbulidingname(String hbulidingname) {
        this.hbulidingname = hbulidingname == null ? null : hbulidingname.trim();
    }

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

    /**
     * 业主姓名
     * @return olName 业主姓名
     */
    public String getOlname() {
        return olname;
    }

    /**
     * 业主姓名
     * @param olname 业主姓名
     */
    public void setOlname(String olname) {
        this.olname = olname == null ? null : olname.trim();
    }
}