package com.briup.bean;

import java.io.Serializable;

public class Storage implements Serializable {
    private Long stkId;

    private String stkWarehourse;

    private Long stkCount;

    private String stkMemo;

    private String stkWare;

    private String stkName;

    private static final long serialVersionUID = 1L;

    public Long getStkId() {
        return stkId;
    }

    public void setStkId(Long stkId) {
        this.stkId = stkId;
    }

    public String getStkWarehourse() {
        return stkWarehourse;
    }

    public void setStkWarehourse(String stkWarehourse) {
        this.stkWarehourse = stkWarehourse == null ? null : stkWarehourse.trim();
    }

    public Long getStkCount() {
        return stkCount;
    }

    public void setStkCount(Long stkCount) {
        this.stkCount = stkCount;
    }

    public String getStkMemo() {
        return stkMemo;
    }

    public void setStkMemo(String stkMemo) {
        this.stkMemo = stkMemo == null ? null : stkMemo.trim();
    }

    public String getStkWare() {
        return stkWare;
    }

    public void setStkWare(String stkWare) {
        this.stkWare = stkWare == null ? null : stkWare.trim();
    }

    public String getStkName() {
        return stkName;
    }

    public void setStkName(String stkName) {
        this.stkName = stkName == null ? null : stkName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stkId=").append(stkId);
        sb.append(", stkWarehourse=").append(stkWarehourse);
        sb.append(", stkCount=").append(stkCount);
        sb.append(", stkMemo=").append(stkMemo);
        sb.append(", stkWare=").append(stkWare);
        sb.append(", stkName=").append(stkName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}