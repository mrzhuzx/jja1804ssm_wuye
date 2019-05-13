package com.ssm.wuye.domain;

import com.ssm.wuye.appcomm.BaseEntity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.type.Alias;

/**
 * house_electric_vo
 */
@Table(name = "house_electric_vo")
@Alias("houseElectricVo")
public class HouseElectricVo extends BaseEntity {
    /**
     * 业主编号
     */
    @Column(name = "olId")
    private Integer olid;

    /**
     * 业主姓名
     */
    @Column(name = "olName")
    private String olname;

    /**
     * 
     */
    @Column(name = "electricid")
    private Integer electricid;

    /**
     * 电表编号
     */
    @Column(name = "enumber")
    private String enumber;

    /**
     * 用电量/度
     */
    @Column(name = "electric")
    private Double electric;

    /**
     * 年月份
     */
    @Column(name = "month")
    private Date month;

    /**
     * 编号
     */
    @Column(name = "hid")
    private Integer hid;

    /**
     * 楼宇名称
     */
    @Column(name = "hBulidingName")
    private String hbulidingname;

    /**
     * 业主编号
     * @return olId 业主编号
     */
    public Integer getOlid() {
        return olid;
    }

    /**
     * 业主编号
     * @param olid 业主编号
     */
    public void setOlid(Integer olid) {
        this.olid = olid;
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

    /**
     * 
     * @return electricid 
     */
    public Integer getElectricid() {
        return electricid;
    }

    /**
     * 
     * @param electricid 
     */
    public void setElectricid(Integer electricid) {
        this.electricid = electricid;
    }

    /**
     * 电表编号
     * @return enumber 电表编号
     */
    public String getEnumber() {
        return enumber;
    }

    /**
     * 电表编号
     * @param enumber 电表编号
     */
    public void setEnumber(String enumber) {
        this.enumber = enumber == null ? null : enumber.trim();
    }

    /**
     * 用电量/度
     * @return electric 用电量/度
     */
    public Double getElectric() {
        return electric;
    }

    /**
     * 用电量/度
     * @param electric 用电量/度
     */
    public void setElectric(Double electric) {
        this.electric = electric;
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
}