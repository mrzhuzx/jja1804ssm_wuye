package com.ssm.wuye.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.type.Alias;

/**
 * gardener
 */
@Table(name = "gardener")
@Alias("gardener")
public class Gardener {
    /**
     * 
     */
    @Column(name = "garid")
    private Integer garid;

    /**
     * 园丁名字
     */
    @Column(name = "garname")
    private String garname;

    /**
     * 手机号
     */
    @Column(name = "garphone")
    private String garphone;

    /**
     * 状态
     */
    @Column(name = "garflag")
    private String garflag;

    /**
     * 类型id
     */
    @Column(name = "roleid")
    private Integer roleid;

    /**
     * 
     * @return garid 
     */
    public Integer getGarid() {
        return garid;
    }

    /**
     * 
     * @param garid 
     */
    public void setGarid(Integer garid) {
        this.garid = garid;
    }

    /**
     * 园丁名字
     * @return garname 园丁名字
     */
    public String getGarname() {
        return garname;
    }

    /**
     * 园丁名字
     * @param garname 园丁名字
     */
    public void setGarname(String garname) {
        this.garname = garname == null ? null : garname.trim();
    }

    /**
     * 手机号
     * @return garphone 手机号
     */
    public String getGarphone() {
        return garphone;
    }

    /**
     * 手机号
     * @param garphone 手机号
     */
    public void setGarphone(String garphone) {
        this.garphone = garphone == null ? null : garphone.trim();
    }

    /**
     * 状态
     * @return garflag 状态
     */
    public String getGarflag() {
        return garflag;
    }

    /**
     * 状态
     * @param garflag 状态
     */
    public void setGarflag(String garflag) {
        this.garflag = garflag == null ? null : garflag.trim();
    }

    /**
     * 类型id
     * @return roleid 类型id
     */
    public Integer getRoleid() {
        return roleid;
    }

    /**
     * 类型id
     * @param roleid 类型id
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }
}