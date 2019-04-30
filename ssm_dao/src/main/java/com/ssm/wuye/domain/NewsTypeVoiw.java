package com.ssm.wuye.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.type.Alias;

/**
 * newstype_voiw
 */
@Table(name = "newstype_voiw")
@Alias("newsTypeVoiw")
public class NewsTypeVoiw {
    /**
     * 类型名字
     */
    @Column(name = "ntypename")
    private String ntypename;

    /**
     * 
     */
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
    @Column(name = "nctime")
    private Date nctime;

    /**
     * ID
     */
    @Column(name = "ntid")
    private Integer ntid;

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
}