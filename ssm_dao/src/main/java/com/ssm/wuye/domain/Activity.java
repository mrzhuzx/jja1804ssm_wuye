package com.ssm.wuye.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.type.Alias;

/**
 * activity
 */
@Table(name = "activity")
@Alias("activity")
public class Activity {
    /**
     * 社区活动
     */
    @Column(name = "id")
    private Integer id;

    /**
     * 活动名称
     */
    @Column(name = "activityname")
    private String activityname;

    /**
     * 活动描述
     */
    @Column(name = "activitydesc")
    private String activitydesc;

    /**
     * 活动节目内容
     */
    @Column(name = "activitycont")
    private String activitycont;

    /**
     * 活动时间
     */
    @Column(name = "activitytime")
    private Date activitytime;

    /**
     * 组织活动工作人员
     */
    @Column(name = "activityworker")
    private String activityworker;

    /**
     * 活动奖品
     */
    @Column(name = "activityward")
    private String activityward;

    /**
     * 社区活动
     * @return id 社区活动
     */
    public Integer getId() {
        return id;
    }

    /**
     * 社区活动
     * @param id 社区活动
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 活动名称
     * @return activityname 活动名称
     */
    public String getActivityname() {
        return activityname;
    }

    /**
     * 活动名称
     * @param activityname 活动名称
     */
    public void setActivityname(String activityname) {
        this.activityname = activityname == null ? null : activityname.trim();
    }

    /**
     * 活动描述
     * @return activitydesc 活动描述
     */
    public String getActivitydesc() {
        return activitydesc;
    }

    /**
     * 活动描述
     * @param activitydesc 活动描述
     */
    public void setActivitydesc(String activitydesc) {
        this.activitydesc = activitydesc == null ? null : activitydesc.trim();
    }

    /**
     * 活动节目内容
     * @return activitycont 活动节目内容
     */
    public String getActivitycont() {
        return activitycont;
    }

    /**
     * 活动节目内容
     * @param activitycont 活动节目内容
     */
    public void setActivitycont(String activitycont) {
        this.activitycont = activitycont == null ? null : activitycont.trim();
    }

    /**
     * 活动时间
     * @return activitytime 活动时间
     */
    public Date getActivitytime() {
        return activitytime;
    }

    /**
     * 活动时间
     * @param activitytime 活动时间
     */
    public void setActivitytime(Date activitytime) {
        this.activitytime = activitytime;
    }

    /**
     * 组织活动工作人员
     * @return activityworker 组织活动工作人员
     */
    public String getActivityworker() {
        return activityworker;
    }

    /**
     * 组织活动工作人员
     * @param activityworker 组织活动工作人员
     */
    public void setActivityworker(String activityworker) {
        this.activityworker = activityworker == null ? null : activityworker.trim();
    }

    /**
     * 活动奖品
     * @return activityward 活动奖品
     */
    public String getActivityward() {
        return activityward;
    }

    /**
     * 活动奖品
     * @param activityward 活动奖品
     */
    public void setActivityward(String activityward) {
        this.activityward = activityward == null ? null : activityward.trim();
    }
}