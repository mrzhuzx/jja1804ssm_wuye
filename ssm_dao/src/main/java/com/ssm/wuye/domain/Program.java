package com.ssm.wuye.domain;

import com.ssm.wuye.appcomm.BaseEntity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * program
 */
@Table(name = "program")
@Alias("program")
@Data
public class Program extends BaseEntity {
    /**
     * 
     */
    @Id
    @Column(name = "pid")
    private Integer pid;

    /**
     * 
     */
    @Column(name = "pname")
    private String pname;

    /**
     * 
     */
    @Column(name = "ppicture")
    private String ppicture;

    /**
     * 
     */
    @Column(name = "pintroduce")
    private String pintroduce;

    /**
     * 
     */
    @Column(name = "padress")
    private String padress;

    /**
     * 
     */
    @Column(name = "ptid")
    private Integer ptid;

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
     * 
     * @return pname 
     */
    public String getPname() {
        return pname;
    }

    /**
     * 
     * @param pname 
     */
    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    /**
     * 
     * @return ppicture 
     */
    public String getPpicture() {
        return ppicture;
    }

    /**
     * 
     * @param ppicture 
     */
    public void setPpicture(String ppicture) {
        this.ppicture = ppicture == null ? null : ppicture.trim();
    }

    /**
     * 
     * @return pintroduce 
     */
    public String getPintroduce() {
        return pintroduce;
    }

    /**
     * 
     * @param pintroduce 
     */
    public void setPintroduce(String pintroduce) {
        this.pintroduce = pintroduce == null ? null : pintroduce.trim();
    }

    /**
     * 
     * @return padress 
     */
    public String getPadress() {
        return padress;
    }

    /**
     * 
     * @param padress 
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

    public Program() {
    }

    public Program(Integer pid, String pname, String ppicture, String pintroduce, String padress, Integer ptid) {
        this.pid = pid;
        this.pname = pname;
        this.ppicture = ppicture;
        this.pintroduce = pintroduce;
        this.padress = padress;
        this.ptid = ptid;
    }
}