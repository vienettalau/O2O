package com.learningspring.o2o.entity;

import java.util.Date;

/**
 * @Author Tree
 * @create 2020/9/10 10:25
 */
public class WechatAuth {
    private Long wechatAuthId;
    private String openId;
    private Date creatTime;
    /**
     *
     * 与用户表实体类关联，创建一个用户实体类
     */
    private PersonInfo personInfo;



    public Long getWechatAuthId() {
        return wechatAuthId;
    }

    public void setWechatAuthId(Long wechatAuthId) {
        this.wechatAuthId = wechatAuthId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }
}
