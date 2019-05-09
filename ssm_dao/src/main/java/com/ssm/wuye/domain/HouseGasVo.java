package com.ssm.wuye.domain;

import com.ssm.wuye.appcomm.BaseEntity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.type.Alias;

/**
 * house_gas_vo
 */
@Table(name = "house_gas_vo")
@Alias("houseGasVo")
public class HouseGasVo extends BaseEntity {
    /**
     * 编号
     */
    @Column(name = "hid")
    private Integer hid;

    /**
     * 楼宇名称
     */
    @Column(name = "hBulidingName")
    private String hbulidingname;

    /**
     * 
     */
    @Column(name = "id")
    private Integer id;

    /**
     * 燃气表编号
     */
    @Column(name = "gasNumber")
    private String gasnumber;

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
     * 业主编号
     */
    @Column(name = "olId")
    private Integer olid;

    /**
     * 业主姓名
     */
    @Column(name = "olName")
    private String olname;

    /**
     * 编号
     * @return hid 编号
     */
    public Integer getHid() {
        return hid;
    }

    /**
     * 编号
     * @param hid 编号
     */
    public void setHid(Integer hid) {
        this.hid = hid;
    }

    /**
     * 楼宇名称
     * @return hBulidingName 楼宇名称
     */
    public String getHbulidingname() {
        return hbulidingname;
    }

    /**
     * 楼宇名称
     * @param hbulidingname 楼宇名称
     */
    public void setHbulidingname(String hbulidingname) {
        this.hbulidingname = hbulidingname == null ? null : hbulidingname.trim();
    }

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

    /**
     * 业主编号
     * @return olId 业主编号
     */
    public Integer getOlid() {
        return olid;
    }

    /**
     * 业主编号
     * @param olid 业主编号
     */
    public void setOlid(Integer olid) {
        this.olid = olid;
    }

    /**
     * 业主姓名
     * @return olName 业主姓名
     */
    public String getOlname() {
        return olname;
    }

    /**
     * 业主姓名
     * @param olname 业主姓名
     */
    public void setOlname(String olname) {
        this.olname = olname == null ? null : olname.trim();
    }
}