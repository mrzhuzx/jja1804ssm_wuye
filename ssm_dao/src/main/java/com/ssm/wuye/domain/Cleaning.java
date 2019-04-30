package com.ssm.wuye.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.type.Alias;

/**
 * cleaning
 */
@Table(name = "cleaning")
@Alias("cleaning")
public class Cleaning {
    /**
     * 
     */
    @Column(name = "cleid")
    private Integer cleid;

    /**
     * 保洁员名字
     */
    @Column(name = "clename")
    private String clename;

    /**
     * 手机
     */
    @Column(name = "clephone")
    private String clephone;

    /**
     * 状态
     */
    @Column(name = "cleflag")
    private String cleflag;

    /**
     * 类型ID
     */
    @Column(name = "roleid")
    private Integer roleid;

    /**
     * 
     * @return cleid 
     */
    public Integer getCleid() {
        return cleid;
    }

    /**
     * 
     * @param cleid 
     */
    public void setCleid(Integer cleid) {
        this.cleid = cleid;
    }

    /**
     * 保洁员名字
     * @return clename 保洁员名字
     */
    public String getClename() {
        return clename;
    }

    /**
     * 保洁员名字
     * @param clename 保洁员名字
     */
    public void setClename(String clename) {
        this.clename = clename == null ? null : clename.trim();
    }

    /**
     * 手机
     * @return clephone 手机
     */
    public String getClephone() {
        return clephone;
    }

    /**
     * 手机
     * @param clephone 手机
     */
    public void setClephone(String clephone) {
        this.clephone = clephone == null ? null : clephone.trim();
    }

    /**
     * 状态
     * @return cleflag 状态
     */
    public String getCleflag() {
        return cleflag;
    }

    /**
     * 状态
     * @param cleflag 状态
     */
    public void setCleflag(String cleflag) {
        this.cleflag = cleflag == null ? null : cleflag.trim();
    }

    /**
     * 类型ID
     * @return roleid 类型ID
     */
    public Integer getRoleid() {
        return roleid;
    }

    /**
     * 类型ID
     * @param roleid 类型ID
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }
}