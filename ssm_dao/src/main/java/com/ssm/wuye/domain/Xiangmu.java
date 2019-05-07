package com.ssm.wuye.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * xiangmu
 */
@Table(name = "xiangmu")
@Alias("xiangmu")
@Data
public class Xiangmu {
    /**
     * 
     */
    @Id
    @Column(name = "pid")
    private Integer pid;

    /**
     * 物业项目名
     */
    @Column(name = "pname")
    private String pname;

    /**
     * 图片信息
     */
    @Column(name = "ppicture")
    private String ppicture;

    /**
     * 描述
     */
    @Column(name = "pintroduce")
    private String pintroduce;

    /**
     * 项目所在地
     */
    @Column(name = "padress")
    private String padress;

    /**
     * 
     */
    @Column(name = "ptid")
    private Integer ptid;

    /**
     * 物业项目类型
     */
    @Column(name = "ptypename")
    private String ptypename;

    /**
     * 
     * @return pid 
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * 
     * @param pid 
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * 物业项目名
     * @return pname 物业项目名
     */
    public String getPname() {
        return pname;
    }

    /**
     * 物业项目名
     * @param pname 物业项目名
     */
    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    /**
     * 图片信息
     * @return ppicture 图片信息
     */
    public String getPpicture() {
        return ppicture;
    }

    /**
     * 图片信息
     * @param ppicture 图片信息
     */
    public void setPpicture(String ppicture) {
        this.ppicture = ppicture == null ? null : ppicture.trim();
    }

    /**
     * 描述
     * @return pintroduce 描述
     */
    public String getPintroduce() {
        return pintroduce;
    }

    /**
     * 描述
     * @param pintroduce 描述
     */
    public void setPintroduce(String pintroduce) {
        this.pintroduce = pintroduce == null ? null : pintroduce.trim();
    }

    /**
     * 项目所在地
     * @return padress 项目所在地
     */
    public String getPadress() {
        return padress;
    }

    /**
     * 项目所在地
     * @param padress 项目所在地
     */
    public void setPadress(String padress) {
        this.padress = padress == null ? null : padress.trim();
    }

    /**
     * 
     * @return ptid 
     */
    public Integer getPtid() {
        return ptid;
    }

    /**
     * 
     * @param ptid 
     */
    public void setPtid(Integer ptid) {
        this.ptid = ptid;
    }

    /**
     * 物业项目类型
     * @return ptypename 物业项目类型
     */
    public String getPtypename() {
        return ptypename;
    }

    /**
     * 物业项目类型
     * @param ptypename 物业项目类型
     */
    public void setPtypename(String ptypename) {
        this.ptypename = ptypename == null ? null : ptypename.trim();
    }

    public Xiangmu() {
    }

    public Xiangmu(Integer pid, String pname, String ppicture, String pintroduce, String padress, Integer ptid, String ptypename) {
        this.pid = pid;
        this.pname = pname;
        this.ppicture = ppicture;
        this.pintroduce = pintroduce;
        this.padress = padress;
        this.ptid = ptid;
        this.ptypename = ptypename;
    }

    @Override
    public String toString() {
        return "Xiangmu{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", ppicture='" + ppicture + '\'' +
                ", pintroduce='" + pintroduce + '\'' +
                ", padress='" + padress + '\'' +
                ", ptid=" + ptid +
                ", ptypename='" + ptypename + '\'' +
                '}';
    }

}