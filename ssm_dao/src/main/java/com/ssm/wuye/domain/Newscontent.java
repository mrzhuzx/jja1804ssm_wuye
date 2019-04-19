package com.ssm.wuye.domain;

import com.ssm.wuye.appcomm.BaseEntity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.type.Alias;

/**
 * newscontent
 */
@Table(name = "newscontent")
@Alias("newscontent")
public class Newscontent extends BaseEntity {
    /**
     * 
     */
    @Id
    @Column(name = "ncid")
    private Integer ncid;

    /**
     * 
     */
    @Column(name = "nctitle")
    private String nctitle;

    /**
     * 
     */
    @Column(name = "nccontent")
    private String nccontent;

    /**
     * 
     */
    @Column(name = "nctime")
    private Date nctime;

    /**
     * 
     */
    @Column(name = "nctypeid")
    private Integer nctypeid;

    /**
     * 
     * @return ncid 
     */
    public Integer getNcid() {
        return ncid;
    }

    /**
     * 
     * @param ncid 
     */
    public void setNcid(Integer ncid) {
        this.ncid = ncid;
    }

    /**
     * 
     * @return nctitle 
     */
    public String getNctitle() {
        return nctitle;
    }

    /**
     * 
     * @param nctitle 
     */
    public void setNctitle(String nctitle) {
        this.nctitle = nctitle == null ? null : nctitle.trim();
    }

    /**
     * 
     * @return nccontent 
     */
    public String getNccontent() {
        return nccontent;
    }

    /**
     * 
     * @param nccontent 
     */
    public void setNccontent(String nccontent) {
        this.nccontent = nccontent == null ? null : nccontent.trim();
    }

    /**
     * 
     * @return nctime 
     */
    public Date getNctime() {
        return nctime;
    }

    /**
     * 
     * @param nctime 
     */
    public void setNctime(Date nctime) {
        this.nctime = nctime;
    }

    /**
     * 
     * @return nctypeid 
     */
    public Integer getNctypeid() {
        return nctypeid;
    }

    /**
     * 
     * @param nctypeid 
     */
    public void setNctypeid(Integer nctypeid) {
        this.nctypeid = nctypeid;
    }
}