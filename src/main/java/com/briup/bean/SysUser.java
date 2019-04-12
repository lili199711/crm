package com.briup.bean;

import java.io.Serializable;

public class SysUser implements Serializable {
    private Long usrId;

    private String usrName;

    private String usrPassword;

    private Long usrFlag;

    private Long usrRoleId;

    private static final long serialVersionUID = 1L;

    public Long getUsrId() {
        return usrId;
    }

    public void setUsrId(Long usrId) {
        this.usrId = usrId;
    }

    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName == null ? null : usrName.trim();
    }

    public String getUsrPassword() {
        return usrPassword;
    }

    public void setUsrPassword(String usrPassword) {
        this.usrPassword = usrPassword == null ? null : usrPassword.trim();
    }

    public Long getUsrFlag() {
        return usrFlag;
    }

    public void setUsrFlag(Long usrFlag) {
        this.usrFlag = usrFlag;
    }

    public Long getUsrRoleId() {
        return usrRoleId;
    }

    public void setUsrRoleId(Long usrRoleId) {
        this.usrRoleId = usrRoleId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", usrId=").append(usrId);
        sb.append(", usrName=").append(usrName);
        sb.append(", usrPassword=").append(usrPassword);
        sb.append(", usrFlag=").append(usrFlag);
        sb.append(", usrRoleId=").append(usrRoleId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}