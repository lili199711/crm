package com.briup.bean;

import java.io.Serializable;

public class CstService implements Serializable {
    private Long svrId;

    private String svrType;

    private String svrTitle;

    private String svrCustName;

    private String svrStatus;

    private String svrRequest;

    private String svrCreateBy;

    private String svrDueTo;

    private String svrDeal;

    private String svrResult;

    private Long svrSatisfy;

    private static final long serialVersionUID = 1L;

    public Long getSvrId() {
        return svrId;
    }

    public void setSvrId(Long svrId) {
        this.svrId = svrId;
    }

    public String getSvrType() {
        return svrType;
    }

    public void setSvrType(String svrType) {
        this.svrType = svrType == null ? null : svrType.trim();
    }

    public String getSvrTitle() {
        return svrTitle;
    }

    public void setSvrTitle(String svrTitle) {
        this.svrTitle = svrTitle == null ? null : svrTitle.trim();
    }

    public String getSvrCustName() {
        return svrCustName;
    }

    public void setSvrCustName(String svrCustName) {
        this.svrCustName = svrCustName == null ? null : svrCustName.trim();
    }

    public String getSvrStatus() {
        return svrStatus;
    }

    public void setSvrStatus(String svrStatus) {
        this.svrStatus = svrStatus == null ? null : svrStatus.trim();
    }

    public String getSvrRequest() {
        return svrRequest;
    }

    public void setSvrRequest(String svrRequest) {
        this.svrRequest = svrRequest == null ? null : svrRequest.trim();
    }

    public String getSvrCreateBy() {
        return svrCreateBy;
    }

    public void setSvrCreateBy(String svrCreateBy) {
        this.svrCreateBy = svrCreateBy == null ? null : svrCreateBy.trim();
    }

    public String getSvrDueTo() {
        return svrDueTo;
    }

    public void setSvrDueTo(String svrDueTo) {
        this.svrDueTo = svrDueTo == null ? null : svrDueTo.trim();
    }

    public String getSvrDeal() {
        return svrDeal;
    }

    public void setSvrDeal(String svrDeal) {
        this.svrDeal = svrDeal == null ? null : svrDeal.trim();
    }

    public String getSvrResult() {
        return svrResult;
    }

    public void setSvrResult(String svrResult) {
        this.svrResult = svrResult == null ? null : svrResult.trim();
    }

    public Long getSvrSatisfy() {
        return svrSatisfy;
    }

    public void setSvrSatisfy(Long svrSatisfy) {
        this.svrSatisfy = svrSatisfy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", svrId=").append(svrId);
        sb.append(", svrType=").append(svrType);
        sb.append(", svrTitle=").append(svrTitle);
        sb.append(", svrCustName=").append(svrCustName);
        sb.append(", svrStatus=").append(svrStatus);
        sb.append(", svrRequest=").append(svrRequest);
        sb.append(", svrCreateBy=").append(svrCreateBy);
        sb.append(", svrDueTo=").append(svrDueTo);
        sb.append(", svrDeal=").append(svrDeal);
        sb.append(", svrResult=").append(svrResult);
        sb.append(", svrSatisfy=").append(svrSatisfy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}