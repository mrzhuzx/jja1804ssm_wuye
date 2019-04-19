package com.ssm.wuye.domain;

import com.ssm.wuye.appcomm.BaseEntity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.type.Alias;

/**
 * complaininfo
 */
@Table(name = "complaininfo")
@Alias("complaininfo")
public class Complaininfo extends BaseEntity {
    /**
     * 主键/自动递增
     */
    @Id
    @Column(name = "cid")
    private Integer cid;

    /**
     * 投诉摘要  关键字
     */
    @Column(name = "title")
    private String title;

    /**
     * 投诉描述
     */
    @Column(name = "descr")
    private String descr;

    /**
     * 投诉人姓名
     */
    @Column(name = "cname")
    private String cname;

    /**
     * 投诉人电话
     */
    @Column(name = "cphone")
    private String cphone;

    /**
     * 受理人
     */
    @Column(name = "rname")
    private String rname;

    /**
     * 是否已处理：0：未处理1：已处理 
     */
    @Column(name = "status")
    private Integer status;

    /**
     * 投诉方式：1：客服中心投诉2：电话投诉3：网上投诉
     */
    @Column(name = "means")
    private Integer means;

    /**
     * 投诉时间
     */
    @Column(name = "cdate")
    private Date cdate;

    /**
     * 处理备注
     */
    @Column(name = "dealdescr")
    private String dealdescr;

    /**
     * 主键/自动递增
     * @return cid 主键/自动递增
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * 主键/自动递增
     * @param cid 主键/自动递增
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * 投诉摘要  关键字
     * @return title 投诉摘要  关键字
     */
    public String getTitle() {
        return title;
    }

    /**
     * 投诉摘要  关键字
     * @param title 投诉摘要  关键字
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 投诉描述
     * @return descr 投诉描述
     */
    public String getDescr() {
        return descr;
    }

    /**
     * 投诉描述
     * @param descr 投诉描述
     */
    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }

    /**
     * 投诉人姓名
     * @return cname 投诉人姓名
     */
    public String getCname() {
        return cname;
    }

    /**
     * 投诉人姓名
     * @param cname 投诉人姓名
     */
    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    /**
     * 投诉人电话
     * @return cphone 投诉人电话
     */
    public String getCphone() {
        return cphone;
    }

    /**
     * 投诉人电话
     * @param cphone 投诉人电话
     */
    public void setCphone(String cphone) {
        this.cphone = cphone == null ? null : cphone.trim();
    }

    /**
     * 受理人
     * @return rname 受理人
     */
    public String getRname() {
        return rname;
    }

    /**
     * 受理人
     * @param rname 受理人
     */
    public void setRname(String rname) {
        this.rname = rname == null ? null : rname.trim();
    }

    /**
     * 是否已处理：0：未处理1：已处理 
     * @return status 是否已处理：0：未处理1：已处理 
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 是否已处理：0：未处理1：已处理 
     * @param status 是否已处理：0：未处理1：已处理 
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 投诉方式：1：客服中心投诉2：电话投诉3：网上投诉
     * @return means 投诉方式：1：客服中心投诉2：电话投诉3：网上投诉
     */
    public Integer getMeans() {
        return means;
    }

    /**
     * 投诉方式：1：客服中心投诉2：电话投诉3：网上投诉
     * @param means 投诉方式：1：客服中心投诉2：电话投诉3：网上投诉
     */
    public void setMeans(Integer means) {
        this.means = means;
    }

    /**
     * 投诉时间
     * @return cdate 投诉时间
     */
    public Date getCdate() {
        return cdate;
    }

    /**
     * 投诉时间
     * @param cdate 投诉时间
     */
    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }

    /**
     * 处理备注
     * @return dealdescr 处理备注
     */
    public String getDealdescr() {
        return dealdescr;
    }

    /**
     * 处理备注
     * @param dealdescr 处理备注
     */
    public void setDealdescr(String dealdescr) {
        this.dealdescr = dealdescr == null ? null : dealdescr.trim();
    }
}