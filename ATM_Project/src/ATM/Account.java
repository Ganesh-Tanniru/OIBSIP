package ATM;

import java.util.ArrayList;

public class Account {

    private String accountId;
    private String userId;
    private String pin;
    private double balance;

    private ArrayList<Transaction> transactions;

    public Account(String accountId, String userId, String pin, double balance) {

        this.accountId = accountId;
        this.userId = userId;
        this.pin = pin;
        this.balance = balance;

        transactions = new ArrayList<>();
    }

    public String getAccountId() {
        return accountId;
    }

    public String getUserId() {
        return userId;
    }

    public String getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }
}