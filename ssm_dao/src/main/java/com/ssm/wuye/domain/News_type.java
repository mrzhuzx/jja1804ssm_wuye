package com.ssm.wuye.domain;

import com.ssm.wuye.appcomm.BaseEntity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.type.Alias;

/**
 * news_type
 */
@Table(name = "news_type")
@Alias("news_type")
public class News_type extends BaseEntity {
    /**
     * ID
     */
    @Id
    @Column(name = "ntid")
    private Integer ntid;

    /**
     * 类型名字
     */
    @Column(name = "ntypename")
    private String ntypename;

    /**
     * ID
     * @return ntid ID
     */
    public Integer getNtid() {
        return ntid;
    }

    /**
     * ID
     * @param ntid ID
     */
    public void setNtid(Integer ntid) {
        this.ntid = ntid;
    }

    /**
     * 类型名字
     * @return ntypename 类型名字
     */
    public String getNtypename() {
        return ntypename;
    }

    /**
     * 类型名字
     * @param ntypename 类型名字
     */
    public void setNtypename(String ntypename) {
        this.ntypename = ntypename == null ? null : ntypename.trim();
    }
}