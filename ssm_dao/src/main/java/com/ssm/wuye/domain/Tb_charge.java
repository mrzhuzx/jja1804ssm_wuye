package com.ssm.wuye.domain;

import com.ssm.wuye.appcomm.BaseEntity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.type.Alias;

/**
 * tb_charge
 */
@Table(name = "tb_charge")
@Alias("tb_charge")
public class Tb_charge extends BaseEntity {
    /**
     * 收费项目ID(P)
     */
    @Id
    @Column(name = "chargeId")
    private Integer chargeid;

    /**
     * 收费项目名（水费、电费、燃气费,物业费）
     */
    @Column(name = "chargeName")
    private String chargename;

    /**
     * 收费标准/年/季度
     */
    @Column(name = "chargeStandard")
    private Double chargestandard;

    /**
     * 收费说明
     */
    @Column(name = "chargeDescription")
    private String chargedescription;

    /**
     * 收费标准年份
     */
    @Column(name = "chargeYear")
    private String chargeyear;

    /**
     * 收费项目ID(P)
     * @return chargeId 收费项目ID(P)
     */
    public Integer getChargeid() {
        return chargeid;
    }

    /**
     * 收费项目ID(P)
     * @param chargeid 收费项目ID(P)
     */
    public void setChargeid(Integer chargeid) {
        this.chargeid = chargeid;
    }

    /**
     * 收费项目名（水费、电费、燃气费,物业费）
     * @return chargeName 收费项目名（水费、电费、燃气费,物业费）
     */
    public String getChargename() {
        return chargename;
    }

    /**
     * 收费项目名（水费、电费、燃气费,物业费）
     * @param chargename 收费项目名（水费、电费、燃气费,物业费）
     */
    public void setChargename(String chargename) {
        this.chargename = chargename == null ? null : chargename.trim();
    }

    /**
     * 收费标准/年/季度
     * @return chargeStandard 收费标准/年/季度
     */
    public Double getChargestandard() {
        return chargestandard;
    }

    /**
     * 收费标准/年/季度
     * @param chargestandard 收费标准/年/季度
     */
    public void setChargestandard(Double chargestandard) {
        this.chargestandard = chargestandard;
    }

    /**
     * 收费说明
     * @return chargeDescription 收费说明
     */
    public String getChargedescription() {
        return chargedescription;
    }

    /**
     * 收费说明
     * @param chargedescription 收费说明
     */
    public void setChargedescription(String chargedescription) {
        this.chargedescription = chargedescription == null ? null : chargedescription.trim();
    }

    /**
     * 收费标准年份
     * @return chargeYear 收费标准年份
     */
    public String getChargeyear() {
        return chargeyear;
    }

    /**
     * 收费标准年份
     * @param chargeyear 收费标准年份
     */
    public void setChargeyear(String chargeyear) {
        this.chargeyear = chargeyear == null ? null : chargeyear.trim();
    }
}