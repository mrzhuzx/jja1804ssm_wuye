package com.ssm.wuye.domain;

import com.ssm.wuye.appcomm.BaseEntity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.type.Alias;

/**
 * house
 */
@Table(name = "house")
@Alias("house")
public class House extends BaseEntity {
    /**
     * 
     */
    @Column(name = "id")
    private Integer id;

    /**
     * 
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 
     */
    @Column(name = "type_id")
    private Integer typeId;

    /**
     * 
     */
    @Column(name = "title")
    private String title;

    /**
     * 
     */
    @Column(name = "description")
    private String description;

    /**
     * 
     */
    @Column(name = "price")
    private Integer price;

    /**
     * 
     */
    @Column(name = "pubdate")
    private Date pubdate;

    /**
     * 
     */
    @Column(name = "floorage")
    private Integer floorage;

    /**
     * 
     */
    @Column(name = "contact")
    private String contact;

    /**
     * 
     */
    @Column(name = "street_id")
    private Integer streetId;

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
     * 
     * @return user_id 
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 
     * @param userId 
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 
     * @return type_id 
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * 
     * @param typeId 
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * 
     * @return title 
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title 
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 
     * @return description 
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description 
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 
     * @return price 
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * 
     * @param price 
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * 
     * @return pubdate 
     */
    public Date getPubdate() {
        return pubdate;
    }

    /**
     * 
     * @param pubdate 
     */
    public void setPubdate(Date pubdate) {
        this.pubdate = pubdate;
    }

    /**
     * 
     * @return floorage 
     */
    public Integer getFloorage() {
        return floorage;
    }

    /**
     * 
     * @param floorage 
     */
    public void setFloorage(Integer floorage) {
        this.floorage = floorage;
    }

    /**
     * 
     * @return contact 
     */
    public String getContact() {
        return contact;
    }

    /**
     * 
     * @param contact 
     */
    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    /**
     * 
     * @return street_id 
     */
    public Integer getStreetId() {
        return streetId;
    }

    /**
     * 
     * @param streetId 
     */
    public void setStreetId(Integer streetId) {
        this.streetId = streetId;
    }
}