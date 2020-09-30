package com.learningspring.o2o.entity;

import java.util.Date;

/**
 * @Author Tree
 * @create 2020/9/10 10:56
 */
public class HeadLine {
    private Long lineId;
    private String limeName;
    private String lineLink;
    private String lineIng;
    private Integer priority;
    /**
     * 0不可用，1可用
     */
    private Integer enableStatus;
    private Date creatTime;
    private Date lastEditTime;

    public Long getLineId() {
        return lineId;
    }

    public void setLineId(Long lineId) {
        this.lineId = lineId;
    }

    public String getLimeName() {
        return limeName;
    }

    public void setLimeName(String limeName) {
        this.limeName = limeName;
    }

    public String getLineLink() {
        return lineLink;
    }

    public void setLineLink(String lineLink) {
        this.lineLink = lineLink;
    }

    public String getLineIng() {
        return lineIng;
    }

    public void setLineIng(String lineIng) {
        this.lineIng = lineIng;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
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
}
