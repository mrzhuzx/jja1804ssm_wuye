package com.ssm.wuye.domain;

import com.ssm.wuye.appcomm.BaseEntity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.type.Alias;

/**
 * programtype
 */
@Table(name = "programtype")
@Alias("programtype")
public class Programtype extends BaseEntity {
    /**
     * 
     */
    @Id
    @Column(name = "ptid")
    private Integer ptid;

    /**
     * 
     */
    @Column(name = "ptypename")
    private String ptypename;

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
     * 
     * @return ptypename 
     */
    public String getPtypename() {
        return ptypename;
    }

    /**
     * 
     * @param ptypename 
     */
    public void setPtypename(String ptypename) {
        this.ptypename = ptypename == null ? null : ptypename.trim();
    }
}