package org.problems.insuranceset;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

class InsurancePolicyManager {
    private final Set<InsurancePolicy> policies = new HashSet<>();

    public void addPolicy(InsurancePolicy policy) {
        policies.add(policy);
    }

    public Set<InsurancePolicy> getExpiringSoon() {
        Date today = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 30);
        Date thresholdDate = calendar.getTime();

        Set<InsurancePolicy> expiringSoon = new HashSet<>();
        for (InsurancePolicy policy : policies) {
            if (policy.getExpiryDate().before(thresholdDate)) {
                expiringSoon.add(policy);
            }
        }
        return expiringSoon;
    }

    public Set<InsurancePolicy> getPoliciesByCoverageType(String type) {
        Set<InsurancePolicy> result = new HashSet<>();
        for (InsurancePolicy policy : policies) {
            if (policy.getCoverageType().equalsIgnoreCase(type)) {
                result.add(policy);
            }
        }
        return result;
    }
}