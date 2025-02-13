package org.problems.insurancemap;

import java.util.*;

public class InsurancePolicyManager {
    private final Set<InsurancePolicy> policies = new TreeSet<>(Comparator.comparing(InsurancePolicy::getExpiryDate));

    public void addPolicy(InsurancePolicy policy) {
        policies.add(policy);
    }

    public void displayPolicies() {
        policies.forEach(System.out::println);
    }

    public void displayExpiringSoon() {
        Date today = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 30);
        Date threshold = calendar.getTime();

        policies.stream().filter(p -> p.getExpiryDate().before(threshold)).forEach(System.out::println);
    }
}