package org.problems.insurancemap;

import java.text.*;

class InsuranceMain {
    public static void main(String[] args) throws ParseException {
        InsurancePolicyManager manager = new InsurancePolicyManager();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        manager.addPolicy(new InsurancePolicy("P1001", "Shreya", sdf.parse("2025-06-10"), "Health", 1000.0));
        manager.addPolicy(new InsurancePolicy("P1002", "Uday", sdf.parse("2024-03-15"), "Auto", 1500.0));
        manager.addPolicy(new InsurancePolicy("P1003", "Pankaj", sdf.parse("2024-04-05"), "Home", 1200.0));

        System.out.println("All Policies:");
        manager.displayPolicies();

        System.out.println("\nExpiring Soon:");
        manager.displayExpiringSoon();
    }
}
