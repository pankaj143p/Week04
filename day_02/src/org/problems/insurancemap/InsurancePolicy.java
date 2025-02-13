package org.problems.insurancemap;

import java.util.Date;

public class InsurancePolicy {
    private final String policyNumber;
    private final String policyholderName;
    private final Date expiryDate;
    private final String coverageType;
    private final double premiumAmount;

    public InsurancePolicy(String policyNumber, String policyholderName, Date expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public String getPolicyNumber() { return policyNumber; }
    public Date getExpiryDate() { return expiryDate; }
    public String getCoverageType() { return coverageType; }

    @Override
    public String toString() {
        return "Policy{" + "Number='" + policyNumber + "', Holder='" + policyholderName + "', Expiry=" + expiryDate + ", Coverage='" + coverageType + "', Premium=" + premiumAmount + '}';
    }
}