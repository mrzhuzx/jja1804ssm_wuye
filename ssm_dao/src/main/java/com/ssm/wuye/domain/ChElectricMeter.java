package com.ssm.wuye.domain;

import com.ssm.wuye.appcomm.BaseEntity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.type.Alias;

/**
 * ch_electric_meter
 */
@Table(name = "ch_electric_meter")
@Alias("chElectricMeter")
public class ChElectricMeter extends BaseEntity {
    /**
     * 
     */
    @Id
    @Column(name = "electricid")
    private Integer electricid;

    /**
     * 电表编号
     */
    @Column(name = "enumber")
    private String enumber;

    /**
     * 房屋号/引用house表的houseid
     */
    @Column(name = "houseid")
    private Integer houseid;

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

    @Override
    public String toString() {
        return "ChElectricMeter{" +
                "electricid=" + electricid +
                ", enumber='" + enumber + '\'' +
                ", houseid=" + houseid +
                ", electric=" + electric +
                ", month=" + month +
                '}';
    }
}