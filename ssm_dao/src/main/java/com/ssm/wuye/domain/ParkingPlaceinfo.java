package com.ssm.wuye.domain;

import com.ssm.wuye.appcomm.BaseEntity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * parking_placeinfo
 */
@Table(name = "parking_placeinfo")
@Alias("parkingPlaceinfo")
@Data
public class ParkingPlaceinfo extends BaseEntity {
    /**
     * 主键/自动递增
     */
    @Id
public class ParkingPlaceinfo extends BaseEntity {
    /**
     * 主键/自动递增
     *
     */
    @Id

    @Column(name = "hid")
    private Integer hid;

    /**
     * 车位号/引用  A区-1303
     */
    @Column(name = "pid")
    private String pid;

    /**
     * 业主ID
     */
    @Column(name = "olid")
    private Integer olid;

    /**
     * 业主姓名
     */
    @Column(name = "hname")
    private String hname;

    /**
     * 电话
     */
    @Column(name = "hphone")
    private String hphone;

    /**
     * 车牌
     */
    @Column(name = "hcards")
    private String hcards;

    /**
     * 描述
     */
    @Column(name = "descr")
    private String descr;

    /**
     * 主键/自动递增
     * @return hid 主键/自动递增
     */
    public Integer getHid() {
        return hid;
    }

    /**
     * 主键/自动递增
     * @param hid 主键/自动递增
     */
    public void setHid(Integer hid) {
        this.hid = hid;
    }

    /**
     * 车位号/引用  A区-1303
     * @return pid 车位号/引用  A区-1303
     */
    public String getPid() {
        return pid;
    }

    /**
     * 车位号/引用  A区-1303
     * @param pid 车位号/引用  A区-1303
     */
    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    /**
     * 业主ID
     * @return olid 业主ID
     */
    public Integer getOlid() {
        return olid;
    }

    /**
     * 业主ID
     * @param olid 业主ID
     */
    public void setOlid(Integer olid) {
        this.olid = olid;
    }

    /**
     * 业主姓名
     * @return hname 业主姓名
     */
    public String getHname() {
        return hname;
    }

    /**
     * 业主姓名
     * @param hname 业主姓名
     */
    public void setHname(String hname) {
        this.hname = hname == null ? null : hname.trim();
    }

    /**
     * 电话
     * @return hphone 电话
     */
    public String getHphone() {
        return hphone;
    }

    /**
     * 电话
     * @param hphone 电话
     */
    public void setHphone(String hphone) {
        this.hphone = hphone == null ? null : hphone.trim();
    }

    /**
     * 车牌
     * @return hcards 车牌
     */
    public String getHcards() {
        return hcards;
    }

    /**
     * 车牌
     * @param hcards 车牌
     */
    public void setHcards(String hcards) {
        this.hcards = hcards == null ? null : hcards.trim();
    }

    /**
     * 描述
     * @return descr 描述
     */
    public String getDescr() {
        return descr;
    }

    /**
     * 描述
     * @param descr 描述
     */
    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }

    public ParkingPlaceinfo(Integer hid,  String descr) {
        this.hid = hid;
        this.descr = descr;
    }

    public ParkingPlaceinfo() {
    }

}