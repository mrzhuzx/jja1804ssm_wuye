package com.ssm.wuye.domain;

import com.ssm.wuye.appcomm.BaseEntity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.type.Alias;

/**
 * role
 */
@Table(name = "role")
@Alias("role")
public class Role extends BaseEntity {
    /**
     * 角色ID(P)
     */
    @Id
    @Column(name = "roleId")
    private Integer roleid;

    /**
     * 角色名
     */
    @Column(name = "roleName")
    private String rolename;

    /**
     * 状态(启用/禁用)
     */
    @Column(name = "roleStatus")
    private String rolestatus;

    /**
     * 角色ID(P)
     * @return roleId 角色ID(P)
     */
    public Integer getRoleid() {
        return roleid;
    }

    /**
     * 角色ID(P)
     * @param roleid 角色ID(P)
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    /**
     * 角色名
     * @return roleName 角色名
     */
    public String getRolename() {
        return rolename;
    }

    /**
     * 角色名
     * @param rolename 角色名
     */
    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    /**
     * 状态(启用/禁用)
     * @return roleStatus 状态(启用/禁用)
     */
    public String getRolestatus() {
        return rolestatus;
    }

    /**
     * 状态(启用/禁用)
     * @param rolestatus 状态(启用/禁用)
     */
    public void setRolestatus(String rolestatus) {
        this.rolestatus = rolestatus == null ? null : rolestatus.trim();
    }
}