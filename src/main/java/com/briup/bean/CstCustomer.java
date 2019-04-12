package com.briup.bean;

import java.io.Serializable;

public class CstCustomer implements Serializable {
    private Long custId;

    private String custNo;

    private String custName;

    private String custRegion;

    private Long custManagerId;

    private String custManagerName;

    private Long custLevel;

    private String custLevelLabel;

    private Long custSatisfy;

    private Long custCredit;

    private String custAddr;

    private String custZip;

    private String custTel;

    private String custFax;

    private String custWebsite;

    private String custLicenceNo;

    private String custChieftain;

    private Long custBankroll;

    private Long custTurnover;

    private String custBank;

    private String custBankAccount;

    private String custLocalTaxNo;

    private String custNationalTaxNo;

    private String custStatus;

    private static final long serialVersionUID = 1L;

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo == null ? null : custNo.trim();
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getCustRegion() {
        return custRegion;
    }

    public void setCustRegion(String custRegion) {
        this.custRegion = custRegion == null ? null : custRegion.trim();
    }

    public Long getCustManagerId() {
        return custManagerId;
    }

    public void setCustManagerId(Long custManagerId) {
        this.custManagerId = custManagerId;
    }

    public String getCustManagerName() {
        return custManagerName;
    }

    public void setCustManagerName(String custManagerName) {
        this.custManagerName = custManagerName == null ? null : custManagerName.trim();
    }

    public Long getCustLevel() {
        return custLevel;
    }

    public void setCustLevel(Long custLevel) {
        this.custLevel = custLevel;
    }

    public String getCustLevelLabel() {
        return custLevelLabel;
    }

    public void setCustLevelLabel(String custLevelLabel) {
        this.custLevelLabel = custLevelLabel == null ? null : custLevelLabel.trim();
    }

    public Long getCustSatisfy() {
        return custSatisfy;
    }

    public void setCustSatisfy(Long custSatisfy) {
        this.custSatisfy = custSatisfy;
    }

    public Long getCustCredit() {
        return custCredit;
    }

    public void setCustCredit(Long custCredit) {
        this.custCredit = custCredit;
    }

    public String getCustAddr() {
        return custAddr;
    }

    public void setCustAddr(String custAddr) {
        this.custAddr = custAddr == null ? null : custAddr.trim();
    }

    public String getCustZip() {
        return custZip;
    }

    public void setCustZip(String custZip) {
        this.custZip = custZip == null ? null : custZip.trim();
    }

    public String getCustTel() {
        return custTel;
    }

    public void setCustTel(String custTel) {
        this.custTel = custTel == null ? null : custTel.trim();
    }

    public String getCustFax() {
        return custFax;
    }

    public void setCustFax(String custFax) {
        this.custFax = custFax == null ? null : custFax.trim();
    }

    public String getCustWebsite() {
        return custWebsite;
    }

    public void setCustWebsite(String custWebsite) {
        this.custWebsite = custWebsite == null ? null : custWebsite.trim();
    }

    public String getCustLicenceNo() {
        return custLicenceNo;
    }

    public void setCustLicenceNo(String custLicenceNo) {
        this.custLicenceNo = custLicenceNo == null ? null : custLicenceNo.trim();
    }

    public String getCustChieftain() {
        return custChieftain;
    }

    public void setCustChieftain(String custChieftain) {
        this.custChieftain = custChieftain == null ? null : custChieftain.trim();
    }

    public Long getCustBankroll() {
        return custBankroll;
    }

    public void setCustBankroll(Long custBankroll) {
        this.custBankroll = custBankroll;
    }

    public Long getCustTurnover() {
        return custTurnover;
    }

    public void setCustTurnover(Long custTurnover) {
        this.custTurnover = custTurnover;
    }

    public String getCustBank() {
        return custBank;
    }

    public void setCustBank(String custBank) {
        this.custBank = custBank == null ? null : custBank.trim();
    }

    public String getCustBankAccount() {
        return custBankAccount;
    }

    public void setCustBankAccount(String custBankAccount) {
        this.custBankAccount = custBankAccount == null ? null : custBankAccount.trim();
    }

    public String getCustLocalTaxNo() {
        return custLocalTaxNo;
    }

    public void setCustLocalTaxNo(String custLocalTaxNo) {
        this.custLocalTaxNo = custLocalTaxNo == null ? null : custLocalTaxNo.trim();
    }

    public String getCustNationalTaxNo() {
        return custNationalTaxNo;
    }

    public void setCustNationalTaxNo(String custNationalTaxNo) {
        this.custNationalTaxNo = custNationalTaxNo == null ? null : custNationalTaxNo.trim();
    }

    public String getCustStatus() {
        return custStatus;
    }

    public void setCustStatus(String custStatus) {
        this.custStatus = custStatus == null ? null : custStatus.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", custId=").append(custId);
        sb.append(", custNo=").append(custNo);
        sb.append(", custName=").append(custName);
        sb.append(", custRegion=").append(custRegion);
        sb.append(", custManagerId=").append(custManagerId);
        sb.append(", custManagerName=").append(custManagerName);
        sb.append(", custLevel=").append(custLevel);
        sb.append(", custLevelLabel=").append(custLevelLabel);
        sb.append(", custSatisfy=").append(custSatisfy);
        sb.append(", custCredit=").append(custCredit);
        sb.append(", custAddr=").append(custAddr);
        sb.append(", custZip=").append(custZip);
        sb.append(", custTel=").append(custTel);
        sb.append(", custFax=").append(custFax);
        sb.append(", custWebsite=").append(custWebsite);
        sb.append(", custLicenceNo=").append(custLicenceNo);
        sb.append(", custChieftain=").append(custChieftain);
        sb.append(", custBankroll=").append(custBankroll);
        sb.append(", custTurnover=").append(custTurnover);
        sb.append(", custBank=").append(custBank);
        sb.append(", custBankAccount=").append(custBankAccount);
        sb.append(", custLocalTaxNo=").append(custLocalTaxNo);
        sb.append(", custNationalTaxNo=").append(custNationalTaxNo);
        sb.append(", custStatus=").append(custStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}