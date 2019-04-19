package com.ssm.wuye.domain;

import com.ssm.wuye.appcomm.BaseEntity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.type.Alias;

/**
 * newstype
 */
@Table(name = "newstype")
@Alias("newstype")
public class Newstype extends BaseEntity {
    /**
     * 
     */
    @Id
    @Column(name = "ntid")
    private Integer ntid;

    /**
     * 
     */
    @Column(name = "ntypename")
    private String ntypename;

    /**
     * 
     * @return ntid 
     */
    public Integer getNtid() {
        return ntid;
    }

    /**
     * 
     * @param ntid 
     */
    public void setNtid(Integer ntid) {
        this.ntid = ntid;
    }

    /**
     * 
     * @return ntypename 
     */
    public String getNtypename() {
        return ntypename;
    }

    /**
     * 
     * @param ntypename 
     */
    public void setNtypename(String ntypename) {
        this.ntypename = ntypename == null ? null : ntypename.trim();
    }
}