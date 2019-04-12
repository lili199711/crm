package com.briup.bean;

import java.io.Serializable;

public class CstActivity implements Serializable {
    private Long atvId;

    private String atvCustNo;

    private String atvCustName;

    private String atvPlace;

    private String atvTitle;

    private String atvDesc;

    private Long atvCustId;

    private static final long serialVersionUID = 1L;

    public Long getAtvId() {
        return atvId;
    }

    public void setAtvId(Long atvId) {
        this.atvId = atvId;
    }

    public String getAtvCustNo() {
        return atvCustNo;
    }

    public void setAtvCustNo(String atvCustNo) {
        this.atvCustNo = atvCustNo == null ? null : atvCustNo.trim();
    }

    public String getAtvCustName() {
        return atvCustName;
    }

    public void setAtvCustName(String atvCustName) {
        this.atvCustName = atvCustName == null ? null : atvCustName.trim();
    }

    public String getAtvPlace() {
        return atvPlace;
    }

    public void setAtvPlace(String atvPlace) {
        this.atvPlace = atvPlace == null ? null : atvPlace.trim();
    }

    public String getAtvTitle() {
        return atvTitle;
    }

    public void setAtvTitle(String atvTitle) {
        this.atvTitle = atvTitle == null ? null : atvTitle.trim();
    }

    public String getAtvDesc() {
        return atvDesc;
    }

    public void setAtvDesc(String atvDesc) {
        this.atvDesc = atvDesc == null ? null : atvDesc.trim();
    }

    public Long getAtvCustId() {
        return atvCustId;
    }

    public void setAtvCustId(Long atvCustId) {
        this.atvCustId = atvCustId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", atvId=").append(atvId);
        sb.append(", atvCustNo=").append(atvCustNo);
        sb.append(", atvCustName=").append(atvCustName);
        sb.append(", atvPlace=").append(atvPlace);
        sb.append(", atvTitle=").append(atvTitle);
        sb.append(", atvDesc=").append(atvDesc);
        sb.append(", atvCustId=").append(atvCustId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}