package com.ssm.wuye.domain;

import com.ssm.wuye.appcomm.BaseEntity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.type.Alias;

/**
 * ower_house_type
 */
@Table(name = "ower_house_type")
@Alias("owerHouseType")
public class OwerHouseType extends BaseEntity {
    /**
     * 业主姓名
     */
    @Column(name = "olName")
    private String olname;

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
     * 出租状态 0不租，1已租，2待租
     */
    @Column(name = "Loan")
    private Integer loan;

    /**
     * 类型名字
     */
    @Column(name = "hTypeName")
    private String htypename;

    /**
     * 类型产权年限
     */
    @Column(name = "htPropertyRight")
    private String htpropertyright;

    /**
     * 业主手机号
     */
    @Column(name = "olPhone")
    private String olphone;

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
     * 出租状态 0不租，1已租，2待租
     * @return Loan 出租状态 0不租，1已租，2待租
     */
    public Integer getLoan() {
        return loan;
    }

    /**
     * 出租状态 0不租，1已租，2待租
     * @param loan 出租状态 0不租，1已租，2待租
     */
    public void setLoan(Integer loan) {
        this.loan = loan;
    }

    /**
     * 类型名字
     * @return hTypeName 类型名字
     */
    public String getHtypename() {
        return htypename;
    }

    /**
     * 类型名字
     * @param htypename 类型名字
     */
    public void setHtypename(String htypename) {
        this.htypename = htypename == null ? null : htypename.trim();
    }

    /**
     * 类型产权年限
     * @return htPropertyRight 类型产权年限
     */
    public String getHtpropertyright() {
        return htpropertyright;
    }

    /**
     * 类型产权年限
     * @param htpropertyright 类型产权年限
     */
    public void setHtpropertyright(String htpropertyright) {
        this.htpropertyright = htpropertyright == null ? null : htpropertyright.trim();
    }

    /**
     * 业主手机号
     * @return olPhone 业主手机号
     */
    public String getOlphone() {
        return olphone;
    }

    /**
     * 业主手机号
     * @param olphone 业主手机号
     */
    public void setOlphone(String olphone) {
        this.olphone = olphone == null ? null : olphone.trim();
    }

    @Override
    public String toString() {
        return "OwerHouseType{" +
                "olname='" + olname + '\'' +
                ", hnumber='" + hnumber + '\'' +
                ", hstate='" + hstate + '\'' +
                ", hbulidingname='" + hbulidingname + '\'' +
                ", hunitnumber=" + hunitnumber +
                ", hfloor=" + hfloor +
                ", htypeid=" + htypeid +
                ", hdirection='" + hdirection + '\'' +
                ", harea='" + harea + '\'' +
                ", hremarks='" + hremarks + '\'' +
                ", loan=" + loan +
                ", htypename='" + htypename + '\'' +
                ", htpropertyright='" + htpropertyright + '\'' +
                ", olphone='" + olphone + '\'' +
                '}';
    }
}