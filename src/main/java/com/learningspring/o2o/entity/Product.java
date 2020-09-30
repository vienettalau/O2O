package com.learningspring.o2o.entity;

import java.util.Date;
import java.util.List;

/**
 * @Author Tree
 * @create 2020/9/10 13:57
 */
public class Product {
    private Long productId;
    private String productName;
    private String productDesc;
    /**
     * 缩略图
     */
    private String imgAddr;
    /**
     * 商品原价
     */
    private String normalPrice;
    /**
     * 商品折扣价
     */
    private String promotongPrice;
    private Integer priority;
    private Date creatTime;
    private Date lastEditTime;
    /**
     * 0下架，1在前端展示系统展示
     */
    private Integer enableStatus;

    private List<ProductImg>productImgList;
    private ProductCatagory productCatagory;
    private Shop shop;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getImgAddr() {
        return imgAddr;
    }

    public void setImgAddr(String imgAddr) {
        this.imgAddr = imgAddr;
    }

    public String getNormalPrice() {
        return normalPrice;
    }

    public void setNormalPrice(String normalPrice) {
        this.normalPrice = normalPrice;
    }

    public String getPromotongPrice() {
        return promotongPrice;
    }

    public void setPromotongPrice(String promotongPrice) {
        this.promotongPrice = promotongPrice;
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

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }

    public List<ProductImg> getProductImgList() {
        return productImgList;
    }

    public void setProductImgList(List<ProductImg> productImgList) {
        this.productImgList = productImgList;
    }

    public ProductCatagory getProductCatagory() {
        return productCatagory;
    }

    public void setProductCatagory(ProductCatagory productCatagory) {
        this.productCatagory = productCatagory;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}
