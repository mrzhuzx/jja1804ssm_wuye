package com.ssm.wuye.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.type.Alias;

/**
 * recruit
 */
@Table(name = "recruit")
@Alias("recruit")
public class Recruit {
    /**
     * 
     */
    @Id
    @Column(name = "recruitId")
    private Integer recruitid;

    /**
     * 公司名称
     */
    @Column(name = "companyName")
    private String companyname;

    /**
     * 岗位名称
     */
    @Column(name = "postName")
    private String postname;

    /**
     * 招聘要求
     */
    @Column(name = "recruitDes")
    private String recruitdes;

    /**
     * 岗位职责
     */
    @Column(name = "Duty")
    private String duty;

    /**
     * 薪资待遇
     */
    @Column(name = "Salary")
    private String salary;

    /**
     * 招聘人数
     */
    @Column(name = "recruitNum")
    private Integer recruitnum;

    /**
     * 联系电话
     */
    @Column(name = "recruitNumber")
    private String recruitnumber;

    /**
     * 截止时间

     */
    @Column(name = "recruitEnd")
    private Date recruitend;

    /**
     * 地址
     */
    @Column(name = "Address")
    private String address;

    /**
     * 
     * @return recruitId 
     */
    public Integer getRecruitid() {
        return recruitid;
    }

    /**
     * 
     * @param recruitid 
     */
    public void setRecruitid(Integer recruitid) {
        this.recruitid = recruitid;
    }

    /**
     * 公司名称
     * @return companyName 公司名称
     */
    public String getCompanyname() {
        return companyname;
    }

    /**
     * 公司名称
     * @param companyname 公司名称
     */
    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    /**
     * 岗位名称
     * @return postName 岗位名称
     */
    public String getPostname() {
        return postname;
    }

    /**
     * 岗位名称
     * @param postname 岗位名称
     */
    public void setPostname(String postname) {
        this.postname = postname == null ? null : postname.trim();
    }

    /**
     * 招聘要求
     * @return recruitDes 招聘要求
     */
    public String getRecruitdes() {
        return recruitdes;
    }

    /**
     * 招聘要求
     * @param recruitdes 招聘要求
     */
    public void setRecruitdes(String recruitdes) {
        this.recruitdes = recruitdes == null ? null : recruitdes.trim();
    }

    /**
     * 岗位职责
     * @return Duty 岗位职责
     */
    public String getDuty() {
        return duty;
    }

    /**
     * 岗位职责
     * @param duty 岗位职责
     */
    public void setDuty(String duty) {
        this.duty = duty == null ? null : duty.trim();
    }

    /**
     * 薪资待遇
     * @return Salary 薪资待遇
     */
    public String getSalary() {
        return salary;
    }

    /**
     * 薪资待遇
     * @param salary 薪资待遇
     */
    public void setSalary(String salary) {
        this.salary = salary == null ? null : salary.trim();
    }

    /**
     * 招聘人数
     * @return recruitNum 招聘人数
     */
    public Integer getRecruitnum() {
        return recruitnum;
    }

    /**
     * 招聘人数
     * @param recruitnum 招聘人数
     */
    public void setRecruitnum(Integer recruitnum) {
        this.recruitnum = recruitnum;
    }

    /**
     * 联系电话
     * @return recruitNumber 联系电话
     */
    public String getRecruitnumber() {
        return recruitnumber;
    }

    /**
     * 联系电话
     * @param recruitnumber 联系电话
     */
    public void setRecruitnumber(String recruitnumber) {
        this.recruitnumber = recruitnumber == null ? null : recruitnumber.trim();
    }

    /**
     * 截止时间

     * @return recruitEnd 截止时间

     */
    public Date getRecruitend() {
        return recruitend;
    }

    /**
     * 截止时间

     * @param recruitend 截止时间

     */
    public void setRecruitend(Date recruitend) {
        this.recruitend = recruitend;
    }

    /**
     * 地址
     * @return Address 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 地址
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}