package com.ssm.wuye.domain;

import com.ssm.wuye.appcomm.BaseEntity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.type.Alias;

/**
 * wy_house
 */
@Table(name = "wy_house")
@Alias("myHouse")
public class MyHouse extends BaseEntity {
    /**
     * 编号
     */
    @Id
    @Column(name = "hid")
    private Integer hid;

    /**
     * 房屋编号
     */
    @Column(name = "hNumber")
    private String hnumber;

    /**
     * 状态
     */
    @Column(name = "hState")
    private String hstate;

    /**
     * 楼宇名称
     */
    @Column(name = "hBulidingName")
    private String hbulidingname;

    /**
     * 楼宇编号
     */
    @Column(name = "hUnitNumber")
    private Integer hunitnumber;

    /**
     * 楼层
     */
    @Column(name = "hFloor")
    private Integer hfloor;

    /**
     * 房屋类型
     */
    @Column(name = "hTypeid")
    private Integer htypeid;

    /**
     * 朝向
     */
    @Column(name = "hDirection")
    private String hdirection;

    /**
     * 面积
     */
    @Column(name = "hArea")
    private String harea;

    /**
     * 描述
     */
    @Column(name = "hRemarks")
    private String hremarks;

    /**
     * 业主ID（外键应用）
     */
    @Column(name = "olid")
    private Integer olid;

    /**
     * 出租状态
     */
    @Column(name = "Loan")
    private Integer loan;

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
     * 房屋编号
     * @return hNumber 房屋编号
     */
    public String getHnumber() {
        return hnumber;
    }

    /**
     * 房屋编号
     * @param hnumber 房屋编号
     */
    public void setHnumber(String hnumber) {
        this.hnumber = hnumber == null ? null : hnumber.trim();
    }

    /**
     * 状态
     * @return hState 状态
     */
    public String getHstate() {
        return hstate;
    }

    /**
     * 状态
     * @param hstate 状态
     */
    public void setHstate(String hstate) {
        this.hstate = hstate == null ? null : hstate.trim();
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
     * 楼宇编号
     * @return hUnitNumber 楼宇编号
     */
    public Integer getHunitnumber() {
        return hunitnumber;
    }

    /**
     * 楼宇编号
     * @param hunitnumber 楼宇编号
     */
    public void setHunitnumber(Integer hunitnumber) {
        this.hunitnumber = hunitnumber;
    }

    /**
     * 楼层
     * @return hFloor 楼层
     */
    public Integer getHfloor() {
        return hfloor;
    }

    /**
     * 楼层
     * @param hfloor 楼层
     */
    public void setHfloor(Integer hfloor) {
        this.hfloor = hfloor;
    }

    /**
     * 房屋类型
     * @return hTypeid 房屋类型
     */
    public Integer getHtypeid() {
        return htypeid;
    }

    /**
     * 房屋类型
     * @param htypeid 房屋类型
     */
    public void setHtypeid(Integer htypeid) {
        this.htypeid = htypeid;
    }

    /**
     * 朝向
     * @return hDirection 朝向
     */
    public String getHdirection() {
        return hdirection;
    }

    /**
     * 朝向
     * @param hdirection 朝向
     */
    public void setHdirection(String hdirection) {
        this.hdirection = hdirection == null ? null : hdirection.trim();
    }

    /**
     * 面积
     * @return hArea 面积
     */
    public String getHarea() {
        return harea;
    }

    /**
     * 面积
     * @param harea 面积
     */
    public void setHarea(String harea) {
        this.harea = harea == null ? null : harea.trim();
    }

    /**
     * 描述
     * @return hRemarks 描述
     */
    public String getHremarks() {
        return hremarks;
    }

    /**
     * 描述
     * @param hremarks 描述
     */
    public void setHremarks(String hremarks) {
        this.hremarks = hremarks == null ? null : hremarks.trim();
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
     * 出租状态
     * @return Loan 出租状态
     */
    public Integer getLoan() {
        return loan;
    }

    /**
     * 出租状态
     * @param loan 出租状态
     */
    public void setLoan(Integer loan) {
        this.loan = loan;
    }

    public MyHouse(Integer hid, String hnumber, String hstate, String hbulidingname, Integer hunitnumber, Integer hfloor, Integer htypeid, String hdirection, String harea, String hremarks, Integer olid, Integer loan) {
        this.hid = hid;
        this.hnumber = hnumber;
        this.hstate = hstate;
        this.hbulidingname = hbulidingname;
        this.hunitnumber = hunitnumber;
        this.hfloor = hfloor;
        this.htypeid = htypeid;
        this.hdirection = hdirection;
        this.harea = harea;
        this.hremarks = hremarks;
        this.olid = olid;
        this.loan = loan;
    }

    public MyHouse(String hnumber, String hstate, String hbulidingname, Integer hunitnumber, Integer hfloor, Integer htypeid, String hdirection, String harea, String hremarks, Integer olid, Integer loan) {
        this.hnumber = hnumber;
        this.hstate = hstate;
        this.hbulidingname = hbulidingname;
        this.hunitnumber = hunitnumber;
        this.hfloor = hfloor;
        this.htypeid = htypeid;
        this.hdirection = hdirection;
        this.harea = harea;
        this.hremarks = hremarks;
        this.olid = olid;
        this.loan = loan;
    }

    public MyHouse(Integer hid, String hstate) {
        this.hid = hid;
        this.hstate = hstate;
    }

    public MyHouse(Integer hid, Integer loan) {
        this.hid = hid;
        this.loan = loan;
    }

    public MyHouse() {
    }

    @Override
    public String toString() {
        return "MyHouse{" +
                "hid=" + hid +
                ", hnumber='" + hnumber + '\'' +
                ", hstate='" + hstate + '\'' +
                ", hbulidingname='" + hbulidingname + '\'' +
                ", hunitnumber=" + hunitnumber +
                ", hfloor=" + hfloor +
                ", htypeid=" + htypeid +
                ", hdirection='" + hdirection + '\'' +
                ", harea='" + harea + '\'' +
                ", hremarks='" + hremarks + '\'' +
                ", olid=" + olid +
                ", loan=" + loan +
                '}';
    }
}