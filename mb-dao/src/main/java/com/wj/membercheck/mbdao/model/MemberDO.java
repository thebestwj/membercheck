package com.wj.membercheck.mbdao.model;

import java.util.Date;

public class MemberDO {
    private Integer memId;

    private String memName;

    private Double memScore;

    private Date memCtime;

    private String memRole;

    private String memPw;

    public Integer getMemId() {
        return memId;
    }

    public void setMemId(Integer memId) {
        this.memId = memId;
    }

    public String getMemName() {
        return memName;
    }

    public void setMemName(String memName) {
        this.memName = memName == null ? null : memName.trim();
    }

    public Double getMemScore() {
        return memScore;
    }

    public void setMemScore(Double memScore) {
        this.memScore = memScore;
    }

    public Date getMemCtime() {
        return memCtime;
    }

    public void setMemCtime(Date memCtime) {
        this.memCtime = memCtime;
    }

    public String getMemRole() {
        return memRole;
    }

    public void setMemRole(String memRole) {
        this.memRole = memRole == null ? null : memRole.trim();
    }

    public String getMemPw() {
        return memPw;
    }

    public void setMemPw(String memPw) {
        this.memPw = memPw == null ? null : memPw.trim();
    }
}