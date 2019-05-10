package com.ssm.wuye.domain;

import org.apache.ibatis.type.Alias;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

/**
 * pay_charge
 */
@Table(name = "pay_charge")
@Alias("payCharge")
public class PayCharge {
    /**
     * 缴费编号ID
     */
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
     * 余额
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
     * 收费项目名（水费、电费、燃气费,物业费）
     */
    @Column(name = "chargeName")
    private String chargename;

    /**
     * 收费标准年份
     */
    @Column(name = "chargeYear")
    private String chargeyear;

    /**
     * 收费标准/年/季度
     */
    @Column(name = "cs")
    private Double cs;

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
     * 余额
     * @return payBalance 余额
     */
    public Double getPaybalance() {
        return paybalance;
    }

    /**
     * 余额
     * @param paybalance 余额
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

    /**
     * 收费项目名（水费、电费、燃气费,物业费）
     * @return chargeName 收费项目名（水费、电费、燃气费,物业费）
     */
    public String getChargename() {
        return chargename;
    }

    /**
     * 收费项目名（水费、电费、燃气费,物业费）
     * @param chargename 收费项目名（水费、电费、燃气费,物业费）
     */
    public void setChargename(String chargename) {
        this.chargename = chargename == null ? null : chargename.trim();
    }

    /**
     * 收费标准年份
     * @return chargeYear 收费标准年份
     */
    public String getChargeyear() {
        return chargeyear;
    }

    /**
     * 收费标准年份
     * @param chargeyear 收费标准年份
     */
    public void setChargeyear(String chargeyear) {
        this.chargeyear = chargeyear == null ? null : chargeyear.trim();
    }

    /**
     * 收费标准/年/季度
     * @return cs 收费标准/年/季度
     */
    public Double getCs() {
        return cs;
    }

    /**
     * 收费标准/年/季度
     * @param cs 收费标准/年/季度
     */
    public void setCs(Double cs) {
        this.cs = cs;
    }
}