package com.ssm.wuye.domain;

import com.ssm.wuye.appcomm.BaseEntity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.type.Alias;

/**
 * ower
 */
@Table(name = "ower")
@Alias("ower")
public class Ower extends BaseEntity {
    /**
     * 业主编号
     */
    @Id
    @Column(name = "olId")
    private Integer olid;

    /**
     * 业主姓名
     */
    @Column(name = "olName")
    private String olname;

    /**
     * 业主账号
     */
    @Column(name = "olAccount")
    private String olaccount;

    /**
     * 登录密码
     */
    @Column(name = "olPasswd")
    private String olpasswd;

    /**
     * 业主身份证
     */
    @Column(name = "powerId")
    private String powerid;

    /**
     * 业主手机号
     */
    @Column(name = "olPhone")
    private String olphone;

    /**
     * 头像（默认头像组）
     */
    @Column(name = "olHeadimg")
    private String olheadimg;

    /**
     * 居住成员人数
     */
    @Column(name = "olMember")
    private Integer olmember;

    /**
     * 角色编号  外键
     */
    @Column(name = "roleId")
    private Integer roleid;

    /**
     * 业主编号
     * @return olId 业主编号
     */
    public Integer getOlid() {
        return olid;
    }

    /**
     * 业主编号
     * @param olid 业主编号
     */
    public void setOlid(Integer olid) {
        this.olid = olid;
    }

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
     * 业主账号
     * @return olAccount 业主账号
     */
    public String getOlaccount() {
        return olaccount;
    }

    /**
     * 业主账号
     * @param olaccount 业主账号
     */
    public void setOlaccount(String olaccount) {
        this.olaccount = olaccount == null ? null : olaccount.trim();
    }

    /**
     * 登录密码
     * @return olPasswd 登录密码
     */
    public String getOlpasswd() {
        return olpasswd;
    }

    /**
     * 登录密码
     * @param olpasswd 登录密码
     */
    public void setOlpasswd(String olpasswd) {
        this.olpasswd = olpasswd == null ? null : olpasswd.trim();
    }

    /**
     * 业主身份证
     * @return powerId 业主身份证
     */
    public String getPowerid() {
        return powerid;
    }

    /**
     * 业主身份证
     * @param powerid 业主身份证
     */
    public void setPowerid(String powerid) {
        this.powerid = powerid == null ? null : powerid.trim();
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

    /**
     * 头像（默认头像组）
     * @return olHeadimg 头像（默认头像组）
     */
    public String getOlheadimg() {
        return olheadimg;
    }

    /**
     * 头像（默认头像组）
     * @param olheadimg 头像（默认头像组）
     */
    public void setOlheadimg(String olheadimg) {
        this.olheadimg = olheadimg == null ? null : olheadimg.trim();
    }

    /**
     * 居住成员人数
     * @return olMember 居住成员人数
     */
    public Integer getOlmember() {
        return olmember;
    }

    /**
     * 居住成员人数
     * @param olmember 居住成员人数
     */
    public void setOlmember(Integer olmember) {
        this.olmember = olmember;
    }

    /**
     * 角色编号  外键
     * @return roleId 角色编号  外键
     */
    public Integer getRoleid() {
        return roleid;
    }

    /**
     * 角色编号  外键
     * @param roleid 角色编号  外键
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }
}