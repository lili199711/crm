package com.briup.bean;

import java.io.Serializable;
import java.util.Date;

public class CstLog implements Serializable {
    private Long logId;

    private String logOp;

    private String logEvent;

    private Date logDate;

    private static final long serialVersionUID = 1L;

    public Long getLogId() {
        return logId;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    public String getLogOp() {
        return logOp;
    }

    public void setLogOp(String logOp) {
        this.logOp = logOp == null ? null : logOp.trim();
    }

    public String getLogEvent() {
        return logEvent;
    }

    public void setLogEvent(String logEvent) {
        this.logEvent = logEvent == null ? null : logEvent.trim();
    }

    public Date getLogDate() {
        return logDate;
    }

    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", logId=").append(logId);
        sb.append(", logOp=").append(logOp);
        sb.append(", logEvent=").append(logEvent);
        sb.append(", logDate=").append(logDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}