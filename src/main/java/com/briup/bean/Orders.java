package com.briup.bean;

import java.io.Serializable;

public class Orders implements Serializable {
    private Long odrId;

    private String odrCustomer;

    private String odrAddr;

    private String odrStatus;

    private Long odrCustId;

    private static final long serialVersionUID = 1L;

    public Long getOdrId() {
        return odrId;
    }

    public void setOdrId(Long odrId) {
        this.odrId = odrId;
    }

    public String getOdrCustomer() {
        return odrCustomer;
    }

    public void setOdrCustomer(String odrCustomer) {
        this.odrCustomer = odrCustomer == null ? null : odrCustomer.trim();
    }

    public String getOdrAddr() {
        return odrAddr;
    }

    public void setOdrAddr(String odrAddr) {
        this.odrAddr = odrAddr == null ? null : odrAddr.trim();
    }

    public String getOdrStatus() {
        return odrStatus;
    }

    public void setOdrStatus(String odrStatus) {
        this.odrStatus = odrStatus == null ? null : odrStatus.trim();
    }

    public Long getOdrCustId() {
        return odrCustId;
    }

    public void setOdrCustId(Long odrCustId) {
        this.odrCustId = odrCustId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", odrId=").append(odrId);
        sb.append(", odrCustomer=").append(odrCustomer);
        sb.append(", odrAddr=").append(odrAddr);
        sb.append(", odrStatus=").append(odrStatus);
        sb.append(", odrCustId=").append(odrCustId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}