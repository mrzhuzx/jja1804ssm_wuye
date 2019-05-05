package com.ssm.wuye.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ssm.wuye.appcomm.BaseEntity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.type.Alias;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * tb_pay
 */
@Table(name = "tb_pay")
@Alias("tbPay")
public class TbPay extends BaseEntity {
    /**
     * 缴费编号ID
     */
    @Id
    @Column(name = "payId")
    private Integer payid;

    /**
     * 收费项目名
     */
    @Column(name = "chargeId")
    private Integer chargeid;

    /**
     * 应收金额
     */
    @Column(name = "chargeStandard")
    private Double chargestandard;

    /**
     * 滞纳金
     */
    @Column(name = "Latepayment")
    private Double latepayment;

    /**
     * 实收金额
     */
    @Column(name = "payReal")
    private Double payreal;

    /**
     * 欠费金额
     */
    @Column(name = "payBalance")
    private Double paybalance;

    /**
     * 对应的houseid
     */
    @Column(name = "houseId")
    private Integer houseid;

    /**
     * 收费时间

     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @Column(name = "chargeTime")
    private Date chargetime;

    /**
     * 缴费签名
     */
    @Column(name = "payName")
    private String payname;

    /**
     * 缴费状态(1已缴费，0未缴费)
     */
    @Column(name = "payState")
    private Integer paystate;

    /**
     * 缴费月份
     */
    @Column(name = "payMonth")
    private String paymonth;

    /**
     * 
     */
    @Column(name = "owerId")
    private Integer owerid;

    /**
     * 缴费编号ID
     * @return payId 缴费编号ID
     */
    public Integer getPayid() {
        return payid;
    }

    /**
     * 缴费编号ID
     * @param payid 缴费编号ID
     */
    public void setPayid(Integer payid) {
        this.payid = payid;
    }

    /**
     * 收费项目名
     * @return chargeId 收费项目名
     */
    public Integer getChargeid() {
        return chargeid;
    }

    /**
     * 收费项目名
     * @param chargeid 收费项目名
     */
    public void setChargeid(Integer chargeid) {
        this.chargeid = chargeid;
    }

    /**
     * 应收金额
     * @return chargeStandard 应收金额
     */
    public Double getChargestandard() {
        return chargestandard;
    }

    /**
     * 应收金额
     * @param chargestandard 应收金额
     */
    public void setChargestandard(Double chargestandard) {
        this.chargestandard = chargestandard;
    }

    /**
     * 滞纳金
     * @return Latepayment 滞纳金
     */
    public Double getLatepayment() {
        return latepayment;
    }

    /**
     * 滞纳金
     * @param latepayment 滞纳金
     */
    public void setLatepayment(Double latepayment) {
        this.latepayment = latepayment;
    }

    /**
     * 实收金额
     * @return payReal 实收金额
     */
    public Double getPayreal() {
        return payreal;
    }

    /**
     * 实收金额
     * @param payreal 实收金额
     */
    public void setPayreal(Double payreal) {
        this.payreal = payreal;
    }

    /**
     * 欠费金额
     * @return payBalance 欠费金额
     */
    public Double getPaybalance() {
        return paybalance;
    }

    /**
     * 欠费金额
     * @param paybalance 欠费金额
     */
    public void setPaybalance(Double paybalance) {
        this.paybalance = paybalance;
    }

    /**
     * 对应的houseid
     * @return houseId 对应的houseid
     */
    public Integer getHouseid() {
        return houseid;
    }

    /**
     * 对应的houseid
     * @param houseid 对应的houseid
     */
    public void setHouseid(Integer houseid) {
        this.houseid = houseid;
    }

    /**
     * 收费时间

     * @return chargeTime 收费时间

     */
    public Date getChargetime() {
        return chargetime;
    }

    /**
     * 收费时间

     * @param chargetime 收费时间

     */
    public void setChargetime(Date chargetime) {
        this.chargetime = chargetime;
    }

    /**
     * 缴费签名
     * @return payName 缴费签名
     */
    public String getPayname() {
        return payname;
    }

    /**
     * 缴费签名
     * @param payname 缴费签名
     */
    public void setPayname(String payname) {
        this.payname = payname == null ? null : payname.trim();
    }

    /**
     * 缴费状态(1已缴费，0未缴费)
     * @return payState 缴费状态(1已缴费，0未缴费)
     */
    public Integer getPaystate() {
        return paystate;
    }

    /**
     * 缴费状态(1已缴费，0未缴费)
     * @param paystate 缴费状态(1已缴费，0未缴费)
     */
    public void setPaystate(Integer paystate) {
        this.paystate = paystate;
    }

    /**
     * 缴费月份
     * @return payMonth 缴费月份
     */
    public String getPaymonth() {
        return paymonth;
    }

    /**
     * 缴费月份
     * @param paymonth 缴费月份
     */
    public void setPaymonth(String paymonth) {
        this.paymonth = paymonth == null ? null : paymonth.trim();
    }

    /**
     * 
     * @return owerId 
     */
    public Integer getOwerid() {
        return owerid;
    }

    /**
     * 
     * @param owerid 
     */
    public void setOwerid(Integer owerid) {
        this.owerid = owerid;
    }

    @Override
    public String toString() {
        return "TbPay{" +
                "payid=" + payid +
                ", chargeid=" + chargeid +
                ", chargestandard=" + chargestandard +
                ", latepayment=" + latepayment +
                ", payreal=" + payreal +
                ", paybalance=" + paybalance +
                ", houseid=" + houseid +
                ", chargetime=" + chargetime +
                ", payname='" + payname + '\'' +
                ", paystate=" + paystate +
                ", paymonth='" + paymonth + '\'' +
                ", owerid=" + owerid +
                '}';
    }
}