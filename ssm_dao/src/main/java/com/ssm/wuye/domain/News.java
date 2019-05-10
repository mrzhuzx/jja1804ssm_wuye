package com.ssm.wuye.domain;

import com.ssm.wuye.appcomm.BaseEntity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import org.apache.ibatis.type.Alias;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * news
 */
@Table(name = "news")
@Alias("news")
@Data
public class News extends BaseEntity {
    /**
     * 
     */
    @Id
    @Column(name = "ncid")
    private Integer ncid;

    /**
     * 新闻标题
     */
    @Column(name = "nctitle")
    private String nctitle;

    /**
     * 内容
     */
    @Column(name = "nccontent")
    private String nccontent;

    /**
     * 发布时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "nctime")
    private Date nctime;

    /**
     * 类型ID
     */
    @Column(name = "nctypeid")
    private Integer nctypeid;

    /**
     * 
     * @return ncid 
     */
    public Integer getNcid() {
        return ncid;
    }

    /**
     * 
     * @param ncid 
     */
    public void setNcid(Integer ncid) {
        this.ncid = ncid;
    }

    /**
     * 新闻标题
     * @return nctitle 新闻标题
     */
    public String getNctitle() {
        return nctitle;
    }

    /**
     * 新闻标题
     * @param nctitle 新闻标题
     */
    public void setNctitle(String nctitle) {
        this.nctitle = nctitle == null ? null : nctitle.trim();
    }

    /**
     * 内容
     * @return nccontent 内容
     */
    public String getNccontent() {
        return nccontent;
    }

    /**
     * 内容
     * @param nccontent 内容
     */
    public void setNccontent(String nccontent) {
        this.nccontent = nccontent == null ? null : nccontent.trim();
    }

    /**
     * 发布时间
     * @return nctime 发布时间
     */
    public Date getNctime() {
        return nctime;
    }

    /**
     * 发布时间
     * @param nctime 发布时间
     */
    public void setNctime(Date nctime) {
        this.nctime = nctime;
    }

    /**
     * 类型ID
     * @return nctypeid 类型ID
     */
    public Integer getNctypeid() {
        return nctypeid;
    }

    /**
     * 类型ID
     * @param nctypeid 类型ID
     */
    public void setNctypeid(Integer nctypeid) {
        this.nctypeid = nctypeid;
    }
}