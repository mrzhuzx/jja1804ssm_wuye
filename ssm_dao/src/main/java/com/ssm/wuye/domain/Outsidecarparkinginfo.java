package com.ssm.wuye.domain;

import com.ssm.wuye.appcomm.BaseEntity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.type.Alias;

/**
 * outsidecarparkinginfo
 */
@Table(name = "outsidecarparkinginfo")
@Alias("outsidecarparkinginfo")
public class Outsidecarparkinginfo extends BaseEntity {
    /**
     * 
     */
    @Id
    @Column(name = "parkingid")
    private Integer parkingid;

    /**
     * 
     */
    @Column(name = "Parkingcards")
    private String parkingcards;

    /**
     * 
     */
    @Column(name = "Parkingcost")
    private String parkingcost;

    /**
     * 
     */
    @Column(name = "Parkingintime")
    private Date parkingintime;

    /**
     * 
     */
    @Column(name = "Parkingouttime")
    private Date parkingouttime;

    /**
     * 
     */
    @Column(name = "paymentMethod")
    private Integer paymentmethod;

    /**
     * 
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
     * 
     * @return Parkingcards 
     */
    public String getParkingcards() {
        return parkingcards;
    }

    /**
     * 
     * @param parkingcards 
     */
    public void setParkingcards(String parkingcards) {
        this.parkingcards = parkingcards == null ? null : parkingcards.trim();
    }

    /**
     * 
     * @return Parkingcost 
     */
    public String getParkingcost() {
        return parkingcost;
    }

    /**
     * 
     * @param parkingcost 
     */
    public void setParkingcost(String parkingcost) {
        this.parkingcost = parkingcost == null ? null : parkingcost.trim();
    }

    /**
     * 
     * @return Parkingintime 
     */
    public Date getParkingintime() {
        return parkingintime;
    }

    /**
     * 
     * @param parkingintime 
     */
    public void setParkingintime(Date parkingintime) {
        this.parkingintime = parkingintime;
    }

    /**
     * 
     * @return Parkingouttime 
     */
    public Date getParkingouttime() {
        return parkingouttime;
    }

    /**
     * 
     * @param parkingouttime 
     */
    public void setParkingouttime(Date parkingouttime) {
        this.parkingouttime = parkingouttime;
    }

    /**
     * 
     * @return paymentMethod 
     */
    public Integer getPaymentmethod() {
        return paymentmethod;
    }

    /**
     * 
     * @param paymentmethod 
     */
    public void setPaymentmethod(Integer paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    /**
     * 
     * @return PaymentStatus 
     */
    public Integer getPaymentstatus() {
        return paymentstatus;
    }

    /**
     * 
     * @param paymentstatus 
     */
    public void setPaymentstatus(Integer paymentstatus) {
        this.paymentstatus = paymentstatus;
    }
}