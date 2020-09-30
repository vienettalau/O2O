package com.learningspring.o2o.entity;

import java.util.Date;

/**
 * @Author Tree
 * @create 2020/9/10 13:39
 */
public class ProductCatagory {
    private Long productCatagoryId;
    private Long shopId;
    private String productCatagoryName;
    private Integer priority;
    private Date creatTime;

    public Long getProductCatagoryId() {
        return productCatagoryId;
    }

    public void setProductCatagoryId(Long productCatagoryId) {
        this.productCatagoryId = productCatagoryId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getProductCatagoryName() {
        return productCatagoryName;
    }

    public void setProductCatagoryName(String productCatagoryName) {
        this.productCatagoryName = productCatagoryName;
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
}
