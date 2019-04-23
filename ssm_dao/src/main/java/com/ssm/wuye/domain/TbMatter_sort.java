package com.ssm.wuye.domain;

import com.ssm.wuye.appcomm.BaseEntity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.type.Alias;

/**
 * tb_matter_sort
 */
@Table(name = "tb_matter_sort")
@Alias("tbMatter_sort")
public class TbMatter_sort extends BaseEntity {
    /**
     * 物资类别ID
     */
    @Id
    @Column(name = "matterSortId")
    private Integer mattersortid;

    /**
     * 物质类别名称
     */
    @Column(name = "matterSort")
    private String mattersort;

    /**
     * 物资类别ID
     * @return matterSortId 物资类别ID
     */
    public Integer getMattersortid() {
        return mattersortid;
    }

    /**
     * 物资类别ID
     * @param mattersortid 物资类别ID
     */
    public void setMattersortid(Integer mattersortid) {
        this.mattersortid = mattersortid;
    }

    /**
     * 物质类别名称
     * @return matterSort 物质类别名称
     */
    public String getMattersort() {
        return mattersort;
    }

    /**
     * 物质类别名称
     * @param mattersort 物质类别名称
     */
    public void setMattersort(String mattersort) {
        this.mattersort = mattersort == null ? null : mattersort.trim();
    }
}