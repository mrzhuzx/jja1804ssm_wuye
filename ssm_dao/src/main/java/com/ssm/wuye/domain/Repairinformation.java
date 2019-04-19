package com.ssm.wuye.domain;

import com.ssm.wuye.appcomm.BaseEntity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.type.Alias;

/**
 * repair_information
 */
@Table(name = "repair_information")
@Alias("repairinformation")
public class Repairinformation extends BaseEntity {
    /**
     * 主键/年月日。+当天递增 
     */
    @Id
    @Column(name = "id")
    private Integer id;

    /**
     * 房屋号/引用house表的houseid
     */
    @Column(name = "repairname")
    private String repairname;

    /**
     * 
     */
    @Column(name = "repairphone")
    private String repairphone;

    /**
     * 报修类别：水表、电表、燃气表、水管、电线、燃气管、其它
     */
    @Column(name = "category")
    private String category;

    /**
     * 报修问题说明 文件域
     */
    @Column(name = "repdesc")
    private String repdesc;

    /**
     * 报修时间
     */
    @Column(name = "reportdate")
    private Date reportdate;

    /**
     * 报修方式：1：客服中心报修2：电话报修3：网上报修
     */
    @Column(name = "means")
    private Integer means;

    /**
     * 是否已处理：0：未处理1：已安排维修2：已维修完成
     */
    @Column(name = "status")
    private Integer status;

    /**
     * 安排维修时间
     */
    @Column(name = "repairdate")
    private Date repairdate;

    /**
     * 维修负责人
     */
    @Column(name = "principal")
    private String principal;

    /**
     * 材料费
     */
    @Column(name = "material")
    private Double material;

    /**
     * 维修费
     */
    @Column(name = "upkeep")
    private Double upkeep;

    /**
     * 维修日期
     */
    @Column(name = "completedate")
    private Date completedate;

    /**
     * 费用是否交纳0：未交纳
     */
    @Column(name = "ispay")
    private Integer ispay;

    /**
     * 费用交纳时间
     */
    @Column(name = "paydate")
    private Date paydate;

    /**
     * 主键/年月日。+当天递增 
     * @return id 主键/年月日。+当天递增 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键/年月日。+当天递增 
     * @param id 主键/年月日。+当天递增 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 房屋号/引用house表的houseid
     * @return repairname 房屋号/引用house表的houseid
     */
    public String getRepairname() {
        return repairname;
    }

    /**
     * 房屋号/引用house表的houseid
     * @param repairname 房屋号/引用house表的houseid
     */
    public void setRepairname(String repairname) {
        this.repairname = repairname == null ? null : repairname.trim();
    }

    /**
     * 
     * @return repairphone 
     */
    public String getRepairphone() {
        return repairphone;
    }

    /**
     * 
     * @param repairphone 
     */
    public void setRepairphone(String repairphone) {
        this.repairphone = repairphone == null ? null : repairphone.trim();
    }

    /**
     * 报修类别：水表、电表、燃气表、水管、电线、燃气管、其它
     * @return category 报修类别：水表、电表、燃气表、水管、电线、燃气管、其它
     */
    public String getCategory() {
        return category;
    }

    /**
     * 报修类别：水表、电表、燃气表、水管、电线、燃气管、其它
     * @param category 报修类别：水表、电表、燃气表、水管、电线、燃气管、其它
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    /**
     * 报修问题说明 文件域
     * @return repdesc 报修问题说明 文件域
     */
    public String getRepdesc() {
        return repdesc;
    }

    /**
     * 报修问题说明 文件域
     * @param repdesc 报修问题说明 文件域
     */
    public void setRepdesc(String repdesc) {
        this.repdesc = repdesc == null ? null : repdesc.trim();
    }

    /**
     * 报修时间
     * @return reportdate 报修时间
     */
    public Date getReportdate() {
        return reportdate;
    }

    /**
     * 报修时间
     * @param reportdate 报修时间
     */
    public void setReportdate(Date reportdate) {
        this.reportdate = reportdate;
    }

    /**
     * 报修方式：1：客服中心报修2：电话报修3：网上报修
     * @return means 报修方式：1：客服中心报修2：电话报修3：网上报修
     */
    public Integer getMeans() {
        return means;
    }

    /**
     * 报修方式：1：客服中心报修2：电话报修3：网上报修
     * @param means 报修方式：1：客服中心报修2：电话报修3：网上报修
     */
    public void setMeans(Integer means) {
        this.means = means;
    }

    /**
     * 是否已处理：0：未处理1：已安排维修2：已维修完成
     * @return status 是否已处理：0：未处理1：已安排维修2：已维修完成
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 是否已处理：0：未处理1：已安排维修2：已维修完成
     * @param status 是否已处理：0：未处理1：已安排维修2：已维修完成
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 安排维修时间
     * @return repairdate 安排维修时间
     */
    public Date getRepairdate() {
        return repairdate;
    }

    /**
     * 安排维修时间
     * @param repairdate 安排维修时间
     */
    public void setRepairdate(Date repairdate) {
        this.repairdate = repairdate;
    }

    /**
     * 维修负责人
     * @return principal 维修负责人
     */
    public String getPrincipal() {
        return principal;
    }

    /**
     * 维修负责人
     * @param principal 维修负责人
     */
    public void setPrincipal(String principal) {
        this.principal = principal == null ? null : principal.trim();
    }

    /**
     * 材料费
     * @return material 材料费
     */
    public Double getMaterial() {
        return material;
    }

    /**
     * 材料费
     * @param material 材料费
     */
    public void setMaterial(Double material) {
        this.material = material;
    }

    /**
     * 维修费
     * @return upkeep 维修费
     */
    public Double getUpkeep() {
        return upkeep;
    }

    /**
     * 维修费
     * @param upkeep 维修费
     */
    public void setUpkeep(Double upkeep) {
        this.upkeep = upkeep;
    }

    /**
     * 维修日期
     * @return completedate 维修日期
     */
    public Date getCompletedate() {
        return completedate;
    }

    /**
     * 维修日期
     * @param completedate 维修日期
     */
    public void setCompletedate(Date completedate) {
        this.completedate = completedate;
    }

    /**
     * 费用是否交纳0：未交纳
     * @return ispay 费用是否交纳0：未交纳
     */
    public Integer getIspay() {
        return ispay;
    }

    /**
     * 费用是否交纳0：未交纳
     * @param ispay 费用是否交纳0：未交纳
     */
    public void setIspay(Integer ispay) {
        this.ispay = ispay;
    }

    /**
     * 费用交纳时间
     * @return paydate 费用交纳时间
     */
    public Date getPaydate() {
        return paydate;
    }

    /**
     * 费用交纳时间
     * @param paydate 费用交纳时间
     */
    public void setPaydate(Date paydate) {
        this.paydate = paydate;
    }
}