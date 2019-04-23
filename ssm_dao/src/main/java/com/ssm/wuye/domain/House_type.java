package com.ssm.wuye.domain;

import com.ssm.wuye.appcomm.BaseEntity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.type.Alias;

/**
 * house_type
 */
@Table(name = "house_type")
@Alias("house_type")
public class House_type extends BaseEntity {
    /**
     * 
     */
    @Id
    @Column(name = "hTypeId")
    private Integer htypeid;

    /**
     * 类型名字
     */
    @Column(name = "hTypeName")
    private String htypename;

    /**
     * 
     */
    @Column(name = "htPropertyRight")
    private String htpropertyright;

    /**
     * 
     * @return hTypeId 
     */
    public Integer getHtypeid() {
        return htypeid;
    }

    /**
     * 
     * @param htypeid 
     */
    public void setHtypeid(Integer htypeid) {
        this.htypeid = htypeid;
    }

    /**
     * 类型名字
     * @return hTypeName 类型名字
     */
    public String getHtypename() {
        return htypename;
    }

    /**
     * 类型名字
     * @param htypename 类型名字
     */
    public void setHtypename(String htypename) {
        this.htypename = htypename == null ? null : htypename.trim();
    }

    /**
     * 
     * @return htPropertyRight 
     */
    public String getHtpropertyright() {
        return htpropertyright;
    }

    /**
     * 
     * @param htpropertyright 
     */
    public void setHtpropertyright(String htpropertyright) {
        this.htpropertyright = htpropertyright == null ? null : htpropertyright.trim();
    }
}