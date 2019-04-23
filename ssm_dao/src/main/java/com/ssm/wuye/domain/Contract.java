package com.ssm.wuye.domain;

import com.ssm.wuye.appcomm.BaseEntity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.type.Alias;

/**
 * contract
 */
@Table(name = "contract")
@Alias("contract")
public class Contract extends BaseEntity {
    /**
     * 
     */
    @Id
    @Column(name = "contractId")
    private Integer contractid;

    /**
     * 合同名字
     */
    @Column(name = "contractName")
    private String contractname;

    /**
     * 合同类型
     */
    @Column(name = "contractType")
    private String contracttype;

    /**
     * 合同起始时间
     */
    @Column(name = "contractStart")
    private Date contractstart;

    /**
     * 合同终止时间
     */
    @Column(name = "contractEnd")
    private Date contractend;

    /**
     * 合同描述
     */
    @Column(name = "contractDes")
    private String contractdes;

    /**
     * 签约人
     */
    @Column(name = "signingPeople")
    private String signingpeople;

    /**
     * 签约人联系方式
     */
    @Column(name = "signatoryTelephone")
    private String signatorytelephone;

    /**
     * 
     * @return contractId 
     */
    public Integer getContractid() {
        return contractid;
    }

    /**
     * 
     * @param contractid 
     */
    public void setContractid(Integer contractid) {
        this.contractid = contractid;
    }

    /**
     * 合同名字
     * @return contractName 合同名字
     */
    public String getContractname() {
        return contractname;
    }

    /**
     * 合同名字
     * @param contractname 合同名字
     */
    public void setContractname(String contractname) {
        this.contractname = contractname == null ? null : contractname.trim();
    }

    /**
     * 合同类型
     * @return contractType 合同类型
     */
    public String getContracttype() {
        return contracttype;
    }

    /**
     * 合同类型
     * @param contracttype 合同类型
     */
    public void setContracttype(String contracttype) {
        this.contracttype = contracttype == null ? null : contracttype.trim();
    }

    /**
     * 合同起始时间
     * @return contractStart 合同起始时间
     */
    public Date getContractstart() {
        return contractstart;
    }

    /**
     * 合同起始时间
     * @param contractstart 合同起始时间
     */
    public void setContractstart(Date contractstart) {
        this.contractstart = contractstart;
    }

    /**
     * 合同终止时间
     * @return contractEnd 合同终止时间
     */
    public Date getContractend() {
        return contractend;
    }

    /**
     * 合同终止时间
     * @param contractend 合同终止时间
     */
    public void setContractend(Date contractend) {
        this.contractend = contractend;
    }

    /**
     * 合同描述
     * @return contractDes 合同描述
     */
    public String getContractdes() {
        return contractdes;
    }

    /**
     * 合同描述
     * @param contractdes 合同描述
     */
    public void setContractdes(String contractdes) {
        this.contractdes = contractdes == null ? null : contractdes.trim();
    }

    /**
     * 签约人
     * @return signingPeople 签约人
     */
    public String getSigningpeople() {
        return signingpeople;
    }

    /**
     * 签约人
     * @param signingpeople 签约人
     */
    public void setSigningpeople(String signingpeople) {
        this.signingpeople = signingpeople == null ? null : signingpeople.trim();
    }

    /**
     * 签约人联系方式
     * @return signatoryTelephone 签约人联系方式
     */
    public String getSignatorytelephone() {
        return signatorytelephone;
    }

    /**
     * 签约人联系方式
     * @param signatorytelephone 签约人联系方式
     */
    public void setSignatorytelephone(String signatorytelephone) {
        this.signatorytelephone = signatorytelephone == null ? null : signatorytelephone.trim();
    }
}