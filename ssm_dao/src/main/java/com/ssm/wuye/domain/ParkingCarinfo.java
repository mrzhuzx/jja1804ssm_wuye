package com.ssm.wuye.domain;

import com.ssm.wuye.appcomm.BaseEntity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * parking_carinfo
 */
@Table(name = "parking_carinfo")
@Alias("parkingCarinfo")
@Data
public class ParkingCarinfo extends BaseEntity {
    /**
     * 
     */
    @Id
    @Column(name = "parkingid")
    private Integer parkingid;

    /**
     * 号牌
     */
    @Column(name = "Parkingcards")
    private String parkingcards;

    /**
     * 标准费
     */
    @Column(name = "Parkingcost")
    private String parkingcost;

    /**
     * 进入时间
     */
    @Column(name = "Parkingintime")
    private Date parkingintime;

    /**
     * 出去时间
     */
    @Column(name = "Parkingouttime")
    private Date parkingouttime;

    /**
     * 收费方式
     */
    @Column(name = "paymentMethod")
    private Integer paymentmethod;

    /**
     * 收费状态
     */
    @Column(name = "PaymentStatus")
    private Integer paymentstatus;

    /**
     * 
     * @return parkingid 
     */
    public Integer getParkingid() {
        return parkingid;
    }

    /**
     * 
     * @param parkingid 
     */
    public void setParkingid(Integer parkingid) {
        this.parkingid = parkingid;
    }

    /**
     * 号牌
     * @return Parkingcards 号牌
     */
    public String getParkingcards() {
        return parkingcards;
    }

    /**
     * 号牌
     * @param parkingcards 号牌
     */
    public void setParkingcards(String parkingcards) {
        this.parkingcards = parkingcards == null ? null : parkingcards.trim();
    }

    /**
     * 标准费
     * @return Parkingcost 标准费
     */
    public String getParkingcost() {
        return parkingcost;
    }

    /**
     * 标准费
     * @param parkingcost 标准费
     */
    public void setParkingcost(String parkingcost) {
        this.parkingcost = parkingcost == null ? null : parkingcost.trim();
    }

    /**
     * 进入时间
     * @return Parkingintime 进入时间
     */
    public Date getParkingintime() {
        return parkingintime;
    }

    /**
     * 进入时间
     * @param parkingintime 进入时间
     */
    public void setParkingintime(Date parkingintime) {
        this.parkingintime = parkingintime;
    }

    /**
     * 出去时间
     * @return Parkingouttime 出去时间
     */
    public Date getParkingouttime() {
        return parkingouttime;
    }

    /**
     * 出去时间
     * @param parkingouttime 出去时间
     */
    public void setParkingouttime(Date parkingouttime) {
        this.parkingouttime = parkingouttime;
    }

    /**
     * 收费方式
     * @return paymentMethod 收费方式
     */
    public Integer getPaymentmethod() {
        return paymentmethod;
    }

    /**
     * 收费方式
     * @param paymentmethod 收费方式
     */
    public void setPaymentmethod(Integer paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    /**
     * 收费状态
     * @return PaymentStatus 收费状态
     */
    public Integer getPaymentstatus() {
        return paymentstatus;
    }

    /**
     * 收费状态
     * @param paymentstatus 收费状态
     */
    public void setPaymentstatus(Integer paymentstatus) {
        this.paymentstatus = paymentstatus;
    }
}