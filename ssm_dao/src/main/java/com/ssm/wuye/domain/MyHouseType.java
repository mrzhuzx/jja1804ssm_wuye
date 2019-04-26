package com.ssm.wuye.domain;

import com.ssm.wuye.appcomm.BaseEntity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.type.Alias;

/**
 * wy_house_type
 */
@Table(name = "wy_house_type")
@Alias("myHouseType")
public class MyHouseType extends BaseEntity {
    /**
     * 类型Id
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
     * 类型产权年限
     */
    @Column(name = "htPropertyRight")
    private String htpropertyright;

    /**
     * 类型Id
     * @return hTypeId 类型Id
     */
    public Integer getHtypeid() {
        return htypeid;
    }

    /**
     * 类型Id
     * @param htypeid 类型Id
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
     * 类型产权年限
     * @return htPropertyRight 类型产权年限
     */
    public String getHtpropertyright() {
        return htpropertyright;
    }

    /**
     * 类型产权年限
     * @param htpropertyright 类型产权年限
     */
    public void setHtpropertyright(String htpropertyright) {
        this.htpropertyright = htpropertyright == null ? null : htpropertyright.trim();
    }

    public MyHouseType(Integer htypeid, String htypename, String htpropertyright) {
        this.htypeid = htypeid;
        this.htypename = htypename;
        this.htpropertyright = htpropertyright;
    }

    public MyHouseType(String htypename, String htpropertyright) {
        this.htypename = htypename;
        this.htpropertyright = htpropertyright;
    }

    @Override
    public String toString() {
        return "MyHouseType{" +
                "htypeid=" + htypeid +
                ", htypename='" + htypename + '\'' +
                ", htpropertyright='" + htpropertyright + '\'' +
                '}';
    }
}