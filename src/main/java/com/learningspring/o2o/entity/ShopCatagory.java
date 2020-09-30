package com.learningspring.o2o.entity;

import java.util.Date;

/**
 * @Author Tree
 * @create 2020/9/10 11:21
 */
public class ShopCatagory {

    private Long shopCatagoryId;
    private String shopCatagoryName;
    private String shopCatagoryDesc;
    private String shopCatagoryImg;
    private Integer priority;
    private Date creatTime;
    private Date lastEditTmie;
    private ShopCatagory parent;

    public Long getShopCatagoryId() {
        return shopCatagoryId;
    }

    public void setShopCatagoryId(Long shopCatagoryId) {
        this.shopCatagoryId = shopCatagoryId;
    }

    public String getShopCatagoryName() {
        return shopCatagoryName;
    }

    public void setShopCatagoryName(String shopCatagoryName) {
        this.shopCatagoryName = shopCatagoryName;
    }

    public String getShopCatagoryDesc() {
        return shopCatagoryDesc;
    }

    public void setShopCatagoryDesc(String shopCatagoryDesc) {
        this.shopCatagoryDesc = shopCatagoryDesc;
    }

    public String getShopCatagoryImg() {
        return shopCatagoryImg;
    }

    public void setShopCatagoryImg(String shopCatagoryImg) {
        this.shopCatagoryImg = shopCatagoryImg;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Date getLastEditTmie() {
        return lastEditTmie;
    }

    public void setLastEditTmie(Date lastEditTmie) {
        this.lastEditTmie = lastEditTmie;
    }

    public ShopCatagory getParent() {
        return parent;
    }

    public void setParent(ShopCatagory parent) {
        this.parent = parent;
    }
}
