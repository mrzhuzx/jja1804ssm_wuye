package com.ssm.wuye.domain;

import com.ssm.wuye.appcomm.BaseEntity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.type.Alias;

/**
 * ch_gas_meter
 */
@Table(name = "ch_gas_meter")
@Alias("chGasMeter")
public class ChGasMeter extends BaseEntity {
    /**
     * 
     */
    @Id
    @Column(name = "id")
    private Integer id;

    /**
     * 燃气表编号
     */
    @Column(name = "gasNumber")
    private String gasnumber;

    /**
     * 房屋号/引用house表的houseid
     */
    @Column(name = "houseid")
    private Integer houseid;

    /**
     * 燃气用量（立方）
     */
    @Column(name = "gas")
    private Double gas;

    /**
     * 年月份
     */
    @Column(name = "month")
    private Date month;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 燃气表编号
     * @return gasNumber 燃气表编号
     */
    public String getGasnumber() {
        return gasnumber;
    }

    /**
     * 燃气表编号
     * @param gasnumber 燃气表编号
     */
    public void setGasnumber(String gasnumber) {
        this.gasnumber = gasnumber == null ? null : gasnumber.trim();
    }

    /**
     * 房屋号/引用house表的houseid
     * @return houseid 房屋号/引用house表的houseid
     */
    public Integer getHouseid() {
        return houseid;
    }

    /**
     * 房屋号/引用house表的houseid
     * @param houseid 房屋号/引用house表的houseid
     */
    public void setHouseid(Integer houseid) {
        this.houseid = houseid;
    }

    /**
     * 燃气用量（立方）
     * @return gas 燃气用量（立方）
     */
    public Double getGas() {
        return gas;
    }

    /**
     * 燃气用量（立方）
     * @param gas 燃气用量（立方）
     */
    public void setGas(Double gas) {
        this.gas = gas;
    }

    /**
     * 年月份
     * @return month 年月份
     */
    public Date getMonth() {
        return month;
    }

    /**
     * 年月份
     * @param month 年月份
     */
    public void setMonth(Date month) {
        this.month = month;
    }
}