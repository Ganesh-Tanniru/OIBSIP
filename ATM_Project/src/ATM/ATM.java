package ATM;

import java.util.Scanner;

public class ATM {

    private Bank bank;
    private Scanner scanner;

    public ATM(Bank bank) {
        this.bank = bank;
        scanner = new Scanner(System.in);
    }

    public void start() {

        Account account = login();

        if (account == null) {
            System.out.println("Access denied.");
            return;
        }

        System.out.println("\nLogin successful!");

        while (true) {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Transaction History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");

            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    showTransactionHistory(account);
                    break;

                case 2:
                    withdraw(account);
                    break;

                case 3:
                    deposit(account);
                    break;

                case 4:
                    transfer(account);
                    break;

                case 5:
                    System.out.println("Thank you for using the ATM.");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private Account login() {

        int attempts = 0;

        while (attempts < 3) {

            System.out.print("Enter User ID: ");
            String userId = scanner.next();

            System.out.print("Enter PIN: ");
            String pin = scanner.next();

            Account account = bank.findAccount(userId, pin);

            if (account != null) {
                return account;
            }

            attempts++;

            System.out.println("Incorrect User ID or PIN.");
            System.out.println("Attempts remaining: " + (3 - attempts));
        }

        return null;
    }

    private void showTransactionHistory(Account account) {

        System.out.println("\n===== TRANSACTION HISTORY =====");

        if (account.getTransactions().isEmpty()) {
            System.out.println("No transactions yet.");
        } else {

            for (Transaction transaction : account.getTransactions()) {
                System.out.println(transaction);
            }
        }
    }

    private void withdraw(Account account) {

        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }

        if (amount > account.getBalance()) {
            System.out.println("Insufficient Funds");
            return;
        }

        account.setBalance(account.getBalance() - amount);

        account.addTransaction(
                new Transaction("Withdraw", -amount)
        );

        System.out.println("Withdrawal successful.");
        System.out.println("Current balance: " + account.getBalance());
    }

    private void deposit(Account account) {

        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }

        account.setBalance(account.getBalance() + amount);

        account.addTransaction(
                new Transaction("Deposit", amount)
        );

        System.out.println("Deposit successful.");
        System.out.println("Current balance: " + account.getBalance());
    }

    private void transfer(Account account) {

        System.out.print("Enter recipient account ID: ");
        String recipientId = scanner.next();

        Account recipient = bank.findAccountById(recipientId);

        if (recipient == null) {
            System.out.println("Recipient account not found.");
            return;
        }

        if (recipient == account) {
            System.out.println("You cannot transfer to your own account.");
            return;
        }

        System.out.print("Enter amount to transfer: ");
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }

        if (amount > account.getBalance()) {
            System.out.println("Insufficient Funds");
            return;
        }

        account.setBalance(account.getBalance() - amount);

        recipient.setBalance(recipient.getBalance() + amount);

        account.addTransaction(
                new Transaction("Transfer to " + recipientId, -amount)
        );

        recipient.addTransaction(
                new Transaction("Received from " + account.getAccountId(), amount)
        );

        System.out.println("Transfer successful.");
        System.out.println("Current balance: " + account.getBalance());
    }
}