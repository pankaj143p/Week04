package org.problems.bankingsystem;

import java.util.*;


class WithdrawalRequest {
    int accountNumber;
    double amount;

    public WithdrawalRequest(int accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }
}

public class BankingSystem {
    private HashMap<Integer, Double> accounts = new HashMap<>();
    private TreeMap<Double, Integer> sortedAccounts = new TreeMap<>();
    private Queue<WithdrawalRequest> withdrawalQueue = new LinkedList<>();

    public void displaySortedAccounts() {
        System.out.println("Accounts sorted by balance:");
        for (Map.Entry<Double, Integer> entry : sortedAccounts.entrySet()) {
            System.out.println("Account " + entry.getValue() + " -> Balance: " + entry.getKey());
        }
    }

    public void withdraw(int accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            withdrawalQueue.add(new WithdrawalRequest(accountNumber, amount));
        } else {
            System.out.println("Account not found.");
        }
    }

    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            WithdrawalRequest request = withdrawalQueue.poll();
            int accountNumber = request.accountNumber;
            double amount = request.amount;

            if (accounts.containsKey(accountNumber) && accounts.get(accountNumber) >= amount) {
                double oldBalance = accounts.get(accountNumber);
                sortedAccounts.remove(oldBalance);
                double newBalance = oldBalance - amount;
                accounts.put(accountNumber, newBalance);
                sortedAccounts.put(newBalance, accountNumber);
                System.out.println("Withdrawal of " + amount + " processed for account " + accountNumber);
            } else {
                System.out.println("Insufficient balance or account not found for " + accountNumber);
            }
        }
    }

    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();
        bank.accounts.put(1001, 5000.0);
        bank.accounts.put(1002, 1000.0);
        bank.accounts.put(1003, 8000.0);

        bank.withdraw(1002, 1000);
        bank.withdraw(1003, 8000);
        bank.processWithdrawals();

        bank.displaySortedAccounts();
    }
}