package com.ssm.wuye.domain;

import com.ssm.wuye.appcomm.BaseEntity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.type.Alias;

/**
 * contract_type
 */
@Table(name = "contract_type")
@Alias("contract_type")
public class Contract_type extends BaseEntity {
    /**
     * 
     */
    @Id
    @Column(name = "contypeId")
    private Integer contypeid;

    /**
     * 
     */
    @Column(name = "contractType")
    private String contracttype;

    /**
     * 
     * @return contypeId 
     */
    public Integer getContypeid() {
        return contypeid;
    }

    /**
     * 
     * @param contypeid 
     */
    public void setContypeid(Integer contypeid) {
        this.contypeid = contypeid;
    }

    /**
     * 
     * @return contractType 
     */
    public String getContracttype() {
        return contracttype;
    }

    /**
     * 
     * @param contracttype 
     */
    public void setContracttype(String contracttype) {
        this.contracttype = contracttype == null ? null : contracttype.trim();
    }
}