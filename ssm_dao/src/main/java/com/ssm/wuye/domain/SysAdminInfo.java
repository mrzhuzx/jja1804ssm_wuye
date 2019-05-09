package com.ssm.wuye.domain;

import com.ssm.wuye.appcomm.BaseEntity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * sys_admin_info
 */
@Table(name = "sys_admin_info")
@Alias("sysAdminInfo")
@Data
public class SysAdminInfo extends BaseEntity {
    /**
     *
     */
    @Id
    @Column(name = "userid")
    private Integer userid;

    /**
     * 名字
     */
    @Column(name = "username")
    private String username;

    /**
     * 密码
     */
    @Column(name = "userpass")
    private String userpass;

    /**
     * 电话
     */
    @Column(name = "userphone")
    private String userphone;

    /**
     * 邮箱
     */
    @Column(name = "usermail")
    private String usermail;

    /**
     * 头像
     */
    @Column(name = "userqqface")
    private String userqqface;

    /**
     * 启用禁用
     */
    @Column(name = "userflag")
    private String userflag;

    /**
     * 个性签名
     */
    @Column(name = "userstyle")
    private String userstyle;

    /**
     *
     */
    @Column(name = "roleid")
    private Integer roleid;

    /**
     *
     * @return userid
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     *
     * @param userid
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * 名字
     * @return username 名字
     */
    public String getUsername() {
        return username;
    }

    /**
     * 名字
     * @param username 名字
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 密码
     * @return userpass 密码
     */
    public String getUserpass() {
        return userpass;
    }

    /**
     * 密码
     * @param userpass 密码
     */
    public void setUserpass(String userpass) {
        this.userpass = userpass == null ? null : userpass.trim();
    }

    /**
     * 电话
     * @return userphone 电话
     */
    public String getUserphone() {
        return userphone;
    }

    /**
     * 电话
     * @param userphone 电话
     */
    public void setUserphone(String userphone) {
        this.userphone = userphone == null ? null : userphone.trim();
    }

    /**
     * 邮箱
     * @return usermail 邮箱
     */
    public String getUsermail() {
        return usermail;
    }

    /**
     * 邮箱
     * @param usermail 邮箱
     */
    public void setUsermail(String usermail) {
        this.usermail = usermail == null ? null : usermail.trim();
    }

    /**
     * 头像
     * @return userqqface 头像
     */
    public String getUserqqface() {
        return userqqface;
    }

    /**
     * 头像
     * @param userqqface 头像
     */
    public void setUserqqface(String userqqface) {
        this.userqqface = userqqface == null ? null : userqqface.trim();
    }

    /**
     * 启用禁用
     * @return userflag 启用禁用
     */
    public String getUserflag() {
        return userflag;
    }

    /**
     * 启用禁用
     * @param userflag 启用禁用
     */
    public void setUserflag(String userflag) {
        this.userflag = userflag == null ? null : userflag.trim();
    }

    /**
     * 个性签名
     * @return userstyle 个性签名
     */
    public String getUserstyle() {
        return userstyle;
    }

    /**
     * 个性签名
     * @param userstyle 个性签名
     */
    public void setUserstyle(String userstyle) {
        this.userstyle = userstyle == null ? null : userstyle.trim();
    }

    /**
     *
     * @return roleid
     */
    public Integer getRoleid() {
        return roleid;
    }

    /**
     *
     * @param roleid
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public SysAdminInfo(Integer userid, String username, String userpass, String userphone, String usermail, String userqqface, String userflag, String userstyle, Integer roleid) {
        this.userid = userid;
        this.username = username;
        this.userpass = userpass;
        this.userphone = userphone;
        this.usermail = usermail;
        this.userqqface = userqqface;
        this.userflag = userflag;
        this.userstyle = userstyle;
        this.roleid = roleid;
    }

    public SysAdminInfo() {
    }

    public SysAdminInfo(String userpass, String usermail, Integer roleid) {
        this.userpass = userpass;
        this.usermail = usermail;
        this.roleid = roleid;
    }
}