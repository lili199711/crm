package com.briup.bean;

import java.io.Serializable;

public class OrdersLine implements Serializable {
    private Long oddId;

    private Long oddOrderId;

    private Long oddCount;

    private String oddUnit;

    private Long oddPrice;

    private Long prodId;

    private static final long serialVersionUID = 1L;

    public Long getOddId() {
        return oddId;
    }

    public void setOddId(Long oddId) {
        this.oddId = oddId;
    }

    public Long getOddOrderId() {
        return oddOrderId;
    }

    public void setOddOrderId(Long oddOrderId) {
        this.oddOrderId = oddOrderId;
    }

    public Long getOddCount() {
        return oddCount;
    }

    public void setOddCount(Long oddCount) {
        this.oddCount = oddCount;
    }

    public String getOddUnit() {
        return oddUnit;
    }

    public void setOddUnit(String oddUnit) {
        this.oddUnit = oddUnit == null ? null : oddUnit.trim();
    }

    public Long getOddPrice() {
        return oddPrice;
    }

    public void setOddPrice(Long oddPrice) {
        this.oddPrice = oddPrice;
    }

    public Long getProdId() {
        return prodId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oddId=").append(oddId);
        sb.append(", oddOrderId=").append(oddOrderId);
        sb.append(", oddCount=").append(oddCount);
        sb.append(", oddUnit=").append(oddUnit);
        sb.append(", oddPrice=").append(oddPrice);
        sb.append(", prodId=").append(prodId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}