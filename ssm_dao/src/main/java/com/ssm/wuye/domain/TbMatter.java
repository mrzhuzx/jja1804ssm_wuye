package com.ssm.wuye.domain;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.ssm.wuye.appcomm.BaseEntity;
import org.apache.ibatis.type.Alias;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * tb_matter
 */
@Table(name = "tb_matter")
@Alias("tbMatter")
public class TbMatter extends BaseEntity {
    /**
     * 物资ID(P)
     */
    @Id
    @Column(name = "matterId")
    private Integer matterid;

    /**
     * 物资名称
     */
    @Column(name = "matterName")
    private String mattername;

    /**
     * 物资数量
     */
    @Column(name = "matterNum")
    private Integer matternum;

    /**
     * 物资价格
     */
    @Column(name = "matterPrice")
    private Double matterprice;

    /**
     * 物资类别ID  为外键,连接的表为物资设备类别管理表tb_matter_sort
     */
    @Column(name = "matterSortId")
    private Integer mattersortid;

    /**
     * 入库时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")

    @Column(name = "inStorageTime")
    private Date instoragetime;

    /**
     * 出库时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")

    @Column(name = "outStorageTime")
    private Date outstoragetime;

    /**
     * 物资状态
     */
    @Column(name = "matterState")
    private String matterstate;

    /**
     * 物资ID(P)
     *
     * @return matterId 物资ID(P)
     */
    public Integer getMatterid() {
        return matterid;
    }

    /**
     * 物资ID(P)
     *
     * @param matterid 物资ID(P)
     */
    public void setMatterid(Integer matterid) {
        this.matterid = matterid;
    }

    /**
     * 物资名称
     *
     * @return matterName 物资名称
     */
    public String getMattername() {
        return mattername;
    }

    /**
     * 物资名称
     *
     * @param mattername 物资名称
     */
    public void setMattername(String mattername) {
        this.mattername = mattername == null ? null : mattername.trim();
    }

    /**
     * 物资数量
     *
     * @return matterNum 物资数量
     */
    public Integer getMatternum() {
        return matternum;
    }

    /**
     * 物资数量
     *
     * @param matternum 物资数量
     */
    public void setMatternum(Integer matternum) {
        this.matternum = matternum;
    }

    /**
     * 物资价格
     *
     * @return matterPrice 物资价格
     */
    public Double getMatterprice() {
        return matterprice;
    }

    /**
     * 物资价格
     *
     * @param matterprice 物资价格
     */
    public void setMatterprice(Double matterprice) {
        this.matterprice = matterprice;
    }

    /**
     * 物资类别ID  为外键,连接的表为物资设备类别管理表tb_matter_sort
     *
     * @return matterSortId 物资类别ID  为外键,连接的表为物资设备类别管理表tb_matter_sort
     */
    public Integer getMattersortid() {
        return mattersortid;
    }

    /**
     * 物资类别ID  为外键,连接的表为物资设备类别管理表tb_matter_sort
     *
     * @param mattersortid 物资类别ID  为外键,连接的表为物资设备类别管理表tb_matter_sort
     */
    public void setMattersortid(Integer mattersortid) {
        this.mattersortid = mattersortid;
    }

    /**
     * 入库时间
     *
     * @return inStorageTime 入库时间
     */
    public Date getInstoragetime() {
        return instoragetime;
    }

    /**
     * 入库时间
     *
     * @param instoragetime 入库时间
     */
    public void setInstoragetime(Date instoragetime) {
        this.instoragetime = instoragetime;
    }

    /**
     * 出库时间
     *
     * @return outStorageTime 出库时间
     */
    public Date getOutstoragetime() {
        return outstoragetime;
    }

    /**
     * 出库时间
     *
     * @param outstoragetime 出库时间
     */
    public void setOutstoragetime(Date outstoragetime) {
        this.outstoragetime = outstoragetime;
    }

    /**
     * 物资状态
     *
     * @return matterState 物资状态
     */
    public String getMatterstate() {
        return matterstate;
    }

    /**
     * 物资状态
     *
     * @param matterstate 物资状态
     */
    public void setMatterstate(String matterstate) {
        this.matterstate = matterstate == null ? null : matterstate.trim();
    }

    public TbMatter() {
    }

    public TbMatter(String mattername, Integer matternum, Double matterprice, Integer mattersortid, Date instoragetime, Date outstoragetime, String matterstate) {
        this.mattername = mattername;
        this.matternum = matternum;
        this.matterprice = matterprice;
        this.mattersortid = mattersortid;
        this.instoragetime = instoragetime;
        this.outstoragetime = outstoragetime;
        this.matterstate = matterstate;
    }

    public TbMatter(Integer matterid, String mattername, Integer matternum, Double matterprice, Integer mattersortid, Date instoragetime, Date outstoragetime, String matterstate) {
        this.matterid = matterid;
        this.mattername = mattername;
        this.matternum = matternum;
        this.matterprice = matterprice;
        this.mattersortid = mattersortid;
        this.instoragetime = instoragetime;
        this.outstoragetime = outstoragetime;
        this.matterstate = matterstate;
    }

    @Override
    public String toString() {
        return "TbMatter{" +
                "matterid=" + matterid +
                ", mattername='" + mattername + '\'' +
                ", matternum=" + matternum +
                ", matterprice=" + matterprice +
                ", mattersortid=" + mattersortid +
                ", instoragetime=" + instoragetime +
                ", outstoragetime=" + outstoragetime +
                ", matterstate='" + matterstate + '\'' +
                '}';
    }
}