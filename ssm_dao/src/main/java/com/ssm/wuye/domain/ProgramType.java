package com.ssm.wuye.domain;

import com.ssm.wuye.appcomm.BaseEntity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

/**
 * program_type
 */
@Table(name = "program_type")
@Alias("programType")
public class ProgramType extends BaseEntity {
    /**
     * 
     */
    @Id
    @Column(name = "ptid")
    private Integer ptid;

    /**
     * 物业项目类型
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

    @Override
    public String toString() {
        return "ProgramType{" +
                "ptid=" + ptid +
                ", ptypename='" + ptypename + '\'' +
                '}';
    }
}