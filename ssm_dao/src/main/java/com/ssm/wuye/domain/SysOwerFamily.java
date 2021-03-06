package com.ssm.wuye.domain;

import com.ssm.wuye.appcomm.BaseEntity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.type.Alias;

/**
 * sys_ower_family
 */
@Table(name = "sys_ower_family")
@Alias("sysOwerFamily")
public class SysOwerFamily extends BaseEntity {
    /**
     * 业主成员编号(p)
     */
    @Id
    @Column(name = "ofId")
    private Integer ofid;

    /**
     * 成员姓名
     */
    @Column(name = "ofName")
    private String ofname;

    /**
     * 成员性别
     */
    @Column(name = "ofSex")
    private String ofsex;

    /**
     * 成员籍贯
     */
    @Column(name = "ofHomeplace")
    private String ofhomeplace;

    /**
     * 成员电话
     */
    @Column(name = "ofTel")
    private String oftel;

    /**
     * 与业主关系
     */
    @Column(name = "ofNexus")
    private String ofnexus;

    /**
     * 业主ID
     */
    @Column(name = "olId")
    private Integer olid;

    /**
     * 业主成员编号(p)
     * @return ofId 业主成员编号(p)
     */
    public Integer getOfid() {
        return ofid;
    }

    /**
     * 业主成员编号(p)
     * @param ofid 业主成员编号(p)
     */
    public void setOfid(Integer ofid) {
        this.ofid = ofid;
    }

    /**
     * 成员姓名
     * @return ofName 成员姓名
     */
    public String getOfname() {
        return ofname;
    }

    /**
     * 成员姓名
     * @param ofname 成员姓名
     */
    public void setOfname(String ofname) {
        this.ofname = ofname == null ? null : ofname.trim();
    }

    /**
     * 成员性别
     * @return ofSex 成员性别
     */
    public String getOfsex() {
        return ofsex;
    }

    /**
     * 成员性别
     * @param ofsex 成员性别
     */
    public void setOfsex(String ofsex) {
        this.ofsex = ofsex == null ? null : ofsex.trim();
    }

    /**
     * 成员籍贯
     * @return ofHomeplace 成员籍贯
     */
    public String getOfhomeplace() {
        return ofhomeplace;
    }

    /**
     * 成员籍贯
     * @param ofhomeplace 成员籍贯
     */
    public void setOfhomeplace(String ofhomeplace) {
        this.ofhomeplace = ofhomeplace == null ? null : ofhomeplace.trim();
    }

    /**
     * 成员电话
     * @return ofTel 成员电话
     */
    public String getOftel() {
        return oftel;
    }

    /**
     * 成员电话
     * @param oftel 成员电话
     */
    public void setOftel(String oftel) {
        this.oftel = oftel == null ? null : oftel.trim();
    }

    /**
     * 与业主关系
     * @return ofNexus 与业主关系
     */
    public String getOfnexus() {
        return ofnexus;
    }

    /**
     * 与业主关系
     * @param ofnexus 与业主关系
     */
    public void setOfnexus(String ofnexus) {
        this.ofnexus = ofnexus == null ? null : ofnexus.trim();
    }

    /**
     * 业主ID
     * @return olId 业主ID
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

    public SysOwerFamily(Integer ofid, String ofname, String ofsex, String ofhomeplace, String oftel, String ofnexus, Integer olid) {
        this.ofid = ofid;
        this.ofname = ofname;
        this.ofsex = ofsex;
        this.ofhomeplace = ofhomeplace;
        this.oftel = oftel;
        this.ofnexus = ofnexus;
        this.olid = olid;
    }

    public SysOwerFamily(String ofname, String ofsex, String ofhomeplace, String oftel, String ofnexus, Integer olid) {
        this.ofname = ofname;
        this.ofsex = ofsex;
        this.ofhomeplace = ofhomeplace;
        this.oftel = oftel;
        this.ofnexus = ofnexus;
        this.olid = olid;
    }

    @Override
    public String toString() {
        return "SysOwerFamily{" +
                "ofid=" + ofid +
                ", ofname='" + ofname + '\'' +
                ", ofsex='" + ofsex + '\'' +
                ", ofhomeplace='" + ofhomeplace + '\'' +
                ", oftel='" + oftel + '\'' +
                ", ofnexus='" + ofnexus + '\'' +
                ", olid=" + olid +
                '}';
    }
}