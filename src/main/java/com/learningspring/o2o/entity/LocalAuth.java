package com.learningspring.o2o.entity;

import java.util.Date;

/**
 * @Author Tree
 * @create 2020/9/10 10:28
 */
public class LocalAuth {
    private Long localAuthId;
    private String username;
    private String password;
    private Date creatTime;
    private Date lastEditTmie;
    private PersonInfo personInfo;

    public Long getLocalAuthId() {
        return localAuthId;
    }

    public void setLocalAuthId(Long localAuthId) {
        this.localAuthId = localAuthId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }
}
